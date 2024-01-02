package com.automationexercise.pages;

import com.automationexercise.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class EnterAccountInfoPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//b[normalize-space()='Enter Account Information']")
    WebElement textEnterAccountInformation;

    @CacheLookup
    @FindBy(id = "id_gender2")
    WebElement selectMrsRadioButton;

    @CacheLookup
    @FindBy (xpath = "//input[@placeholder='Name']")
    WebElement enterName;

    @CacheLookup
    @FindBy(xpath = "//input[@data-qa='signup-email']")
    WebElement emailField;

    @CacheLookup
    @FindBy(id = "newsletter")
    WebElement signUpForOurNewsletterTickBox;

    @CacheLookup
    @FindBy(id = "optin")
    WebElement receiveSpecialOffersFromOurPartners;

    @CacheLookup
    @FindBy(id = "password")
    WebElement enterPassword;

    @CacheLookup
    @FindBy(id = "first_name")
    WebElement enterFirstName;

    @CacheLookup
    @FindBy(id = "last_name")
    WebElement enterLastName;

    @CacheLookup
    @FindBy(id = "company")
    WebElement enterCompanyName;

    @CacheLookup
    @FindBy(id = "address1")
    WebElement enterAddressLine1;

    @CacheLookup
    @FindBy(id = "address2")
    WebElement enterAddressLine2;

    @CacheLookup
    @FindBy(xpath = "//option[@value='India']")
    WebElement selectCountryFromDropDownList;

    @CacheLookup
    @FindBy(id = "state")
    WebElement enterStateName;

    @CacheLookup
    @FindBy (id = "city")
    WebElement enterCityName;

    @CacheLookup
    @FindBy(id = "zipcode")
    WebElement enterZipCodeOfTheCountry;

    @CacheLookup
    @FindBy(id = "mobile_number")
    WebElement enterMobileNumber;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Create Account']")
    WebElement createAccount;




    public String getNewUserSignupText(){
        log.info("ENTER ACCOUNT INFORMATION" + textEnterAccountInformation.toString());
        return getTextFromElement(textEnterAccountInformation);
    }

    public void clickOnMrsRadioButton(){
        clickOnElement(selectMrsRadioButton);
    }

    private void sendTextToElement(WebElement enterName) {
    }

    public void enterFirstName(String fName){
        sendTextToElement(enterName);
    }

    public void sendEmailAddress(String email){
        sendTextToElement(emailField);
    }

    public void clickOnSignUpForOurNewsletterTickBox(){
        clickOnElement(signUpForOurNewsletterTickBox);
    }

    public void clickOnReceiveSpecialOffersFromOurPartners(){
        clickOnElement(receiveSpecialOffersFromOurPartners);
    }

    public void enterPassword(String password){
        sendTextToElement(enterPassword);
    }

    public void enterFirstNameUnderAddressInfo(String firstName){
        sendTextToElement(enterFirstName);
    }

    public void enterLastNameUnderAddressInfo(String lastName){
        sendTextToElement(enterLastName);
    }

    public void enterCompanyNameUnderAddressInfo(String companyName){
        sendTextToElement(enterCompanyName);
    }

    public void enterFirstLineOfTheAddress1(String address1){
        sendTextToElement(enterAddressLine1);
    }

    public void enterSecondLineOfTheAddress(String address2){
        sendTextToElement(enterAddressLine2);
    }

    private void selectByValueFromDropDown(WebElement selectCountryFromDropDownList) {
    }
    public void selectCountryUKFromList(String UK){
        selectByValueFromDropDown(selectCountryFromDropDownList);
    }

    public void enterState(String state){
        sendTextToElement(enterStateName);
    }

    public void enterCity(String city){
        sendTextToElement(enterCityName);
    }

    public void enterZipCode(String zipCode){
        sendTextToElement(enterZipCodeOfTheCountry);
    }

    public void enterMobileNumber(String mobNum){
        sendTextToElement(enterMobileNumber);
    }

    public void clickOnCreateAccount(){
        clickOnElement(createAccount);
    }

}
