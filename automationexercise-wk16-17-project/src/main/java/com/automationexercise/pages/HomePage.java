package com.automationexercise.pages;

import com.automationexercise.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Utility {

    @CacheLookup
    @FindBy (xpath = "//a[normalize-space()='Signup / Login']")
    WebElement clickOnSignupLoginLinkText;

    @CacheLookup
    @FindBy(xpath = "//h2[text()='Login to your account']")
    WebElement logInToYourAccount;

    @CacheLookup
    @FindBy (xpath = "//a[@href='/products']")
    WebElement productsButton;

    @CacheLookup
    @FindBy (linkText = "view_cart")
    WebElement cartButton;

    public void iClickOnSignupLoginLink(){
        clickOnElement(clickOnSignupLoginLinkText);
    }


    public String iVerifyLoginToYourAccountLinkIsVisible(){
        log.info("Login to your account" + logInToYourAccount.toString());
        return getTextFromElement(logInToYourAccount);
    }

    public void clickOnProductsButton(){
        clickOnElement(productsButton);
    }

    public void clickOnCartButton(){
        clickOnElement(cartButton);
    }

}
