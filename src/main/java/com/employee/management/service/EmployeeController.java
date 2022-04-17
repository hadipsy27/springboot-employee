package com.employee.management.service;

import com.employee.management.execption_handler.EmployeeNotFound;
import com.employee.management.model.Employee;
import com.employee.management.model.EmployeeDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
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
        if(null == employee)
            throw new EmployeeNotFound("Employee not found");
        return employee;
    }

    @PostMapping("/employees")
    public ResponseEntity<Object> saveEmployee(@RequestBody Employee employee){
        Employee newEmployee = service.saveEmployee(employee);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("{employeeId}")
                .buildAndExpand(newEmployee.getEmployeeId())
                .toUri();
        return ResponseEntity.created(uri).build();
    }

    @DeleteMapping("/employees/{id}")
    public void deleteEmployee(@PathVariable int id){
        Employee employee = service.deleteEmployee(id);
        if(null == employee){
            throw new EmployeeNotFound("Employee not found");
        }
    }


}
