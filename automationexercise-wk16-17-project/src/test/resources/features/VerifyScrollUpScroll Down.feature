Feature: Verify Scroll Up using 'Arrow' button and Scroll Down functionality

  Scenario: Launch Browser and home page is visible
    When I Verify text SUBSCRIPTION
    And I click on arrow at bottom right side to move upward
    Then I verify that page is scrolled up and Full-Fledged practice website for Automation Engineers text is visible on screen

