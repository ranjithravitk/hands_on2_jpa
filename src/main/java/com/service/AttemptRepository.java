package com.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.modal.Attempt;

@Repository
public interface AttemptRepository extends JpaRepository<Attempt, Integer> {

	
}
