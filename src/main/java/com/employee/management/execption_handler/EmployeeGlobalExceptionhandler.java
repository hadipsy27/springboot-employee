package com.employee.management.execption_handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.Date;

@RestController
@ControllerAdvice
public class EmployeeGlobalExceptionhandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<Object> handleAllException(Exception exception, WebRequest webRequest){
        EmployeeExecptionResponse employeeExecptionResponse = new EmployeeExecptionResponse(exception.getMessage(),
                webRequest.getDescription(false), new Date());
        return new ResponseEntity<Object>(employeeExecptionResponse, HttpStatus.INTERNAL_SERVER_ERROR);

    }

    @ExceptionHandler(EmployeeNotFound.class) // Spesific Error message to not found
    public ResponseEntity<Object> handleEmployeeNotFoundException(Exception exception, WebRequest webRequest){
        EmployeeExecptionResponse employeeExecptionResponse = new EmployeeExecptionResponse(exception.getMessage(),
                webRequest.getDescription(false), new Date());
        return new ResponseEntity<Object>(employeeExecptionResponse, HttpStatus.NOT_FOUND);

    }

}
