package webDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef {
	WebDriver driver;
@Given("^open the Firefox and launch the application$")
public void open_the_Firefox_and_launch_the_application() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	System.setProperty("webdriver.chrome.driver","D:\\BDD\\FireBug & FirePath\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("file:///D:/BDD/WorkingWithForms.html");
  
}

@When("^Enter the Username , Password, confirmpassword, firstName,lastname,gender ,Dob,Email,address,city,phone And hobbies$")
public void enter_the_Username_Password_confirmpassword_firstName_lastname_gender_Dob_Email_address_city_phone_And_hobbies() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	//Find Username textbox and enter value
	driver.findElement(By.id("txtUserName")).sendKeys("Amit123");
	
	
	//Find password textbox and enter value
	driver.findElement(By.name("txtPwd")).sendKeys("igate");
	Thread.sleep(1000);
	
	//Find confirm password textbox and enter value
			driver.findElement(By.id("txtConfPassword")).sendKeys("igate");
			Thread.sleep(1000);

//find first name textbox and input values
driver.findElement(By.cssSelector("input.Format1")).sendKeys("Amit");


//find Last name textbox and input values
driver.findElement(By.cssSelector("input[value='Male']")).click();

//find Gender radio button and input values
driver.findElement(By.name("txtLN")).sendKeys("Pandit");

//find DateOfBirth textbox and input values
driver.findElement(By.name("DtOB")).sendKeys("12/20/1983");

//find Email textbox and input values
driver.findElement(By.name("Email")).sendKeys("amit.pandit@igate.com");

//find Address textbox and enter values
driver.findElement(By.name("Address")).sendKeys("Tilak Nagar");

Select drpCity = new Select(driver.findElement(By.name("City")));
//drpCity.selectByVisibleText("Mumbai");
drpCity.selectByIndex(1);
//drpCity.selectByIndex(1);
//find Phone textbox and enter values

driver.findElement(By.xpath(".//*[@id='txtPhone']")).sendKeys("9458207565");
driver.findElement(By.cssSelector("input[value='Music']" )).click();
driver.findElement(By.cssSelector("input[value='Reading']" )).click();

    
}

@Then("^Reset the credential$")
public void reset_the_credential() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	driver.findElement(By.name("submit")).click();
  
}


}
