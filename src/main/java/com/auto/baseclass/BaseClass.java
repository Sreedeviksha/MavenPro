package com.auto.baseclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {

	public static WebDriver driver;

	public static WebDriver getBrowser(String browsername) {
		try {
			if (browsername.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
				driver = new ChromeDriver();

			} else if (browsername.equalsIgnoreCase("gecko")) {
				System.setProperty("webdriver.gecko.driver", ".\\geckodriver.exe");
				driver = new FirefoxDriver();

			} else {
				System.out.println("Invalid BrowserName");
			}

			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return driver;

	}
	
	public static void waitForElementVisibility(WebElement element) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.visibilityOf(element));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void getUrl(String url) {
		try {
			driver.get(url);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void inputValuestoElement(WebElement element, String value) {
		waitForElementVisibility(element);
		try {
			element.sendKeys(value);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void clickonElement(WebElement element) {
		
		try {
			waitForElementVisibility(element);
			element.click();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void selectDropDown(WebElement element, String value, String option) {
		waitForElementVisibility(element);
		try {
			Select s = new Select(element);
			if (option.equalsIgnoreCase("value")) {
				s.selectByValue(value);
			} else if (option.equalsIgnoreCase("visibletext")) {
				s.selectByVisibleText(value);
			} else if (option.equalsIgnoreCase("index")) {
				s.selectByIndex(Integer.parseInt(value));
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}

	}

	public static void mouseHoverToElement( WebElement element) {
		waitForElementVisibility(element);
		try {
			Actions ac = new Actions(driver);
			ac.moveToElement(element).perform();			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void switchToFrameusingId(String option, int index) {
		
		try {
			if (option.equalsIgnoreCase("id")) {
				driver.switchTo().frame(index);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}
	
	public static void switchToFrameUsingName(String option, String Framename) {
		
		try {
			if (option.equalsIgnoreCase("name")) {
				driver.switchTo().frame(Framename);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void switchToFrameUsingElement(String option, String element) {
		if (option.equalsIgnoreCase("element")) {
			driver.switchTo().frame(element);

		}
	}
	
	
	public static void closeWindow() {
		try {
			driver.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void quitWindow() {
		try {
			driver.quit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	
	
	
	
	}
