package com.greatlearning.employeemanagement.service;
import java.util.List;

import org.springframework.data.domain.Sort.Direction;

import com.greatlearning.employeemanagement.entity.Employee;

public interface EmployeeService {

	public List<Employee> findAll();
	
	public Employee findById(int Id);
	
	public List<Employee> findByFirstName(String firstName);
	
	public Employee save(Employee theEmployee);

	public Employee deleteById(int theId);

	List<Employee> findAllCustomSorted(Direction direction);
	
}
