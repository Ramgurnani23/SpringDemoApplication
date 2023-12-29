package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.Entity.Employee;
import com.example.demo.service.EmployeeService;

@RestController
@RequestMapping("/emp")
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@GetMapping
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }
	
	@GetMapping("/{empId}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable Integer empId) {
        Employee employee = employeeService.getEmployeeById(empId);
        if (employee != null) {
            return ResponseEntity.ok(employee);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
	
	@PostMapping
    public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee) {
        Employee createdEmployee = employeeService.createEmployee(employee);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdEmployee);
    }
	
	@PutMapping("/{empId}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable Integer empId, @RequestBody Employee employee) {
        Employee existingEmployee = employeeService.getEmployeeById(empId);
        if (existingEmployee != null) {
            employee.setEmpID(empId); // Make sure the ID is set
            Employee updatedEmployee = employeeService.updateEmployee(employee);
            return ResponseEntity.ok(updatedEmployee);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
	
	@DeleteMapping("/{empId}")
    public ResponseEntity<Void> deleteEmployee(@PathVariable Integer empId) {
        Employee existingEmployee = employeeService.getEmployeeById(empId);
        if (existingEmployee != null) {
            employeeService.deleteEmployee(empId);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
	

}
