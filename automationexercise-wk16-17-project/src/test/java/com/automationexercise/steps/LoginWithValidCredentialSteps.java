package com.automationexercise.steps;

import com.automationexercise.pages.HomePage;
import com.automationexercise.pages.LoginPage;
import com.automationexercise.pages.LoginWithValidCredentialPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class LoginWithValidCredentialSteps {

    @Given("I click on SignupLogin button")
    public void iClickOnSignupLoginButton() {
        new HomePage().iClickOnSignupLoginLink();
    }

    @When("I Verify Login to your account is visible")
    public void iVerifyLoginToYourAccountIsVisible() {
        Assert.assertEquals(new HomePage().iVerifyLoginToYourAccountLinkIsVisible(), "Login to your account");
    }

    @Then("I enter correct email address {string}")
    public void iEnterCorrectEmailAddress(String email) {
        new LoginWithValidCredentialPage().enterEmailAddress(email);
    }

    @And("I enter correct password {string}")
    public void iEnterCorrectPassword(String password) {
        new LoginWithValidCredentialPage().enterPassword(password);
    }

    @And("I clicked on Login button")
    public void iClickedOnLoginButton() {
        new LoginPage().clickOnLoginButton();
    }

    @And("I Verify that Logged in as username is visible")
    public void iVerifyThatLoggedInAsUsernameIsVisible() {
        //Assert.assertEquals(new LoginWithValidCredentialPage(),"Logged in as Jo");
        Assert.assertEquals(new LoginWithValidCredentialPage().getTextLoggedInAsJo(),"Logged in as Jo");
    }

    @And("I Click on Delete Account button")
    public void iClickOnDeleteAccountButton() {
        new LoginWithValidCredentialPage().clickOnDeleteAccount();
    }

    @Then("I Verify that ACCOUNT DELETED! is visible")
    public void iVerifyThatACCOUNTDELETEDIsVisible() {
        Assert.assertEquals(new LoginWithValidCredentialPage().getTextAccountDeleted(),"ACCOUNT DELETED!");
    }

}
