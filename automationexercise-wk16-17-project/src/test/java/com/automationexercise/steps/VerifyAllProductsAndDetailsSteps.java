package com.automationexercise.steps;

import com.automationexercise.pages.HomePage;
import com.automationexercise.pages.VerifyAllProductsAndDetailsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import static com.automationexercise.browserfactory.ManageBrowser.driver;

public class VerifyAllProductsAndDetailsSteps {
    @Given("I Click on Products button")
    public void iClickOnProductsButton() {
        new HomePage().clickOnProductsButton();
    }

    @When("I Verify user is navigated to ALL PRODUCTS page successfully")
    public void iVerifyUserIsNavigatedToALLPRODUCTSPageSuccessfully() {
//        driver.navigate().to("https://automationexercise.com/products");
//        driver.getTitle().equals("ALL PRODUCTS");
        Assert.assertEquals(new VerifyAllProductsAndDetailsPage().getProductPriceText(),  "ALL PRODUCTS");
    }

    @Then("I verify the products list is visible")
    public void iVerifyTheProductsListIsVisible() {
        Assert.assertEquals(new VerifyAllProductsAndDetailsPage().verifyingAllProductsOnThePage(),  "ALL PRODUCTS");
    }

    @And("I click on View Product of first product")
    public void iClickOnViewProductOfFirstProduct() {
        new VerifyAllProductsAndDetailsPage().clickOnFirstProduct();
    }

    @And("I have landed to product detail page")
    public void iHaveLandedToProductDetailPage() {
        driver.navigate().to("https://automationexercise.com/product_details/1");
    }

    @Then("I Verify that detail detail is visible: product name, category, price, availability, condition, brand")
    public void iVerifyThatDetailDetailIsVisibleProductNameCategoryPriceAvailabilityConditionBrand() {
        Assert.assertEquals(new VerifyAllProductsAndDetailsPage().getProductCategoryText(), "Blue Top");
        Assert.assertEquals(new VerifyAllProductsAndDetailsPage().getProductPriceText(), "Rs. 500");
        Assert.assertEquals(new VerifyAllProductsAndDetailsPage().getProductAvailabilityText(), "Availability");
        Assert.assertEquals(new VerifyAllProductsAndDetailsPage().getProductConditionText(), "Condition");
        Assert.assertEquals(new VerifyAllProductsAndDetailsPage().getproductBrandText(), "Brand");
    }
}
