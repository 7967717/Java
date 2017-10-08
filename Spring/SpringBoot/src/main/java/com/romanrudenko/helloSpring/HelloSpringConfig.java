package com.romanrudenko.helloSpring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloSpringConfig {

    private String message = "Hello from SpringConfig";

    @Bean
    public A a(){
        System.out.println("In A");
        return new A(message);
    }

    @Bean
    public B b(){
        System.out.println("In B");
        return new B(a());
    }

}
