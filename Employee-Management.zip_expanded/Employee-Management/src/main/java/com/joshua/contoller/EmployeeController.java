package com.joshua.contoller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.joshua.entity.Employee;
import com.joshua.model.EmployeeDTO;
import com.joshua.service.EmployeeService;

import jakarta.validation.Valid;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@PostMapping("/createEmployee")
	public ResponseEntity<Employee> saveEmployee(@RequestBody @Valid EmployeeDTO employeeDTO) {
		return new ResponseEntity<>(employeeService.saveEmployee(employeeDTO), HttpStatus.CREATED);
	}
	
	@GetMapping("/employee/{id}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable long id) {
		return ResponseEntity.ok().body(employeeService.getEmployeeById(id));
	}
	
}
