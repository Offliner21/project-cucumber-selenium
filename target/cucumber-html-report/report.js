$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("checkbox_radiobutton/checkbox_radiobutton.feature");
formatter.feature({
  "line": 2,
  "name": "Check box test and radio button",
  "description": "I want to use this template for my feature file",
  "id": "check-box-test-and-radio-button",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@checkboxandradio"
    }
  ]
});
formatter.before({
  "duration": 1935803874,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "Click on the hobbies checkbox and the gender radio button",
  "description": "",
  "id": "check-box-test-and-radio-button;click-on-the-hobbies-checkbox-and-the-gender-radio-button",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@check"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "I connect to the QAtools website check box and radio buttons page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I click on the check box sports",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I select the radio button male",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "The checkbox is checked",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "The radio button is selected",
  "keyword": "And "
});
formatter.match({
  "location": "CheckBoxAndRadioBoxStepDefinitions.iConnectToTheQAtoolsWebsiteCheckBoxAndRadioButtonsPage()"
});
formatter.result({
  "duration": 2813474714,
  "status": "passed"
});
formatter.match({
  "location": "CheckBoxAndRadioBoxStepDefinitions.iClickOnTheCheckBoxSports()"
});
formatter.result({
  "duration": 702190,
  "error_message": "java.lang.NullPointerException\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\n\tat com.sun.proxy.$Proxy21.click(Unknown Source)\n\tat com.orangeHRM.e2eTests.checkBoxAndRadioButton.pages.CheckBoxAndRadioBoxPage.checkBox(CheckBoxAndRadioBoxPage.java:23)\n\tat com.orangeHRM.e2eTests.checkBoxAndRadioButton.stepDefinitions.CheckBoxAndRadioBoxStepDefinitions.iClickOnTheCheckBoxSports(CheckBoxAndRadioBoxStepDefinitions.java:26)\n\tat ✽.When I click on the check box sports(checkbox_radiobutton/checkbox_radiobutton.feature:8)\n",
  "status": "failed"
});
formatter.match({
  "location": "CheckBoxAndRadioBoxStepDefinitions.iSelectTheRadioButtonMale()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CheckBoxAndRadioBoxStepDefinitions.theCheckboxIsChecked()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CheckBoxAndRadioBoxStepDefinitions.theRadioButtonIsSelected()"
});
formatter.result({
  "status": "skipped"
});
formatter.write("Current page url is https://demoqa.com/automation-practice-form");
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 702067444,
  "status": "passed"
});
});