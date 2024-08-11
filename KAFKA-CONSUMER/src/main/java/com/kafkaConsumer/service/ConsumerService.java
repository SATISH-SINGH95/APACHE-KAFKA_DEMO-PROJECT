package com.kafkaConsumer.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {

    @KafkaListener(topics = "DEMO_TOPIC", groupId = "DEMO_GRUOUP")
    public void consumesMessages(String messages){
        System.out.println("Message is received : "+ messages);
    }
}
