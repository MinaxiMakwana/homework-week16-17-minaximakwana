package com.automationexercise.steps;

import com.automationexercise.pages.RemoveProductsFromCartPages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class RemoveProductsFromCartSteps {
    @And("I click X button corresponding to particular product")
    public void iClickXButtonCorrespondingToParticularProduct() {
        new RemoveProductsFromCartPages().clickOnXToDeleteProductFromCart();
    }

    @Then("I verify that product is removed from the cart")
    public void iVerifyThatProductIsRemovedFromTheCart() {
    }

}
