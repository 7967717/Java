package io.rr.vertx.rest;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.AsyncResult;
import io.vertx.core.Future;
import io.vertx.core.Handler;
import io.vertx.core.http.HttpServer;
import io.vertx.core.http.HttpServerResponse;
import io.vertx.core.json.Json;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.jdbc.JDBCClient;
import io.vertx.ext.sql.SQLConnection;
import io.vertx.ext.sql.UpdateResult;
import io.vertx.ext.web.Router;
import io.vertx.ext.web.RoutingContext;
import io.vertx.ext.web.handler.BodyHandler;
import io.vertx.ext.web.handler.StaticHandler;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author roman on 1/7/17.
 */
public class RestVerticleJDBC extends AbstractVerticle {
    private JDBCClient jdbc;

    @Override
    public void start(Future<Void> fut) {

        // Create a JDBC client
        jdbc = JDBCClient.createShared(vertx, config(), "Car-Collection");

        startBackend(
                (connection) -> createSomeData(connection,
                        (nothing) -> startWebApp(
                                (http) -> completeStartup(http, fut)
                        ), fut
                ), fut);
    }

    private void startBackend(Handler<AsyncResult<SQLConnection>> next, Future<Void> fut) {
        jdbc.getConnection(ar -> {
            if (ar.failed()) {
                fut.fail(ar.cause());
            } else {
                next.handle(Future.succeededFuture(ar.result()));
            }
        });
    }


    private void createSomeData(AsyncResult<SQLConnection> result, Handler<AsyncResult<Void>> next, Future<Void> fut) {
        if (result.failed()) {
            fut.fail(result.cause());
        } else {
            SQLConnection connection = result.result();
            connection.execute(
                    "CREATE TABLE IF NOT EXISTS Car (id INTEGER IDENTITY, brand varchar(100), model varchar" +
                            "(100))",
                    ar -> {
                        if (ar.failed()) {
                            fut.fail(ar.cause());
                            connection.close();
                            return;
                        }
                        connection.query("SELECT * FROM Car", select -> {
                            if (select.failed()) {
                                fut.fail(ar.cause());
                                connection.close();
                                return;
                            }
                            if (select.result().getNumRows() == 0) {
                                insert(
                                        new Car0("Skoda", "Octavia"), connection,
                                        (v) -> insert(new Car0("Skoda", "Yeti"), connection,
                                                (r) -> {
                                                    next.handle(Future.<Void>succeededFuture());
                                                    connection.close();
                                                }));
                            } else {
                                next.handle(Future.<Void>succeededFuture());
                                connection.close();
                            }
                        });

                    });
        }
    }

    private void startWebApp(Handler<AsyncResult<HttpServer>> next) {
        // Create a router object.
        Router router = Router.router(vertx);

        // Bind "/" to our hello message.
        router.route("/").handler(routingContext -> {
            HttpServerResponse response = routingContext.response();
            response
                    .putHeader("content-type", "text/html")
                    .end("<h1>Hello from my first Vert.x 3 application</h1>");
        });

        router.route("/assets/*").handler(StaticHandler.create("assets"));

        router.get("/api/cars").handler(this::getAll);
        router.route("/api/cars*").handler(BodyHandler.create());
        router.post("/api/cars").handler(this::addOne);
        router.get("/api/cars/:id").handler(this::getOne);
        router.put("/api/cars/:id").handler(this::updateOne);
        router.delete("/api/cars/:id").handler(this::deleteOne);


        // Create the HTTP server and pass the "accept" method to the request handler.
        vertx
                .createHttpServer()
                .requestHandler(router::accept)
                .listen(
                        // Retrieve the port from the configuration,
                        // default to 8080.
                        config().getInteger("http.port", 8083),
                        next::handle
                );
    }

    private void completeStartup(AsyncResult<HttpServer> http, Future<Void> fut) {
        if (http.succeeded()) {
            fut.complete();
        } else {
            fut.fail(http.cause());
        }
    }

    @Override
    public void stop() throws Exception {
        // Close the JDBC client.
        jdbc.close();
    }

    private void addOne(RoutingContext routingContext) {
        jdbc.getConnection(ar -> {
            // Read the request's content and create an instance of Car.
            final Car0 car = Json.decodeValue(routingContext.getBodyAsString(),
                    Car0.class);
            SQLConnection connection = ar.result();
            insert(car, connection, (r) ->
                    routingContext.response()
                            .setStatusCode(201)
                            .putHeader("content-type", "application/json; charset=utf-8")
                            .end(Json.encodePrettily(r.result())));
            connection.close();
        });

    }

    private void getOne(RoutingContext routingContext) {
        final String id = routingContext.request().getParam("id");
        if (id == null) {
            routingContext.response().setStatusCode(400).end();
        } else {
            jdbc.getConnection(ar -> {
                // Read the request's content and create an instance of Whisky.
                SQLConnection connection = ar.result();
                select(id, connection, result -> {
                    if (result.succeeded()) {
                        routingContext.response()
                                .setStatusCode(200)
                                .putHeader("content-type", "application/json; charset=utf-8")
                                .end(Json.encodePrettily(result.result()));
                    } else {
                        routingContext.response()
                                .setStatusCode(404).end();
                    }
                    connection.close();
                });
            });
        }
    }

    private void updateOne(RoutingContext routingContext) {
        final String id = routingContext.request().getParam("id");
        JsonObject json = routingContext.getBodyAsJson();
        if (id == null || json == null) {
            routingContext.response().setStatusCode(400).end();
        } else {
            jdbc.getConnection(ar ->
                    update(id, json, ar.result(), (car) -> {
                        if (car.failed()) {
                            routingContext.response().setStatusCode(404).end();
                        } else {
                            routingContext.response()
                                    .putHeader("content-type", "application/json; charset=utf-8")
                                    .end(Json.encodePrettily(car.result()));
                        }
                        ar.result().close();
                    })
            );
        }
    }

    private void deleteOne(RoutingContext routingContext) {
        String id = routingContext.request().getParam("id");
        if (id == null) {
            routingContext.response().setStatusCode(400).end();
        } else {
            jdbc.getConnection(ar -> {
                SQLConnection connection = ar.result();
                connection.execute("DELETE FROM Car WHERE id='" + id + "'",
                        result -> {
                            routingContext.response().setStatusCode(204).end();
                            connection.close();
                        });
            });
        }
    }

    private void getAll(RoutingContext routingContext) {
        jdbc.getConnection(ar -> {
            SQLConnection connection = ar.result();
            connection.query("SELECT * FROM Car", result -> {
                List<Car0> cars = result.result().getRows().stream().map(Car0::new).collect(Collectors.toList());
                routingContext.response()
                        .putHeader("content-type", "application/json; charset=utf-8")
                        .end(Json.encodePrettily(cars));
                connection.close();
            });
        });
    }


    private void insert(Car0 car, SQLConnection connection, Handler<AsyncResult<Car0>> next) {
        String sql = "INSERT INTO Car (brand, model) VALUES ?, ?";
        connection.updateWithParams(sql,
                new JsonArray().add(car.getBrand()).add(car.getModel()),
                (ar) -> {
                    if (ar.failed()) {
                        next.handle(Future.failedFuture(ar.cause()));
                        connection.close();
                        return;
                    }
                    UpdateResult result = ar.result();
                    // Build a new car instance with the generated id.
                    Car0 c = new Car0(result.getKeys().getInteger(0), car.getBrand(), car.getModel());
                    next.handle(Future.succeededFuture(c));
                });
    }

    private void select(String id, SQLConnection connection, Handler<AsyncResult<Car0>> resultHandler) {
        connection.queryWithParams("SELECT * FROM Car WHERE id=?", new JsonArray().add(id), ar -> {
            if (ar.failed()) {
                resultHandler.handle(Future.failedFuture("Car not found"));
            } else {
                if (ar.result().getNumRows() >= 1) {
                    resultHandler.handle(Future.succeededFuture(new Car0(ar.result().getRows().get(0))));
                } else {
                    resultHandler.handle(Future.failedFuture("Car not found"));
                }
            }
        });
    }

    private void update(String id, JsonObject content, SQLConnection connection,
                        Handler<AsyncResult<Car0>> resultHandler) {
        String sql = "UPDATE Car SET brand=?, model=? WHERE id=?";
        connection.updateWithParams(sql,
                new JsonArray().add(content.getString("brand")).add(content.getString("model")).add(id),
                update -> {
                    if (update.failed()) {
                        resultHandler.handle(Future.failedFuture("Cannot update the car"));
                        return;
                    }
                    if (update.result().getUpdated() == 0) {
                        resultHandler.handle(Future.failedFuture("Car not found"));
                        return;
                    }
                    resultHandler.handle(
                            Future.succeededFuture(new Car0(Integer.valueOf(id),
                                    content.getString("brand"), content.getString("model"))));
                });
    }

}
