$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("drag_and_drop/drag.feature");
formatter.feature({
  "line": 2,
  "name": "Drag and Drop",
  "description": "I want to use this template for my feature file",
  "id": "drag-and-drop",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@draganddrop"
    }
  ]
});
formatter.before({
  "duration": 3124949969,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "drag one element to another",
  "description": "",
  "id": "drag-and-drop;drag-one-element-to-another",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@drag"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "That I connect to the demoqa application",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I drag the webelement dragme",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "The webelement drag me is now over the webelement drag here",
  "keyword": "Then "
});
formatter.match({
  "location": "DragAndDropStepDefinition.thatIConnectToTheDemoqaApplication()"
});
formatter.result({
  "duration": 2939458044,
  "status": "passed"
});
formatter.match({
  "location": "DragAndDropStepDefinition.iDragTheWebelementDragme()"
});
formatter.result({
  "duration": 339963888,
  "status": "passed"
});
formatter.match({
  "location": "DragAndDropStepDefinition.theWebelementDragMeIsNowOverTheWebelementDragHere()"
});
formatter.result({
  "duration": 38191117,
  "status": "passed"
});
formatter.after({
  "duration": 1328082733,
  "status": "passed"
});
});