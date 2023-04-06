package com.lokesh.spring.kafka.controllers;

import com.lokesh.spring.kafka.model.SuperHero;
import com.lokesh.spring.kafka.service.ProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value = "/kafka")
public class KafkaController {

    @Autowired
    private ProducerService<SuperHero> producerService;


    @PostMapping(value = "/publish/message")
    public String sendMessageToKafkaTopic(@RequestParam("message") String message) {
        producerService.sendMessage(message);
        return "🍻🍻Successfully publisher message..!";
    }


    @PostMapping(value = "/publish")
    public Map<String, Object> sendObjectToKafkaTopic(@RequestBody SuperHero superHero) {
        producerService.sendSuperHeroMessage(superHero);

        Map<String, Object> map = new HashMap<>();
        map.put("message", "🍻🍻🍻Successfully publisher Super Hero..!");
        map.put("payload", superHero);

        return map;
    }
}
