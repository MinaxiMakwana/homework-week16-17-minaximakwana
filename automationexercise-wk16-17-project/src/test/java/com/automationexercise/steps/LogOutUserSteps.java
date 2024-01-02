package com.automationexercise.steps;

import com.automationexercise.pages.LogOutUserPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class LogOutUserSteps {
    @Given("I clicked on SignupLogin button link")
    public void iClickedOnSignupLoginButtonLink() {
        new LogOutUserPage().iClickOnSignupLoginLink();
    }

    @When("I Verify text Login to your account is visible")
    public void iVerifyTextLoginToYourAccountIsVisible() {
        Assert.assertEquals(new LogOutUserPage().iVerifyLoginToYourAccountLinkIsVisible(), "Login to your account");
    }

    @Then("I enter correct email address")
    public void iEnterCorrectEmailAddress(String email) {
        new LogOutUserPage().enterEmailAddress(email);
    }

    @And("I enter correct password")
    public void iEnterCorrectPassword(String password) {
        new LogOutUserPage().enterPassword(password);
    }

    @And("I clicked on Login Button")
    public void iClickedOnLoginButton() {
        new LogOutUserPage().clickOnLoginButton();
    }

    @And("I Verify that Logged in as username text is visible")
    public void iVerifyThatLoggedInAsUsernameTextIsVisible() {
        Assert.assertEquals(new LogOutUserPage().getTextLoggedInAsJo(),"Logged in as Jo");
    }

    @And("I click on Logout button")
    public void iClickOnLogoutButton() {
        new LogOutUserPage().clickOnLogOutLink();
    }

}
