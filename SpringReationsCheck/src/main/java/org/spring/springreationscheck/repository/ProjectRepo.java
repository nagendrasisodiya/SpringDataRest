package org.spring.springreationscheck.repository;

import org.spring.springreationscheck.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepo extends JpaRepository<Project, Integer> {
}
