@background
Feature: Background - OrangeHRM
  ETQ utilisateur je souhaite verifier le fonctionnement du Background

  Background: 
    Given Je me connecte a l'application OrangeHRM
    When Je saisie Username "Admin"
    And Je saisie Password "admin123"
    And Je clique sur le boutton login

  @cnx
  Scenario: Authentification - OrangeHRM
    Then Redirection vers le compte admin "Welcome"

  @buzz
  Scenario: Cliquer sur le module BUZZ
    When Je clique sur le module BUZZ

  @rec
  Scenario: Cliquer sur le module Recruitment
    When Je clique sur le module Recruitment
