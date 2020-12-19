package com.test.concepts;

import org.testng.annotations.Test;

public class PriorityTest {
	
	@Test(priority=2)//same priority it will take in alphabetical ordr
	private void searchMobile() {
		System.out.println("Search mobile");
	}

	@Test //  Non prioritised will be executed first
	private void searchLaptop() {
		System.out.println("Search Laptop");
	}

	@Test(priority=2)
	private void searchTv() {
		System.out.println("Search Tv");
	}

	@Test(priority=3)
	private void searchWatch() {
		System.out.println("Search watch");
	}

	@Test(priority=4)
	private void searchFruits() {
		System.out.println("Search fruits");
	}

}
