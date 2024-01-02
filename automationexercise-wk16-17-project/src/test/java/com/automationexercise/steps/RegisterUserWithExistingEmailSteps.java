package com.automationexercise.steps;

import com.automationexercise.pages.RegisterUserWithExistingEmailPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class RegisterUserWithExistingEmailSteps {
    @Given("I clicked on SignupLogin button link to check with existing email")
    public void iClickedOnSignupLoginButtonLinkToCheckWithExistingEmail() {
        new RegisterUserWithExistingEmailPage().iClickOnSignupLoginLink();
    }

    @When("I Verify text New User Signup! is visible")
    public void iVerifyTextNewUserSignupIsVisible() {
        Assert.assertEquals(new RegisterUserWithExistingEmailPage().getNewUserSignupText(),  "New User Signup!");
    }

    @Then("I enter my correct name {string}")
    public void iEnterMyCorrectNameJo(String FirstName) {
        new RegisterUserWithExistingEmailPage().enterFirstName(FirstName);
    }

    @And("I enter correct email address in email field {string}")
    public void iEnterCorrectEmailAddressInEmailField(String email) {
        new RegisterUserWithExistingEmailPage().sendEmailAddress(email);
    }


    @And("I clicked on signup Button")
    public void iClickedOnSignupButton() {
        new RegisterUserWithExistingEmailPage().iClickOnSignupButton();
    }

    @Then("I Verify error Email Address already exist! is visible")
    public void iVerifyErrorEmailAddressAlreadyExistIsVisible() {
        Assert.assertEquals(new RegisterUserWithExistingEmailPage().getErrorMsgTextEmailAddressAlreadyExist(), "Email Address already exist!");
    }

}
