package com.example.restservice;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employees")
public class EmployeeController {


    private final EmployeeManager employeeManager = new EmployeeManager();

    @GetMapping
    public Employees getEmployees() {
        return employeeManager.getAllEmployees();
    }

    @PostMapping
    public ResponseEntity<Object> addEmployee(@RequestBody Employee employee) {

        int id = employeeManager.getAllEmployees().getEmployeeList().size() + 1;
        employee.setEmployee_id(id);

        employeeManager.addEmployee(employee);

        return ResponseEntity.accepted().body(employee);
    }

}
