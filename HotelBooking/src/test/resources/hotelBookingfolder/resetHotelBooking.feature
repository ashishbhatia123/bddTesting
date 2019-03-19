#Author:  Ashish Bhatia
@HotelBooking
Feature: HotelBooking

Background: user has already logged in with valid credentials and is navigated to hotelbooking page.

Scenario: check the title
Given User is on hotel Booking page
Then check the title of the page

Scenario: Successfull hotel bookin with all valid data
Given user is on hotel booking page
When user enters all valid data
Then navigate to welcome page

Scenario: Failure in hotelBooking on leaving the first name empty
Given user is on hotel booking page
When user leaves firstName empty  
And clicks the button
Then display alert msg

Scenario: Failure in hotelBooking on leaving the last name blank
Given user is on hotel booking page
When user leaves lastName blank and clicks the button
Then display alert msg

Scenario: Failure in hotelBooking on incorrect email format
Given user is on hotel booking page
When user enters all data
But user enters incorrect email format and clicks the button
Then display alert msg

Scenario: Failure in hotelBooking on leaving the mobile no. blank
Given user is on hotel booking page
When user leaves mobile number blank and clicks the button
Then display alert msg

Scenario: Failure in hotelBooking on incorrect mobile format
Given user is on hotel booking page
When user enters incorrect mobileNo format and clicks the button
|7722005480|
|0900000000|
|2345678989|
|84321|
|77722005480|
| |
Then display alert msg

Scenario: Failure in hotelBooking on not selecting the city
Given user is on hotel booking page
When user does not select city
Then display alert msg

Scenario: Failure in hotelBooking on not selecting the state
Given user is on hotel booking page
When user does not select state
Then display alert msg

Scenario Outline: Validate the no. of rooms alloted
Given User is on hotel Booking page
When user enters <numberOfGuests>
Then allocate room such that 1 room for minimum 3 guests
Examples:
| numberOfGuests |
|2|
|6|
|9|

Scenario: Failure in hotelBooking on leaving the cardHolderName blank
Given user is on hotel booking page
When user leaves cardholder name blank and clicks the button
Then display alert msg  

Scenario: Failure in  hotelBooking on leaving the DebitCardNo blank
Given user is on hotel booking page
When user leaves DebitCardNo blank and clicks the button
Then display alert msg

Scenario: Failure in  hotelBooking on leaving the expirationMonth blank
Given user is on hotel booking page
When user leaves expirationMonth blank and clicks the button
Then display alert msg

Scenario: Failure in  hotelBooking on leaving the expirationYear blank
Given user is on hotel booking page
When user leaves  expirationYear blank and clicks the button
Then display alert msg