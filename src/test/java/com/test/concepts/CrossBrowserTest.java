package com.test.concepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTest {
	
	public static WebDriver driver;
	
	
	@Test
	@Parameters("browser")
	private void test(String browserName) {
		
		if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
			 driver = new ChromeDriver();
			
		}else if (browserName.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver", "Drivers\\IEDriverServer.exe");
			 driver = new InternetExplorerDriver();
		}
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
	}

}
