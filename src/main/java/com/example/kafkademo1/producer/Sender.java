package com.example.kafkademo1.producer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;


public class Sender {

    private static final Logger LOGGER = LoggerFactory.getLogger(Sender.class);

    //For sending messages we will be using the KafkaTemplate which wraps a Producer and provides convenience methods to send data to
    //Kafka topics. The template provides asynchronous send methods which return a ListenableFuture.

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void send(String payload) {
        LOGGER.info("sending payload='{}'", payload);
        kafkaTemplate.send("helloworld.t", payload); //Kafka broker default settings cause it to auto-create a topic when a request for
        //an unknown topic is received.
    }

}