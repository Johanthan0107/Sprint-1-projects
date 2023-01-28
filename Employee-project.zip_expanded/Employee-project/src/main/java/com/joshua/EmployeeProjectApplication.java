package com.joshua;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.joshua.entity.Company;
import com.joshua.entity.Employee;
import com.joshua.repository.EmployeeRepository;


@SpringBootApplication
public class EmployeeProjectApplication implements CommandLineRunner{
	
	@Autowired
	private EmployeeRepository employeeRepository;

	public static void main(String[] args) {
		SpringApplication.run(EmployeeProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		
		Employee emp1=new Employee();
		emp1.setEmpId(15);
		emp1.setEmpName("jeevan");
		emp1.setEmpAge(23);
		emp1.setEmpEmail("jeevan1107@gmail.com");
		emp1.setEmpMobile("9716078550");
		
		Employee emp2=new Employee();
		emp2.setEmpId(16);
		emp2.setEmpName("vishal");
		emp2.setEmpAge(24);
		emp2.setEmpEmail("vishal4622@gmail.com");
		emp2.setEmpMobile(" 8096810114");
		
		Employee emp3=new Employee();
		emp3.setEmpId(13);
		emp3.setEmpName("karthik");
		emp3.setEmpAge(25);
		emp3.setEmpEmail("karthik@gmail.com");
		emp3.setEmpMobile("9390600581");
		
		Company comp1=new Company();
		comp1.setcId(59);
		comp1.setcName("Hcl");
		comp1.setcLocation("Delhi");
		comp1.setcPincode(144001);
		
		Company comp2=new Company();
		comp2.setcId(60);
		comp2.setcName("Amazon");
		comp2.setcLocation("Hyderabad");
		comp2.setcPincode(155001);
		
		Company comp3=new Company();
		comp3.setcId(61);
		comp3.setcName("Capgemini");
		comp3.setcLocation("Pune");
		comp3.setcPincode(411003);
		
		emp1.setCompany(comp2);
		emp2.setCompany(comp3);
		emp3.setCompany(comp1);
		
		employeeRepository.save(emp1);
		employeeRepository.save(emp2);
		employeeRepository.save(emp3);
		
		System.out.println("Data Saved");
	}
}