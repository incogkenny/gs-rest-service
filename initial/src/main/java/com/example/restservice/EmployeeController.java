package com.example.restservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/employees")
public class EmployeeController implements ErrorController {

    @Autowired
    private EmployeeManager employeeManager;
    @GetMapping(
            path = "http://localhost:8080/employees"
    )
    public List<Employee> getEmployees(){
        return employeeManager.getAllEmployees();
    }

    @RequestMapping(value = "/error")
    public String error() {
        return "Error handling";
    }

    public String getErrorPath() {
        return "/error";
    }


}
