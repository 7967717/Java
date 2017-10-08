package com.romanrudenko.helloSpring;

public class B {

    private A a;

    public B(A a) {
        this.a = a;
    }

    public void printA(){
        a.printMessage();
    }
}
