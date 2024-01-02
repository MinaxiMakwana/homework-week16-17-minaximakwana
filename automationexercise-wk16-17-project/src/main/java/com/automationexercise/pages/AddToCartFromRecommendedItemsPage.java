package com.automationexercise.pages;

import com.automationexercise.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class AddToCartFromRecommendedItemsPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//h2[@class='title text-center']")
    WebElement viewProduct;

    @CacheLookup
    @FindBy (xpath = "//*[@id=\"recommended-item-carousel\"][1]")
    WebElement addToCart;

    @CacheLookup
    @FindBy (xpath = "//u[normalize-space()='View Cart']")
    WebElement viewCartWhenAddedItemFromRecommendedItems;

    @CacheLookup
    @FindBy(xpath = "//*[@class='active']")
    WebElement productAddedToShoppingCart;



    public String getRecommendedItemsText() {
        log.info("RECOMMENDED ITEMS" + viewProduct.toString());
        return getTextFromElement(viewProduct);
    }

    public void clickOnAddToCartFromRecommended(){
        clickOnElement(addToCart);
    }

    public void clickOnViewCartFromRecommendedItem(){
        clickOnElement(viewCartWhenAddedItemFromRecommendedItems);
    }

    public String getShoppingCartText() {
        log.info("Shopping Cart" + productAddedToShoppingCart.toString());
        return getTextFromElement(productAddedToShoppingCart);
    }

}
