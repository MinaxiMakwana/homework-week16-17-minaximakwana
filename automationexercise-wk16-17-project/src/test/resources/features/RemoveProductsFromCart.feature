Feature: Remove products from cart

  Scenario: Scenario: Launch Browser and home page is visible
    When I Click on Cart button
    Then I Verify that cart page is displayed
    And I click X button corresponding to particular product
    Then I verify that product is removed from the cart


