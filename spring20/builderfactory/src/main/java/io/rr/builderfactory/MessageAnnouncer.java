package io.rr.builderfactory;

import javax.annotation.PostConstruct;

public class MessageAnnouncer implements Announcer {
    @InjectByType
    private Messenger messenger;

    @PostConstruct
    public void init() {
        System.out.println("MessageAnnouncer ".toUpperCase() + "was injected a field " +  messenger.getClass());
    }

    public void announce(String message) {
        System.out.println("MessageAnnouncer ".toUpperCase() + message);
        messenger.send(message);
    }
}
