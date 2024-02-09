package com.algonquin.cst8288.assignment1.emoloyee;

import java.util.Date;
import org.junit.Assert;
import org.junit.Test;

public class ContractEmployeeImplTest {
	private static final double EPSILON = 1E-12;


	@Test
	public void testRenewalDate() {
		ContractEmployeeImpl testContractEmployee = new ContractEmployeeImpl();
		testContractEmployee.setRenewalDate(testContractEmployee.renewalDate());
    	Date today = new Date();
        // Get one year later from today
        long oneYearInMillis = 365L * 24 * 60 * 60 * 1000; // milliseconds in a year
        Date oneYearLater = new Date(today.getTime() + oneYearInMillis);
		Assert.assertEquals(oneYearLater, testContractEmployee.getRenewalDate());

		//fail("Not yet implemented");
	}

	@Test
	public void testCalculateTotalCompensation() {
		ContractEmployeeImpl testContractEmployee = new ContractEmployeeImpl();
        testContractEmployee.setSalary(6000);
        double result = testContractEmployee.calculateTotalCompensation(testContractEmployee);
        Assert.assertEquals(6000, result,EPSILON);
		//fail("Not yet implemented");
	}

}
