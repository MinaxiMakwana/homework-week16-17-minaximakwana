package com.automationexercise.pages;

import com.automationexercise.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class VerifySubscriptionHomePage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Subscription']")
    WebElement subscriptionText;

    @CacheLookup
    @FindBy(id = "susbscribe_email")
    WebElement enterEmailAddress;

    @CacheLookup
    @FindBy(id = "subscribe")
    WebElement subscribeButton;

    @CacheLookup
    @FindBy(xpath = "//div[@class='alert-success alert']")
    WebElement textYouHaveBeenSuccessfullySubscribed;

    public String getTextSubscription(){
        log.info("SUBSCRIPTION text" + subscriptionText.toString());
        return getTextFromElement(subscriptionText);
    }
    private void sendTextToElement(WebElement enterEmailAddress) {
    }

    public void sendEmailAddress(String email){
        sendTextToElement(enterEmailAddress);
    }


    public void clickOnSubscribeButton(){
        clickOnElement(subscribeButton);
    }

    public String getTextYouHaveBeenSuccessfullySubscribed(){
        log.info("You have been successfully subscribed!" + textYouHaveBeenSuccessfullySubscribed.toString());
        return getTextFromElement(textYouHaveBeenSuccessfullySubscribed);
    }



}
