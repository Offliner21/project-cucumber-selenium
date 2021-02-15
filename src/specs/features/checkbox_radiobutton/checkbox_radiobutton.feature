@checkboxandradio
Feature: Check box test and radio button
  I want to use this template for my feature file

  @check
  Scenario: Click on the hobbies checkbox and the gender radio button
    Given I connect to the QAtools website check box and radio buttons page
    When I click on the check box sports
    And I select the radio button male
    Then The checkbox is checked
    And The radio button is selected
