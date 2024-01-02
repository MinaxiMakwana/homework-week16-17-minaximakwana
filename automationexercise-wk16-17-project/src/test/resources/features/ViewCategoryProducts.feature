Feature: View category products

  Scenario: Launch Browser and home page is visible
    When I Verify that categories are visible on left side bar
    Then I Click on Women category
    And I Click on any category link under Women category, for example: Dress
    And I Verify that category page is displayed and confirm text WOMEN - TOPS PRODUCTS
    And On left side bar, I click on any sub-category link of Men category
    Then I Verify that user is navigated to that category page

