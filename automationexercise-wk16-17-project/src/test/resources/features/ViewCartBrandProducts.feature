Feature: View and cart brand products

Scenario: Launch Browser and home page is visible
  When I Click on Products button
  Then I Verify that Brands are visible on left side bar
  And I Click on any brand name
  And I Verify that user is navigated to brand page and brand products are displayed
  Then On left side bar, I click on any other brand link
  Then I Verify that user is navigated to that brand page and can see products

