package io.rr.builderfactory;

public class MessengerImpl implements Messenger {
//    @InjectProperty("sendMessageBy")
    @InjectProperty()
    private String method;

    @Override
    public void send(String message) {
        System.out.println("Sending message /" + message + "/ to all by " + method);
    }
}
