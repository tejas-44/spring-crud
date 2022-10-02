package com.tej.example.cruddemo.dao;

import java.util.List;

import com.tej.example.cruddemo.entity.Employee;

public interface EmployeeDAO {
	
	public List<Employee> findAll();
	
	public Employee findById(int theId);
	
	public void save(Employee theEmployee);
	
	public void deleteById(int theId);
}
