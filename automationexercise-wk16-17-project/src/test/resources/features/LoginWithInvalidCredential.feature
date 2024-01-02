Feature: Login User feature file with incorrect email and password
  Login User with incorrect email and password

  Scenario: Launch browser to Login with invalid credential
    Given I clicked on SignupLogin button
    When I Verify Login to your account link is visible
    Then I enter incorrect email address 'abcd12345@gmail.com'
    And I enter incorrect password '1234Qwer'
    And I click on Login button
    Then I Verify error Your email or password is incorrect! is visible



