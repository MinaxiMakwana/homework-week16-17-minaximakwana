package com.automationexercise.pages;

import com.automationexercise.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class SearchProductPage extends Utility {

    @CacheLookup
    @FindBy(id = "search_product")
    WebElement enterProductName;

    @CacheLookup
    @FindBy(id = "submit_search")
    WebElement searchProductButton;

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Searched Products']")
    WebElement searchedProductsText;


    private void sendTextToElement(WebElement enterProductName) {
    }

    public void enterProductNameOnSearchLabel(String Tops){
        sendTextToElement(enterProductName);
    }

    public void clickOnSearchButton(){
        clickOnElement(searchProductButton);
    }

    public String getSearchedProductsText(){
        log.info("SEARCHED PRODUCTS text" + searchedProductsText.toString());
        return getTextFromElement(searchedProductsText);
    }

}
