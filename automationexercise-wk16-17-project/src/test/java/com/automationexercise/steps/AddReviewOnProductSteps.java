package com.automationexercise.steps;

import com.automationexercise.pages.AddReviewOnProductPage;
import com.automationexercise.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class AddReviewOnProductSteps {
    @And("I Click on View Product button")
    public void iClickOnViewProductButton() {
        new HomePage().clickOnProductsButton();
        new AddReviewOnProductPage().clickOnViewProduct();
    }

    @And("I Verify Write Your Review is visible")
    public void iVerifyWriteYourReviewIsVisible() {
        Assert.assertEquals(new AddReviewOnProductPage().getWriteYourReviewText(),  "WRITE YOUR REVIEW");
    }

    @And("I enter name {string} and email address {string}")
    public void iEnterNameJoeAndEmailAddressJoeblogsGmailCom(String name, String email) {
        new AddReviewOnProductPage().enterYourName(name);
        new AddReviewOnProductPage().enterYourEmail(email);
    }

    @And("I enter review comment {string}")
    public void iEnterReviewCommentTestingThisField(String review) {
        new AddReviewOnProductPage().enterYourReview(review);
    }

    @And("I click on submit button")
    public void iClickOnSubmitButton() {
        new AddReviewOnProductPage().clickOnSubmitButton();
    }

    @Then("I Verify success message Thank you for your review.")
    public void iVerifySuccessMessageThankYouForYourReview() {
        Assert.assertEquals(new AddReviewOnProductPage().getReviewText(),  "Thank you for your review.");
    }

}
