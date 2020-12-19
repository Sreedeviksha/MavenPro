package com.test.concepts;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {
	
	
	@Test
	@Parameters({"username","password"})
	
	private void logIn(@Optional("ArunKumar")String username,String password) {
		System.out.println("Username: "+username);
		System.out.println("Password: "+password);

	}

}
