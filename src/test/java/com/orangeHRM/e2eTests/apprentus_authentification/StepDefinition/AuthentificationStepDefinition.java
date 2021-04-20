package com.orangeHRM.e2eTests.apprentus_authentification.StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.orangeHRM.e2eTests.apprentus_authentification.Pages.AuthentificationPage;
import com.orangeHRM.e2eTests.utils.CommonMethods;
import com.orangeHRM.e2eTests.utils.Setup;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.deps.com.thoughtworks.xstream.core.util.Pool.Factory;

public class AuthentificationStepDefinition extends CommonMethods {
	
	public WebDriver driver;
	private CommonMethods commondMethods = new CommonMethods();
	private AuthentificationPage authentificationPage = new AuthentificationPage();
	
	public AuthentificationStepDefinition() {
		
		driver = Setup.driver;
	}
	
	@Given("^That I open the Apprentus Applicaiton$")
	public void thatIOpenTheApprentusApplicaiton() throws Throwable {
      PageFactory.initElements(driver, authentificationPage);
	}

	@When("^I cick on the hamburger menu$")
	public void iCickOnTheHamburgerMenu() throws Throwable {
	    
	}

	@When("^I click on the sign in button$")
	public void iClickOnTheSignInButton() throws Throwable {
	  
	}

	@When("^I enter the username \"([^\"]*)\"$")
	public void iEnterTheUsername(String arg1) throws Throwable {
	   
	}

	@When("^I enter the password \"([^\"]*)\"$")
	public void iEnterThePassword(String arg1) throws Throwable {
	 
	}

	@Then("^I am redirected to the main dashboard$")
	public void iAmRedirectedToTheMainDashboard() throws Throwable {

	}

}
