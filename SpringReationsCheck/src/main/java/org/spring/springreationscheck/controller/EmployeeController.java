package org.spring.springreationscheck.controller;

import org.spring.springreationscheck.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.spring.springreationscheck.service.EmployeeService;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @GetMapping("/")
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }
    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable int id) {
        return employeeService.getEmployeeById(id);
    }
    @PostMapping("/")
    public void addEmployee(@RequestBody List<Employee> employee) {
        employeeService.addEmployee(employee);
    }
}
