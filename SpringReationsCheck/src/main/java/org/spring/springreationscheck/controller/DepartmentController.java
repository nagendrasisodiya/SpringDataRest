package org.spring.springreationscheck.controller;

import org.spring.springreationscheck.model.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.spring.springreationscheck.service.DepartmentService;

import java.util.List;

@RestController
@RequestMapping("/department")
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;
    @GetMapping("/")
    public List<Department> getAll() {
        return departmentService.getAllDepartments();
    }
    @GetMapping("/{id}")
    public Department getById(@PathVariable int id) {
        return departmentService.getDepartmentById(id);
    }
    @PostMapping("/")
    public void add(@RequestBody List<Department> department) {
        departmentService.addDepartment(department);
    }
}
