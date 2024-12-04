package com.github.bjan816.employee.controller;

import com.github.bjan816.employee.entity.Employee;
import com.github.bjan816.employee.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
// @RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }


    @PostMapping("/employee")
    public Employee postEmployee(@RequestBody Employee employee) { // Endpoint
        return employeeService.postEmployee(employee);
    }

}
