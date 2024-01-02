package com.automationexercise.steps;

import com.automationexercise.pages.ViewCategoryProductsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class ViewCategoryProductsSteps {
    @When("I Verify that categories are visible on left side bar")
    public void iVerifyThatCategoriesAreVisibleOnLeftSideBar() {
        Assert.assertEquals(new ViewCategoryProductsPage().verifyingSidePanel(), "CATEGORY");
    }

    @Then("I Click on Women category")
    public void iClickOnWomenCategory() {
        new ViewCategoryProductsPage().clickOnWomenCategory();
    }

    @And("I Click on any category link under Women category, for example: Dress")
    public void iClickOnAnyCategoryLinkUnderWomenCategoryForExampleDress() {
        new ViewCategoryProductsPage().clickOnWomensDressCategory();
    }

    @And("I Verify that category page is displayed and confirm text WOMEN - TOPS PRODUCTS")
    public void iVerifyThatCategoryPageIsDisplayedAndConfirmTextWOMENTOPSPRODUCTS() {
        Assert.assertEquals(new ViewCategoryProductsPage().verifyingwomenDressProductsText(), "WOMEN - DRESS PRODUCTS");
    }

    @And("On left side bar, I click on any sub-category link of Men category")
    public void onLeftSideBarIClickOnAnySubCategoryLinkOfMenCategory() {
        new ViewCategoryProductsPage().clickOnMenSubCategoryTshirts();
    }

    @Then("I Verify that user is navigated to that category page")
    public void iVerifyThatUserIsNavigatedToThatCategoryPage() {
        Assert.assertEquals(new ViewCategoryProductsPage().verifyingMenTshirtsProductsText(), "MEN - TSHIRTS PRODUCTS");
    }
}
