package hotelBookingPackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HotelBooking {
 static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\BDD\\FireBug & FirePath\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("file:///D:/BDD/Selenium/hotelbooking.html");
	Thread.sleep(2000);
	
	driver.findElement(By.id("txtFirstName")).sendKeys("");
	Thread.sleep(2000);
	driver.findElement(By.id("btnPayment")).click();
	Thread.sleep(2000);
	alert();
	

	driver.findElement(By.id("txtFirstName")).sendKeys("ashish");
	Thread.sleep(2000);
	driver.findElement(By.id("txtLastName")).sendKeys("");
	driver.findElement(By.id("btnPayment")).click();
	alert();
	
	/*driver.findElement(By.id("txtFirstName")).sendKeys("ashish");
	Thread.sleep(2000);*/
	driver.findElement(By.id("txtLastName")).sendKeys("bhatia");
	driver.findElement(By.id("txtEmail")).sendKeys("");
	driver.findElement(By.id("btnPayment")).click();
	alert();
	
	//when emailId not valid
	/*driver.findElement(By.id("txtFirstName")).sendKeys("ashish");
	Thread.sleep(2000);
	driver.findElement(By.id("txtLastName")).sendKeys("bhatia");*/
	driver.findElement(By.id("txtEmail")).sendKeys("abc");
	driver.findElement(By.id("btnPayment")).click();
	alert();
	
	
	/*driver.findElement(By.id("txtFirstName")).sendKeys("ashish");
	Thread.sleep(2000);
	driver.findElement(By.id("txtLastName")).sendKeys("bhatia");*/
	driver.findElement(By.id("txtEmail")).clear();
	driver.findElement(By.id("txtEmail")).sendKeys("ashishbhatia@gmail.com");
	driver.findElement(By.id("txtPhone")).sendKeys("");
	// validation on mobile no
	//driver.findElement(By.cssSelector("input[pattern='[789][0-9]{9}]")).sendKeys("7896");
	driver.findElement(By.id("btnPayment")).click();
	alert();
	
	/*driver.findElement(By.id("txtFirstName")).sendKeys("ashish");
	Thread.sleep(2000);
	driver.findElement(By.id("txtLastName")).sendKeys("bhatia");
	driver.findElement(By.id("txtEmail")).sendKeys("ashishbhatia@gmail.com");*/
	driver.findElement(By.id("txtPhone")).clear();
	driver.findElement(By.id("txtPhone")).sendKeys("123456");
	
	driver.findElement(By.id("btnPayment")).click();
	alert();
	
/*	driver.findElement(By.id("txtFirstName")).sendKeys("ashish");
	Thread.sleep(2000);
	driver.findElement(By.id("txtLastName")).sendKeys("bhatia");
	driver.findElement(By.id("txtEmail")).sendKeys("ashishbhatia@gmail.com");*/
	driver.findElement(By.id("txtPhone")).clear();
	driver.findElement(By.id("txtPhone")).sendKeys("9458207565");
	driver.findElement(By.xpath("html/body/div/div/form/table/tbody/tr[6]/td[2]/textarea")).sendKeys("f-220 kamla nagar agra");
	Select drpCity = new Select(driver.findElement(By.name("city")));
	drpCity.selectByVisibleText("Select City");
	driver.findElement(By.id("btnPayment")).click();
	alert();
	
	
	/*driver.findElement(By.id("txtFirstName")).sendKeys("ashish");
	Thread.sleep(2000);
	driver.findElement(By.id("txtLastName")).sendKeys("bhatia");
	driver.findElement(By.id("txtEmail")).sendKeys("ashishbhatia@gmail.com");
	driver.findElement(By.id("txtPhone")).sendKeys("9458207565");
	driver.findElement(By.xpath("html/body/div/div/form/table/tbody/tr[6]/td[2]/textarea")).sendKeys("f-220 kamla nagar agra");*/
	Select drpCity2 = new Select(driver.findElement(By.name("city")));
	drpCity2.selectByVisibleText("Pune");
	Select drpState = new Select(driver.findElement(By.name("state")));
	drpState.selectByIndex(0);
	driver.findElement(By.id("btnPayment")).click();
	alert();
	
	// not check on Number of guest staying
/*	driver.findElement(By.id("txtFirstName")).sendKeys("ashish");
	Thread.sleep(2000);
	driver.findElement(By.id("txtLastName")).sendKeys("bhatia");
	driver.findElement(By.id("txtEmail")).sendKeys("ashishbhatia@gmail.com");
	driver.findElement(By.id("txtPhone")).sendKeys("9458207565");
	driver.findElement(By.xpath("html/body/div/div/form/table/tbody/tr[6]/td[2]/textarea")).sendKeys("f-220 kamla nagar agra");
	Select drpCity3 = new Select(driver.findElement(By.name("city")));
	drpCity3.selectByVisibleText("Pune");*/
	Select drpState2 = new Select(driver.findElement(By.name("state")));
	drpState2.selectByIndex(1);
	Select drpPerson = new Select(driver.findElement(By.name("persons")));
	drpPerson.selectByIndex(3);
	driver.findElement(By.id("btnPayment")).click();
	alert();
	
	
	
	//card holder
	/*driver.findElement(By.id("txtFirstName")).sendKeys("ashish");
	Thread.sleep(2000);
	driver.findElement(By.id("txtLastName")).sendKeys("bhatia");
	driver.findElement(By.id("txtEmail")).sendKeys("ashishbhatia@gmail.com");
	driver.findElement(By.id("txtPhone")).sendKeys("9458207565");
	driver.findElement(By.xpath("html/body/div/div/form/table/tbody/tr[6]/td[2]/textarea")).sendKeys("f-220 kamla nagar agra");
	Select drpCity4 = new Select(driver.findElement(By.name("city")));
	drpCity4.selectByVisibleText("Pune");
	Select drpState3 = new Select(driver.findElement(By.name("state")));
	drpState3.selectByIndex(1);
	Select drpPerson2 = new Select(driver.findElement(By.name("person")));
	drpPerson2.selectByIndex(3);*/
	driver.findElement(By.name("txtFN")).sendKeys("");
	driver.findElement(By.id("btnPayment")).click();
	alert();
  Thread.sleep(1000);
	//debit card no
	
	/*driver.findElement(By.id("txtFirstName")).sendKeys("ashish");
	Thread.sleep(2000);
	driver.findElement(By.id("txtLastName")).sendKeys("bhatia");
	driver.findElement(By.id("txtEmail")).sendKeys("ashishbhatia@gmail.com");
	driver.findElement(By.id("txtPhone")).sendKeys("9458207565");
	driver.findElement(By.xpath("html/body/div/div/form/table/tbody/tr[6]/td[2]/textarea")).sendKeys("f-220 kamla nagar agra");
	Select drpCity5 = new Select(driver.findElement(By.name("city")));
	drpCity5.selectByVisibleText("Pune");
	Select drpState4 = new Select(driver.findElement(By.name("state")));
	drpState4.selectByIndex(1);
	Select drpPerson3 = new Select(driver.findElement(By.name("state")));
	drpPerson3.selectByIndex(3);*/
	driver.findElement(By.id("txtCardholderName")).sendKeys("ashu");
	driver.findElement(By.name("debit")).sendKeys("123");
	driver.findElement(By.name("cvv")).sendKeys("123");
	driver.findElement(By.name("month")).sendKeys("123");
	driver.findElement(By.name("year")).sendKeys("123");
	driver.findElement(By.id("btnPayment")).click();
	alert();
  
	
	
	Thread.sleep(5000);
	driver.quit();
	}
	
	public static void alert()
	{
		Alert prompt = driver.switchTo().alert();
		
		String text = prompt.getText();
		System.out.println(text);
		
		prompt.accept();
		
	}

}
