package io.rr.vertx.rest;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Future;
import io.vertx.core.http.HttpServerResponse;
import io.vertx.core.json.Json;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.jdbc.JDBCClient;
import io.vertx.ext.web.Router;
import io.vertx.ext.web.RoutingContext;
import io.vertx.ext.web.handler.BodyHandler;
import io.vertx.ext.web.handler.StaticHandler;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author roman on 12/27/16.
 */
public class RestVerticle extends AbstractVerticle {
    // Store our product
    private Map<Integer, Car> products = new LinkedHashMap<>();
    // Create some products
    private void createSomeData() {
        Car oktavia = new Car("Skoda", "Octavia");
        products.put(oktavia.getId(), oktavia);
        Car altea = new Car("Seat", "Altea");
        products.put(altea.getId(), altea);
        Car touareg = new Car("VW", "Touareg");
        products.put(touareg.getId(), touareg);
        Car golf = new Car("VW", "Golf");
        products.put(golf.getId(), golf);
        Car yeti = new Car("Skoda", "Yeti");
        products.put(yeti.getId(), yeti);
    }

    @Override
    public void start(Future<Void> fut) {
        createSomeData();

        // Create a router object.
        Router router = Router.router(vertx);

        // Bind "/" to our hello message - so we are still compatible.
        router.route("/").handler(routingContext -> {
            HttpServerResponse response = routingContext.response();
            response
                    .putHeader("content-type", "text/html")
                    .end("<h1>Hello from my first Vert.x 3 application</h1>");
        });

        // Serve static resources from the /assets directory
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
                        config().getInteger("http.port", 8082),
                        result -> {
                            if (result.succeeded()) {
                                fut.complete();
                            } else {
                                fut.fail(result.cause());
                            }
                        }
                );
    }

    private void getAll(RoutingContext routingContext) {
        routingContext.response()
                .putHeader("content-type", "application/json; charset=utf-8")
                .end(Json.encodePrettily(products.values()));
    }

    private void addOne(RoutingContext routingContext) {
        final Car car = Json.decodeValue(routingContext.getBodyAsString(),
                Car.class);
        products.put(car.getId(), car);
        routingContext.response()
                .setStatusCode(201)
                .putHeader("content-type", "application/json; charset=utf-8")
                .end(Json.encodePrettily(car));
    }

    private void getOne(RoutingContext routingContext) {
        final String id = routingContext.request().getParam("id");
        if (id == null) {
            routingContext.response().setStatusCode(400).end();
        } else {
            final Integer idAsInteger = Integer.valueOf(id);
            Car car = products.get(idAsInteger);
            if (car == null) {
                routingContext.response().setStatusCode(404).end();
            } else {
                routingContext.response()
                        .putHeader("content-type", "application/json; charset=utf-8")
                        .end(Json.encodePrettily(car));
            }
        }
    }

    private void updateOne(RoutingContext routingContext) {
        final String id = routingContext.request().getParam("id");
        JsonObject json = routingContext.getBodyAsJson();
        if (id == null || json == null) {
            routingContext.response().setStatusCode(400).end();
        } else {
            final Integer idAsInteger = Integer.valueOf(id);
            Car car = products.get(idAsInteger);
            if (car == null) {
                routingContext.response().setStatusCode(404).end();
            } else {
                car.setBrand(json.getString("brand"));
                car.setModel(json.getString("model"));
                routingContext.response()
                        .putHeader("content-type", "application/json; charset=utf-8")
                        .end(Json.encodePrettily(car));
            }
        }
    }

    private void deleteOne(RoutingContext routingContext) {
        String id = routingContext.request().getParam("id");
        if (id == null) {
            routingContext.response().setStatusCode(400).end();
        } else {
            Integer idAsInteger = Integer.valueOf(id);
            products.remove(idAsInteger);
        }
        routingContext.response().setStatusCode(204).end();
    }

}
