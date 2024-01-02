package com.automationexercise.pages;

import com.automationexercise.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class RegisterUserWithExistingEmailPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Signup / Login']")
    WebElement clickOnSignupLoginLinkText;

    @CacheLookup
    @FindBy(xpath = "//h2[text()='New User Signup!']")
    WebElement newUserSignup;

    @CacheLookup
    @FindBy (xpath = "//input[@placeholder='Name']")
    WebElement enterName;

    @CacheLookup
    @FindBy(xpath = "//input[@data-qa='signup-email']")
    WebElement emailField;

    @CacheLookup
    @FindBy (xpath = "//button[normalize-space()='Signup']")
    WebElement clickOnSignupButton;

    @CacheLookup
    @FindBy (xpath = "//p[normalize-space()='Email Address already exist!']")
    WebElement verifyTextEmailAlreadyExist;

    private void sendTextToElement(WebElement enterName) {
    }

    public void iClickOnSignupLoginLink(){
        clickOnElement(clickOnSignupLoginLinkText);
    }

    public String getNewUserSignupText(){
        log.info("Getting New User Signup! text" + newUserSignup.toString());
        return getTextFromElement(newUserSignup);
    }

    public void enterFirstName(String fName){
        sendTextToElement(enterName);
    }

    public void sendEmailAddress(String email){
        sendTextToElement(emailField);
    }

    public void iClickOnSignupButton(){
        clickOnElement(clickOnSignupButton);
    }

    public String getErrorMsgTextEmailAddressAlreadyExist(){
        log.info("Email Address already exist! text" + verifyTextEmailAlreadyExist.toString());
        return getTextFromElement(verifyTextEmailAlreadyExist);
    }



}
