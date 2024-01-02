package com.automationexercise.pages;

import com.automationexercise.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class SearchProductsAndVerifyCartAfterLoginPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//li[@class='active']")
    WebElement shoppingCart;

    public String verifyingShoppingCartProduct() {
        log.info("Shopping Cart" + shoppingCart.toString());
        return getTextFromElement(shoppingCart);
    }


}
