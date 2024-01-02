Feature: Place Order: Login before Checkout

  Scenario Outline: Launch Browser and home page is visible
    When I click on signup button
    Then I enter email address <email>
    And I enter password <password>
    And I Verify ACCOUNT CREATED! and click Continue button
    And I  Verify Logged in as username at top
    And I add products to cart
    And I Click on Cart button
    And I Click Proceed To Checkout button
    And I verify Address Details and Review Your Order
    And I Enter description in comment text area <msg> and click Place Order
    And I Enter payment details: Name on Card <name>, Card Number <cardNum>, CVC <cvc>, Expiration date <expmm>, <expyy>
    And I Click Pay and Confirm Order button
    Then I Verify success message Your order has been placed successfully!
    And I Click Delete Account button
    Then Verify ACCOUNT DELETED! and click Continue button
    Examples:
      | email                | password | msg    | name  | cardNum               | cvc   | expmm | expyy  |
      | 'joeblogs@gmail.com' | joblogs  | 'None' | 'Joe' | '1234 1234 1234 1234' | '123' | '01'  | '2025' |

