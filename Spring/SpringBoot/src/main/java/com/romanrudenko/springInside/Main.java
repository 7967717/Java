package com.romanrudenko.springInside;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author roman.rudenko on 31-Mar-16.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        context.getBean(Printer.class).printSth();
//        while (true) {
//            Thread.sleep(1000);
//            context.getBean(Printer.class).printSth();
//        }
    }
}
