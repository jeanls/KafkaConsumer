package com.jean.kafkaconsumer.listener;

import com.jean.kafkaconsumer.model.User;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

//    @KafkaListener(topics = "user_topic", groupId = "group_id")
//    public void consumer(String message){
//        System.out.println(message);
//    }

    @KafkaListener(topics = "user_topic", groupId = "group_id", containerFactory = "userKafkaListenerFactory")
    public void consumer(User message){
        System.out.println(message.toString());
    }
}
