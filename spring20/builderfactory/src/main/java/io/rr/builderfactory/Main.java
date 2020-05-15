package io.rr.builderfactory;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = Application.run("io.rr", new HashMap<Class, Class>() {{
            put(Cleaner.class, PlaceCleaner.class);
        }});
        HouseBuilder houseBuilder = context.getObject(HouseBuilder.class);
        houseBuilder.start(new BrickHouse("a house from bricks"));
    }
}
