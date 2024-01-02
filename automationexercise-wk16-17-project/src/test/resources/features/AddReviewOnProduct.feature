Feature:  Add review on product feature file

  Scenario: Launch Browser and home page is visible
    When I Click Products button
    Then I Verify user is navigated to ALL PRODUCTS page successfully
    And I Click on View Product button
    And I Verify Write Your Review is visible
    And I enter name 'joe' and email address 'joeblogs@gmail.com'
    And I enter review comment 'Testing this field'
    And I click on submit button
    Then I Verify success message Thank you for your review.

