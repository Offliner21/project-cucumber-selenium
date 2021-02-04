@connexion
Feature: Authentification - OrangeHRM
  En tant que utilisateur je souhaite m'authentifier

  Background: 
    Given Je me connecte a l'application OrangeHRM

  @cnx
  Scenario: Authentification - OrangeHRM
    When Je saisie Username "Admin"
    And Je saisie Password "admin123"
    And Je clique sur le boutton login
    Then Redirection vers le compte admin "welcome"
