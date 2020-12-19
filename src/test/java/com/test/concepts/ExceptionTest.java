package com.test.concepts;

import org.testng.annotations.Test;

public class ExceptionTest {
	
		@Test(expectedExceptions=ArithmeticException.class)
		private void test() {
			int i = 10;
			System.out.println(i/0);

		}
		
}
