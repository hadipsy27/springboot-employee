package com.employee.management.model;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class EmployeeDAO {
    static List<Employee> list = new ArrayList<>();

    static {
        list.add(new Employee(123, "Bibo", "bibo@gmail.com"));
        list.add(new Employee(124, "Jojo", "jojo@gmail.com"));
        list.add(new Employee(125, "Rara", "rara@gmail.com"));
    }

    public List<Employee> getAllEmplyees(){
        return list; // Sudah di inisialisasi di atas
    }
}
