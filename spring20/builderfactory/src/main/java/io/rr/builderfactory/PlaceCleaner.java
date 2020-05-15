package io.rr.builderfactory;

public class PlaceCleaner implements Cleaner {
    @InjectByType
    private Messenger messenger;

    @Override
    public void clean() {
        System.out.println("PlaceCleaner ".toUpperCase() + "Cleaning building place");
    }
}
