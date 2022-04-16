package com.employee.management.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
public class Employee {

    private int employeeId;
    private String name, email;


}
