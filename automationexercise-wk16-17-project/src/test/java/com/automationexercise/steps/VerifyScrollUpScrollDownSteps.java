package com.automationexercise.steps;

import com.automationexercise.pages.VerifyScrollUpDownPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class VerifyScrollUpScrollDownSteps {
    @And("I click on arrow at bottom right side to move upward")
    public void iClickOnArrowAtBottomRightSideToMoveUpward() {
        Assert.assertEquals(new VerifyScrollUpDownPage().getScrollUpButton(),  "scrollUp");
        new VerifyScrollUpDownPage().clickOnScrollUpButton();
    }

    @Then("I verify that page is scrolled up and Full-Fledged practice website for Automation Engineers text is visible on screen")
    public void iVerifyThatPageIsScrolledUpAndFullFledgedPracticeWebsiteForAutomationEngineersTextIsVisibleOnScreen() {
        Assert.assertEquals(new VerifyScrollUpDownPage().getHeadingTwoText(),  "Full-Fledged practice website for Automation Engineers");
    }

}


