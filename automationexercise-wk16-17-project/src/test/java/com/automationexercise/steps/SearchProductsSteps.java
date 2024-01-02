package com.automationexercise.steps;

import com.automationexercise.pages.HomePage;
import com.automationexercise.pages.SearchProductPage;
import com.automationexercise.pages.VerifyAllProductsAndDetailsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class SearchProductsSteps {
    @Given("I Clicked on Products button")
    public void iClickedOnProductsButton() {
        new HomePage().clickOnProductsButton();
    }

    @When("I Verified user is navigated to ALL PRODUCTS page successfully")
    public void iVerifiedUserIsNavigatedToALLPRODUCTSPageSuccessfully() {
        Assert.assertEquals(new VerifyAllProductsAndDetailsPage().getProductPriceText(),  "ALL PRODUCTS");
    }

    @And("I Enter product name {string} in search input and click search button")
    public void iEnterProductNameProductNameInSearchInputAndClickSearchButton(String Tops) {
        new SearchProductPage().enterProductNameOnSearchLabel(Tops);
        new SearchProductPage().clickOnSearchButton();
    }

    @Then("I Verify SEARCHED PRODUCTS is visible")
    public void iVerifySEARCHEDPRODUCTSIsVisible() {
        Assert.assertEquals(new SearchProductPage().getSearchedProductsText(),  "SEARCHED PRODUCTS");
    }

}
