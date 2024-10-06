package org.spring.springreationscheck.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Project {
    @Id
    private int id;
    private String name;
    private String description;
    @ManyToMany(mappedBy = "projects")
    @JsonIgnore
    private List<Employee> employees;
}
