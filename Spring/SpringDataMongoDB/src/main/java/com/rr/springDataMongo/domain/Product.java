package com.rr.springDataMongo.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author roman.rudenko on 14-Apr-16.
 */
@Document
public class Product {

    @Id
    private final String id;
    private final String warehouse;
    private final float price;

    public Product(String id, String warehouse, float price) {
        this.id = id;
        this.warehouse = warehouse;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public String getWarehouse() {
        return warehouse;
    }

    public float getPrice() {
        return price;
    }
}
