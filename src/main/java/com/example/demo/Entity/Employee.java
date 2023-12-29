package com.example.demo.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="EMPLOYEE")
public class Employee {
	
	@Id
	@Column(name = "EMPID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer empID;
	
	@Column(name = "EMPNAME")
	private String empName;
	
	@Column(name = "EMPAGE")
	private String empAge;
	
	@Column(name = "EMPSALARY")
	private String empSalary;
	
	public Employee(Integer empID, String empName, String empAge, String empSalary) {
		super();
		this.empID = empID;
		this.empName = empName;
		this.empAge = empAge;
		this.empSalary = empSalary;
	}

	public Integer getEmpID() {
		return empID;
	}

	public void setEmpID(Integer empID) {
		this.empID = empID;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpAge() {
		return empAge;
	}

	public void setEmpAge(String empAge) {
		this.empAge = empAge;
	}

	public String getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(String empSalary) {
		this.empSalary = empSalary;
	}

	public Employee() {
		super();
	}
	
	
}
