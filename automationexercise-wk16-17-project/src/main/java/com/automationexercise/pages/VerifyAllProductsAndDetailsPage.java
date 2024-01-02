package com.automationexercise.pages;

import com.automationexercise.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class VerifyAllProductsAndDetailsPage extends Utility {



    @CacheLookup
    @FindBy (xpath = "//h2[normalize-space()='All Products']")
    WebElement allProductsText;

    @CacheLookup
    @FindBy(xpath = "//div[@class='col-sm-9 padding-right']")
    WebElement allProductsOnThePage;

    @CacheLookup
    @FindBy (xpath = "(//a[contains(text(),'View Product')])[1]")
    WebElement viewFirstProduct;

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Blue Top']")
    WebElement productName;

    @CacheLookup
    @FindBy(xpath = "//p[normalize-space()='Category: Women > Tops']")
    WebElement productCategory;

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Rs. 500']")
    WebElement productPrice;

    @CacheLookup
    @FindBy(xpath = "//b[normalize-space()='Availability:']")
    WebElement productAvailability;

    @CacheLookup
    @FindBy(xpath = "//b[normalize-space()='Condition:']")
    WebElement productCondition;

    @CacheLookup
    @FindBy(xpath = "//b[normalize-space()='Brand:']")
    WebElement productBrand;



    public String getAllProductsText(){
        log.info("ALL PRODUCTS" + allProductsText.toString());
            return getTextFromElement(allProductsText);
    }

    public String verifyingAllProductsOnThePage(){
        log.info("ALL PRODUCTS" + allProductsOnThePage.toString());
        return getTextFromElement(allProductsOnThePage);
    }

    public void clickOnFirstProduct(){
        clickOnElement(viewFirstProduct);
    }

    public String getProductCategoryText(){
        log.info("Blue Top text" + productCategory.toString());
        return getTextFromElement(productCategory);
    }

    public String getProductPriceText(){
        log.info("Rs. 500" + productPrice.toString());
        return getTextFromElement(productPrice);
    }

    public String getProductAvailabilityText(){
        log.info("Rs. 500" + productAvailability.toString());
        return getTextFromElement(productAvailability);
    }

    public String getProductConditionText(){
        log.info("Condition" + productCondition.toString());
        return getTextFromElement(productCondition);
    }

    public String getproductBrandText(){
        log.info("Brand" + productBrand.toString());
        return getTextFromElement(productBrand);
    }

}
