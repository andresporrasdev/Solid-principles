/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.algonquin.cst8288.assignment1.emoloyee;

import java.util.Date;

/**
 *
 * @author camil
 */
public class ContractEmployeeImpl extends Employee implements RenewalDate, EmployeeService{

    @Override
    public Date renewalDate() {
    	Date today = new Date();
        // Get one year later from today
        long oneYearInMillis = 365L * 24 * 60 * 60 * 1000; // milliseconds in a year
        Date oneYearLater = new Date(today.getTime() + oneYearInMillis);
    	return oneYearLater;
    }

    @Override
    public double calculateTotalCompensation(Employee employee) {
        return employee.getSalary();
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
