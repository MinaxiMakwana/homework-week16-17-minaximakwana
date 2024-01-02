package com.automationexercise.steps;

import com.automationexercise.pages.HomePage;
import com.automationexercise.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class LoginWithInValidCredentialSteps {

    @Given("I clicked on SignupLogin button")
    public void iClickedOnSignupLoginButton() {
        new HomePage().iClickOnSignupLoginLink();
    }

    @When("I Verify Login to your account link is visible")
    public void loginToYourAccountLinkIsVisible() {
        Assert.assertEquals(new HomePage().iVerifyLoginToYourAccountLinkIsVisible(), "Login to your account");
    }

    @Then("I enter incorrect email address {string}")
    public void iEnterIncorrectEmailAddressFjkfjkddsGmailCom(String emailAddress) {
        new LoginPage().enterEmailAddress(emailAddress);
    }

    @And("I enter incorrect password {string}")
    public void iEnterIncorrectPasswordQwer(String password) {
        new LoginPage().enterPassword(password);
    }

    @And("I click on Login button")
    public void iClickOnLoginButton() {
        new LoginPage().clickOnLoginButton();
    }

    @Then("I Verify error Your email or password is incorrect! is visible")
    public void iVerifyErrorYourEmailOrPasswordIsIncorrectIsVisible() {
        Assert.assertEquals(new LoginPage().getErrorMsgTextEmailAndPasswordIncorrect(), "Your email or password is incorrect!");
    }

}
