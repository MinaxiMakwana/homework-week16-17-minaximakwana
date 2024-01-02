package com.automationexercise.pages;

import com.automationexercise.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class VerifyScrollUpDownPage extends Utility {

    //*[@class='fa fa-angle-up']
    @CacheLookup
    @FindBy (xpath = "//*[@class='fa fa-angle-up']")
    WebElement scrollUpButton;

    @CacheLookup
    @FindBy(xpath = "//div[@class='item active']//h2[contains(text(),'Full-Fledged practice website for Automation Engin')]")
    WebElement headingTwoText;


    public String getScrollUpButton(){
        log.info("scrollUp" + scrollUpButton.toString());
        return getTextFromElement(scrollUpButton);
    }

    public void clickOnScrollUpButton(){
        clickOnElement(scrollUpButton);
    }

    public String getHeadingTwoText(){
        log.info("Full-Fledged practice website for Automation Engineers" + headingTwoText.toString());
        return getTextFromElement(headingTwoText);
    }


}
