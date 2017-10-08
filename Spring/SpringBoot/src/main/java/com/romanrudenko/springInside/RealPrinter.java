package com.romanrudenko.springInside;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @author roman.rudenko on 31-Mar-16.
 */
//@Component
@Profiling
@DeprecatedClass(newImpl = NewRealPrinter.class)
public class RealPrinter implements Printer {

    @InjectRandom(min = 2, max = 5)
    private int printLines;

    @Value("Real printer is printing")
    private String wordToPrint;

    public RealPrinter() {
        System.out.println("============================");
        System.out.println("In Constructor - P1");
        System.out.println("printLines = " + printLines);
    }

    @PostConstruct
    public void init(){
        System.out.println("============================");
        System.out.println("In init method - P2");
        System.out.println("printLines = " + printLines);
    }

    public void setWordToPrint(String wordToPrint) {
        this.wordToPrint = wordToPrint;
    }

    @Override
    @PostProxy
    public void printSth() {
        System.out.println();
        System.out.println("In printSth method - P3");
        System.out.println("----------------------------");
        for (int i = 0; i < printLines; i++) {
            System.out.println("wordToPrint = " + wordToPrint);
        }
        System.out.println("============================");
    }
}
