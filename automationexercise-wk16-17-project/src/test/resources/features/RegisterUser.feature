Feature: Register User
  This feature file is to check register functionality

  Scenario: Launch browser
    Given I navigated to the URL automationexercise.com
    When I Verify that home page is visible successfully
    Then I clicked on login button
    And I Verify 'New User Signup!' is visible
    And I enter name "Jo"
    And I enter email address "jo_12345@gmail.com"
    And I click on signup button
    Then I Verify that ENTER ACCOUNT INFORMATION is visible

  Scenario: Fill in the detail
    Given I click on title
    When I enter my name "Jo"
    Then I enter my email address "jo_12345@gmail.com"
    And I enter my password "jo123Abc"
    And I enter my date of birth
    And I click on Select checkbox Sign up for our newsletter!
    Then I click on Select checkbox 'Receive special offers from our partners!

  Scenario: Fill in the address information
    Given I enter first name "Jo"
    When I enter last name "Blogs"
    Then I enter company detail "xyzIT"
    And I enter first line of the address "Oxford Street"
    And I enter second line of the address "London"
    And I select country from drop down list "United Kingdom"
    And I enter State "London"
    And I enter City "London"
    And I enter Zipcode "LN11AB"
    And I enter Mobile number "07286 597 174"
    Then I click on Create Account button




