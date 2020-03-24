package com.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import com.modal.Employee;
import com.modal.Skill;

public class SkillService {

	
	
	@Autowired
	private SkillRepository skillrepo;
	
	
	
	 @Transactional
	    public Skill get(int id) {
	        
	        return skillrepo.findById(id).get();
	    }

	    @Transactional
	    public void save(Skill skill) {
	      
	        skillrepo.save(skill);
	       
	    }
}
