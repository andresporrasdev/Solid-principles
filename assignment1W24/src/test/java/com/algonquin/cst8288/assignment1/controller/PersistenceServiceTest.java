package com.algonquin.cst8288.assignment1.controller;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;
import com.algonquin.cst8288.assignment1.emoloyee.PermanentEmployeeImpl;
import com.algonquin.cst8288.assignment1.persistence.JSONFormatter;

public class PersistenceServiceTest {

	@Test
	public void testSaveEmployee() throws IOException {
		PermanentEmployeeImpl permEmployee = new PermanentEmployeeImpl();
        permEmployee.setName("Andres");
        permEmployee.setEmail("123@123.com");
        permEmployee.setAddress("123 baseline");
        permEmployee.setSalary(3000);
        permEmployee.setNumberOfServiceYear(5);
        permEmployee.setTotalCompensation(permEmployee.calculateTotalCompensation(permEmployee));
        permEmployee.setBonus(permEmployee.calculateBonus(permEmployee));
        permEmployee.calculateTotalCompensation(permEmployee);
        EmployeeController controllerEmployee = new EmployeeController(); //New instance of controller
        JSONFormatter formatter = new JSONFormatter(); //Creation of and instance of the format JSON
        String testEmployee = controllerEmployee.processEmployee(permEmployee, formatter); // Save employee in document
         Assert.assertEquals("SUCCESS", testEmployee);
	}

}
