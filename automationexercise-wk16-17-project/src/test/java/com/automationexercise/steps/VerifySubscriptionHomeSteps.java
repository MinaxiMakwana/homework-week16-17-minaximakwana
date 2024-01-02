package com.automationexercise.steps;

import com.automationexercise.pages.VerifySubscriptionHomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class VerifySubscriptionHomeSteps {
    @Given("I Verify text SUBSCRIPTION")
    public void iVerifyTextSUBSCRIPTION() {
        Assert.assertEquals(new VerifySubscriptionHomePage().getTextSubscription(),  "SUBSCRIPTION");
    }

    @When("I Enter email address {string} in input and click arrow button")
    public void iEnterEmailAddressInInputAndClickArrowButton(String email) {
        new VerifySubscriptionHomePage().sendEmailAddress(email);
        new VerifySubscriptionHomePage().clickOnSubscribeButton();
    }

    @Then("I verify success message You have been successfully subscribed! is visible")
    public void iVerifySuccessMessageYouHaveBeenSuccessfullySubscribedIsVisible() {
        Assert.assertEquals(new VerifySubscriptionHomePage().getTextYouHaveBeenSuccessfullySubscribed(),  "You have been successfully subscribed!");
    }
}
