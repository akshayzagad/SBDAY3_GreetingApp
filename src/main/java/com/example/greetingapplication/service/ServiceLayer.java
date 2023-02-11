package com.example.greetingapplication.service;

import org.springframework.stereotype.Service;

@Service
public class ServiceLayer implements ServiceInterface{

    @Override
    public String printMessage() {
        return "Hello World";
    }

    @Override
    public String UseInput(String Name) {
        return " Hello World " + Name;
    }
}
