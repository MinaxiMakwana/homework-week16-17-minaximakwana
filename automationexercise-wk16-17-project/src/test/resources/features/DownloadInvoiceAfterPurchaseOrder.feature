Feature: Download Invoice after purchase order

  Scenario Outline: Launch Browser and home page is visible
    When I add products to cart
    Then I Click on Cart button
    Then I Verify that cart page is displayed
    And I Click Proceed To Checkout button
    And I click on RegisterLogin button
    And I Fill all details in Signup and create account name 'Joe' and email 'joeblogs@gmail.com'
    Then I Verify ACCOUNT CREATED! and click Continue button
    Then I  Verify Logged in as username at top
    And I Click on Cart button
    And I Click Proceed To Checkout button
    Then I verify Address Details and Review Your Order
    And I Enter description in comment text area 'test' and click Place Order
    And I Enter payment details: Name on Card <name>, Card Number <cardNum>, CVC <cvc>, Expiration date <expmm>, <expyy>
    And I Click Pay and Confirm Order button
    Then I Verify success message Your order has been placed successfully!
    And I Click Delete Account button
    Then Verify ACCOUNT DELETED! and click Continue button
    Examples:
     | name  | cardNum               | cvc   | expmm | expyy  |
     | 'Joe' | '1234 1234 1234 1234' | '123' | '01'  | '2025' |

