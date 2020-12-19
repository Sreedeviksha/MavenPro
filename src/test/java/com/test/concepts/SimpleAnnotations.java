package com.test.concepts;

import org.testng.annotations.*;


public class SimpleAnnotations {

	// STCM
	@BeforeSuite
	private void setUp() {
		System.out.println("Set Up");
	}

	@BeforeTest
	private void browserLaunch() {
		System.out.println("Browser Launch");
	}

	@BeforeClass
	private void enterUrl() {
		System.out.println("Enter Url");
	}

	@BeforeMethod
	private void logIn() {
		System.out.println("Log In");
	}

	@Test
	private void searchMobile() {
		System.out.println("Search Mobile");
	}

	@Test
	private void searchLaptop() {
		System.out.println("Search Laptop");
	}

	@AfterMethod
	private void logOut() {
		System.out.println("LogOut");
	}

	@AfterClass
	private void verifyHomePage() {
		System.out.println("Verify home Page");
	}

	@AfterTest
	private void closeBrowser() {
		System.out.println("Close Browser");
	}

	@AfterSuite
	private void deleteCookies() {
		System.out.println("Delete Cookies");
	}

}
