package registrationForm;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import pageBean.RegistrationFormPageFactory;

public class StepDefs {
	WebDriver driver;
	RegistrationFormPageFactory objRegis;



@Given("^User is on Registration Form page$")
public void user_is_on_Registration_Form_page() throws Throwable {
	System.setProperty("webdriver.chrome.driver","D:\\BDD\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	objRegis = new RegistrationFormPageFactory(driver);
	driver.get("file://D:/Users/ASBHATIA/Desktop/BDD%20MPT%20HTML%20files/set%20A/WebPages/RegistrationForm.html");
}

@Then("^check the title of the page$")
public void check_the_title_of_the_page() throws Throwable {
	String title= driver.getTitle();
	if(title.contentEquals("Welcome to JobsWorld"))
		System.out.println("***Title Matched ***");
	else
		System.out.println("***Title Not matched***");
	driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
	driver.close();
}
@When("^user enters all valid data and click on submit button$")
public void user_enters_all_valid_data_and_click_on_submit_button() throws Throwable {
	objRegis.setPfUserId("anjulat"); Thread.sleep(1000);
	objRegis.setPfPassword("abcdefgh");Thread.sleep(1000);
	objRegis.setPfName("anjulata");Thread.sleep(1000);
	objRegis.setPfAddress("Talwadeychowk1");Thread.sleep(1000);
	objRegis.setPfCountry("India");Thread.sleep(1000);
	objRegis.setPfZipCode("282005");Thread.sleep(1000);
	objRegis.setPfemail("anjulata@gmail.com");Thread.sleep(1000);
	objRegis.setPfSex();Thread.sleep(1000);Thread.sleep(1000);
	objRegis.setPfLanguage();Thread.sleep(1000);  
}
@Then("^thanks for visit$")
public void thanks_for_visit() throws Throwable {
	System.out.println("successfully enter all data");
}


@Then("^click on submit button$")
public void click_on_submit_button() throws Throwable {
	objRegis.setPfSubmit();
}

@When("^user leaves userid empty  and clicks the submit button$")
public void user_leaves_userid_empty_and_clicks_the_submit_button() throws Throwable {
	objRegis.setPfUserId("");
	objRegis.setPfSubmit();
	Thread.sleep(1000);
    
}

@Then("^display alert msg$")
public void display_alert_msg() throws Throwable {
	String alertMessage = driver.switchTo().alert().getText();
	Thread.sleep(1000);
	driver.switchTo().alert().accept();
	System.out.println("******" + alertMessage);
	driver.close(); 
}

@When("^user enter wrong length of user id  and clicks the submit button$")
public void user_enter_wrong_length_of_user_id_and_clicks_the_submit_button() throws Throwable {
	objRegis.setPfUserId("anjulat"); Thread.sleep(1000);
	objRegis.setPfPassword("ab");Thread.sleep(1000);
	objRegis.setPfSubmit();
}

@When("^user leaves password empty  and clicks the submit button$")
public void user_leaves_password_empty_and_clicks_the_submit_button() throws Throwable {
	objRegis.setPfUserId("anjulat"); Thread.sleep(1000);
	objRegis.setPfPassword("");
	
	objRegis.setPfSubmit();
}


@When("^user enters wrong length of password and clicks the button$")
public void user_enters_wrong_length_of_password_and_clicks_the_button() throws Throwable {
	objRegis.setPfUserId("anjulat"); Thread.sleep(1000);
	objRegis.setPfPassword("ab");Thread.sleep(1000);
	objRegis.setPfSubmit();
}

@When("^user leaves Name empty  and clicks the submit button$")
public void user_leaves_Name_empty_and_clicks_the_submit_button() throws Throwable {
	objRegis.setPfUserId("anjulat"); 
	objRegis.setPfPassword("abcdefgh");
	objRegis.setPfName("");Thread.sleep(1000);
	objRegis.setPfSubmit();
}

@When("^user enter wrong type of name and clicks the submit button$")
public void user_enter_wrong_type_of_name_and_clicks_the_submit_button() throws Throwable {
	objRegis.setPfUserId("anjulat"); 
	objRegis.setPfPassword("abcdefgh");
	objRegis.setPfName("anjulata123");Thread.sleep(1000);
	objRegis.setPfSubmit();
}

@When("^user leaves Address empty  and clicks the submit button$")
public void user_leaves_Address_empty_and_clicks_the_submit_button() throws Throwable {
	objRegis.setPfUserId("anjulat"); Thread.sleep(1000);
	objRegis.setPfPassword("abcdefgh");Thread.sleep(1000);
	objRegis.setPfName("anjulata");Thread.sleep(1000);
	objRegis.setPfAddress("");Thread.sleep(1000);
	objRegis.setPfSubmit();
}

@When("^user enter wrong type of address and clicks the submit button$")
public void user_enter_wrong_type_of_address_and_clicks_the_submit_button() throws Throwable {
	objRegis.setPfUserId("anjulat"); Thread.sleep(1000);
	objRegis.setPfPassword("abcdefgh");Thread.sleep(1000);
	objRegis.setPfName("anjulata");Thread.sleep(1000);
	objRegis.setPfAddress("Talwadeychowk1@Pune_maharashtra!!");Thread.sleep(1000);
	objRegis.setPfSubmit();
}

@When("^user not select any country and clicks the submit button$")
public void user_not_select_any_country_and_clicks_the_submit_button() throws Throwable {
	objRegis.setPfUserId("anjulat"); Thread.sleep(1000);
	objRegis.setPfPassword("abcdefgh");Thread.sleep(1000);
	objRegis.setPfName("anjulata");Thread.sleep(1000);
	objRegis.setPfAddress("Talwadeychowk1");Thread.sleep(1000);
	objRegis.setPfCountry("(Please select a country)");Thread.sleep(1000);
	objRegis.setPfSubmit();
}

@When("^user leaves zipcode empty and clicks the submit button$")
public void user_leaves_zipcode_empty_and_clicks_the_submit_button() throws Throwable {
	objRegis.setPfUserId("anjulat"); Thread.sleep(1000);
	objRegis.setPfPassword("abcdefgh");Thread.sleep(1000);
	objRegis.setPfName("anjulata");Thread.sleep(1000);
	objRegis.setPfAddress("Talwadeychowk1");Thread.sleep(1000);
	objRegis.setPfCountry("India");Thread.sleep(1000);
	objRegis.setPfZipCode("");Thread.sleep(1000);
	objRegis.setPfSubmit();
}

@When("^user enters wrong zipcode and clicks the submit button$")
public void user_enters_wrong_zipcode_and_clicks_the_submit_button() throws Throwable {
	objRegis.setPfUserId("anjulat"); Thread.sleep(1000);
	objRegis.setPfPassword("abcdefgh");Thread.sleep(1000);
	objRegis.setPfName("anjulata");Thread.sleep(1000);
	objRegis.setPfAddress("Talwadeychowk1");Thread.sleep(1000);
	objRegis.setPfCountry("India");Thread.sleep(1000);
	objRegis.setPfZipCode("abcdef");Thread.sleep(1000);
	objRegis.setPfSubmit();
}

@When("^user leaves email empty and clicks the submit button$")
public void user_leaves_email_empty_and_clicks_the_submit_button() throws Throwable {
	objRegis.setPfUserId("anjulat"); Thread.sleep(1000);
	objRegis.setPfPassword("abcdefgh");Thread.sleep(1000);
	objRegis.setPfName("anjulata");Thread.sleep(1000);
	objRegis.setPfAddress("Talwadeychowk1");Thread.sleep(1000);
	objRegis.setPfCountry("India");Thread.sleep(1000);
	objRegis.setPfZipCode("282005");Thread.sleep(1000);
	objRegis.setPfemail("");Thread.sleep(1000);
	objRegis.setPfSubmit();
}

@When("^user enters wrong format of email id and clicks the submit button$")
public void user_enters_wrong_format_of_email_id_and_clicks_the_submit_button() throws Throwable {
	objRegis.setPfUserId("anjulat"); Thread.sleep(1000);
	objRegis.setPfPassword("abcdefgh");Thread.sleep(1000);
	objRegis.setPfName("anjulata");Thread.sleep(1000);
	objRegis.setPfAddress("Talwadeychowk1");Thread.sleep(1000);
	objRegis.setPfCountry("India");Thread.sleep(1000);
	objRegis.setPfZipCode("282005");Thread.sleep(1000);
	objRegis.setPfemail("anjulata@.com");Thread.sleep(1000);
	objRegis.setPfSubmit();
}

@When("^user does not select any gender and clicks the submit button$")
public void user_does_not_select_any_gender_and_clicks_the_submit_button() throws Throwable {
	objRegis.setPfUserId("anjulat"); Thread.sleep(1000);
	objRegis.setPfPassword("abcdefgh");Thread.sleep(1000);
	objRegis.setPfName("anjulata");Thread.sleep(1000);
	objRegis.setPfAddress("Talwadeychowk1");Thread.sleep(1000);
	objRegis.setPfCountry("India");Thread.sleep(1000);
	objRegis.setPfZipCode("282005");Thread.sleep(1000);
	objRegis.setPfemail("anjulata@gmail.com");Thread.sleep(1000);
	
	objRegis.setPfSubmit();
}

@When("^select language and clicks the submit button$")
public void select_language_and_clicks_the_submit_button() throws Throwable {
	objRegis.setPfUserId("anjulat"); Thread.sleep(1000);
	objRegis.setPfPassword("abcdefgh");Thread.sleep(1000);
	objRegis.setPfName("anjulata");Thread.sleep(1000);
	objRegis.setPfAddress("Talwadeychowk1");Thread.sleep(1000);
	objRegis.setPfCountry("India");Thread.sleep(1000);
	objRegis.setPfZipCode("282005");Thread.sleep(1000);
	objRegis.setPfemail("anjulata@gmail.com");Thread.sleep(1000);
	objRegis.setPfSex();Thread.sleep(1000);Thread.sleep(1000);
	objRegis.setPfLanguage();Thread.sleep(1000);
	objRegis.setPfSubmit();
}

@Then("^click the submit button$")
public void click_the_submit_button() throws Throwable {
	objRegis.setPfSubmit();
}

	
	
}
