package com.automationexercise.pages;

import com.automationexercise.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class RemoveProductsFromCartPages extends Utility {

    @CacheLookup
    @FindBy(xpath = "(//i[@class='fa fa-times'])[1]")
    WebElement deleteCartProduct;



    public void clickOnXToDeleteProductFromCart(){
        clickOnElement(deleteCartProduct);
    }

}
