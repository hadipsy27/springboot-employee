package com.employee.management.service;

import com.employee.management.model.Employee;
import com.employee.management.model.EmployeeDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeDAO service;

    @GetMapping("/employees")
    public List<Employee> getAll(){
        return service.getAllEmplyees();
    }

}