Feature:Login Funtionality 
Register user should be able to login to the access account details

Background:
Given User should be navigate to home page
And  user has to click on the login button
 

 #laptop123@gmail.com --laptop123
@login  @smoke
Scenario: Login with valid credentials
When user has to click on login link
And user has to enter valid email address "laptop123@gmail.com" 
And  user has to enter valid password "laptop123"
Then  user should be login succesfully


@login @regression
Scenario: Login with invalid credentials
When user has to click on login link
And user has to enter invalid  email address "a123@gmail.com" 
And  user has to enter invalid password "subhash123"
Then user should not able to login succesfully
And get a proper warring message


@login @sanity
Scenario: Login with valid emailaddress and invalid password credentials
When user has to click on login link
And user has to enter valid email address "laptop123@gmail.com " 
And  user has to enter invalid  password "subhash123"
Then user should not able to login succesfully
And get a proper warring message

@login @regression @smoke
Scenario: Login with invalid emailaddress and valid password credentials
When user has to click on login link
And user has to enter invalid email address "a123@gmail.com" 
And  user has to enter valid password "subhash123"
Then user should not able to login succesfully
And get a proper warring message

@login @functional
Scenario: Login without providing the credentials
When user dont enter any credentials
Then  user should get a proper warning message

