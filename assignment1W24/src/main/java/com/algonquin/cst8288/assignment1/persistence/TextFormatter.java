/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.algonquin.cst8288.assignment1.persistence;

import com.algonquin.cst8288.assignment1.emoloyee.Employee;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import java.io.IOException;

/**
* This class
* should be responsible for saving the Employee object as key-value pairs, such as (name=xxxx,
* email=xyz@abc.com)
 * @author camil
 */
public class TextFormatter implements Formatter {

	@Override
	public String format(Employee employee, String filename, Formatter formatter) throws IOException {
		// TODO Auto-generated method stub
		ObjectMapper mapper = new ObjectMapper();
		mapper.registerModule(new JavaTimeModule());
		try {
			return mapper.writeValueAsString(employee);
		} catch (JsonProcessingException e) {
			throw new IOException(e);
		}
	}
    
}
