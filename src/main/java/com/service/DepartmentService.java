package com.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import com.modal.Department;
import com.modal.Employee;

public class DepartmentService {

	
	@Autowired
	private DepartmentRepository deptrepo;
	
	
	 @Transactional
	    public Department get(int id) {
	        
	        return deptrepo.findById(id).get();
	    }

	    @Transactional
	    public void save(Department dept) {
	      
	        deptrepo.save(dept);
	       
	    }
}
