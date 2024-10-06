package org.spring.springreationscheck.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Employee {
    @Id
    private int id;
    private String name;
    private Integer age;
    private Integer salary;
    private String post;
    @OneToOne
    @JoinColumn(name = "address_id")
    private Address address;
    @ManyToOne
    @JoinColumn(name = "dept_id")
    private Department department;
    @ManyToMany
    @JoinTable(
            name = "employee_project",
            joinColumns = @JoinColumn(name = "e_id"),
            inverseJoinColumns = @JoinColumn(name = "p_id")
    )
    private List<Project> projects;

}
