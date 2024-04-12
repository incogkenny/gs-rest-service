package com.example.restservice;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeManager {

    private static Employees employees = new Employees();

    static {

        // Creating a few employees and adding them to the list
        employees.getEmployeeList().add(
                new Employee(
                        1,
                        "Joshua",
                        "Muiruri",
                        "joshmuiruri@outlook.com",
                        "Intern"));

        employees.getEmployeeList().add(
                new Employee(
                        2,
                        "John",
                        "Smith",
                        "johnsmith@example.com",
                        "CEO"));

        employees.getEmployeeList().add(
                new Employee(
                        3,
                        "Jane",
                        "Doe",
                        "asdjf@gmail.com",
                        "Associate"));


    }

    // Method to return the list
    public List<Employee> getAllEmployees() {

        return employees.getEmployeeList();
    }

}
