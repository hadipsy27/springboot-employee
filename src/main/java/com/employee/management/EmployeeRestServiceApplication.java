package com.employee.management;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployeeRestServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeRestServiceApplication.class, args);
		System.out.println("Application was running yeeayy!!...");
	}

}
