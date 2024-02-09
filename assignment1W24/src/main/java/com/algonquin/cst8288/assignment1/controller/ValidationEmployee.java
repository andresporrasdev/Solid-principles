/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.algonquin.cst8288.assignment1.controller;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.algonquin.cst8288.assignment1.emoloyee.Employee;



/**
 *
 * @author camil
 */
public class ValidationEmployee {
	
	// Validates the Employee object
		public  boolean isValidEmployee(Employee employee) {
			if (!ValidationEmployee.isPresent(employee.getName())) {
				return false;
			}
			employee.setName(employee.getName().trim());

			if (!ValidationEmployee.isValidAlphaNumeric(employee.getName())) {
				return false;
			}
			if (employee.getEmail() == null || employee.getEmail().trim().length() == 0) {
				return false;
			}
			employee.setEmail(employee.getEmail().trim());
			if (!ValidationEmployee.isValidEmail(employee.getEmail())) {
				return false;
			}
			
			if (!ValidationEmployee.isNoSalary(employee.getSalary())) {
				return false;
			}
			
			if (!ValidationEmployee.isNoCompensation(employee.getTotalCompensation())) {
				return false;
			}
			
			if (!ValidationEmployee.isNoServiceYear(employee.getNumberOfServiceYear())) {
				return false;
			}
			
			return true;
		}
    	/**
	 * Check for null or empty
	 * 
	 * @param value
	 * @return
	 */
	public static boolean isPresent(String value) {
		return value != null && value.trim().length() > 0;
	}
        
        /**
	 * Check for special character
	 * 
	 * @param value
	 * @return
	 */
	public static boolean isValidAlphaNumeric(String value) {
		Pattern pattern = Pattern.compile("[^A-Za-z0-9]");
		Matcher matcher = pattern.matcher(value);
		return !matcher.find();
	}
	/**
	 * Check for valid email address
	 * 
	 * @param value
	 * @return
	 */
	public static boolean isValidEmail(String value) {
		Pattern pattern = Pattern
				.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
		Matcher matcher = pattern.matcher(value);
		return matcher.find();
	}
	
	/**
	 * Check for salary
	 * 
	 * @param salary
	 * @return
	 */
        public static boolean isNoSalary(double salary) {
        return salary <= 0 ? false : true ;
	}
        
        /**
	 * Check for total compensation
	 * 
	 * @param compensation
	 * @return
	 */
	public static boolean isNoCompensation(double compensation) {
		return compensation <= 0 ? false : true ;
	}
        
        /**
	 * Check number of service year.
	 * 
	 * @param serviceYear
	 * @return
	 */
	public static boolean isNoServiceYear(int serviceYear) {
		return serviceYear <= 0 ? false : true ;
	}
}
