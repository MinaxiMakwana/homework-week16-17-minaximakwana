package com.automationexercise.pages;

import com.automationexercise.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoginWithValidCredentialPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Email Address']")
    WebElement emailAddressField;

    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Password']")
    WebElement passwordField;

    @CacheLookup
    @FindBy (css = "li:nth-child(10) a:nth-child(1)")
    WebElement loggedInAsJo;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Delete Account']")
    WebElement deleteAccount;

    @CacheLookup
    @FindBy(xpath = "//h2[@class='title text-center']")
    WebElement accountDeletedConfirmed;



    private void sendTextToElement(WebElement emailAddressField) {
    }

    public void enterEmailAddress(String emailAddress){
        sendTextToElement(emailAddressField);
    }

    public void enterPassword(String password){
        sendTextToElement(passwordField);
    }

    public String getTextLoggedInAsJo(){
        log.info("Logged in as Jo text" + loggedInAsJo.toString());
        return getTextFromElement(loggedInAsJo);
    }

    public void clickOnDeleteAccount(){
        clickOnElement(deleteAccount);
    }

    public String getTextAccountDeleted(){
        log.info("ACCOUNT DELETED!" + accountDeletedConfirmed.toString());
        return getTextFromElement(accountDeletedConfirmed);
    }
    
}
