package com.rr.myjmstest;

import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;

/**
 * @author roman.rudenko on 18-May-16.
 */
public class Producer {
    private String url = "tcp://localhost:61616";
    private String queue = "Test0";
    private String messageText = "This is a text message #4";

    public static void main(String[] args) {
        Producer producer = new Producer();
        try {
            producer.work();
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
        // Create the producer.
        Destination destination = session.createQueue(this.queue);
        MessageProducer producer = session.createProducer(destination);
        // Start sending messages
        TextMessage message = session.createTextMessage(messageText);
        producer.send(message);
        System.out.println("Sent message >>> " + message.getText());
        connection.close();
    }
}
