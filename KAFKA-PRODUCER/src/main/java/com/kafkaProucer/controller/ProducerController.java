package com.kafkaProucer.controller;

import com.kafkaProucer.controller.service.ProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/producer")
public class ProducerController {

    @Autowired
    private ProducerService producerService;

    @PostMapping("/message/{message}")
    public String produceMessage(@PathVariable String message){
        producerService.produceMessage(message);
        return "Message produced successfully";
    }
}
