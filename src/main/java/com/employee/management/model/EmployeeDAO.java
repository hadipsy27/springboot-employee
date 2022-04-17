package com.employee.management.model;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Iterator;
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

    public Employee getEmployeeById(int empId) {
        return  list.stream()
                .filter(employee -> employee.getEmployeeId() == empId)
                .findAny().orElse(null);

    }

    public Employee saveEmployee(Employee employee) {
        employee.setEmployeeId(list.size()+123);
        list.add(employee);
        return employee;
    }

    public Employee deleteEmployee(int empId) {
        Iterator<Employee> iterator = list.iterator();
        while (iterator.hasNext()){
            Employee employee = iterator.next();
            if (empId == employee.getEmployeeId()){
                iterator.remove();
                return employee;
            }
        }
        return null;
    }
}
