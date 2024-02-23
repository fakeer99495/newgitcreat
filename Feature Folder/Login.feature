Feature: login page.
@Login
Scenario Outline: User is able to login with valid credential
Given : User navigate to " https://demo.guru99.com/v4/ ".
When : User enter valid username as "<username>" and valid password "<password>"
And : click on login button
Then : click on logout button
Then click on Alert ok button

Examples:

| username | password |
|mngr553871|dYsurev   |
 
