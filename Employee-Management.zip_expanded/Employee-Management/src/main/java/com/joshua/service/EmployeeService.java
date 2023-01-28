package com.joshua.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.joshua.entity.Employee;
import com.joshua.exception.EmployeeNotFoundException;
import com.joshua.model.EmployeeDTO;
import com.joshua.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	public Employee saveEmployee(EmployeeDTO employeeDTO) {
		Employee employee=( Employee.builder()).empName(employeeDTO.getEmpName()).salary(employeeDTO.getSalary()).deportment(employeeDTO.getDepartment()).build();
	return employeeRepository.save(employee);
	}
	
	public Employee getEmployeeById(long id) {
		return employeeRepository.findById(id).orElseThrow(
	  () -> new EmployeeNotFoundException("No Employee exist with this id: " + id));
	}
	
}
	
