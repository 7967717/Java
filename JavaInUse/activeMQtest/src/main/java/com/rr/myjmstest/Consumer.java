package com.rr.myjmstest;

import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;

/**
 * @author roman.rudenko on 18-May-16.
 */
public class Consumer {
    private String url = "tcp://localhost:61616";
    private String queue = "Test0";

    public static void main(String[] args) {
        Consumer consumer = new Consumer();
        try {
            consumer.work();
        } catch (JMSException e) {
            e.printStackTrace();
        }
    }

    private void work() throws JMSException {
        // Create the connection.
        ActiveMQConnectionFactory connectionFactory = new ActiveMQConnectionFactory(url);
        Connection connection = connectionFactory.createConnection();
        connection.start();
        // Create the session
        Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
        // Create the consumer.
        Destination destination = session.createQueue(this.queue);
        MessageConsumer consumer = session.createConsumer(destination);
        // Start receiving messages
        TextMessage message = (TextMessage) consumer.receive();
        System.out.println("Received message >>> " + message.getText());
//        connection.close();
    }
}
