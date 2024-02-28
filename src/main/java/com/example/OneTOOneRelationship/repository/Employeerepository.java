package com.example.OneTOOneRelationship.repository;

import com.example.OneTOOneRelationship.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Employeerepository extends JpaRepository<Employee,Integer> {
}
