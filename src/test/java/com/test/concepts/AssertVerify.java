package com.test.concepts;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertVerify {

	// Hard Assert
	@Test
	private void test1() {
		System.out.println("Assertion started");
		Assert.assertEquals("Arun", "ArunKumar");
		System.out.println("Assertion completed");
	}

	// Soft Assert
	@Test
	private void test2() {
		SoftAssert soft = new SoftAssert();
		System.out.println("Verification started");
		soft.assertEquals("Bala", "Balaji");
		System.out.println("Verification completed");
		soft.assertAll();
	}

	/*@Test
	private void sample() {
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");

		SoftAssert soft = new SoftAssert();
		soft.assertEquals("Gooogle", driver.getTitle());
		System.out.println("Assert completed");
		soft.assertAll();

	}*/

}
