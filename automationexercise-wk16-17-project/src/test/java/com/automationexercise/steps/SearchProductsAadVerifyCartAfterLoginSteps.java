package com.automationexercise.steps;

import com.automationexercise.pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class SearchProductsAadVerifyCartAfterLoginSteps {
    @Then("I Verify all the products related to search are visible")
    public void iVerifyAllTheProductsRelatedToSearchAreVisible() {
        Assert.assertEquals(new SearchProductPage().getSearchedProductsText(),  "SEARCHED PRODUCTS");
    }

    @And("I added those products to cart")
    public void iAddedThoseProductsToCart() {
        new AddProductsInCartPage().hoverOverFirstProduct();
        new AddProductsInCartPage().clickOnViewCartLinkText();
    }

    @Then("I verify that products are visible in cart")
    public void iVerifyThatProductsAreVisibleInCart() {
        Assert.assertEquals(new AddProductsInCartPage().verifyingAllProductsOnThePage(),  "Shopping Cart");
    }

    @And("I added those products to cart email address {string} and password {string}")
    public void iAddedThoseProductsToCartEmailAddressJoblogsGmailComAndPasswordJoblogs(String email, String password) {
        new LoginWithValidCredentialPage().enterEmailAddress(email);
        new LoginWithValidCredentialPage().enterPassword(password);
    }

    @And("Again I go to cart page")
    public void againIGoToCartPage() {
        new HomePage().clickOnCartButton();
    }

    @Then("I Verify that those products are visible in cart after login as well")
    public void iVerifyThatThoseProductsAreVisibleInCartAfterLoginAsWell() {
        Assert.assertEquals(new SearchProductsAndVerifyCartAfterLoginPage().verifyingShoppingCartProduct(), "Shopping Cart");
    }


}
