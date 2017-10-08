package io.rr.vertx.first;

import io.vertx.core.Context;
import io.vertx.core.DeploymentOptions;
import io.vertx.core.Vertx;
import io.vertx.core.impl.WorkerContext;
import io.vertx.core.json.JsonObject;

/**
 * @author romanr on 12/26/2016.
 */
public class Main {
    public static void main(String[] args) {
        Vertx vertx = Vertx.vertx();
//        vertx.deployVerticle(MyFirstVerticle.class.getName());

        int port = 8082;
        DeploymentOptions options = new DeploymentOptions()
                .setConfig(new JsonObject().put("http.port", port)
                );
        vertx.deployVerticle(MyFirstVerticleWithConfig.class.getName(), options);
    }
}
