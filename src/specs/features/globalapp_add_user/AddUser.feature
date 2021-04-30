@adduser
Feature: Add a user in the GlobalAppCasting web Application

 I want to add a user in the GlobalAppCasting webapp

  @globalapp
  Scenario: Add a user
    Given I open the GloblaAppCasting Application
    When I enter the admin username "test@globalappcasting.com"
    And I click on the button next
    And I enter the admin password "autoSummer12"
    And I click on the sign in button
    Then I am redirected to the admin dashboard
    When I click on the Add user button
    And I enter the new user firstname "John"
    And I enter the new user lastname "Doe"
    And I enter the new user email address "John@email.com"
    And I click on the save button
    Then The user profile should be created
    When I click on the create xPage button
    And I enter the xPage name
    And I select the xPage category
    And I add the xPage icon
    And I click on the choose an image icon button
    And I select the chosen image icon
    And I click on the use icon button
    And I add the xPage background image
    And I click on the choose an image background button
    And I select the chosen background image
    And I click on the use background image button
    And I select the xPage responsible person from the list
    And I selecy the priority from the list
    And I enter the production description
    And I select the start date from the calendar
    And I select the end date from the calendar
    And I click on the save button
    Then the xPage should be added to the user
    

  