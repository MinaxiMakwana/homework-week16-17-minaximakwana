package com.automationexercise.pages;

import com.automationexercise.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class AddProductsInCartPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "(//div[@class='product-overlay'])[1]")
    WebElement firstProduct;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue Shopping']")
    WebElement continueShopping;

    @CacheLookup
    @FindBy(xpath = "(//a[contains(text(),'Add to cart')])[4]")
    WebElement secondProduct;

    @CacheLookup
    @FindBy(xpath = "//div[@id='cartModal']//p[1]")
    WebElement viewCartLinkText;

    @CacheLookup
    @FindBy(xpath = "//div[@id='cart_info']")
    WebElement verifyCartHasTwoItems;

    @CacheLookup
    @FindBy(xpath = "//td[@class='cart_price']//p[contains(text(),'Rs. 500')]")
    WebElement price;

    @CacheLookup
    @FindBy(xpath = "//button[@fdprocessedid='fdaudd']")
    WebElement quantity;

    @CacheLookup
    @FindBy(xpath = "//p[@class='cart_total_price'][normalize-space()='Rs. 500']")
    WebElement cartTotalPrice;



    public void hoverOverFirstProduct() {
        mouseHoverToElementAndClick(firstProduct);
    }

    public void clickOnContinueShopping() {
        clickOnElement(continueShopping);
    }

    public void hoverOverSecondProduct() {
        mouseHoverToElementAndClick(secondProduct);
    }

    public void clickOnViewCartLinkText() {
        clickOnElement(viewCartLinkText);
    }

    public String verifyingAllProductsOnThePage() {
        log.info("Shopping Cart" + verifyCartHasTwoItems.toString());
        return getTextFromElement(verifyCartHasTwoItems);
    }

    public String verifyingPrice() {
        log.info("Rs.900" + price.toString());
        return getTextFromElement(price);
    }

    public String verifyingQuantity() {
        log.info("2" + quantity.toString());
        return getTextFromElement(quantity);
    }

    public String verifyCartTotalAmount() {
        log.info("Rs.900" + cartTotalPrice.toString());
        return getTextFromElement(cartTotalPrice);
    }

}
