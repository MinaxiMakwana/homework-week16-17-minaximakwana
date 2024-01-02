package com.automationexercise.steps;

import com.automationexercise.pages.VerifyProductQuantityInCartPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class VerifyProductQuantityInCartSteps {

    @Given("I Click View Product for any product on home page")
    public void iClickViewProductForAnyProductOnHomePage() {
        new VerifyProductQuantityInCartPage().clickOnViewProduct();
    }

    @When("I verify product detail is opened")
    public void iVerifyProductDetailIsOpened() {
        Assert.assertEquals(new VerifyProductQuantityInCartPage().verifyingProductOnThePage(),  "Winter Top");
    }

    @Then("I increase quantity to {string}")
    public void iIncreaseQuantityTo(String four) {
        new VerifyProductQuantityInCartPage().enterQtyFour();
    }

    @And("I Click Add to cart button")
    public void iClickAddToCartButton() {
        new VerifyProductQuantityInCartPage().clickOnAddToCart();
    }

    @And("I Click View Cart button")
    public void iClickViewCartButton() {
        new VerifyProductQuantityInCartPage().clickOnviewCartLinkText();
    }

    @Then("I verify that product is displayed in cart page with exact quantity")
    public void iVerifyThatProductIsDisplayedInCartPageWithExactQuantity() {
        Assert.assertEquals(new VerifyProductQuantityInCartPage().verifyingCartInfoIsCorrect(),  "cart_info");
    }

}
