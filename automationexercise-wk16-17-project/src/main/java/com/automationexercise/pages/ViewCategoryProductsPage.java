package com.automationexercise.pages;

import com.automationexercise.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ViewCategoryProductsPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//div[@class='left-sidebar']")
    WebElement categorySidePanel;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Women']")
    WebElement womenCategory;

    @CacheLookup
    @FindBy(linkText = "/category_products/1")
    WebElement womenDress;

    @CacheLookup
    @FindBy (xpath = "//h2[normalize-space()='Women - Dress Products']")
    WebElement womenDressProducts;

    @CacheLookup
    @FindBy (linkText = "/category_products/3")
    WebElement menTshirts;

    @CacheLookup
    @FindBy (xpath = "//h2[normalize-space()='Men - Tshirts Products']")
    WebElement menTshirtsProduct;



    public String verifyingSidePanel() {
        log.info("CATEGORY" + categorySidePanel.toString());
        return getTextFromElement(categorySidePanel);
    }

    public void clickOnWomenCategory(){
        clickOnElement(womenCategory);
    }

    public void clickOnWomensDressCategory(){
        clickOnElement(womenDress);
    }

    public String verifyingwomenDressProductsText() {
        log.info("WOMEN - DRESS PRODUCTS" + womenDressProducts.toString());
        return getTextFromElement(womenDressProducts);
    }

    public void clickOnMenSubCategoryTshirts(){
        clickOnElement(menTshirts);
    }

    public String verifyingMenTshirtsProductsText() {
        log.info("MEN - TSHIRTS PRODUCTS" + menTshirtsProduct.toString());
        return getTextFromElement(menTshirtsProduct);
    }

}
