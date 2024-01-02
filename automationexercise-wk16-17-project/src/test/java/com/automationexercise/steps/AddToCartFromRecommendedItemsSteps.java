package com.automationexercise.steps;

import com.automationexercise.pages.AddToCartFromRecommendedItemsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class AddToCartFromRecommendedItemsSteps {
    @When("I Scroll to bottom of page I Verify RECOMMENDED ITEMS are visible")
    public void iScrollToBottomOfPageIVerifyRECOMMENDEDITEMSAreVisible() {
        Assert.assertEquals(new AddToCartFromRecommendedItemsPage().getRecommendedItemsText(),  "RECOMMENDED ITEMS");
    }

    @Then("I Click on Add To Cart on Recommended product")
    public void iClickOnAddToCartOnRecommendedProduct() {
        new AddToCartFromRecommendedItemsPage().clickOnAddToCartFromRecommended();
    }

    @And("I Click on View Cart button")
    public void iClickOnViewCartButton() {
        new AddToCartFromRecommendedItemsPage().clickOnViewCartFromRecommendedItem();
    }

    @Then("I Verify that product is displayed in cart page")
    public void iVerifyThatProductIsDisplayedInCartPage() {
        Assert.assertEquals(new AddToCartFromRecommendedItemsPage().getShoppingCartText(),  "Shopping Cart");
    }

}
