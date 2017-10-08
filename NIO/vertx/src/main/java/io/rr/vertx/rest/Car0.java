package io.rr.vertx.rest;

import io.vertx.core.json.JsonObject;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author roman on 12/27/16.
 */
public class Car0 {

    private final int id;

    private String brand;

    private String model;

    public Car0(String brand, String model) {
        this.id = -1;
        this.brand = brand;
        this.model = model;
    }

    public Car0(int id, String brand, String model) {
        this.id = id;
        this.brand = brand;
        this.model = model;
    }

    public Car0(JsonObject json) {
        this.brand = json.getString("BRAND");
        this.model = json.getString("MODEL");
        this.id = json.getInteger("ID");
    }

    public Car0() {
        this.id = -1;
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
