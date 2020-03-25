package com.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.modal.Attempt;

@Service
public class AttemptService {

	@Autowired
	private AttemptRepository att;
	//public Attempt getAttempt(int userId, int attemptId) {
	//	return att.getAttempt(userId, attemptId);
	//}
}
