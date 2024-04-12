package com.example.restservice;

import org.springframework.stereotype.Repository;

@Repository
public class EmployeeManager {

    private static final Employees employees = new Employees();

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
    public Employees getAllEmployees() {

        return employees;
    }

    public void addEmployee(Employee employee) {
        employees.getEmployeeList().add(employee);
    }
}
