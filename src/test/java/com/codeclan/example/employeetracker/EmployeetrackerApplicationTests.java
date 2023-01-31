package com.codeclan.example.employeetracker;

import com.codeclan.example.employeetracker.models.Department;
import com.codeclan.example.employeetracker.models.Employee;
import com.codeclan.example.employeetracker.repositories.DepartmentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.codeclan.example.employeetracker.repositories.EmployeeRepository;

import java.util.ArrayList;

@SpringBootTest
class EmployeetrackerApplicationTests {
@Autowired
	EmployeeRepository employeeRepository;
@Autowired
	DepartmentRepository departmentRepository;
	@Test
	void contextLoads() {
	}

	@Test
	public void createSingleEmployeeAndDepartment(){
		Department hr = new Department("hr");
		departmentRepository.save(hr);
		Employee ruth = new Employee("bob",28,112, "bob@bob", hr);
		employeeRepository.save(ruth);
		hr.addEmployee(ruth);
		System.out.println("this is the array" + hr.getEmployees());
		System.out.println("Hr" + hr);
		departmentRepository.save(hr);
	}



}
