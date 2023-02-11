package com.example.greetingapplication.controller;

import com.example.greetingapplication.service.ServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RestControllers {
    @Autowired
    ServiceInterface service;
    @GetMapping("/company")
    public String getAllEmployee(){
        return service.printMessage();
    }

}
