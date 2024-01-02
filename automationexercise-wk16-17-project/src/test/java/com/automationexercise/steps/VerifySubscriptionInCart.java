package com.automationexercise.steps;

import com.automationexercise.pages.HomePage;
import com.automationexercise.pages.VerifySubscriptionHomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class VerifySubscriptionInCart {
    @Given("I Click on Cart button")
    public void iClickOnCartButton() {
        new HomePage().clickOnCartButton();
    }

    @When("I Verify text SUBSCRIPTION in cart")
    public void iVerifyTextSUBSCRIPTIONInCart() {
        Assert.assertEquals(new VerifySubscriptionHomePage().getTextSubscription(),  "SUBSCRIPTION");
    }

    @And("I Enter email address in input 'joblogs@gmail.com and click arrow button")
    public void iEnterEmailAddressInInputJoblogsGmailComAndClickArrowButton(String emailAddress) {
        new VerifySubscriptionHomePage().sendEmailAddress(emailAddress);
        new VerifySubscriptionHomePage().clickOnSubscribeButton();
    }

    @Then("I Verify success message You have been successfully subscribed! is visible")
    public void iVerifySuccessMessageYouHaveBeenSuccessfullySubscribedIsVisible() {
        Assert.assertEquals(new VerifySubscriptionHomePage().getTextYouHaveBeenSuccessfullySubscribed(),  "You have been successfully subscribed!");

    }
}
