package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Employee;
import com.example.demo.repo.EmployeeRepo;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepo employeeRepo;
	
	// This constructor is used for JUnit/Mockito Testing purpose
	public EmployeeService(EmployeeRepo empRepo) {
		this.employeeRepo = empRepo;
	}

	public List<Employee> getAllEmployees() {
        return employeeRepo.findAll();
    }

    public Employee getEmployeeById(Integer empId) {
        return employeeRepo.findById(empId).orElse(null);
    }

    public Employee createEmployee(Employee employee) {
        return employeeRepo.save(employee);
    }

    public Employee updateEmployee(Employee employee) {
        return employeeRepo.save(employee);
    }

    public void deleteEmployee(Integer empId) {
    	employeeRepo.deleteById(empId);
    }
}
