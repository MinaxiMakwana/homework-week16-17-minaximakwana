package com.automationexercise.steps;

import com.automationexercise.pages.VerifyScrollUpDownPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class VerifyScrollUpWithoutArrowButtonSteps {
    @And("I scroll up page to top")
    public void iScrollUpPageToTop() {

    }

    @Then("I Verify that page is scrolled up and Full-Fledged practice website for Automation Engineers text is visible on screen")
    public void iVerifyThatPageIsScrolledUpAndFullFledgedPracticeWebsiteForAutomationEngineersTextIsVisibleOnScreen() {
        Assert.assertEquals(new VerifyScrollUpDownPage().getHeadingTwoText(),  "Full-Fledged practice website for Automation Engineers");
    }
}
