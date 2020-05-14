package io.rr.builderfactory;

public class Main {
    public static void main(String[] args) {
        HouseBuilder houseBuilder = ObjectFactory.getInstance().createObject(HouseBuilder.class);
        houseBuilder.start(new BrickHouse("a house from bricks"));
    }
}
