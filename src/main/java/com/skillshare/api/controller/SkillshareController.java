package com.skillshare.api.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/skillshare")
public class SkillshareController {
    @PostMapping
    public String receiveSkillshareData(@RequestBody String payload) {
        // You can parse JSON into a DTO later
        System.out.println("Received: " + payload);
        return "Data received";
    }
}
