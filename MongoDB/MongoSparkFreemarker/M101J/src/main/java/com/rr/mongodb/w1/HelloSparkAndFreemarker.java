package com.rr.mongodb.w1;

import freemarker.template.Configuration;
import freemarker.template.Template;
import spark.Request;
import spark.Response;
import spark.Route;
import spark.Spark;

import java.io.StringWriter;
import java.util.HashMap;

/**
 * @author roman.rudenko on 27-May-16.
 */
public class HelloSparkAndFreemarker {
    public static void main(String[] args) {
        final Configuration configuration = new Configuration();
        configuration.setClassForTemplateLoading(HelloSparkAndFreemarker.class, "/");

        Spark.get("/", new Route() {
            @Override
            public Object handle(Request request, Response response) throws Exception {
                Template template = configuration.getTemplate("hello.ftl");
                StringWriter stringWriter = new StringWriter();
                HashMap<String, Object> map = new HashMap<String, Object>();
                map.put("name", "^^^Freemarker^^^");

                template.process(map, stringWriter);
//                System.out.println(stringWriter);
                return stringWriter;
            }
        });
    }
}
