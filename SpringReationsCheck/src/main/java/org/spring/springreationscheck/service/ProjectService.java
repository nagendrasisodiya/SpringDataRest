package org.spring.springreationscheck.service;

import org.spring.springreationscheck.model.Project;
import org.spring.springreationscheck.repository.ProjectRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectService {
    @Autowired
    private ProjectRepo projectRepo;
    public List<Project> getAllProjects() {
        return projectRepo.findAll();
    }
    public Project getProjectById(int id) {
        return projectRepo.findById(id).get();
    }
    public void addProject(List<Project> projects) {
        projectRepo.saveAll(projects);
    }
}
