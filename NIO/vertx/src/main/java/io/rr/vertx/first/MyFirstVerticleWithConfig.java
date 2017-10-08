package io.rr.vertx.first;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Future;

/**
 * @author romanr on 12/26/2016.
 */
public class MyFirstVerticleWithConfig extends AbstractVerticle {
    public void start(Future<Void> fut) {
        vertx
                .createHttpServer()
                .requestHandler(r -> {
                    r.response().end("<h1>Hello from my first " +
                            "Vert.x 3 application</h1>");
                })
                .listen(
                        // Retrieve the port from the configuration,
                        // default to 8080.
                        config().getInteger("http.port", 8080),
                        result -> {
                            if (result.succeeded()) {
                                fut.complete();
                            } else {
                                fut.fail(result.cause());
                            }
                        }
                );
    }
}
