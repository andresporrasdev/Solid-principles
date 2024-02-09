package com.algonquin.cst8288.assignment1.controller;


import com.algonquin.cst8288.assignment1.emoloyee.ContractEmployeeImpl;
import com.algonquin.cst8288.assignment1.emoloyee.PermanentEmployeeImpl;
import com.algonquin.cst8288.assignment1.persistence.JSONFormatter;
import com.algonquin.cst8288.assignment1.persistence.TextFormatter;

import java.io.IOException;

/**
 * 
 * Main class to execute the application
 * 
 */ 

public class Main {
	
	
	public static void main(String[] args) throws IOException {
		

		// Instantiate two Employee objects and use PermanentEmployeeService.java 
		// and ContractEmployeeService.java to calculate and populate required data for objects
		// Utilize EmployeeController.java to save both objects in JSON and Text formats, 
		// saving the data in files named json_employee_data.txt and text_employee_data.txt.
		// Do the same thing to output the data to the console instead of saving it to a file.
			//Creation instance Permanent Employee
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
            System.out.println (controllerEmployee.processEmployee(permEmployee, formatter)); // Save employee in document
            
            //Contract Employee creation
            ContractEmployeeImpl contractEmployee = new ContractEmployeeImpl();
            contractEmployee.setName("Camilo");
            contractEmployee.setEmail("123@123.com");
            contractEmployee.setAddress("321 baseline");
            contractEmployee.setSalary(6000);
            contractEmployee.setRenewalDate(contractEmployee.renewalDate());
            contractEmployee.setNumberOfServiceYear(1);
            contractEmployee.setTotalCompensation(contractEmployee.calculateTotalCompensation(contractEmployee));
            TextFormatter formatter2 = new TextFormatter(); //Creation of and instance of the format TXT
            System.out.println (controllerEmployee.processEmployee(contractEmployee, formatter2)); // Save employee in document

	}	

}
