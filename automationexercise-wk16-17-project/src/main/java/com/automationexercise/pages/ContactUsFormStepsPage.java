package com.automationexercise.pages;

import com.automationexercise.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ContactUsFormStepsPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Contact us']")
    WebElement contactUsLink;

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Get In Touch']")
    WebElement getInTouchText;

    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Name']")
    WebElement enterName;

    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Email']")
    WebElement enterEmailAddress;

    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Subject']")
    WebElement enterSubject;

    @CacheLookup
    @FindBy(id = "message")
    WebElement enterMessage;

    @CacheLookup
    @FindBy(xpath = "//input[@name='submit']")
    WebElement submitButton;

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Home']")
    WebElement homeButton;

    @CacheLookup
    @FindBy(xpath = "//div[@class='status alert alert-success']")
    WebElement yourDetailsHaveBeenSubmittedSuccessfullyText;



    public void clickOnContactUsLink(){
        clickOnElement(contactUsLink);
    }

    public String getTextGetInTouch(){
        log.info("GET IN TOUCH text" + getInTouchText.toString());
        return getTextFromElement(getInTouchText);
    }

    private void sendTextToElement(WebElement enterName) {
    }

    public void enterYourName(String name){
        sendTextToElement(enterName);
    }

    public void enterEmailAddressInEmailField(String email){
        sendTextToElement(enterEmailAddress);
    }

    public void enterSubjectInField(String subject){
        sendTextToElement(enterSubject);
    }

    public void enterMessageInField(String message){
        sendTextToElement(enterMessage);
    }

    public void clickOnSubmitButton(){
        clickOnElement(submitButton);
    }

    public void clickOnHomeButton(){
        clickOnElement(homeButton);
    }

    public String getTextDetailsHaveBeenSubmittedSuccessfully(){
        log.info("Success! Your details have been submitted successfully. text" + yourDetailsHaveBeenSubmittedSuccessfullyText.toString());
        return getTextFromElement(yourDetailsHaveBeenSubmittedSuccessfullyText);
    }

}
