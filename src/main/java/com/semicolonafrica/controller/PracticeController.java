package com.semicolonafrica.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class PracticeController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello my World";
    }




}
