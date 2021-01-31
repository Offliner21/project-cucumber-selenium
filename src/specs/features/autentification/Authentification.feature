@connexion
Feature: Authentification - OrangeHRM
  En tant que utilisateur je souhaite m'authentifier

  @cnx
  Scenario: Authentification - OrangeHRM
    Given Je me connecte a l'application OrangeHRM
    When Je saisie Username
    And Je saisie Password
    And Je clique sur le boutton login
    Then Redirection vers le compte admin
