package com.example.kafkademo1;

import com.example.kafkademo1.producer.Sender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KafkaDemo1Application implements ApplicationRunner {
    @Autowired
    Sender sender;

    public static void main(String[] args) {
        SpringApplication.run(KafkaDemo1Application.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        sender.send("Hello Spring kafka");
    }

}