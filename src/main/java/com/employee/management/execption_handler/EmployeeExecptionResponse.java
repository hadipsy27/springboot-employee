package com.employee.management.execption_handler;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class EmployeeExecptionResponse {

    private String errorMessage, description;
    private Date ateAndTime;

}
