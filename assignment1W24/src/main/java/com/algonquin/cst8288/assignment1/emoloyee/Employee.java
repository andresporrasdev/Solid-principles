package com.algonquin.cst8288.assignment1.emoloyee;

import com.algonquin.cst8288.assignment1.controller.ValidationEmployee;
import java.util.Date;

public class Employee {

	private String name;
	private String email;
	private String address;
	private double salary;
	private int numberOfServiceYear;
	private double bonus;
	private double totalCompensation;
	private Date renewalDate;

	public Employee() {
		// Default constructor
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
                if (ValidationEmployee.isNoSalary(salary)){ //2.a. All employees receive a salary and salary is a positive integer greater than 0
                    this.salary = salary;
                }
	}

	public int getNumberOfServiceYear() {
		return numberOfServiceYear;
	}

	public void setNumberOfServiceYear(int numberOfServiceYear) {
		if (ValidationEmployee.isNoServiceYear(numberOfServiceYear)){
                    this.numberOfServiceYear = numberOfServiceYear;
            }  
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	public double getTotalCompensation() {
		return totalCompensation;
	}

	public void setTotalCompensation(double totalCompensation) {
		this.totalCompensation = totalCompensation;
	}

	public Date getRenewalDate() {
		return renewalDate;
	}

	public void setRenewalDate(Date renewalDate) {
		this.renewalDate = renewalDate;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", email=" + email + ", address=" + address + ", salary=" + salary
				+ ", numberOfServiceYear=" + numberOfServiceYear + ", bonus=" + bonus + ", totalCompensation="
				+ totalCompensation + ", renewalDate=" + renewalDate + "]";
	}

}