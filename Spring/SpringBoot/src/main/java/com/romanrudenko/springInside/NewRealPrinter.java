package com.romanrudenko.springInside;

import org.springframework.stereotype.Component;

/**
 * @author roman.rudenko on 11-Apr-16.
 */
@Component
public class NewRealPrinter extends RealPrinter implements Printer{
    @Override
    public void printSth() {
        System.out.println("This is a new implementation of deprecated RealPrinter");
    }
}
