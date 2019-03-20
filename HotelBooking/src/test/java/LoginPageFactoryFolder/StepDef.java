package LoginPageFactoryFolder;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageBean.HotelBookingLoginPageFactory;

public class StepDef {
	WebDriver driver;
	HotelBookingLoginPageFactory objLoginPageFactory;
	@Given("^user is on Login page$")
	public void user_is_on_Login_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver","D:\\BDD\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		objLoginPageFactory = new HotelBookingLoginPageFactory(driver);
		driver.get("file:///D:/Users/ASBHATIA/Desktop/module%203/login.html");
	}

	@Then("^check the title of the page$")
	public void check_the_title_of_the_page() throws Throwable {
		String heading = driver.findElement(By.xpath(".//*[@id='mainCnt']/div/div[1]/h1")).getText();
		if(heading.contentEquals("Hotel Booking Application "))
		System.out.println("********Title matched************");
		else
			System.out.println("******title not matched**********");
	  
	}

	@When("^user enters all valid data$")
	public void user_enters_all_valid_data() throws Throwable {
		objLoginPageFactory.setPfUserName("capgemini");
		objLoginPageFactory.setPfPassword("capg1234");
	   
	}

	@Then("^navigate to hotel Booking$")
	public void navigate_to_hotel_Booking() throws Throwable {
		objLoginPageFactory.setPfLoginButton();
	  
	}

	@When("^user leaves UserName empty$")
	public void user_leaves_UserName_empty() throws Throwable {
		objLoginPageFactory.setPfUserName("");
	}

	@When("^clicks the button$")
	public void clicks_the_button() throws Throwable {
		objLoginPageFactory.setPfLoginButton();
	}

	@Then("^display the text$")
	public void display_the_text() throws Throwable {
		String Message = driver.findElement(By.id("userErrMsg")).getText();
		Thread.sleep(1000);
		
		System.out.println("******" + Message);
	}

	@When("^user leaves password empty$")
	public void user_leaves_password_empty() throws Throwable {
		objLoginPageFactory.setPfUserName("capgemini");
		objLoginPageFactory.setPfPassword("");
	}

	@When("^user leaves UserName  and password empty$")
	public void user_leaves_UserName_and_password_empty() throws Throwable {
		objLoginPageFactory.setPfUserName("");
		objLoginPageFactory.setPfPassword("");
	}

	
	@When("^user leaves wrong username and password and click the login button$")
	public void user_leaves_wrong_username_and_password_and_click_the_login_button() throws Throwable {
		objLoginPageFactory.setPfUserName("kuchbhi");
		objLoginPageFactory.setPfPassword("kuchbhi");
		objLoginPageFactory.setPfLoginButton();
	}

	@Then("^display the alert box$")
	public void display_the_alert_box() throws Throwable {
		String alertMessage = driver.switchTo().alert().getText();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		System.out.println("******" + alertMessage);
	}

	
}
