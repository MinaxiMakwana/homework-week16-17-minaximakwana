Feature: Background feature file for Automation exercise demo site

  Background:
    Given I Launch browser
    When I navigated to the url 'http://automationexercise.com'
    Then I verify page has lorded successfully
