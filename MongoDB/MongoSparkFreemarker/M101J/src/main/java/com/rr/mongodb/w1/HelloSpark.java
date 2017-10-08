package com.rr.mongodb.w1;

import spark.*;

/**
 * @author roman.rudenko on 26-May-16.
 */
public class HelloSpark {
    public static void main(String[] args) {
        Spark.get("/", new Route() {
            @Override
            public Object handle(Request request, Response response) throws Exception {
                return "Hello From Spark";
            }
        });
    }
}
