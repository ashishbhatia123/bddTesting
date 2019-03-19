package LoginFolder;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef {
	WebDriver driver;
	@Given("^Open the firefox and launch the application$")
	public void open_the_firefox_and_launch_the_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver","D:\\BDD\\FireBug & FirePath\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("file:///D:/Users/ASBHATIA/Desktop/module%203/login.html");
	}
	
	

	@When("^Enter the Username and Password$")
	public void enter_the_Username_and_Password(DataTable arg1) throws Throwable {
	 
		List<List<String>> data= arg1.raw();
		for(int i=0;i<data.size();i++)
		{
			driver.findElement(By.name("userName")).clear();
			driver.findElement(By.xpath(".//*[@id='mainCnt']/div/div[1]/form/table/tbody/tr[3]/td[2]/input")).clear();
			driver.findElement(By.name("userName")).sendKeys(data.get(i).get(0));
			driver.findElement(By.xpath(".//*[@id='mainCnt']/div/div[1]/form/table/tbody/tr[3]/td[2]/input")).sendKeys(data.get(i).get(1));
			Thread.sleep(2000);
			driver.findElement(By.className("btn")).click();
			System.out.println("username="+data.get(i).get(0) +"password= "+ data.get(i).get(1));
			System.out.println("username="+data.get(i).get(0).length() +"password= "+ data.get(i).get(1).length());
			if((data.get(i).get(0).length()==0||data.get(i).get(0).equals("")) &&data.get(i).get(1).length()!=0)
			{
				System.out.println("p");
				String Message = driver.findElement(By.id("userErrMsg")).getText();
				Thread.sleep(1000);
				
				System.out.println("******" + Message);
				
				
			}
			else if(data.get(i).get(0).length()==0 &&data.get(i).get(1).length()==0 )
			{
				String uMessage = driver.findElement(By.id("userErrMsg")).getText();
				Thread.sleep(1000);
				String pMessage = driver.findElement(By.id("pwdErrMsg")).getText();
				Thread.sleep(1000);
				System.out.println("******" + uMessage);
				System.out.println("******" + pMessage);
				System.out.println("a");
				
				
			}
			else if((data.get(i).get(0).length()!=0||data.get(i).get(0).equals("")) &&data.get(i).get(1).equals("") )
			{
				
				String pMessage = driver.findElement(By.id("pwdErrMsg")).getText();
				Thread.sleep(1000);
				
				System.out.println("******" + pMessage);
				
				System.out.println("b");
			
			}
			else if(data.get(i).get(0).equals("capgemini") &&data.get(i).get(1).equals("capg1234") )
			{
				
				
				System.out.println("******Login Succesfull*******");
			
				
			}
			
			else
			{
				String alertMessage = driver.switchTo().alert().getText();
				Thread.sleep(1000);
				driver.switchTo().alert().accept();
				System.out.println("******" + alertMessage);
				System.out.println("d");
				
			
			}
			
		}
		
	}
	    

	@Then("^reset the Credential$")
	public void reset_the_Credential() throws Throwable {
		driver.close();
		System.out.println("*****************Thankyou for using our application**************");
	}

}
