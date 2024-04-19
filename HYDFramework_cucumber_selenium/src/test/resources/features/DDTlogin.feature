Feature: Login Funtionality with ddt
Multiple user should be able to login to the access account details 
 #laptop123@gmail.com --laptop123
 
 @DDT
Scenario Outline: Login with valid credentials
Given User should be navigate to home page
When user has to click on login link
And user has to enter the valid email address <email> 
And  user has to enter the valid password <password>
And  user has to click on the login button
Then  user should be login succesfully

	Examples: 
					|email           |   password  | 
					|pqr@gmail.com   |45678        |
					| mno@gmail.com  |12345        |
					|azp@gmail.com   | 123456      |
					|qaz@gmail.com   |456718       |
					|azp@gmail.com   | 123456      |
					|qaz@gmail.com   |456718       |