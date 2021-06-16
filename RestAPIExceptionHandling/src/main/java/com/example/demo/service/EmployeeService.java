package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;

@Service
public class EmployeeService {
	
	public Employee getEmployee() throws EmployeeServiceException {
		Employee emp = new Employee();
		emp.setName("Harish");
		emp.setDesignation("Senor Consultant");
		emp.setEmpId("1");
		emp.setSalary(1000);

		return emp;
	}
	
	public Employee getEmployeeNull() throws EmployeeServiceException {
		return null;
	}
	
}
