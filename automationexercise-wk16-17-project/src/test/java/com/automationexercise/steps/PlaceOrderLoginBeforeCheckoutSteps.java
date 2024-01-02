package com.automationexercise.steps;

import com.automationexercise.pages.LoginWithValidCredentialPage;
import io.cucumber.java.en.And;

public class PlaceOrderLoginBeforeCheckoutSteps {

    @And("I enter password <password>")
    public void iEnterPasswordPassword(String password) {
        new LoginWithValidCredentialPage().enterPassword(password);
    }
}
