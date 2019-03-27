#Author:  Ashish Bhatia
@HotelBooking
Feature: RegistrationForm
Background: user has already open the browser and is navigated to Registration Form .

Scenario: check the title
Given User is on Registration Form page
Then check the title of the page


Scenario: Successfull Registration  with all valid data
Given User is on Registration Form page
When user enters all valid data and click on submit button
Then thanks for visit

Scenario: Failure in registration on leaving the user id empty
Given User is on Registration Form page
When user leaves userid empty  and clicks the submit button
Then display alert msg


Scenario: Failure in registration on entering the wrong length of  user id
Given User is on Registration Form page
When user enter wrong length of user id  and clicks the submit button

Then display alert msg

Scenario: Failure in registration on leaving the password empty
Given User is on Registration Form page
When user leaves password empty  and clicks the submit button

Then display alert msg

Scenario: Failure in registration on entering the wrong length of password
Given User is on Registration Form page
When user enters wrong length of password and clicks the button
Then display alert msg

Scenario: Failure in registration on leaving the Name empty
Given User is on Registration Form page
When user leaves Name empty  and clicks the submit button

Then display alert msg


Scenario: Failure in registration as name must have alphabets only
Given User is on Registration Form page
When user enter wrong type of name and clicks the submit button

Then display alert msg

Scenario: Failure in registration on leaving the Address empty
Given User is on Registration Form page
When user leaves Address empty  and clicks the submit button

Then display alert msg

Scenario: Failure in registration as address must have alphanumeric characters only
Given User is on Registration Form page
When user enter wrong type of address and clicks the submit button 

Then display alert msg

Scenario: Failure in registration on not select any country
Given User is on Registration Form page
When user not select any country and clicks the submit button

Then display alert msg

Scenario: Failure in registration on not entering zipcode
Given User is on Registration Form page
When user leaves zipcode empty and clicks the submit button

Then display alert msg

Scenario: Failure in registration as zipcode must have numeric characters only
Given User is on Registration Form page
When user enters wrong zipcode and clicks the submit button

Then display alert msg


Scenario: Failure in registration on not entering email id
Given User is on Registration Form page
When user leaves email empty and clicks the submit button

Then display alert msg



Scenario: Failure in registration on entering wrong format of email id
Given User is on Registration Form page
When user enters wrong format of email id and clicks the submit button

Then display alert msg

Scenario: Failure in registration on not selecting any gender
Given User is on Registration Form page
When user does not select any gender and clicks the submit button

Then display alert msg


Scenario: select language
Given User is on Registration Form page
When select language and clicks the submit button
Then display alert msg

