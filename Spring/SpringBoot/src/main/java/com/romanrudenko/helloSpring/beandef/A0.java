package com.romanrudenko.helloSpring.beandef;

import org.springframework.stereotype.Component;

/**
 * @author roman on 3/10/17.
 */

@Component
public class A0 implements A{

    @Override
    public void print() {
        System.out.println("In A0");
    }
}
