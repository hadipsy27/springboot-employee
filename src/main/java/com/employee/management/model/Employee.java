package com.employee.management.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
public class Employee {

    private int employeeId;
    @Size(min = 3, max = 5, message = "Invalid chars for Name")
    private String name;
    @Email
    private String email;

}
