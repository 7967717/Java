package io.rr.builderfactory;

public class MessageAnnouncer implements Announcer {
    @InjectByType
    private Messenger messenger;

    public void announce(String message) {
        System.out.println(message);
        messenger.send(message);
    }
}
