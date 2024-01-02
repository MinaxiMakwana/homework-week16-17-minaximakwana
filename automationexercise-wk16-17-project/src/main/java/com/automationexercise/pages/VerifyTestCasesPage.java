package com.automationexercise.pages;

import com.automationexercise.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class VerifyTestCasesPage extends Utility {

    @CacheLookup
    @FindBy (xpath = "//button[@class='btn btn-success']")
    WebElement testCasesButton;


   public void clickOnTestCasesButton(){
        clickOnElement(testCasesButton);
    }


}
