package com.example.kafkademo1.consumer;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;

public class Receiver {

    private static final Logger LOGGER = LoggerFactory.getLogger(Receiver.class);

    /*private CountDownLatch latch = new CountDownLatch(1);

    public CountDownLatch getLatch(){
        return latch;
    }*/

    //@KafkaListener annotation creates a ConcurrentMessageListenerContainer message listener container behind the scenes for each
    //method. To do so, a factory bean with name kafkaListenerContainerFactory is expected
    @KafkaListener(topics = "helloworld.t")
    public void receive(String payload) {
        LOGGER.info("received payload='{}", payload);
        //latch.countDown();
    }

}