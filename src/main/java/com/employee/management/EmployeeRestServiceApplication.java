package com.employee.management;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class EmployeeRestServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeRestServiceApplication.class, args);
		System.out.println("Application was running yeeayy!!...");
	}

}
