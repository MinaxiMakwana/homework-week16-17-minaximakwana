package com.automationexercise.pages;

import com.automationexercise.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ViewCartBrandProductsPages extends Utility {

    @CacheLookup
    @FindBy (xpath = "//div[@class='brands_products']")
    WebElement brandsProduct;

    @CacheLookup
    @FindBy (linkText = "/brand_products/Polo")
    WebElement brandsPolo;

    @CacheLookup
    @FindBy(xpath = "//h2[@class=\"title text-center\"]")
    WebElement poloBrandProduct;

    @CacheLookup
    @FindBy (linkText = "/brand_products/H&M")
    WebElement brandsHandM;

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Brand - H&M Products']")
    WebElement HandMBrandProduct;



    public String verifyingBrandsProduct() {
        log.info("BRANDS" + brandsProduct.toString());
        return getTextFromElement(brandsProduct);
    }

    public void clickOnPoloBrand(){
        clickOnElement(brandsPolo);
    }

    public String verifyingPoloBrandsProducts() {
        log.info("BRAND - POLO PRODUCTS" + poloBrandProduct.toString());
        return getTextFromElement(poloBrandProduct);
    }

    public void clickOnHandMBrand(){
        clickOnElement(brandsHandM);
    }

    public String verifyingHandMBrandsProducts() {
        log.info("BRAND - H&M PRODUCTS" + HandMBrandProduct.toString());
        return getTextFromElement(HandMBrandProduct);
    }

}
