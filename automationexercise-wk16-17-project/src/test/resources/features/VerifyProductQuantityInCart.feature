Feature:  Add products in cart

  Scenario: Launch Browser and home page is visible
    Given I Click View Product for any product on home page
    When I verify product detail is opened
    Then I increase quantity to '4'
    And I Click Add to cart button
    And I Click View Cart button
    Then I verify that product is displayed in cart page with exact quantity

