Feature: Login User feature file with correct email and password
  Login User with correct email and password

  Scenario:  Launch browser to Login with valid credential
    Given I click on SignupLogin button
    When I Verify Login to your account is visible
    Then I enter correct email address 'joblogs@gmail.com'
    And I enter correct password 'joblogs'
    And I clicked on Login button
    And I Verify that Logged in as username is visible
    And I Click on Delete Account button
    Then I Verify that ACCOUNT DELETED! is visible

