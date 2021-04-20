$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("globalapp/GlobalApp_Form.feature");
formatter.feature({
  "line": 2,
  "name": "This feature is used to test the form",
  "description": "I want to use this template for my feature file",
  "id": "this-feature-is-used-to-test-the-form",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@form"
    }
  ]
});
formatter.before({
  "duration": 2289114242,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "Testing the GlobalApp form",
  "description": "",
  "id": "this-feature-is-used-to-test-the-form;testing-the-globalapp-form",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@globalapp"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "That I open the GlobalApp testing form",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I click on the first option from the multiple choice section",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I click the second option from the checkboxes section",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I select the third option from the dropdown menu",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I type a random text in the text field \"random text\"",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I choose a date from the calendar",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I choose the second option from the scale section",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I click on the submit button",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "The answers are recorded \"Submit another response\"",
  "keyword": "Then "
});
formatter.match({
  "location": "GlobalFormAppStepDefinition.thatIOpenTheGlobalAppTestingForm()"
});
formatter.result({
  "duration": 2649033923,
  "status": "passed"
});
formatter.match({
  "location": "GlobalFormAppStepDefinition.iClickOnTheFirstOptionFromTheMultipleChoiceSection()"
});
formatter.result({
  "duration": 439124548,
  "status": "passed"
});
formatter.match({
  "location": "GlobalFormAppStepDefinition.iClickTheSecondOptionFromTheCheckboxesSection()"
});
formatter.result({
  "duration": 90966161,
  "status": "passed"
});
formatter.match({
  "location": "GlobalFormAppStepDefinition.iSelectTheThirdOptionFromTheDropdownMenu()"
});
formatter.result({
  "duration": 339051260,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "random text",
      "offset": 40
    }
  ],
  "location": "GlobalFormAppStepDefinition.iTypeARandomTextInTheTextField(String)"
});
formatter.result({
  "duration": 248297946,
  "status": "passed"
});
formatter.match({
  "location": "GlobalFormAppStepDefinition.iChooseADateFromTheCalendar()"
});
formatter.result({
  "duration": 45923,
  "status": "passed"
});
formatter.match({
  "location": "GlobalFormAppStepDefinition.iChooseTheSecondOptionFromTheScaleSection()"
});
formatter.result({
  "duration": 179132971,
  "status": "passed"
});
formatter.match({
  "location": "GlobalFormAppStepDefinition.iClickOnTheSubmitButton()"
});
formatter.result({
  "duration": 954854344,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Submit another response",
      "offset": 26
    }
  ],
  "location": "GlobalFormAppStepDefinition.theAnswersAreRecorded(String)"
});
formatter.result({
  "duration": 4089662282,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"link text\",\"selector\":\"Submit another response\"}\n  (Session info: chrome\u003d89.0.4389.114)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027offliner\u0027, ip: \u0027127.0.1.1\u0027, os.name: \u0027Linux\u0027, os.arch: \u0027amd64\u0027, os.version: \u00275.8.0-50-generic\u0027, java.version: \u002711.0.10\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 89.0.4389.114, chrome: {chromedriverVersion: 88.0.4324.96 (68dba2d8a0b14..., userDataDir: /tmp/.com.google.Chrome.RcYztQ}, goog:chromeOptions: {debuggerAddress: localhost:34719}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: LINUX, platformName: LINUX, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: a61a9141e37169da3a6d57c3f75517b3\n*** Element info: {Using\u003dlink text, value\u003dSubmit another response}\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByLinkText(RemoteWebDriver.java:380)\n\tat org.openqa.selenium.By$ByLinkText.findElement(By.java:220)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\n\tat com.sun.proxy.$Proxy21.getText(Unknown Source)\n\tat com.orangeHRM.e2eTests.GloablAppForm.StepDefinitions.GlobalFormAppStepDefinition.theAnswersAreRecorded(GlobalFormAppStepDefinition.java:68)\n\tat ✽.Then The answers are recorded \"Submit another response\"(globalapp/GlobalApp_Form.feature:15)\n",
  "status": "failed"
});
formatter.write("Current page url is https://docs.google.com/forms/d/e/1FAIpQLSdwD1y2eBOoJ-hvk97wDGptfI9oYga8SqtUz7u3nrFbWM7hxw/formResponse");
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 1303836481,
  "status": "passed"
});
});