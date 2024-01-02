Feature: Search products

  Scenario: Launch Browser and home page is visible
    Given I Clicked on Products button
    When I Verified user is navigated to ALL PRODUCTS page successfully
    And I Enter product name 'Tops' in search input and click search button
    Then I Verify SEARCHED PRODUCTS is visible


