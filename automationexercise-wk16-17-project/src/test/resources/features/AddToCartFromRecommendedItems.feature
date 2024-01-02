Feature:  Add products to cart from recommended items feature file

  Scenario: Launch Browser and home page is visible
    When I Scroll to bottom of page I Verify RECOMMENDED ITEMS are visible
    Then I Click on Add To Cart on Recommended product
    And I Click on View Cart button
    Then I Verify that product is displayed in cart page

