package alertDemoPackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","D:\\BDD\\FireBug & FirePath\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("file:///D:/BDD/Selenium/AlertBoxDemos.html");
	
			Thread.sleep(2000);
		
		driver.findElement(By.id("alert")).click();
	
			Thread.sleep(2000);
		
		Alert alert=driver.switchTo().alert();
		System.out.println("The alert message is: "+alert.getText());
		alert.accept();
		
			Thread.sleep(2000);
		
		driver.findElement(By.id("confirm")).click();
		
			Thread.sleep(2000);
		
		
		Alert confirm =driver.switchTo().alert();
		confirm.accept();
			Thread.sleep(2000);
		
		driver.findElement(By.id("confirm")).click();
		Thread.sleep(2000);
		confirm =driver.switchTo().alert();
		confirm.dismiss();
			Thread.sleep(2000);
			
		driver.findElement(By.id("prompt")).click();
		Thread.sleep(2000);
		
		Alert prompt = driver.switchTo().alert();
		
		String text = prompt.getText();
		System.out.println(text);
		
		
		prompt.sendKeys("ratuja");
		
		Thread.sleep(2000);
		
		prompt.accept();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("prompt")).click();
		Thread.sleep(2000);
		
		prompt = driver.switchTo().alert();
		prompt.dismiss();
		
		Thread.sleep(2000);
		driver.quit();
	}

}
