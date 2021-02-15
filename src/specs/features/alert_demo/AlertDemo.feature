@alert
Feature: Generating An Alert
  I want to use this template for my feature file

  @alrt
  Scenario: Generate an alert from a webpage and accept it
    Given That I connect to the QAtools website alert page
    When I click on the first Click me blue button
    Then I accept the alert
    And The title of the page is displayed in the console
