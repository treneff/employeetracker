package com.codeclan.example.employeetracker;

import com.codeclan.example.employeetracker.models.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.codeclan.example.employeetracker.repositories.EmployeeRepository;

@SpringBootTest
class EmployeetrackerApplicationTests {
@Autowired
	EmployeeRepository employeeRepository;
	@Test
	void contextLoads() {
	}

	@Test
	public void createSingleEmployeeAndSave(){
		Employee ruth = new Employee("bob",28,112, "bob@bob");
		employeeRepository.save(ruth);
	}

}
