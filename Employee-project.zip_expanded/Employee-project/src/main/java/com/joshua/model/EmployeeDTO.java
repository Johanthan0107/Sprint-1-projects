package com.joshua.model;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
@Data
public class EmployeeDTO {
	
	@NotBlank(message="empty not allowed")
	@NotBlank(message="what is your name")
	@Size(min=3,max=17,message="Name must be with in 3 to 15 charcters")
	private String empName;
	
	private long salary;
	
	@NotBlank(message="empty not allowed")
	@NotBlank(message="what is your deportment")
	@Size(min=3,max=17,message="Name must be with in 2 to 15 charcters")
	private String deportment;

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	public String getDeportment() {
		return deportment;
	}

	public void setDeportment(String deportment) {
		this.deportment = deportment;
	}
	

}
