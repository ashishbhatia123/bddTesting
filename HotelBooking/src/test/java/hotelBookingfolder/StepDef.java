package hotelBookingfolder;

import static org.junit.Assert.assertEquals;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageBean.HotelBookingPageFactory;

public class StepDef {
	WebDriver driver;
	HotelBookingPageFactory objhbpg;
	
	@Given("^User is on hotel Booking page$")
	public void user_is_on_hotel_Booking_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver","D:\\BDD\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		objhbpg = new HotelBookingPageFactory(driver);
		driver.get("file:///D:/BDD/Selenium/hotelbooking.html");
	
	}
	

	@Then("^check the title of the page$")
	public void check_the_title_of_the_page() throws Throwable {
		String title= driver.getTitle();
		if(title.contentEquals("Hotel Booking"))
			System.out.println("***Title Matched ***");
		else
			System.out.println("***Title Not matched***");
		driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
		driver.close();
		
	 
	}

	@Given("^user is on hotel booking page$")
	public void user_is_on_hotel_booking_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver","D:\\BDD\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		objhbpg = new HotelBookingPageFactory(driver);
		driver.get("file:///D:/BDD/Selenium/hotelbooking.html");
	
	}

	@When("^user enters all valid data$")
	public void user_enters_all_valid_data() throws Throwable {

		  objhbpg.setPffname("Ratuja"); Thread.sleep(1000);
		  objhbpg.setPflname("Kulkarni");Thread.sleep(1000);
		  objhbpg.setPfemail("ashishbhatia0209@gmail.com");Thread.sleep(1000);
		  objhbpg.setPfmobile("9458207565");Thread.sleep(1000);
		  objhbpg.setPfcity("Pune");Thread.sleep(1000);
		  objhbpg.setPfstate("Maharashtra");Thread.sleep(1000);
		  objhbpg.setPfpersons(5);Thread.sleep(1000);
		  objhbpg.setPfcardholder("Ratuja Kulkarni");Thread.sleep(1000);
		  objhbpg.setPfdebit("5678567867897890");
		  objhbpg.setPfcvv("067");Thread.sleep(1000);
		  objhbpg.setPfmonth("5");Thread.sleep(1000);
		  objhbpg.setPfyear("2020");
		  driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
		  objhbpg.setPfbutton();
		  Thread.sleep(1000);
		//  driver.close();
		
	  
	}

	@Then("^navigate to welcome page$")
	public void navigate_to_welcome_page() throws Throwable {
		
		driver.navigate().to("file:///D:/Users/ASBHATIA/Desktop/module%203/success.html");
		driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
		
		driver.close();
	}

	@When("^user leaves firstName empty$")
	public void user_leaves_firstName_empty() throws Throwable {
		objhbpg.setPffname(""); Thread.sleep(1000);
	  
	}

	@When("^clicks the button$")
	public void clicks_the_button() throws Throwable {
		objhbpg.setPfbutton();
	   
	}

	@Then("^display alert msg$")
	public void display_alert_msg() throws Throwable {
		String alertMessage = driver.switchTo().alert().getText();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		System.out.println("******" + alertMessage);
		driver.close();
	
	}

	@When("^user leaves lastName blank and clicks the button$")
	public void user_leaves_lastName_blank_and_clicks_the_button() throws Throwable {
		objhbpg.setPffname("Ratuja"); Thread.sleep(1000);
		objhbpg.setPflname(""); Thread.sleep(1000);
		objhbpg.setPfbutton();
	  
	}

	@When("^user enters all data$")
	public void user_enters_all_data() throws Throwable {
		 objhbpg.setPffname("Ratuja"); Thread.sleep(1000);
		  objhbpg.setPflname("Kulkarni");Thread.sleep(1000);
		  objhbpg.setPfemail("ashishbhatia0209@gmail.com");Thread.sleep(1000);
		  objhbpg.setPfmobile("9458207565");Thread.sleep(1000);
		  objhbpg.setPfcity("Pune");Thread.sleep(1000);
		  objhbpg.setPfstate("Maharashtra");Thread.sleep(1000);
		  objhbpg.setPfpersons(5);Thread.sleep(1000);
		  objhbpg.setPfcardholder("Ratuja Kulkarni");Thread.sleep(1000);
		  objhbpg.setPfdebit("5678567867897890");
		  objhbpg.setPfcvv("067");Thread.sleep(1000);
		  objhbpg.setPfmonth("5");Thread.sleep(1000);
		  objhbpg.setPfyear("2020"); Thread.sleep(1000);
	  
	}

	@When("^user enters incorrect email format and clicks the button$")
	public void user_enters_incorrect_email_format_and_clicks_the_button() throws Throwable {
	objhbpg.setPfemail("rk@.com"); Thread.sleep(1000);
	objhbpg.setPfbutton();
	}

	@When("^user leaves mobile number blank and clicks the button$")
	public void user_leaves_mobile_number_blank_and_clicks_the_button() throws Throwable {
		objhbpg.setPffname("Rutuja");	Thread.sleep(1000);
		objhbpg.setPflname("Kulkarni");	Thread.sleep(1000);
		objhbpg.setPfemail("rutuja.k@gmail.com");	Thread.sleep(1000);
		objhbpg.setPfmobile(""); Thread.sleep(1000);
		objhbpg.setPfbutton();
	}

	@When("^user enters incorrect mobileNo format and clicks the button$")
	public void user_enters_incorrect_mobileNo_format_and_clicks_the_button(DataTable arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
		objhbpg.setPffname("Rutuja");	Thread.sleep(1000);
		objhbpg.setPflname("Kulkarni");	Thread.sleep(1000);
		objhbpg.setPfemail("rutuja.k@gmail.com");	Thread.sleep(1000);
		List<String>  objList = arg1.asList(String.class); Thread.sleep(1000);
		objhbpg.setPfbutton();
		
		for(int i=0; i<objList.size(); i++) {
			if(Pattern.matches("^[7-9]{1}[0-9]{9}$", objList.get(i))) {
			System.out.println("***** Matched" + objList.get(i) + "*****");
			}
			else {
				System.out.println("***** NOT Matched" + objList.get(i) + "*****");
			}
		}
	
	
	}

	@When("^user does not select city$")
	public void user_does_not_select_city() throws Throwable {
		objhbpg.setPffname("Rutuja");	Thread.sleep(1000);
		objhbpg.setPflname("Kulkarni");	Thread.sleep(1000);
		objhbpg.setPfemail("rutuja.k@gmail.com");	Thread.sleep(1000);
		objhbpg.setPfmobile("7722005480");	Thread.sleep(1000);
		objhbpg.setPfcity("Select City");	Thread.sleep(1000);
		objhbpg.setPfbutton();
	 
	}

	@When("^user does not select state$")
	public void user_does_not_select_state() throws Throwable {
		objhbpg.setPffname("Rutuja");	Thread.sleep(1000);
		objhbpg.setPflname("Kulkarni");	Thread.sleep(1000);
		objhbpg.setPfemail("rutuja.k@gmail.com");Thread.sleep(1000);
		objhbpg.setPfmobile("7722005480");	Thread.sleep(1000);
		objhbpg.setPfcity("Pune");	Thread.sleep(1000);
		objhbpg.setPfstate("Select State");	Thread.sleep(1000);
		objhbpg.setPfbutton();
	}


@When("^user enters (\\d+)$")
public void user_enters(int arg1) throws Throwable {
	
	objhbpg.setPffname("Rutuja");	Thread.sleep(1000);
	objhbpg.setPflname("Kulkarni");	Thread.sleep(1000);
	objhbpg.setPfemail("rutuja.k@gmail.com");	Thread.sleep(1000);
	objhbpg.setPfmobile("7722005480");	Thread.sleep(1000);
	objhbpg.setPfcity("Pune");	Thread.sleep(1000);
	objhbpg.setPfstate("Maharashtra");	Thread.sleep(1000);
	objhbpg.setPfpersons(arg1);	Thread.sleep(2000);
}
	@Then("^allocate room such that (\\d+) room for minimum (\\d+) guests$")
	public void allocate_room_such_that_room_for_minimum_guests(int arg1, int arg2) throws Throwable {
		if(arg2 <=3) {
	    	System.out.println("***** 1 room");
	    	assertEquals(1, arg1);
	    }
	    else if(arg2 <=6){
	    	System.out.println("***** 2 rooms");
	    	assertEquals(2, arg1); 	
	    }	 
	    else if(arg2 <=9){
	    	System.out.println("***** 3 rooms");
	    	assertEquals(3, arg1); 	
	    }
	}

	@When("^user leaves cardholder name blank and clicks the button$")
	public void user_leaves_cardholder_name_blank_and_clicks_the_button() throws Throwable {
		objhbpg.setPffname("Rutuja");	Thread.sleep(1000);
		objhbpg.setPflname("Kulkarni");	Thread.sleep(1000);
		objhbpg.setPfemail("rutuja.k@gmail.com");	Thread.sleep(1000);
		objhbpg.setPfmobile("7722005480");	Thread.sleep(1000);
		objhbpg.setPfcity("Pune");	Thread.sleep(1000);
		objhbpg.setPfstate("Maharashtra");	Thread.sleep(1000);
		objhbpg.setPfpersons(7);	Thread.sleep(1000);
		objhbpg.setPfcardholder("");	Thread.sleep(1000);
		objhbpg.setPfbutton();
	 
	}

	@When("^user leaves DebitCardNo blank and clicks the button$")
	public void user_leaves_DebitCardNo_blank_and_clicks_the_button() throws Throwable {
		objhbpg.setPffname("Rutuja");	Thread.sleep(1000);
		objhbpg.setPflname("Kulkarni");	Thread.sleep(1000);
		objhbpg.setPfemail("rutuja.k@gmail.com");	Thread.sleep(1000);
		objhbpg.setPfmobile("7722005480");	Thread.sleep(1000);
		objhbpg.setPfcity("Pune");	Thread.sleep(1000);
		objhbpg.setPfstate("Maharashtra");	Thread.sleep(1000);
		objhbpg.setPfpersons(7);	Thread.sleep(1000);
		objhbpg.setPfcardholder("Rutuja Kulkarni");	Thread.sleep(1000);
		objhbpg.setPfdebit("");	Thread.sleep(1000);
		objhbpg.setPfbutton();
	}

	@When("^user leaves expirationMonth blank and clicks the button$")
	public void user_leaves_expirationMonth_blank_and_clicks_the_button() throws Throwable {
		objhbpg.setPffname("Rutuja");	Thread.sleep(1000);
		objhbpg.setPflname("Kulkarni");	Thread.sleep(1000);
		objhbpg.setPfemail("rutuja.k@gmail.com");	Thread.sleep(1000);
		objhbpg.setPfmobile("7722005680");	Thread.sleep(1000);
		objhbpg.setPfcity("Pune");	Thread.sleep(1000);
		objhbpg.setPfstate("Maharashtra");	Thread.sleep(1000);
		objhbpg.setPfpersons(7);	Thread.sleep(1000);
		objhbpg.setPfcardholder("Rutuja Kulkarni");	Thread.sleep(1000);
		objhbpg.setPfdebit("8765431234567898");	Thread.sleep(1000);
		objhbpg.setPfcvv("098");	Thread.sleep(1000);
		objhbpg.setPfmonth("");	Thread.sleep(1000);
		objhbpg.setPfbutton();
	   
	}

	@When("^user leaves  expirationYear blank and clicks the button$")
	public void user_leaves_expirationYear_blank_and_clicks_the_button() throws Throwable {
		objhbpg.setPffname("Rutuja");	Thread.sleep(1000);
		objhbpg.setPflname("Kulkarni");	Thread.sleep(1000);
		objhbpg.setPfemail("Rutu.k@gmail.com");	Thread.sleep(1000);
		objhbpg.setPfmobile("7722005680");	Thread.sleep(1000);
		objhbpg.setPfcity("Pune");	Thread.sleep(1000);
		objhbpg.setPfstate("Maharashtra");	Thread.sleep(1000);
		objhbpg.setPfpersons(7);	Thread.sleep(1000);
		objhbpg.setPfcardholder("Rutu Kulkarni");	Thread.sleep(1000);
		objhbpg.setPfdebit("7678567867897890");	Thread.sleep(1000);
		objhbpg.setPfcvv("056");	Thread.sleep(1000);
		objhbpg.setPfmonth("8");	Thread.sleep(1000);
		objhbpg.setPfyear("");	Thread.sleep(1000);
		objhbpg.setPfbutton();
	}



}
