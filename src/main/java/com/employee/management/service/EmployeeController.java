package com.employee.management.service;

import com.employee.management.model.Employee;
import com.employee.management.model.EmployeeDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeDAO service;

    @GetMapping("/employees")
    public List<Employee> getAll(){
        return service.getAllEmplyees();
    }

    @GetMapping("/employees/{empId}")
    public Employee getEmployeeById(@PathVariable int empId){
        Employee employee = service.getEmployeeById(empId);
        return employee;
    }

    @PostMapping("/employees")
    public void saveEmployee(@RequestBody Employee employee){
        service.saveEmployee(employee);
    }

}
