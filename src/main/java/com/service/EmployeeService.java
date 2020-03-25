package com.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.modal.Employee;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository emprepo;
	

    @Transactional
    public Employee get(int id) {
        
        return emprepo.findById(id).get();
    }

    @Transactional
    public void save(Employee employee) {
      
        emprepo.save(employee);
       
    }
    
    @Transactional
    public List<Employee> getAllPermanentEmployees(){
    	List<Employee> result=emprepo.getAllPermanentEmployees();
    	return result;
    }

	
}
