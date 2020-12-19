package com.automation.practice;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.auto.baseclass.BaseClass;
import com.automation.pom.HomePage;
import com.automation.pom.SignInPage;

public class AutomationPractice extends BaseClass {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		/*System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
*/
		/*WebElement signIn = driver.findElement(By.xpath("//a[@class='login']"));
		signIn.click();*/
		
		 driver = getBrowser("chrome");
		 getUrl("http://automationpractice.com/index.php");
		
		HomePage hp = new HomePage(driver);
		clickonElement(hp.getSignIn());

		Thread.sleep(2000);
		/*WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("viky@gmail.com");

		WebElement passwd = driver.findElement(By.id("passwd"));
		passwd.sendKeys("14789");

		WebElement submit = driver.findElement(By.id("SubmitLogin"));
		submit.click();*/
		
		SignInPage sp = new SignInPage(driver);
		inputValuestoElement(sp.getEmail(), "viky@gmail.com");
		inputValuestoElement(sp.getPasswd(), "14789");
		clickonElement(sp.getSubmit());
		

		Thread.sleep(3000);
		WebElement women = driver.findElement(By.xpath("//a[@title='Women']"));
		Actions ac = new Actions(driver);
		ac.moveToElement(women).perform();

		WebElement tshirts = driver.findElement(By.xpath("//a[@title='T-shirts']"));
		ac.moveToElement(tshirts).perform();
		tshirts.click();

		WebElement cartBlock = driver.findElement(By.xpath("//li[contains(@class,'ajax_block_product ')]"));
		ac.moveToElement(cartBlock).perform();

		WebElement addtoCart = driver
				.findElement(By.xpath("//a[@class='button ajax_add_to_cart_button btn btn-default']"));
		addtoCart.click();

		WebElement qview1 = driver.findElement(By.xpath("//li[contains(@class,'ajax_block_product ')]"));
		ac.moveToElement(qview1).perform();

		WebElement qview = driver.findElement(By.xpath("//a[@class='quick-view']"));
		ac.moveToElement(qview).perform();
		qview.click();

		driver.switchTo().frame(0);
		WebElement quantity = driver.findElement(By.xpath("(//a[@data-field-qty='qty'])[2]"));
		quantity.click();

		WebElement addToCart = driver.findElement(By.xpath("//button[@name='Submit']"));
		addToCart.click();

		Thread.sleep(3000);
		WebElement chkOut = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
		chkOut.click();

		WebElement chkOut2 = driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));
		chkOut2.click();

		WebElement chkOut3 = driver.findElement(By.xpath("//button[@name='processAddress']"));
		chkOut3.click();

		WebElement agreeBtn = driver.findElement(By.id("cgv"));
		agreeBtn.click();

		WebElement chkOut4 = driver.findElement(By.xpath("//button[@name='processCarrier']"));
		chkOut4.click();

		WebElement bankWire = driver.findElement(By.xpath("//a[@class='bankwire']"));
		bankWire.click();

		WebElement confirm = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		confirm.click();

		WebElement signOut = driver.findElement(By.xpath("//a[@class='logout']"));
		signOut.click();

		// driver.quit();

	}
}
