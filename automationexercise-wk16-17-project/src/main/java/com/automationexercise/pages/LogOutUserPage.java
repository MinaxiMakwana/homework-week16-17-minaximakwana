package com.automationexercise.pages;

import com.automationexercise.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LogOutUserPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Signup / Login']")
    WebElement clickOnSignupLoginLinkText;

    @CacheLookup
    @FindBy(xpath = "//h2[text()='Login to your account']")
    WebElement logInToYourAccount;

    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Email Address']")
    WebElement emailAddressField;

    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Password']")
    WebElement passwordField;

    @CacheLookup
    @FindBy(xpath = "//button[@class='btn btn-default']")
    WebElement loginButton;

    @CacheLookup
    @FindBy (css = "li:nth-child(10) a:nth-child(1)")
    WebElement loggedInAsJo;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Logout']")
    WebElement logOutLink;



    private void sendTextToElement(WebElement emailAddressField) {
    }

    public void iClickOnSignupLoginLink(){
        clickOnElement(clickOnSignupLoginLinkText);
    }

    public String iVerifyLoginToYourAccountLinkIsVisible(){
        log.info("Login to your account" + logInToYourAccount.toString());
        return getTextFromElement(logInToYourAccount);
    }

    public void enterEmailAddress(String emailAddress){
        sendTextToElement(emailAddressField);
    }


    public void enterPassword(String password){
        sendTextToElement(passwordField);
    }

    public void clickOnLoginButton(){
        clickOnElement(loginButton);
    }

    public String getTextLoggedInAsJo(){
        log.info("Logged in as Jo text" + loggedInAsJo.toString());
        return getTextFromElement(loggedInAsJo);
    }

    public void clickOnLogOutLink(){
        clickOnElement(logOutLink);
    }



}
