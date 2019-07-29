#Author: Ashish bhatia

@redBus
Feature: redBusBooking Page

Background: user has already open website 



Scenario: Enter  all valid data
Given user is on Home page 
When want to travel from "Agra" to "Delhi (All Locations)"
And user enters  "28 Apr 2019" and "5 May 2020" from today
Then navigate to view bus page

Given user is on page 2
When want to scroll down
Then click on view seats

