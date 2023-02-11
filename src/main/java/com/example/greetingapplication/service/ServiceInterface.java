package com.example.greetingapplication.service;

import com.example.greetingapplication.Model.PojoClass;

import java.util.List;

public interface ServiceInterface {
    String printMessage();

    String UseInput(String Name);

    List<PojoClass> getGreetMessage();
    public PojoClass getMessage(Long id);

    PojoClass addEmployeeMessage(PojoClass pojoClass);

    PojoClass editEmployee(long empId, PojoClass employee);
    public String editEmployees(Long id,PojoClass employee);

    String DeleteEmployee(long empId);
}
