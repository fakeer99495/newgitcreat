Feature: Add new account feature
@AddAccount
Scenario: User should be add new account details
Given : User navigate to "https://demo.guru99.com/v4/".
When : User enter valid username as "mngr511858" and valid password "sApuzYg"
And : click on login button
Then user should click on new account button
And user should Add new account form
And user should click submit button
Then : click on logout button
Then click on Alert ok button 