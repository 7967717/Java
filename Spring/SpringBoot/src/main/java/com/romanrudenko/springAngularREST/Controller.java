package com.romanrudenko.springAngularREST;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @author roman.rudenko on 23-May-16.
 */
@RestController
public class Controller {
    public static final String template = "Hello %s!";
    private final AtomicLong counter = new AtomicLong();

@RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
    return new Greeting(counter.incrementAndGet(), String.format(template, name));
}

}