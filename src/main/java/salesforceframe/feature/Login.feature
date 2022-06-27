Feature: login functionality

Scenario Outline: Login with positive data
Given Enter the username as <username>
And Enter the Password as <password>
When Click on the Login
Then Homepage should be displayed


Examples: 
|username|password|
|'ramkumar.ramaiah@testleaf.com'|'Password@123'|
