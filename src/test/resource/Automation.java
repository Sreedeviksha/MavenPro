import org.openqa.selenium.WebDriver;

import com.auto.baseclass.BaseClass;

public class Automation extends BaseClass {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = getBrowser("chrome");
		getUrl("http://automationpractice.com/index.php");
	
		HomePage hp = new HomePage(driver);
		clickonElement(hp.getSignIn());
		
		SignInPage sp = new SignInPage(driver);
		inputValuestoElement(sp.getMail(), "sdr@gmail.com");
		inputValuestoElement(sp.getPass(), "123456");
		clickonElement(sp.getSubmit());
		
		AddToCart ac = new AddToCart(driver);
		mouseHoverToElement(ac.getWomen());
		mouseHoverToElement(ac.getTshirts());
		clickonElement(ac.getTshirts());
		mouseHoverToElement(ac.getQview1());
		mouseHoverToElement(ac.getQview());
		clickonElement(ac.getQview());
		switchToFrameusingId("id", 0);
		clickonElement(ac.getQuantity());
		clickonElement(ac.getAddtocart());
		clickonElement(ac.getChkout());
		clickonElement(ac.getChkout2());
		clickonElement(ac.getChkout3());
		clickonElement(ac.getAgreebtn());
		clickonElement(ac.getChkout4());
		clickonElement(ac.getBankwire());
		clickonElement(ac.getConfirm());
		
		quitWindow();
		
	}
}