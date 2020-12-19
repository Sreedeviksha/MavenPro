package com.test.concepts;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
	
	
	@Test(dataProvider="MyDataProvider")
	private void logIn(String username, String password) {
		System.out.println("Username: "+username);
		System.out.println("Password: "+password);

	}
	
	@DataProvider(name="MyDataProvider")
	private Object[][] credentials() {
		return new Object[][] {
			{"AAA","111"},
			{"BBB","222"},
			{"CCC","333"}
	
		};
	}

}
