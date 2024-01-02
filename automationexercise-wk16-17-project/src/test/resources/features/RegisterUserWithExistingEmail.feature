Feature: Register User
  This feature file is to check register user with existing email functionality

  Scenario: Launch browser
    Given I clicked on SignupLogin button link to check with existing email
    When I Verify text New User Signup! is visible
    Then I enter my correct name 'Jo'
    And I enter correct email address in email field 'joblogs@gmail.com'
    And I clicked on signup Button
    Then I Verify error Email Address already exist! is visible


