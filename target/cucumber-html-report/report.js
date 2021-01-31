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
  "duration": 2740240941,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "Authentification - OrangeHRM",
  "description": "",
  "id": "authentification---orangehrm;authentification---orangehrm",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@cnx"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "Je me connecte a l\u0027application OrangeHRM",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "Je saisie Username",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Je saisie Password",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Je clique sur le boutton login",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Redirection vers le compte admin",
  "keyword": "Then "
});
formatter.match({
  "location": "AuthentificationStepDefinition.jeMeConnecteALApplicationOrangeHRM()"
});
formatter.result({
  "duration": 3329105804,
  "status": "passed"
});
formatter.match({
  "location": "AuthentificationStepDefinition.jeSaisieUsername()"
});
formatter.result({
  "duration": 357375169,
  "status": "passed"
});
formatter.match({
  "location": "AuthentificationStepDefinition.jeSaisiePassword()"
});
formatter.result({
  "duration": 134948647,
  "status": "passed"
});
formatter.match({
  "location": "AuthentificationStepDefinition.jeCliqueSurLeBouttonLogin()"
});
formatter.result({
  "duration": 2449005811,
  "status": "passed"
});
formatter.match({
  "location": "AuthentificationStepDefinition.redirectionVersLeCompteAdmin()"
});
formatter.result({
  "duration": 78046,
  "status": "passed"
});
formatter.after({
  "duration": 168462906,
  "status": "passed"
});
});