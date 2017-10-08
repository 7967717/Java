package io.rr.vertx.rest;

import io.vertx.core.DeploymentOptions;
import io.vertx.core.Vertx;
import io.vertx.core.json.JsonObject;

/**
 * @author roman on 12/27/16.
 */
public class MainJDBC {
    public static void main(String[] args) {
        Vertx vertx = Vertx.vertx();
        DeploymentOptions options = new DeploymentOptions()
                .setConfig(new JsonObject().put("http.port", 8083).put("url", "jdbc:hsqldb:mem:it-test?shutdown=true")
                        .put("driver_class", "org.hsqldb.jdbcDriver")
                );
        vertx.deployVerticle(RestVerticleJDBC.class.getName(), options);
    }
}
