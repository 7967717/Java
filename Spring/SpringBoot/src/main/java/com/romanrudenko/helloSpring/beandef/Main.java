package com.romanrudenko.helloSpring.beandef;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author roman on 3/10/17.
 */
public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        context.getBean(A.class).print();
    }

}
