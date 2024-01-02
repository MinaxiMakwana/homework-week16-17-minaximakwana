package com.automationexercise.steps;

import com.automationexercise.pages.AddProductsInCartPage;
import com.automationexercise.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class AddProductsInCartSteps {
    @Given("I Click Products button")
    public void iClickProductsButton() {
        new HomePage().clickOnProductsButton();
    }

    @When("I Hover over first product and click Add to cart")
    public void iHoverOverFirstProductAndClickAddToCart() {
        new AddProductsInCartPage().hoverOverFirstProduct();
    }

    @Then("I Click Continue Shopping button")
    public void iClickContinueShoppingButton() {
        new AddProductsInCartPage().clickOnContinueShopping();
    }

    @And("I Hover over second product and click Add to cart")
    public void iHoverOverSecondProductAndClickAddToCart() {
        new AddProductsInCartPage().hoverOverSecondProduct();
    }

    @And("I clicked on View Cart button")
    public void iClickedOnViewCartButton() {
        new AddProductsInCartPage().clickOnViewCartLinkText();
    }

    @And("I verify both products are added to Cart")
    public void iVerifyBothProductsAreAddedToCart() {
        Assert.assertEquals(new AddProductsInCartPage().verifyingAllProductsOnThePage(),  "Shopping Cart");
    }

    @Then("I verify their prices, quantity and total price")
    public void iVerifyTheirPricesQuantityAndTotalPrice() {
        Assert.assertEquals(new AddProductsInCartPage().verifyingPrice(),  "Rs. 900");
        Assert.assertEquals(new AddProductsInCartPage().verifyingQuantity(),  "2");
        Assert.assertEquals(new AddProductsInCartPage().verifyCartTotalAmount(),  "Rs. 900");
    }
}
