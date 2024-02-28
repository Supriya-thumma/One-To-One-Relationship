package com.example.OneTOOneRelationship.service;

import com.example.OneTOOneRelationship.model.Project;
import com.example.OneTOOneRelationship.repository.Projectrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Projectservice {
    @Autowired
    private Projectrepository repo;

    public Project saveproject(Project project) {
        return repo.save(project);
    }
}
