package com.romanrudenko.helloSpring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class MainApp {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx =
                new AnnotationConfigApplicationContext();

        ctx.register(HelloSpringConfig.class);
        ctx.refresh();

        B b = ctx.getBean(B.class);
        b.printA();
    }
}
