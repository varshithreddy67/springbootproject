package com.varshith.springbootproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyPortfolioController {

    @GetMapping("/")
    public String home() {
        return "Welcome to My Spring Boot Portfolio";
    }
}