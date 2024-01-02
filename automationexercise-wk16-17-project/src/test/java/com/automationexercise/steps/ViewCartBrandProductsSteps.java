package com.automationexercise.steps;

import com.automationexercise.pages.HomePage;
import com.automationexercise.pages.ViewCartBrandProductsPages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class ViewCartBrandProductsSteps {
    @Then("I Verify that Brands are visible on left side bar")
    public void iVerifyThatBrandsAreVisibleOnLeftSideBar() {
        new HomePage().clickOnProductsButton();
        Assert.assertEquals(new ViewCartBrandProductsPages().verifyingBrandsProduct(), "BRANDS");
    }

    @And("I Click on any brand name")
    public void iClickOnAnyBrandName() {
        new ViewCartBrandProductsPages().clickOnPoloBrand();
    }

    @And("I Verify that user is navigated to brand page and brand products are displayed")
    public void iVerifyThatUserIsNavigatedToBrandPageAndBrandProductsAreDisplayed() {
        Assert.assertEquals(new ViewCartBrandProductsPages().verifyingPoloBrandsProducts(), "BRAND - POLO PRODUCTS");
    }

    @Then("On left side bar, I click on any other brand link")
    public void onLeftSideBarIClickOnAnyOtherBrandLink() {
        new ViewCartBrandProductsPages().clickOnHandMBrand();
    }

    @Then("I Verify that user is navigated to that brand page and can see products")
    public void iVerifyThatUserIsNavigatedToThatBrandPageAndCanSeeProducts() {
        Assert.assertEquals(new ViewCartBrandProductsPages().verifyingHandMBrandsProducts(), "BRAND - H&M PRODUCTS");
    }



}
