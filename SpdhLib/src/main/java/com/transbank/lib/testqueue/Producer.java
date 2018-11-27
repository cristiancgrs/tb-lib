package com.transbank.lib.testqueue;

import javax.jms.Connection;
import javax.jms.DeliveryMode;
import javax.jms.Destination;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.activemq.ActiveMQConnectionFactory;

public class Producer implements Runnable{

	public void run() {
		
		try {
			System.out.println("Iniciando producer.run");
			//Create a Connection Factory
			ActiveMQConnectionFactory connectionFactory = new ActiveMQConnectionFactory("vm://localhost");
			
			//Create a Connection
			System.out.println("Producer.connection");
			Connection connection = connectionFactory.createConnection();
			System.out.println("Producer.createConnection");
			connection.start();
			System.out.println("Producer.start");
			
			//Create a Session
			Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
			
			//Create a Destination (Queue or topic)
			Destination destination = session.createQueue("TEST.FOO");
			
			//Create a MessageProducer from the Session to the Topic or Queue
			MessageProducer producer = session.createProducer(destination);
			producer.setDeliveryMode(DeliveryMode.NON_PERSISTENT);
			
			//Create a messages
			String text = "Hello World From: "+ Thread.currentThread().getName()+" : "+this.hashCode();
			TextMessage message = session.createTextMessage(text);
			
			//Tell de producer to send the message
			System.out.println("Send message: "+message.hashCode()+" : "+Thread.currentThread().getName());
			producer.send(message);
			
			//Clean up
			session.close();
			connection.close();
			
			
		}catch(Exception e) {
			System.out.println("Error: "+e);
			e.printStackTrace();
		}
	}
	
}
