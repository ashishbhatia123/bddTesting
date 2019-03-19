#Author:  Ashish Bhatia
@HotelBooking
Feature: Login Page

Background: user has already open website and is navigated to Login page.

Scenario: check the title
Given User is on Login page
Then check the title of the page

Scenario: Successfull Login page with all valid data
Given user is on Login pagege
When user enters all valid data
Then navigate to hotel Booking

Scenario: Failure in hotelBooking on leaving the UserName empty
Given user is on Login page 
When user leaves UserName empty  
And clicks the button
Then display the text


Scenario: Failure in hotelBooking on leaving the password empty
Given user is on Login page 
When user leaves password empty  
And clicks the button
Then display the text

Scenario: Failure in hotelBooking on leaving the UserName and password empty
Given user is on Login page 
When user leaves UserName  and password empty  
And clicks the button
Then display the text


Scenario: Failure in hotelBooking on filling wrong username and password
Given user is on Login page 
When user leaves wrong username and password
Then display the text
