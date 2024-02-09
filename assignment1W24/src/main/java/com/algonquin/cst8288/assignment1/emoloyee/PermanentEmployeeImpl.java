/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.algonquin.cst8288.assignment1.emoloyee;

import com.algonquin.cst8288.assignment1.controller.Rate;

/**
 *
 * @author camil
 */
public class PermanentEmployeeImpl extends Employee implements EmployeeService, CalculateBonus, PensionContribution{

    @Override
    public double calculateTotalCompensation(Employee employee) {
    	return employee.getSalary() + this.calculateBonus(employee);
    }

    @Override
    public double calculateBonus(Employee employee) {
    	double bonus = employee.getSalary() * Rate.BONUS_PERCENTAGE * employee.getNumberOfServiceYear(); //2. Bonus is 2.5 % base salary * years in service 
    	return bonus;
    	
    }

    @Override
    public double pensionContribution(Employee employee) {
        return employee.getSalary() * Rate.PENSION_PERCENTAGE; //2.e. Pension is 1% base salary
    }
    
}
