package com.automationexercise.steps;

import com.automationexercise.pages.EnterAccountInfoPage;
import com.automationexercise.pages.HomePage;
import com.automationexercise.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class RegisterUserSteps {
    @Given("I navigated to the URL automationexercise.com")
    public void iNavigatedToTheURLAutomationexerciseCom() {
    }

    @When("I Verify that home page is visible successfully")
    public void iVerifyThatHomePageIsVisibleSuccessfully() {
    }

    @Then("I clicked on login button")
    public void iClickedOnLoginButton() {
        new HomePage().iClickOnSignupLoginLink();
    }

    @And("I Verify {string} is visible")
    public void iVerifyNewUserSignupIsVisible(String text) {
        Assert.assertEquals(new LoginPage().getNewUserSignupText(), text, "New User Signup!");
    }

    @And("I enter name {string}")
    public void iEnterName(String FirstName) {
        new LoginPage().enterFirstName(FirstName);
    }

    @And("I enter email address {string}")
    public void iEnterEmailAddress(String email) {
        new LoginPage().sendEmailAddress(email);
    }

    @And("I click on signup button")
    public void iClickOnSignupButton() {
        new HomePage().iClickOnSignupLoginLink();
    }

    @Then("I Verify that ENTER ACCOUNT INFORMATION is visible")
    public void iVerifyThatENTERACCOUNTINFORMATIONIsVisible() {
        Assert.assertEquals(new LoginPage().getNewUserSignupText(), "ENTER ACCOUNT INFORMATION");
    }

    @Given("I click on title")
    public void iClickOnTitle() {
        new EnterAccountInfoPage().clickOnMrsRadioButton();
    }

    @When("I enter my name {string}")
    public void iEnterMyName(String FirstName) {
        new EnterAccountInfoPage().enterFirstName(FirstName);
    }

    @Then("I enter my email address {string}")
    public void iEnterMyEmailAddress(String email) {
        new EnterAccountInfoPage().sendEmailAddress(email);
    }

    @And("I enter my password {string}")
    public void iEnterMyPassword(String password) {
        new EnterAccountInfoPage().enterPassword(password);
    }

    @And("I enter my date of birth")
    public void iEnterMyDateOfBirth() {

    }

    @And("I click on Select checkbox Sign up for our newsletter!")
    public void iClickOnSelectCheckboxSignUpForOurNewsletter() {
        new EnterAccountInfoPage().clickOnSignUpForOurNewsletterTickBox();
    }

    @Then("I click on Select checkbox 'Receive special offers from our partners!")
    public void iClickOnSelectCheckboxReceiveSpecialOffersFromOurPartners() {
        new EnterAccountInfoPage().clickOnReceiveSpecialOffersFromOurPartners();
    }

    @Given("I enter first name {string}")
    public void iEnterFirstName(String fName) {
        new EnterAccountInfoPage().enterFirstName(fName);
    }

    @When("I enter last name {string}")
    public void iEnterLastName(String lName) {
        new EnterAccountInfoPage().enterLastNameUnderAddressInfo(lName);
    }

    @Then("I enter company detail {string}")
    public void iEnterCompanyDetail(String companyName) {
        new EnterAccountInfoPage().enterCompanyNameUnderAddressInfo(companyName);
    }

    @And("I enter first line of the address {string}")
    public void iEnterFirstLineOfTheAddress(String address1) {
        new EnterAccountInfoPage().enterFirstLineOfTheAddress1(address1);
    }

    @And("I enter second line of the address {string}")
    public void iEnterSecondLineOfTheAddress(String address2) {
        new EnterAccountInfoPage().enterSecondLineOfTheAddress(address2);
    }

    @And("I select country from drop down list {string}")
    public void iSelectCountryFromDropDownList(String UK) {
        new EnterAccountInfoPage().selectCountryUKFromList(UK);
    }

    @And("I enter State {string}")
    public void iEnterState(String state) {
        new EnterAccountInfoPage().enterState(state);
    }

    @And("I enter City {string}")
    public void iEnterCity(String city) {
        new EnterAccountInfoPage().enterCity(city);
    }

    @And("I enter Zipcode {string}")
    public void iEnterZipcode(String zipCode) {
        new EnterAccountInfoPage().enterZipCode(zipCode);
    }

    @And("I enter Mobile number {string}")
    public void iEnterMobileNumber(String mobileNum) {
        new EnterAccountInfoPage().enterMobileNumber(mobileNum);
    }

    @Then("I click on Create Account button")
    public void iClickOnCreateAccountButton() {
        new EnterAccountInfoPage().clickOnCreateAccount();
    }

}

