package com.automationexercise.pages;

import com.automationexercise.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class AddReviewOnProductPage extends Utility {

    @CacheLookup
    @FindBy(linkText = "/product_details/1")
    WebElement viewProduct;

    @CacheLookup
    @FindBy(linkText = "//a[text()='Write Your Review']")
    WebElement writeYourReview;

    @CacheLookup
    @FindBy(id = "name")
    WebElement yourName;

    @CacheLookup
    @FindBy(id = "email")
    WebElement yourEmail;

    @CacheLookup
    @FindBy(id = "review")
    WebElement yourReview;

    @CacheLookup
    @FindBy(id = "button-review")
    WebElement submitButton;


    //span[normalize-space()='Thank you for your review.']
    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Thank you for your review.']")
    WebElement thankYouForReview;

    public void clickOnViewProduct() {
        clickOnElement(viewProduct);
    }

    public String getWriteYourReviewText() {
        log.info("Write Your Review" + writeYourReview.toString());
        return getTextFromElement(writeYourReview);
    }

    private void sendTextToElement(WebElement yourName) {
    }

    public void enterYourName(String name) {
        sendTextToElement(yourName);
    }

    public void enterYourEmail(String email) {
        sendTextToElement(yourEmail);
    }

    public void enterYourReview(String review){
        sendTextToElement(yourReview);
    }

    public void clickOnSubmitButton(){
        clickOnElement(submitButton);
    }

    public String getReviewText() {
        log.info("Thank you for your review." + thankYouForReview.toString());
        return getTextFromElement(thankYouForReview);
    }

}