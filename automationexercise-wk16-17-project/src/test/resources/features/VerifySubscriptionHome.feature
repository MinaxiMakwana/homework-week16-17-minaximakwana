Feature: Verify subscription in home page

  Scenario: Launch Browser and home page is visible
    Given I Verify text SUBSCRIPTION
    When I Enter email address 'joblogs@gmail.com' in input and click arrow button
    Then I verify success message You have been successfully subscribed! is visible

