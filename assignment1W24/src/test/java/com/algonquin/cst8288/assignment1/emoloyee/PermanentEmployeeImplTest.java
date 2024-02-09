package com.algonquin.cst8288.assignment1.emoloyee;

import org.junit.Assert;
import org.junit.Test;

public class PermanentEmployeeImplTest {
	private static final double EPSILON = 1E-12;

	@Test
	public void testCalculateTotalCompensation() {
		PermanentEmployeeImpl testPermanentEmployee = new PermanentEmployeeImpl();
        testPermanentEmployee.setSalary(6000);
        testPermanentEmployee.setNumberOfServiceYear(5);
        double result = testPermanentEmployee.calculateTotalCompensation(testPermanentEmployee);
        Assert.assertEquals(6750, result,EPSILON);
		//fail("Not yet implemented");
	}

	@Test
	public void testCalculateBonus() {
		PermanentEmployeeImpl testCotestPermanentEmployeentractEmployee = new PermanentEmployeeImpl();
        testCotestPermanentEmployeentractEmployee.setSalary(6000);
        testCotestPermanentEmployeentractEmployee.setNumberOfServiceYear(5);
        double result = testCotestPermanentEmployeentractEmployee.calculateBonus(testCotestPermanentEmployeentractEmployee);
        Assert.assertEquals(750, result,EPSILON);
	}

	@Test
	public void testPensionContribution() {
		PermanentEmployeeImpl testPermanentEmployee = new PermanentEmployeeImpl();
        testPermanentEmployee.setSalary(6000);
        double result = testPermanentEmployee.pensionContribution(testPermanentEmployee);
        Assert.assertEquals(60, result,EPSILON);
		//fail("Not yet implemented");
	}

}
