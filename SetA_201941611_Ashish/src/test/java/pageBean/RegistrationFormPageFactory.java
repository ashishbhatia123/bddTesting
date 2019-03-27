package pageBean;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegistrationFormPageFactory {

	WebDriver driver;
	//step1 : identify elements
	@FindBy(how= How.XPATH, using =".//*[@id='usrID']")
	@CacheLookup
	WebElement pfUserId;
	
	@FindBy(how= How.XPATH, using =".//*[@id='pwd']")
	@CacheLookup
	WebElement pfPassword;
	
	@FindBy(how= How.XPATH, using =".//*[@id='usrname']")
	@CacheLookup
	WebElement pfName;
	
	@FindBy(how= How.XPATH, using =".//*[@id='addr']")
	@CacheLookup
	WebElement pfAddress;
	

	
	@FindBy(how= How.XPATH, using ="html/body/form/ul/li[10]/select")
	@CacheLookup
	WebElement pfCountry;
	
	@FindBy(how= How.XPATH, using ="html/body/form/ul/li[12]/input")
	@CacheLookup
	WebElement pfZipCode;
	
	@FindBy(how= How.XPATH, using ="html/body/form/ul/li[14]/input")
	@CacheLookup
	WebElement pfemail;
	

	@FindBy(how = How.CSS, using = "[type='radio'][value='Male']")
	@CacheLookup
	 WebElement pfSex;
	
	
	@FindBy(how = How.CSS, using = "[type='checkbox'][value='noen']")
	@CacheLookup
	 WebElement pfLanguage;
	
	@FindBy(how= How.XPATH, using ="html/body/form/ul/li[23]/input")
	@CacheLookup
	WebElement pfSubmit;
	
	// constructor

	public RegistrationFormPageFactory(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	// all setters




	public void setPfUserId(String uid) {
		pfUserId.sendKeys(uid);
	}

	public void setPfPassword(String password) {
		pfPassword.sendKeys(password);;
	}

	public void setPfName(String name) {
		pfName.sendKeys(name);;
	}

	public void setPfAddress(String address) {
		pfAddress.sendKeys(address);;
	}

	public void setPfCountry(String country) {
		Select drpCity= new Select(pfCountry);
		drpCity.selectByVisibleText(country);
	}

	public void setPfZipCode(String zipcode) {
	pfZipCode.sendKeys(zipcode);
	}

	public void setPfemail(String email) {
		pfemail.sendKeys(email);
	}

	public void setPfSex() {
		pfSex.click();
	}

	public void setPfLanguage() {
		pfLanguage.click();
	}

	public void setPfSubmit() {
		pfSubmit.click();
	}
	
	
	
	
	
	
}
