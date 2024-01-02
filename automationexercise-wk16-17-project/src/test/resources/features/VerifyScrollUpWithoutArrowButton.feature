Feature: Verify Scroll Up without 'Arrow' button and Scroll Down functionality

  Scenario: Launch Browser and home page is visible
    When I Verify text SUBSCRIPTION
    And I scroll up page to top
    Then I Verify that page is scrolled up and Full-Fledged practice website for Automation Engineers text is visible on screen

