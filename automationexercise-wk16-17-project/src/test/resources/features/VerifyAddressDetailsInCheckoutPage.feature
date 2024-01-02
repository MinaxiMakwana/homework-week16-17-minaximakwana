Feature:  Verify address details in checkout page

  Scenario: Launch Browser and home page is visible
    When I click on SignupLogin button
    Then I Fill all details in Signup and create account name 'Joe' and email 'joeblogs@gmail.com'
    And I Verify ACCOUNT CREATED! and click Continue button
    And I Verify that Logged in as username is visible
    Then I add products to cart
    And I Click on Cart button
    Then I Verify that cart page is displayed
    And I Click Proceed To Checkout button
    Then I verify Address Details and Review Your Order
    And I Click on Delete Account button
    Then I Verify that ACCOUNT DELETED! is visible

