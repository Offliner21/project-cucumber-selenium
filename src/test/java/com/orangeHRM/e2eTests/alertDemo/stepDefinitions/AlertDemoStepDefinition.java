package com.orangeHRM.e2eTests.alertDemo.stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.orangeHRM.e2eTests.alertDemo.pages.AlertDemoPage;
import com.orangeHRM.e2eTests.utils.CommonMethods;
import com.orangeHRM.e2eTests.utils.Setup;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AlertDemoStepDefinition extends CommonMethods {
	public WebDriver driver;
	private AlertDemoPage alertDemopage = new AlertDemoPage();
	private CommonMethods commonMethods = new CommonMethods();
	
	public AlertDemoStepDefinition() {
		driver = Setup.driver;
	}
	

@Given("^That I connect to the QAtools website alert page$")
public void thatIConnectToTheQAtoolsWebsiteAlertPage() throws Throwable {
	PageFactory.initElements(driver, alertDemopage);
   commonMethods.openApplicationWithConfigFile("url-alert-demo");
   
}

@When("^I click on the first Click me blue button$")
public void iClickOnTheFirstClickMeBlueButton() throws Throwable {
    alertDemopage.clickAlert();
}

//@Then("^An alert window appears$")
//public void anAlertWindowAppears() throws Throwable {
//   
//}

@When("^I accept the alert$")
public void iAcceptTheAlert() throws Throwable {
   alertDemopage.acceptAlert();
}

@Then("^The title of the page is displayed in the console$")
public void theTitleOfThePageIsDisplayedInTheConsole() throws Throwable {
   alertDemopage.getTitle();
}

//@Then("^The alert window disappears$")
//public void theAlertWindowDisappears() throws Throwable {
//   
//}
}
