package com.test.concepts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Sample {
	
	@Test
	private void test1() {
		System.out.println("Test1 Started");
		Assert.assertEquals("A","a");
		System.out.println("Test1 completed");

	}
	
	@Test
	private void test2() {
		System.out.println("Test2 Started");
		Assert.assertEquals("B","b");
		System.out.println("Test2 completed");

	}

}
