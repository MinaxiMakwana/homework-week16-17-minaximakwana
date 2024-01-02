package com.automationexercise.steps;

import com.automationexercise.pages.ContactUsFormStepsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class ContactUsFormSteps {
    @Given("I Click on Contact Us button")
    public void iClickOnContactUsButton() {
        new ContactUsFormStepsPage().clickOnContactUsLink();
    }

    @When("I Verify GET IN TOUCH is visible")
    public void iVerifyGETINTOUCHIsVisible() {
        Assert.assertEquals(new ContactUsFormStepsPage().getTextGetInTouch(),  "GET IN TOUCH");
    }

    @Then("I Enter my name in Name field {string}")
    public void iEnterMyNameInNameFieldJo(String name) {
        new ContactUsFormStepsPage().enterYourName(name);
    }

    @And("I enter my email in email field 'joblogs@gmail.com'")
    public void iEnterMyEmailInEmailField(String email) {
        new ContactUsFormStepsPage().enterEmailAddressInEmailField(email);
    }

    @And("I write subject 'Test'")
    public void iWriteSubject(String subject) {
        new ContactUsFormStepsPage().enterSubjectInField(subject);
    }

    @And("I type my message 'Test101'")
    public void iTypeMyMessage(String message) {
        new ContactUsFormStepsPage().enterMessageInField(message);
    }

    @And("I choose file to Upload")
    public void iChooseFileToUpload() {

    }

    @And("I click Submit button")
    public void clickSubmitButton() {
        new ContactUsFormStepsPage().clickOnSubmitButton();
    }

    @And("I click OK button on small pop up window")
    public void clickOKButtonOnSmallPopUpWindow() {

    }

    @And("I Verify success message Success! Your details have been submitted successfully. is visible")
    public void verifySuccessMessageSuccessYourDetailsHaveBeenSubmittedSuccessfullyIsVisible() {
        Assert.assertEquals(new ContactUsFormStepsPage().getTextDetailsHaveBeenSubmittedSuccessfully(),  "Success! Your details have been submitted successfully.");
    }

    @Then("I Click Home button and verify that landed to home page successfully")
    public void clickHomeButtonAndVerifyThatLandedToHomePageSuccessfully() {
        new ContactUsFormStepsPage().clickOnHomeButton();
    }


}
