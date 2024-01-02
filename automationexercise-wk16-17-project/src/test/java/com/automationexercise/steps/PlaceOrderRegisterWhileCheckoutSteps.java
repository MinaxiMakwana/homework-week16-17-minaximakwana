package com.automationexercise.steps;

import com.automationexercise.pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class PlaceOrderRegisterWhileCheckoutSteps {
    @When("I add products to cart")
    public void iAddProductsToCart() {
        new VerifyProductQuantityInCartPage().clickOnAddToCart();
    }

    @Then("I  Click on Cart button")
    public void iClickOnCartButton() {
        new VerifyProductQuantityInCartPage().clickOnAddToCart();
    }

    @And("I Verify that cart page is displayed")
    public void iVerifyThatCartPageIsDisplayed() {
        Assert.assertEquals(new VerifyProductQuantityInCartPage().verifyingCartInfoIsCorrect(),  "cart_info");
    }

    @Then("I Click Proceed To Checkout button")
    public void iClickProceedToCheckoutButton() {
        new PlaceOrderRegisterWhileCheckoutPage().clickOnProceedToCheckout();
    }

    @And("I click on RegisterLogin button")
    public void iClickOnRegisterLoginButton() {
        new PlaceOrderRegisterWhileCheckoutPage().clickOnRegisterLoginButton();
    }

    @And("I Fill all details in Signup and create account name 'Joe' and email 'joeblogs@gmail.com'")
    public void iFillAllDetailsInSignupAndCreateAccount(String FirstName, String email) {
        new RegisterUserWithExistingEmailPage().enterFirstName(FirstName);
        new RegisterUserWithExistingEmailPage().sendEmailAddress(email);
        new RegisterUserWithExistingEmailPage().iClickOnSignupButton();
    }

    @And("I enter account information email 'joeblogs@gmail.com' Password {string}, first name {string} last name {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void iEnterAccountInformationPasswordJoeblogsLastNameBlogsAddressLineOneAddressLineTwoStateCityZipcodeMobileNumber(String email, String password, String FirstName, String lName, String addressOne, String addressTwo, String state, String city, String zipCode, String mobileNumber) {
        new EnterAccountInfoPage().clickOnMrsRadioButton();
        new RegisterUserWithExistingEmailPage().enterFirstName(FirstName);
        new RegisterUserWithExistingEmailPage().sendEmailAddress(email);
        new EnterAccountInfoPage().enterPassword(password);
        new RegisterUserWithExistingEmailPage().enterFirstName(FirstName);
        new EnterAccountInfoPage().enterLastNameUnderAddressInfo(lName);
        new EnterAccountInfoPage().enterFirstLineOfTheAddress1(addressOne);
        new EnterAccountInfoPage().enterSecondLineOfTheAddress(addressTwo);
        new EnterAccountInfoPage().selectCountryUKFromList(state);
        new EnterAccountInfoPage().enterState(state);
        new EnterAccountInfoPage().enterCity(city);
        new EnterAccountInfoPage().enterZipCode(zipCode);
        new EnterAccountInfoPage().enterMobileNumber(mobileNumber);
        new EnterAccountInfoPage().clickOnCreateAccount();
    }

    @Then("I Verify ACCOUNT CREATED! and click Continue button")
    public void iVerifyACCOUNTCREATEDAndClickContinueButton() {
        Assert.assertEquals(new PlaceOrderRegisterWhileCheckoutPage().getTextAccountCreated(), "ACCOUNT CREATED!");
    }

    @Then("I  Verify Logged in as username at top")
    public void iVerifyLoggedInAsUsernameAtTop() {
        Assert.assertEquals(new LoginWithValidCredentialPage().getTextLoggedInAsJo(),"Logged in as Jo");
    }

    @And("I Click Cart button")
    public void iClickCartButton() {
        new HomePage().clickOnCartButton();
        new PlaceOrderRegisterWhileCheckoutPage().clickOnProceedToCheckout();
    }

    @Then("I verify Address Details and Review Your Order")
    public void iVerifyAddressDetailsAndReviewYourOrder() {
        Assert.assertEquals(new PlaceOrderRegisterWhileCheckoutPage().getTextAddressDetails(),"Address Details");
        Assert.assertEquals(new PlaceOrderRegisterWhileCheckoutPage().getTextReviewYourOrder(),"Review Your Order");
    }

    @And("I Enter description in comment text area {string} and click Place Order")
    public void iEnterDescriptionInCommentTextAreaNoneAndClickPlaceOrder(String msg) {
        new PlaceOrderRegisterWhileCheckoutPage().enterCommentInTheField(msg);
        new PlaceOrderRegisterWhileCheckoutPage().clickOnPlaceOrderButton();
    }

    @And("I Enter payment details: Name on Card {string}, Card Number {string}, CVC {string}, Expiration date {string}, {string}")
    public void iEnterPaymentDetailsNameOnCardJoeCardNumberCVCExpirationDate(int name, int cardNum, int cvc, int expmm, int expyy, int arg5, int arg6) {
        new PlaceOrderRegisterWhileCheckoutPage().enterNameOnCard(name);
        new PlaceOrderRegisterWhileCheckoutPage().enterCardNumber(cardNum);
        new PlaceOrderRegisterWhileCheckoutPage().enterCVCNumber(cvc);
        new PlaceOrderRegisterWhileCheckoutPage().enterExpiryMonth(expmm);
        new PlaceOrderRegisterWhileCheckoutPage().enterExpiryYear(expyy);
    }

    @And("I Click Pay and Confirm Order button")
    public void iClickPayAndConfirmOrderButton() {
        new PlaceOrderRegisterWhileCheckoutPage().clickOnPayAndConfirmOrder();
    }

    @Then("I Verify success message Your order has been placed successfully!")
    public void iVerifySuccessMessageYourOrderHasBeenPlacedSuccessfully() {
    }

    @And("I Click Delete Account button")
    public void iClickDeleteAccountButton() {
        new LoginWithValidCredentialPage().clickOnDeleteAccount();
    }

    @Then("Verify ACCOUNT DELETED! and click Continue button")
    public void verifyACCOUNTDELETEDAndClickContinueButton() {
        Assert.assertEquals(new LoginWithValidCredentialPage().getTextAccountDeleted(),"ACCOUNT DELETED!");

    }

}
