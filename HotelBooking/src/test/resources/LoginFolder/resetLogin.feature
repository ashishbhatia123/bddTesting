# Author: Ashish Bhatia
Feature: reset functionality on login page of application
Scenario: Verification of Login button with number of credentials
Given Open the firefox and launch the application
When Enter the Username and Password

|username |password  	|
| 				|password11 |
| 				| 					|
|User33   |					  |
|kuchbhi  |kuchbhi  	|
|capgemini|capg1234   |

Then reset the Credential
