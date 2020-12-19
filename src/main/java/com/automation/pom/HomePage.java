package com.automation.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	public static WebDriver driver;
	
	// WebElement signIn = driver.findElement(By.xpath("//a[@class='login']")); 

	@FindBy(xpath="//a[@class='login']")
	private WebElement signIn;

	public HomePage(WebDriver ldriver) {
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}
	
	
	public WebElement getSignIn() {
		return signIn;
	}

	

}
