package com.joshua.service;



import java.util.List;

import org.springframework.stereotype.Component;

import com.joshua.entity.Employee;
@Component
public interface EmployeeServiceRepo {

	Employee postEmployee(Employee s);

	Employee getEmployee(int empId);

	List<Employee> getAllEmployees();

	Employee updateEmployee(Employee params, int empId);

	String deleteEmployee(int empId);

}
