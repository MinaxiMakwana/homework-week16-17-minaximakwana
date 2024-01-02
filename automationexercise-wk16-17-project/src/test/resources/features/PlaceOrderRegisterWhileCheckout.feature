Feature: Place Order: Register While Checkout

  Scenario: Launch Browser and home page is visible
    When I add products to cart
    Then I  Click on Cart button
    And I Verify that cart page is displayed
    Then I Click Proceed To Checkout button
    And I click on RegisterLogin button
    And I Fill all details in Signup and create account name 'Joe' and email 'joeblogs@gmail.com'
    And I enter account information email 'joeblogs@gmail.com' Password 'joeblogs', first name 'FirstName' last name 'blogs', 'abcStreet', 'xyzStreet', 'London', 'Wembley', 'HA11AA', '07325896008'
    And I click on Create Account button
    Then I Verify ACCOUNT CREATED! and click Continue button
    Then I  Verify Logged in as username at top
    And I Click Cart button
    And I Click Proceed To Checkout button
    Then I verify Address Details and Review Your Order
    And I Enter description in comment text area 'None' and click Place Order
    And I Enter payment details: Name on Card 'Joe', Card Number '1234 1234 1234 1234', CVC '123', Expiration date '01', '2025'
    And I Click Pay and Confirm Order button
    Then I Verify success message Your order has been placed successfully!
    And I Click Delete Account button
    Then Verify ACCOUNT DELETED! and click Continue button

