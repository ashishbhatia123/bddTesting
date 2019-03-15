package ScenerioOutline;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef {
	WebDriver driver;
	@Given("^Open the firefox and launch the application$")
	public void open_the_firefox_and_launch_the_application() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver","D:\\BDD\\FireBug & FirePath\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("file:///D:/BDD/WorkingWithForms.html");
	   
		
		
	   
	}

	@When("^Enter the Username \"([^\"]*)\" and Password \"([^\"]*)\"$")
	public void enter_the_Username_and_Password(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("txtUName")).sendKeys(arg1);
		
		driver.findElement(By.name("txtPwd")).sendKeys(arg2);
		Thread.sleep(1000);
	   
	}

	@Then("^reset the Credential$")
	public void reset_the_Credential() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
		driver.findElement(By.name("reset")).click();
	   
	}

}
