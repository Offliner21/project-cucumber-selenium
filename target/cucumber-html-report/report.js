$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("pmi_module/Addnewemployee.feature");
formatter.feature({
  "line": 2,
  "name": "Add a new employee",
  "description": "I want to use this template for my feature file",
  "id": "add-a-new-employee",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@add"
    }
  ]
});
formatter.before({
  "duration": 1712752717,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "Add a new employee profile to the HR application",
  "description": "",
  "id": "add-a-new-employee;add-a-new-employee-profile-to-the-hr-application",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@addprofile"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "I open the OrangeHRM application",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I enter the Admin username \"Admin\"",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I enter the admin password \"admin123\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I click on the login button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I click on the PIM Module",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I go to Add Employee",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I add the first name \"John\"",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I add the middle name \"walker\"",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I add the lastname \"Doe\"",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I add an employee ID \"8889\"",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I select a photograph",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I click on create login details",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I create an employee username \"John889\"",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I create an employee password \"John889J!#\"",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "I confirm the employee password \"John889J!#\"",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "I choose the status Enabled",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "I click on the button save",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "The employee profile is created",
  "keyword": "Then "
});
formatter.match({
  "location": "AddNewEmployeeStepDefinition.iOpenTheOrangeHRMApplication()"
});
formatter.result({
  "duration": 3680067481,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Admin",
      "offset": 28
    }
  ],
  "location": "AddNewEmployeeStepDefinition.iEnterTheAdminUsername(String)"
});
formatter.result({
  "duration": 135472024,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin123",
      "offset": 28
    }
  ],
  "location": "AddNewEmployeeStepDefinition.iEnterTheAdminPassword(String)"
});
formatter.result({
  "duration": 130097584,
  "status": "passed"
});
formatter.match({
  "location": "AddNewEmployeeStepDefinition.iClickOnTheLoginButton()"
});
formatter.result({
  "duration": 2300189609,
  "status": "passed"
});
formatter.match({
  "location": "AddNewEmployeeStepDefinition.iClickOnThePIMModule()"
});
formatter.result({
  "duration": 2839284413,
  "status": "passed"
});
formatter.match({
  "location": "AddNewEmployeeStepDefinition.iGoToAddEmployee()"
});
formatter.result({
  "duration": 927663769,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "John",
      "offset": 22
    }
  ],
  "location": "AddNewEmployeeStepDefinition.iAddTheFirstName(String)"
});
formatter.result({
  "duration": 111287224,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "walker",
      "offset": 23
    }
  ],
  "location": "AddNewEmployeeStepDefinition.iAddTheMiddleName(String)"
});
formatter.result({
  "duration": 111854630,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Doe",
      "offset": 20
    }
  ],
  "location": "AddNewEmployeeStepDefinition.iAddTheLastname(String)"
});
formatter.result({
  "duration": 120948462,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "8889",
      "offset": 22
    }
  ],
  "location": "AddNewEmployeeStepDefinition.iAddAnEmployeeID(String)"
});
formatter.result({
  "duration": 108393977,
  "status": "passed"
});
formatter.match({
  "location": "AddNewEmployeeStepDefinition.iSelectAPhotograph()"
});
formatter.result({
  "duration": 57549920,
  "status": "passed"
});
formatter.match({
  "location": "AddNewEmployeeStepDefinition.iClickOnCreateLoginDetails()"
});
formatter.result({
  "duration": 99058658,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "John889",
      "offset": 31
    }
  ],
  "location": "AddNewEmployeeStepDefinition.iCreateAnEmployeeUsername(String)"
});
formatter.result({
  "duration": 100237502,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "John889J!#",
      "offset": 31
    }
  ],
  "location": "AddNewEmployeeStepDefinition.iCreateAnEmployeePassword(String)"
});
formatter.result({
  "duration": 139019835,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "John889J!#",
      "offset": 33
    }
  ],
  "location": "AddNewEmployeeStepDefinition.iConfirmTheEmployeePassword(String)"
});
formatter.result({
  "duration": 122146800,
  "status": "passed"
});
formatter.match({
  "location": "AddNewEmployeeStepDefinition.iChooseTheStatusEnabled()"
});
formatter.result({
  "duration": 103141028,
  "status": "passed"
});
formatter.match({
  "location": "AddNewEmployeeStepDefinition.iClickOnTheButtonSave()"
});
formatter.result({
  "duration": 90216750,
  "status": "passed"
});
formatter.match({
  "location": "AddNewEmployeeStepDefinition.theEmployeeProfileIsCreated()"
});
formatter.result({
  "duration": 3161507381,
  "status": "passed"
});
formatter.after({
  "duration": 124804342,
  "status": "passed"
});
});