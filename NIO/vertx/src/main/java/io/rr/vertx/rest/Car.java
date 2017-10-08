package io.rr.vertx.rest;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author roman on 12/27/16.
 */
public class Car {
    private static final AtomicInteger COUNTER = new AtomicInteger();

    private final int id;

    private String brand;

    private String model;

    public Car(String brand, String model) {
        this.id = COUNTER.getAndIncrement();
        this.brand = brand;
        this.model = model;
    }

    public Car() {
        this.id = COUNTER.getAndIncrement();
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getId() {
        return id;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
