package com.test.concepts;

import org.testng.annotations.Test;

public class InvocationTest {
	
	@Test
	private void searchMobile() {
		System.out.println("Search Mobile");
	}
	
	@Test(invocationCount=3)
	private void searchLaptop() {
		System.out.println("Search Laptop");
	}
	
	@Test(invocationCount=2)
	private void searchWatch() {
		System.out.println("Search Watch");
	}

}
