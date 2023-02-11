package com.example.greetingapplication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RestControllers {
    @GetMapping("/company")
    public String getAllEmployee(){
        return "Hellow";
    }
    
}
