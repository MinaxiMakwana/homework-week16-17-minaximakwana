Feature: Verify subscription in cart page

  Scenario: Launch Browser and home page is visible
    Given I Click on Cart button
    When I Verify text SUBSCRIPTION in cart
    And I Enter email address in input 'joblogs@gmail.com and click arrow button
    Then I Verify success message You have been successfully subscribed! is visible


