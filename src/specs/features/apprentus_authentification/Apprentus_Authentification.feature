@login
Feature: Apprentus Authentification
  The purpose of this feature is to test the authetification functionality

  @authent
  Scenario: Login to Apprentus Website
    Given That I open the Apprentus Applicaiton
    When I cick on the hamburger menu
    And I click on the sign in button
    And I enter the username "moadeb.mohamed@gmail.com"
    And I enter the password "yoadf889nikita"
    And I click on the login button
    Then I am redirected to the main dashboard
