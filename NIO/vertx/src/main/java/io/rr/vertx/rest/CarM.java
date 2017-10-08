package io.rr.vertx.rest;

import io.vertx.core.json.JsonObject;

/**
 * @author roman on 12/27/16.
 */
public class CarM {

    private String id;
    private String brand;
    private String model;

    public CarM(String brand, String model) {
        this.id = "";
        this.brand = brand;
        this.model = model;
    }

    public CarM(String id, String brand, String model) {
        this.id = id;
        this.brand = brand;
        this.model = model;
    }

    public CarM(JsonObject json) {
        this.brand = json.getString("brand");
        this.model = json.getString("model");
        this.id = json.getString("_id");
    }

    public CarM() {
        this.id = "";
    }

    public JsonObject toJson() {
        JsonObject json = new JsonObject()
                .put("brand", brand)
                .put("model", model);
        if (id != null && !id.isEmpty()) {
            json.put("_id", id);
        }
        return json;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getId() {
        return id;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setId(String id) {
        this.id = id;
    }
}
