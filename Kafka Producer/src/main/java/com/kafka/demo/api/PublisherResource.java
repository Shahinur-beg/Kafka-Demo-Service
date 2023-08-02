package com.kafka.demo.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Shahinur Beg
 * Created date : 6/19/2023
 */
@RestController
public class PublisherResource {
    @Autowired
    private KafkaTemplate<String, Object> template;

    @GetMapping("/publish/{message}")
    public String publishMessage(@PathVariable String message){

        template.send("topic3", message);

        return "Data Published";
    }
}
