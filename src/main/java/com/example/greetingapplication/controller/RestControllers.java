package com.example.greetingapplication.controller;

import com.example.greetingapplication.Model.PojoClass;
import com.example.greetingapplication.service.ServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RestControllers {
    @Autowired
    ServiceInterface service;

    @GetMapping("/company")
    public String getAllEmployee() {
        return service.printMessage();
    }

    @GetMapping("/company/{name}")
    public String inputUser(@PathVariable("name") String name) {
        return service.UseInput(name);
    }

    @GetMapping("/get")
    public List<PojoClass> getGreetMessage() {
        return service.getGreetMessage();
    }
    @GetMapping("/Message/{empId}")
    public PojoClass getEmployee(@PathVariable ("empId") long empId){
        return service.getMessage(empId);
    }
    @PostMapping ("/post")
    public PojoClass addEmployee(@RequestBody PojoClass pojoClass){
        return service.addEmployeeMessage(pojoClass);
    }

    @PutMapping("/edit/{empid}")
    public PojoClass paraID(@PathVariable ("empid") long empId,@RequestBody PojoClass employee ) {
        return service.editEmployee(empId,employee);
    }
    @PutMapping("/specific/{empid}")
    public String paraName(@PathVariable ("empid") long empId,@RequestBody PojoClass employee ) {
        return service.editEmployees(empId,employee);
    }
    @DeleteMapping("/company/Yes/{empid}")
    public String ID(@PathVariable ("empid") long empId) {
        return service.DeleteEmployee(empId);
    }
}

