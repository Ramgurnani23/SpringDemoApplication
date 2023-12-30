package com.example.demo.repo;

import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.service.EmployeeService;

@ExtendWith(MockitoExtension.class)
public class EmployeeServiceTest {
	
	@Mock
	private EmployeeRepo empRepo;
	
	@Autowired
	private EmployeeService empService;
	
	@BeforeEach
	void setup() {
		this.empService = new EmployeeService(this.empRepo);
	}
	
	@Test
	void getAllEmployees() {
		
		empService.getAllEmployees();
		
		verify(empRepo).findAll();
	}
}
