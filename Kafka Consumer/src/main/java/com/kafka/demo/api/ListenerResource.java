package com.kafka.demo.api;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Shahinur Beg
 * Created date : 6/19/2023
 */
@RestController
public class ListenerResource {

    List<String> messages = new ArrayList<>();

    @KafkaListener(groupId = "group1", topics = "topic3")
    public List<String> getMessageFromTopic(String data){
        System.out.println(data);
        messages.add(data);
        return messages;
    }

    @GetMapping("/consumed")
    public List<String> consumedMessage(){
        return messages;
    }
}
