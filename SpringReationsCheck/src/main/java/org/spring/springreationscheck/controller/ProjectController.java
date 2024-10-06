package org.spring.springreationscheck.controller;

import org.spring.springreationscheck.model.Project;
import org.spring.springreationscheck.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/project")
public class ProjectController {
    @Autowired
    private ProjectService projectService;
    @GetMapping("/")
    public List<Project> getProject() {
        return projectService.getAllProjects();
    }
    @GetMapping("/{id}")
    public Project getProject(@PathVariable int id) {
        return projectService.getProjectById(id);
    }
    @PostMapping("/")
    public void createProject(@RequestBody List<Project> project) {
        projectService.addProject(project);
    }
}
