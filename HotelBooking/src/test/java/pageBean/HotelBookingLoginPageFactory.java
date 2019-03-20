package pageBean;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class HotelBookingLoginPageFactory {
	WebDriver driver;
	//step1 : identify elements
	@FindBy(name="userName")
	@CacheLookup
	WebElement pfUserName;
	
	//constructor
	public HotelBookingLoginPageFactory(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
		}

	@FindBy(xpath=".//*[@id='mainCnt']/div/div[1]/form/table/tbody/tr[3]/td[2]/input")
	@CacheLookup
	WebElement pfPassword;
	
	
	//initiating Elements
	//using how class
	@FindBy(how= How.CLASS_NAME, using ="btn")
	@CacheLookup
	WebElement pfLoginButton;
	
	
	
	public WebElement getPfUserName() {
		return pfUserName;
	}

	public void setPfUserName(String UserName) {
		pfUserName.sendKeys(UserName);
	}

	public WebElement getPfPassword() {
		return pfPassword;
	}

	public void setPfPassword(String Password) {
		pfPassword.sendKeys(Password);
	}

	public WebElement getPfLoginButton() {
		return pfLoginButton;
	}

	public void setPfLoginButton() {
		pfLoginButton.click();
	}

	

	

}


