Feature: Contact Us Form feature file
  This feature file is to check contact us form functionality

  Scenario: Launch browser
    Given I Click on Contact Us button
    When I Verify GET IN TOUCH is visible
    Then I Enter my name in Name field 'Jo'
    And I enter my email in email field 'joblogs@gmail.com'
    And I write subject 'Test'
    And I type my message 'Test101'
    And I choose file to Upload
    And I click Submit button
    And I click OK button on small pop up window
    And I Verify success message Success! Your details have been submitted successfully. is visible
    Then I Click Home button and verify that landed to home page successfully


