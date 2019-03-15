package webDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WorkingWithForms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*WebDriver driver=new FirefoxDriver();
		driver.get("file:///D:/BDD/WorkingWithForms.html");*/
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","D:\\BDD\\FireBug & FirePath\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("file:///D:/BDD/WorkingWithForms.html");
		
try {		
		//Find Username textbox and enter value
		driver.findElement(By.id("txtUserName")).sendKeys("Amit123");
		Thread.sleep(1000);
		
		//Find password textbox and enter value
		driver.findElement(By.name("txtPwd")).sendKeys("igate");
		Thread.sleep(1000);
		
		//Find confirm password textbox and enter value
				driver.findElement(By.id("txtConfPassword")).sendKeys("igate");
				Thread.sleep(1000);
		
	}
catch(Exception e)
{
	System.out.println("some exception");
}
// find first name textbox and input values
driver.findElement(By.cssSelector("input.Format1")).sendKeys("Amit");


// find Last name textbox and input values
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

//submit button
try {
	Thread.sleep(3000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
driver.findElement(By.name("submit")).click();

	}
	
		}
	


