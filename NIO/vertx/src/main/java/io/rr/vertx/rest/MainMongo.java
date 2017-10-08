package io.rr.vertx.rest;

import io.vertx.core.DeploymentOptions;
import io.vertx.core.Vertx;
import io.vertx.core.json.JsonObject;

/**
 * @author roman on 12/27/16.
 */
public class MainMongo {
    public static void main(String[] args) {
        Vertx vertx = Vertx.vertx();
        int MONGO_PORT = 27017;
        DeploymentOptions options = new DeploymentOptions()
                .setConfig(new JsonObject()
                        .put("http.port", 8083)
                        .put("db_name", "cars")
                        .put("connection_string",
                                "mongodb://localhost:" + MONGO_PORT)
                );
        vertx.deployVerticle(RestVerticleMongo.class.getName(), options);
    }
}
