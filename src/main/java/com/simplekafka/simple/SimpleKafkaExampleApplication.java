package com.simplekafka.simple;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.annotation.KafkaListener;

@EnableKafka
@SpringBootApplication
public class SimpleKafkaExampleApplication {

    @KafkaListener(topics="msg")
    public void msgListener(String key, String msg){
        System.out.println("ID = " +key +", Message = "+msg);
    }

    public static void main(String[] args) {
        SpringApplication.run(SimpleKafkaExampleApplication.class, args);
    }
}