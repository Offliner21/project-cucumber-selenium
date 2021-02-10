@draganddrop
Feature: Drag and Drop
  I want to use this template for my feature file

  @drag
  Scenario: drag one element to another
    Given That I connect to the demoqa application
    When I drag the webelement dragme
    Then The webelement drag me is now over the webelement drag here
