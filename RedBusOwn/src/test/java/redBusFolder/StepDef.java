package redBusFolder;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class StepDef {
WebDriver driver;
@Given("^user is on Home page$")
public void user_is_on_Home_page() throws Throwable {
    
    /*id="src"
    id="dest"*/
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Ashish Bhatia\\Desktop\\cap java\\bddTesting-master\\module 3\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.redbus.in/");
}

@When("^want to travel from \"([^\"]*)\" to \"([^\"]*)\"$")
public void want_to_travel_from_to(String arg1, String arg2) throws Throwable {
	driver.findElement(By.id("src")).click();
	driver.findElement(By.id("src")).sendKeys(arg1);
	Thread.sleep(1000);
	driver.findElement(By.id("dest")).click();
driver.findElement(By.id("dest")).sendKeys(arg2);
Thread.sleep(1000);

}

@When("^user enters  \"([^\"]*)\" and \"([^\"]*)\" from today$")
public void user_enters_and_from_today(String arg1, String arg2) throws Throwable {
driver.findElement(By.xpath("//*[@id=\"search\"]/div/div[3]/div/label")).click();
	String month= arg1.substring(3);
	String date = arg1.substring(0, 2);
	System.out.println(month);
	
	while (true)
	{String getMonth = driver.findElement(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[1]/td[2]")).getText();
	System.out.println(getMonth);
	System.out.println((getMonth.equalsIgnoreCase(month)));
	if(!(getMonth.equalsIgnoreCase(month)))
	{
		driver.findElement(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[1]/td[3]/button")).click();
	}
	else
		break;
		
	}
	driver.findElement(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody//td[text()='"+month+"']/../..//td[text()='"+date+ "']")).click();
	
	
	//return date
	driver.findElement(By.xpath("//*[@id=\"search\"]/div/div[4]/span")).click();
	String month2= arg2.substring(2);
	String date2 = arg2.substring(0, 1);
	System.out.println(month2);
	
	while (true)
	{String getMonth2 = driver.findElement(By.xpath("//*[@id=\"rb-calendar_return_cal\"]/table/tbody/tr[1]/td[2]")).getText();
	System.out.println(getMonth2);
	System.out.println((getMonth2.equalsIgnoreCase(month2)));
	if(!(getMonth2.equalsIgnoreCase(month2)))
	{
		driver.findElement(By.xpath("//*[@id=\"rb-calendar_return_cal\"]/table/tbody/tr[1]/td[3]/button")).click();
	}
	else
		break;
		
	}
	driver.findElement(By.xpath("//*[@id=\"rb-calendar_return_cal\"]/table/tbody//td[text()='"+month2+"']/../..//td[text()='"+date2+ "']")).click();
}

@Then("^navigate to view bus page$")
public void navigate_to_view_bus_page() throws Throwable {
	driver.findElement(By.xpath("//*[@id=\"search_btn\"]")).click();
    
}

@Given("^user is on page (\\d+)$")
public void user_is_on_page(int arg1) throws Throwable {
   System.out.println("now user is on 2nd page");
}

@When("^want to scroll down$")
public void want_to_scroll_down() throws Throwable {
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	jse.executeScript("window.scrollBy(0,250)", "");
	 Thread.sleep(1500);
			
}

@Then("^click on view seats$")
public void click_on_view_seats() throws Throwable {
	 driver.findElement(By.xpath("//*[@id=\"11602295\"]/div/div[2]/div[1]")).click();
	
	 WebElement logo = driver.findElements(By.tagName("canvas")).get(0);
     //To get the width of the logo
	 int logoWidth = logo.getSize().getWidth();
System.out.println("Logo width : "+logoWidth+" pixels");
     //To get the height of the logo
	int logoHeight = logo.getSize().getHeight();        
System.out.println("Logo height : "+logoHeight+" pixels");
}



}
