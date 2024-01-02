Feature: Logout user feature file

  Scenario: Launch browser to Login with valid credential
    Given I clicked on SignupLogin button link
    When I Verify text Login to your account is visible
    Then I enter correct email address
    And I enter correct password
    And I clicked on Login Button
    And I Verify that Logged in as username text is visible
    Then I click on Logout button


