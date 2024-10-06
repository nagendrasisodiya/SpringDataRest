package org.spring.springreationscheck.service;

import org.spring.springreationscheck.model.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.spring.springreationscheck.repository.DepartmentRepo;

import java.util.List;

@Service
public class DepartmentService {
    @Autowired
    private DepartmentRepo departmentRepo;
    public List<Department> getAllDepartments() {
        return departmentRepo.findAll();
    }
    public Department getDepartmentById(int id) {
        return departmentRepo.findById(id).get();
    }
    public void addDepartment(List<Department> department) {
        departmentRepo.saveAll(department);
    }
}
