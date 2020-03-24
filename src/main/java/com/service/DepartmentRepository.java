package com.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.modal.Department;

public interface DepartmentRepository extends JpaRepository<Department, Integer> {

}
