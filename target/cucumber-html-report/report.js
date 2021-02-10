$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("autentification/Authentification.feature");
formatter.feature({
  "line": 2,
  "name": "Authentification - OrangeHRM",
  "description": "En tant que utilisateur je souhaite m\u0027authentifier",
  "id": "authentification---orangehrm",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@connexion"
    }
  ]
});
formatter.before({
  "duration": 14142860887,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "Je me connecte a l\u0027application OrangeHRM",
  "keyword": "Given "
});
formatter.match({
  "location": "AuthentificationStepDefinition.jeMeConnecteALApplicationOrangeHRM()"
});
formatter.result({
  "duration": 7319698856,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "Authentification - OrangeHRM",
  "description": "",
  "id": "authentification---orangehrm;authentification---orangehrm",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 8,
      "name": "@cnx"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "Je saisie Username \"Admin\"",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "Je saisie Password \"admin123\"",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "Je clique sur le boutton login",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "Redirection vers le compte admin \"Welcome\"",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Admin",
      "offset": 20
    }
  ],
  "location": "AuthentificationStepDefinition.jeSaisieUsername(String)"
});
formatter.result({
  "duration": 571448959,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin123",
      "offset": 20
    }
  ],
  "location": "AuthentificationStepDefinition.jeSaisiePassword(String)"
});
formatter.result({
  "duration": 118594270,
  "status": "passed"
});
formatter.match({
  "location": "AuthentificationStepDefinition.jeCliqueSurLeBouttonLogin()"
});
formatter.result({
  "duration": 6440075287,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Welcome",
      "offset": 34
    }
  ],
  "location": "AuthentificationStepDefinition.redirectionVersLeCompteAdmin(String)"
});
formatter.result({
  "duration": 68159487,
  "status": "passed"
});
formatter.after({
  "duration": 240556905,
  "status": "passed"
});
});