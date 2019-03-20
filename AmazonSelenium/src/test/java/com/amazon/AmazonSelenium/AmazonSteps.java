package com.amazon.AmazonSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AmazonSteps {

	WebDriver driver;

	@Given("^Open Chrome Browser$")
	public void open_Chrome_Browser() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "D:\\\\BDD\\\\chromedriver_win32\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		// open amazon
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@When("^click on departments after that click on lightining after that select bulb to add in cart$")
	public void click_on_departments_after_that_click_on_lightining_after_that_select_bulb_to_add_in_cart()
			throws Throwable {

		// click on Departments
		driver.findElement(By.id("nav-link-shopall")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// click on Lightning
		driver.findElement(By.xpath("//*[@id=\"a-page\"]/div[1]/div/div[2]/div[1]/div/a[1]")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// click on Bulb to be added to cart
		driver.findElement(By.xpath("//*[@id=\"result_0\"]/div/div/div/div[2]/div[1]/div[1]/a")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// add to Cart
		driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@Then("^bulb is added in cart$")
	public void bulb_is_added_in_cart() throws Throwable {

		// open cart
		driver.findElement(By.xpath("//*[@id=\"hlb-view-cart-announce\"]")).click();

	}

}
