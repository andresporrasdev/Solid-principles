package com.algonquin.cst8288.assignment1.controller;

import java.io.IOException;
import com.algonquin.cst8288.assignment1.emoloyee.Employee;
import com.algonquin.cst8288.assignment1.persistence.Formatter;
import com.algonquin.cst8288.assignment1.persistence.PersistenceService;
/**
 * 
 * Process, validate and save employee data.
 * 
 * 
 */

public class EmployeeController {

	public String processEmployee(Employee employee, Formatter formatter) throws IOException {

		
		// Process data
		// Calculate bonus, 
		// total compensation, 
		// pension contribution, 
		// renewal date etc.
		ValidationEmployee validator = new ValidationEmployee();
//		 Validate data
		
		if (!validator.isValidEmployee(employee)) {
			return "FALIED";
		}
		PersistenceService saveEmployee = new PersistenceService();
		
		// Store data in json and txt format
		saveEmployee.saveEmployee(employee, "json_employee_data.txt", formatter);
		saveEmployee.saveEmployee(employee, "txt_employee_data.txt", formatter);
		System.out.println(employee.toString());
		return "SUCCESS";
	
	
	}
}