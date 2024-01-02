package com.automationexercise.pages;

import com.automationexercise.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class VerifyProductQuantityInCartPage extends Utility {

    @CacheLookup
    @FindBy(linkText = "/product_details/5")
    WebElement viewProduct;

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Winter Top']")
    WebElement winterTopsViewProduct;

    @CacheLookup
    @FindBy(id = "quantity")
    WebElement increaseQtyTo4;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Add to cart']")
    WebElement addToCart;

    @CacheLookup
    @FindBy(xpath = "//u[normalize-space()='View Cart']")
    WebElement viewCart;

    @CacheLookup
    @FindBy(xpath = "//div[@id='cart_info']")
    WebElement cartInfoIncluding4Qty;


    public void clickOnViewProduct(){
        clickOnElement(viewProduct);
    }

    public String verifyingProductOnThePage() {
        log.info("Winter Top" + winterTopsViewProduct.toString());
        return getTextFromElement(winterTopsViewProduct);
    }

    private void sendTextToElement(WebElement increaseQtyTo4) {
    }
    public void enterQtyFour(){
        sendTextToElement(increaseQtyTo4);
    }

    public void clickOnAddToCart(){
        clickOnElement(addToCart);
    }

    public void clickOnviewCartLinkText(){
        clickOnElement(viewCart);
    }

    public String verifyingCartInfoIsCorrect() {
        log.info("Winter Top" + cartInfoIncluding4Qty.toString());
        return getTextFromElement(cartInfoIncluding4Qty);
    }

}
