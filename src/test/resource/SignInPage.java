

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {
	public static WebDriver driver;
	
	@FindBy(id="email")
	private WebElement mail;
	
	@FindBy(id="passwd")
	private WebElement pass;
	
	public WebElement getMail() {
		return mail;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getSubmit() {
		return submit;
	}

	@FindBy(id="SubmitLogin")
	private WebElement submit;
	
	public SignInPage(WebDriver ldriver) {
		this.driver = ldriver;
		PageFactory.initElements(driver, this);
	}

	
	
	
}
