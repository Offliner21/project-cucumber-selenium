@outline
Feature: Authentification Outline - OrangeHRM
    En tant que utilisateur je souhaite m'authentifier avec un scénario outline

  Background: 
    Given Je me connecte a l'application OrangeHRM

  @cnx-outline
  Scenario Outline: Authentification Outline - OrangeHRM
    When je saisie Username "<name>"
    And je saisie Password "<password>"
    And Je clique sur le boutton login

    Examples: 
      | name   | password  |
      | Admin  | admin123  |
      | safe   | safe123   |
      | imen   | imen123   |
      | sondes | sondes123 |
      | hanen  | hanen123  |
