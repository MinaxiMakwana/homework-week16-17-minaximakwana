Feature:  Add products in cart

  Scenario: Launch Browser and home page is visible
    Given I Click Products button
    When I Hover over first product and click Add to cart
    Then I Click Continue Shopping button
    And I Hover over second product and click Add to cart
    And I clicked on View Cart button
    And I verify both products are added to Cart
    Then I verify their prices, quantity and total price

