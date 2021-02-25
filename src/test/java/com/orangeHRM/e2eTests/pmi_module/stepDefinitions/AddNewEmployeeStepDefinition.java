package com.orangeHRM.e2eTests.pmi_module.stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.orangeHRM.e2eTests.pmi_module.pages.AddNewEmployeePage;
import com.orangeHRM.e2eTests.utils.CommonMethods;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddNewEmployeeStepDefinition {
	
	public WebDriver driver;
	private CommonMethods commondMethods = new CommonMethods();
	private AddNewEmployeePage addNewEmployeePage = new AddNewEmployeePage();
	
	@Given("^I open the OrangeHRM application$")
	public void iOpenTheOrangeHRMApplication() throws Throwable {
	PageFactory.initElements(driver, addNewEmployeePage);
	commondMethods.openApplicationWithConfigFile("url-test");
	}

	@When("^I click on the PIM Module$")
	public void iClickOnThePIMModule() throws Throwable {
	    
	}

	@When("^I go to Add Employee$")
	public void iGoToAddEmployee() throws Throwable {
	  
	}

	@When("^I add the first name <John>$")
	public void iAddTheFirstNameJohn() throws Throwable {
	
	}

	@When("^I add the middle name <walker>$")
	public void iAddTheMiddleNameWalker() throws Throwable {
	   
	}

	@When("^I add the lastname <Doe>$")
	public void iAddTheLastnameDoe() throws Throwable {
	
	}

	@When("^I add an employee ID <(\\d+)>$")
	public void iAddAnEmployeeID(int arg1) throws Throwable {
	    
	}

	@When("^I add a photograph$")
	public void iAddAPhotograph() throws Throwable {
	  
	}

	@When("^I click on create login details checkbox$")
	public void iClickOnCreateLoginDetailsCheckbox() throws Throwable {
	  
	}

	@When("^I create an employee username <John(\\d+)>$")
	public void iCreateAnEmployeeUsernameJohn(int arg1) throws Throwable {
	  
	}

	@When("^I create an employee password <John(\\d+)J!#>$")
	public void iCreateAnEmployeePasswordJohnJ(int arg1) throws Throwable {
	    
	}

	@When("^I confirm the employee password <John(\\d+)J!#>$")
	public void iConfirmTheEmployeePasswordJohnJ(int arg1) throws Throwable {
	    
	}

	@When("^I choose the status Enabled$")
	public void iChooseTheStatusEnabled() throws Throwable {
	 
	}

	@When("^I click on the button save$")
	public void iClickOnTheButtonSave() throws Throwable {
	    
	}

	@Then("^The employee profile is created$")
	public void theEmployeeProfileIsCreated() throws Throwable {
	 
	}


}
