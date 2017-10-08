package com.romanrudenko.helloSpring;

public class A {
    private String message;

    public A(String message) {
        this.message = message;
    }

    public void printMessage(){
        System.out.println("Your Message : " + message);
    }

}
