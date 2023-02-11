package com.example.greetingapplication.service;

import com.example.greetingapplication.Model.PojoClass;
import com.example.greetingapplication.repositry.RepositryClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ServiceLayer implements ServiceInterface{
    @Autowired
    RepositryClass repositryClass;

    @Override
    public String printMessage() {
        return "Hello World";
    }

    @Override
    public String UseInput(String Name) {
        return " Hello World " + Name;
    }

    @Override
    public List<PojoClass> getGreetMessage() {
        ArrayList<PojoClass> tableList = new ArrayList<>();
        repositryClass.findAll().forEach(tableList::add);
        return tableList;
    }
    public PojoClass getMessage(Long id) {
        return repositryClass.findById(id).orElse(null);
    }

    @Override
    public PojoClass addEmployeeMessage(PojoClass pojoClass) {
       return repositryClass.save(pojoClass);
    }

    @Override
    public PojoClass editEmployee(long empId, PojoClass employee) {
        employee.setId(empId);
        return repositryClass.save(employee);
    }
    public String editEmployees(Long id,PojoClass employee) {
        Optional<PojoClass> emp = repositryClass.findById(id);
        if (emp.isPresent()) {
            PojoClass existEmp = emp.get();
            existEmp.setFirstName(employee.getFirstName());
            existEmp.setLastName(employee.getLastName());
            existEmp.setGreetingMassage(employee.getGreetingMassage());
            repositryClass.save(existEmp);
            return "Employee Details Against ID : " + id + "Updated";
        } else {
            return "Employee Details Against ID not existed ";
        }
    }

    @Override
    public String DeleteEmployee(long empId) {
        repositryClass.deleteById(empId);
        return "Employee Deleted Successfully";
    }

}
