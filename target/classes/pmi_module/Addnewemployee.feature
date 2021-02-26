@add
Feature: Add a new employee
  I want to use this template for my feature file

  @addprofile
  Scenario: Add a new employee profile to the HR application
    Given I open the OrangeHRM application
    When I enter the Admin username "Admin"
    And I enter the admin password "admin123"
    And I click on the login button
    And I click on the PIM Module
    And I go to Add Employee
    And I add the first name "John"
    And I add the middle name "walker"
    And I add the lastname "Doe"
    And I add an employee ID "8889"
    And I select a photograph
    And I click on create login details
    And I create an employee username "John889
    And I create an employee password "John889J!#"
    And I confirm the employee password "John889J!#"
    And I choose the status Enabled
    And I click on the button save
    Then The employee profile is created
