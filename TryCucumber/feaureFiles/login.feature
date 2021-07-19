Feature: To Validate Login Application

Scenario: To test Login with valid data

Given I should have valid URl for Login Page
When I enter Valid UserName 
And I Enter Valid Password
And I click Submit button
Then Login successfully
