Feature: Search Products and Verify Cart After Login feature file

  Scenario: Launch Browser and home page is visible
    When I Clicked on Products button
    Then I Verify user is navigated to ALL PRODUCTS page successfully
    And I Enter product name 'Tops' in search input and click search button
    Then I Verify SEARCHED PRODUCTS is visible
    Then I Verify all the products related to search are visible
    And I added those products to cart email address 'joblogs@gmail.com' and password 'joblogs'
    And I Click on Cart button
    Then I verify that products are visible in cart
    And I click on SignupLogin button
    And Again I go to cart page
    Then I Verify that those products are visible in cart after login as well


