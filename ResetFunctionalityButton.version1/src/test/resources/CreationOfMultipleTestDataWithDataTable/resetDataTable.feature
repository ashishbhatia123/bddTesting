# Author: Ashish Bhatia
Feature: reset functionality on login page of application
Scenario: Verification of reset button with number of credentials
Given Open the firefox and launch the application
When Enter the Username and Password

|username |password  |
|User11  |password11  |
|User22  |password22 |
|User33  |password33  |

Then reset the Credential

