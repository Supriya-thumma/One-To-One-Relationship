package com.example.OneTOOneRelationship.repository;

import com.example.OneTOOneRelationship.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Projectrepository extends JpaRepository<Project,Long> {
}
