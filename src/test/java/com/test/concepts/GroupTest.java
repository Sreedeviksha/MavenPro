package com.test.concepts;

import org.testng.annotations.Test;

public class GroupTest {
	
	@Test(groups="Selenium")
	private void seleniumTest1() {
		System.out.println("Log In");
	}
	@Test(groups="API")
	private void APITest1() {
		System.out.println("POST Test");
	}

	@Test(groups="Selenium")
	private void seleniumTest2() {
		System.out.println("Order of Product");
	}
	
	@Test(groups="API")
	private void APITest2() {
		System.out.println("GET Test");
	}
	
}
