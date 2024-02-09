package com.algonquin.cst8288.assignment1.persistence;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import com.algonquin.cst8288.assignment1.emoloyee.Employee;

public class PersistenceService {
	/**
	 * Write data into file but it violates DIP
	 * 
	 * @param employee
	 * @throws IOException
	 * 
	 * 
	 */
	public void saveEmployee (Employee person, String filename, Formatter formatter) throws IOException {
		
            
//		JSONFormatter formatter = new JSONFormatter();
		try (PrintWriter writer = new PrintWriter(new FileWriter(filename))) {
			writer.println(formatter.format(person, filename, formatter));
			writer.flush();
		}
	}

		// TODO Auto-generated method stub
		
}