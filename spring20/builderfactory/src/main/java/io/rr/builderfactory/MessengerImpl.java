package io.rr.builderfactory;

@Singleton
//@Deprecated
//@Deprecated1
public class MessengerImpl implements Messenger {
//    @InjectProperty("sendMessageBy")
    @InjectProperty()
    private String method;

    public MessengerImpl() {
        System.out.println("MessengerImpl ".toUpperCase() + "Messenger created");
    }

    @Override
    public void send(String message) {
        System.out.println("MessengerImpl ".toUpperCase() +  "Sending message /" + message + "/ to all by " + method);
    }
}
