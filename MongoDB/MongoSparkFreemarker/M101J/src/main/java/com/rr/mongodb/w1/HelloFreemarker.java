package com.rr.mongodb.w1;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

import java.io.IOException;
import java.io.StringWriter;
import java.util.HashMap;

/**
 * @author roman.rudenko on 26-May-16.
 */
public class HelloFreemarker {
    public static void main(String[] args) throws IOException, TemplateException {
        Configuration configuration = new Configuration();
        configuration.setClassForTemplateLoading(HelloFreemarker.class, "/");

        Template template = configuration.getTemplate("hello.ftl");
        StringWriter stringWriter = new StringWriter();
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("name", "^^^Freemarker^^^");

        template.process(map, stringWriter);
        System.out.println(stringWriter);
    }
}
