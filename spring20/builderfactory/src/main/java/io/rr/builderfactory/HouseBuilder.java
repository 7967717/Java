package io.rr.builderfactory;

@Deprecated
@Deprecated1
public class HouseBuilder {
    @InjectByType
    Announcer announcer;
    @InjectByType
    Cleaner cleaner;

    void start(House house){
        announcer.announce("Started house building");
        cleaner.clean();
        build(house);
        announcer.announce("Finished house building");
    }

    void build(House house) {
        System.out.println("HouseBuilder ".toUpperCase() + "Building " + house.name());
    }
}
