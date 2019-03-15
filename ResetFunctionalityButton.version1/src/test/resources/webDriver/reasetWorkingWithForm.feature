# feature file tells what is the requirement
#Author : Ashish Bhatia


Feature: reset functionality on login page of Appl
Scenario: Verification of Reset button
Given open the Firefox and launch the application
When Enter the Username , Password, confirmpassword, firstName,lastname,gender ,Dob,Email,address,city,phone And hobbies
Then Reset the credential 
