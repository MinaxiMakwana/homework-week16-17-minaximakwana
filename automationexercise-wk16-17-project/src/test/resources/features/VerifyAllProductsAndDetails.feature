Feature: Verify All Products and Products detail

  Scenario: Launch Browser and home page is visible
    Given I Click on Products button
    When I Verify user is navigated to ALL PRODUCTS page successfully
    Then I verify the products list is visible
    And I click on View Product of first product
    And I have landed to product detail page
    Then I Verify that detail detail is visible: product name, category, price, availability, condition, brand

