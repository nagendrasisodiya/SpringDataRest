package org.spring.springreationscheck.service;

import org.spring.springreationscheck.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.spring.springreationscheck.repository.DepartmentRepo;
import org.spring.springreationscheck.repository.EmployeeRepo;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepo employeeRepo;
    @Autowired
    private DepartmentRepo departmentRepo;
    public List<Employee> getAllEmployees() {
        return employeeRepo.findAll();
    }
    public Employee getEmployeeById(int id) {
        return employeeRepo.findById(id).get();
    }
    public void addEmployee(List<Employee>employee) {
        employeeRepo.saveAll(employee);
    }
}
