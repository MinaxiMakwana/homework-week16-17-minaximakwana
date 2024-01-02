package com.automationexercise.steps;

import com.automationexercise.pages.VerifyTestCasesPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import static com.automationexercise.browserfactory.ManageBrowser.driver;

public class VerifyTestCaseSteps {
    @Given("I Click on Test Cases button")
    public void iClickOnTestCasesButton() {
        new VerifyTestCasesPage().clickOnTestCasesButton();
    }

    @Then("I verify user is navigated to test cases page successfully")
    public void iVerifyUserIsNavigatedToTestCasesPageSuccessfully() {
        driver.navigate().to("https://automationexercise.com/test_cases");
    }
}
