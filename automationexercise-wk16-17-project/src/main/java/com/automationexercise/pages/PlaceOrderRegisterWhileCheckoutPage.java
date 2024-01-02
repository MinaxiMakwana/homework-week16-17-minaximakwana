package com.automationexercise.pages;

import com.automationexercise.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class PlaceOrderRegisterWhileCheckoutPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//a[@class='btn btn-default check_out']")
    WebElement proceedToCheckout;

    @CacheLookup
    @FindBy(xpath = "//u[normalize-space()='Register / Login']")
    WebElement registerLoginButton;

    @CacheLookup
    @FindBy(xpath = "//b[normalize-space()='Account Created!']")
    WebElement accountCreated;

    @CacheLookup
    @FindBy (xpath = "//h2[normalize-space()='Address Details']")
    WebElement addressDetails;

    @CacheLookup
    @FindBy (xpath = "//h2[normalize-space()='Review Your Order']")
    WebElement reviewYourOrder;

    @CacheLookup
    @FindBy (xpath = "//textarea[@name='message']")
    WebElement addCommentInThisField;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Place Order']")
    WebElement placeOrderbutton;

    @CacheLookup
    @FindBy(xpath = "//input[@name='name_on_card']")
    WebElement nameOnCard;

    @CacheLookup
    @FindBy(xpath = "//input[@name='card_number']")
    WebElement cardNumber;

    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='ex. 311']")
    WebElement CVCNumber;

    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='MM']")
    WebElement ExpirationMM;

    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='YYYY']")
    WebElement ExpirationYYYY;

    @CacheLookup
    @FindBy(id = "submit")
    WebElement payAndConfirmOrder;





    public void clickOnProceedToCheckout(){
        clickOnElement(proceedToCheckout);
    }

    public void clickOnRegisterLoginButton(){
        clickOnElement(registerLoginButton);
    }

    public String getTextAccountCreated(){
        log.info("Logged in as Jo text" + accountCreated.toString());
            return getTextFromElement(accountCreated);
    }

    public String getTextAddressDetails(){
        log.info("Address Details" + addressDetails.toString());
        return getTextFromElement(addressDetails);
    }

    public String getTextReviewYourOrder(){
        log.info("Address Details" + reviewYourOrder.toString());
        return getTextFromElement(reviewYourOrder);
    }

    private void sendTextToElement(WebElement addCommentInThisField) {
    }

    public void enterCommentInTheField(String text){
        sendTextToElement(addCommentInThisField);
    }

    public void clickOnPlaceOrderButton(){
        clickOnElement(placeOrderbutton);
    }

    public void enterNameOnCard(int name){
        sendTextToElement(nameOnCard);
    }

    public void enterCardNumber(int cardNum){
        sendTextToElement(cardNumber);
    }

    public void enterCVCNumber(int cvc){
        sendTextToElement(CVCNumber);
    }

    public void enterExpiryMonth(int expNum){
        sendTextToElement(ExpirationMM);
    }

    public void enterExpiryYear(int expYear){
        sendTextToElement(ExpirationYYYY);
    }

    public void clickOnPayAndConfirmOrder(){
        clickOnElement(payAndConfirmOrder);
    }

}
