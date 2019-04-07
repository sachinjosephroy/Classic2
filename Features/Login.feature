Feature: Login

Scenario: Valid login
Given user is on the login page
When user enters valid credentials
And clicks the Login button
Then use should be logged in