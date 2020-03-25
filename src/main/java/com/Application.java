package com;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.modal.Employee;
import com.service.CountryRepository;
import com.service.EmployeeRepository;
import com.service.EmployeeService;

@SpringBootApplication
@ComponentScan("com")
public class Application {
	private static final Logger LOGGER = LoggerFactory.getLogger(Application.class);
@Autowired
	static CountryRepository r;
@Autowired
    static EmployeeService emp;
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	
		LOGGER.info("Inside main");
		//testGetAllPermanentEmployees();
	
	}
    public static void testGetAllPermanentEmployees() {
        LOGGER.info("Start");
        List<Employee> employees = emp.getAllPermanentEmployees();
        LOGGER.debug("Permanent Employees:{}", employees);
        employees.forEach(e -> LOGGER.debug("Skills:{}", e.getSkillList()));
        LOGGER.info("End");
    }


}
