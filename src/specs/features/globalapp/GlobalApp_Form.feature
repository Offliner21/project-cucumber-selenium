@form
Feature: This feature is used to test the form
  I want to use this template for my feature file

  @globalapp
  Scenario: Testing the GlobalApp form
    Given That I open the GlobalApp testing form
    When I click on the first option from the multiple choice section
    And I click the second option from the checkboxes section
    And I select the third option from the dropdown menu 
    And I type a random text in the text field "random text"
    And I choose a date from the calendar
    And I choose the second option from the scale section
    And I click on the submit button
    Then The answers are recorded "Submit another response"
