package com.example.demo;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    //For more then one kafka listener groupId must be unique!

    @KafkaListener(topics = "newTopic", groupId = "groupId")
    void listener(String data) {
        System.out.println("Listener received: " + data +".");

    }
}
