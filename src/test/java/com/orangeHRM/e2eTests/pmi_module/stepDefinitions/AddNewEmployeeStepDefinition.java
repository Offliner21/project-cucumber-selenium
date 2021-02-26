package com.orangeHRM.e2eTests.pmi_module.stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.orangeHRM.e2eTests.pmi_module.pages.AddNewEmployeePage;
import com.orangeHRM.e2eTests.utils.CommonMethods;
import com.orangeHRM.e2eTests.utils.Setup;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddNewEmployeeStepDefinition {

	public WebDriver driver;
	private CommonMethods commondMethods = new CommonMethods();
	private AddNewEmployeePage addNewEmployeePage = new AddNewEmployeePage();

	public AddNewEmployeeStepDefinition() {
		driver = Setup.driver;
	}

	@Given("^I open the OrangeHRM application$")
	public void iOpenTheOrangeHRMApplication() throws Throwable {
		PageFactory.initElements(driver, addNewEmployeePage);
		commondMethods.openApplicationWithConfigFile("url-test");
	}

	@When("^I enter the Admin username \"([^\"]*)\"$")
	public void iEnterTheAdminUsername(String name) throws Throwable {
		commondMethods.fillForm(AddNewEmployeePage.admin, name);
	}

	@When("^I enter the admin password \"([^\"]*)\"$")
	public void iEnterTheAdminPassword(String password) throws Throwable {
		commondMethods.fillForm(AddNewEmployeePage.pass, password);
	}

	@When("^I click on the login button$")
	public void iClickOnTheLoginButton() throws Throwable {
		addNewEmployeePage.loginClick();
	}

	@When("^I click on the PIM Module$")
	public void iClickOnThePIMModule() throws Throwable {
		addNewEmployeePage.pmiClick();
	}

	@When("^I go to Add Employee$")
	public void iGoToAddEmployee() throws Throwable {
		addNewEmployeePage.addEmployeeClick();
	}

	@When("^I add the first name \"([^\"]*)\"$")
	public void iAddTheFirstName(String name) throws Throwable {
		commondMethods.fillForm(AddNewEmployeePage.firstName, name);
	}

	@When("^I add the middle name \"([^\"]*)\"$")
	public void iAddTheMiddleName(String middle) throws Throwable {
		commondMethods.fillForm(AddNewEmployeePage.middleName, middle);
	}

	@When("^I add the lastname \"([^\"]*)\"$")
	public void iAddTheLastname(String lastname) throws Throwable {
		commondMethods.fillForm(AddNewEmployeePage.familyName, lastname);
	}

	@When("^I add an employee ID \"([^\"]*)\"$")
	public void iAddAnEmployeeID(String id) throws Throwable {
		commondMethods.fillForm(AddNewEmployeePage.employeeId, id);
	}

	@When("^I select a photograph$")
	public void iSelectAPhotograph() throws Throwable {

	}

	@When("^I click on create login details$")
	public void iClickOnCreateLoginDetails() throws Throwable {
		addNewEmployeePage.checkLoginClick();
	}

	@When("^I create an employee username \"John(\\d+)$")
	public void iCreateAnEmployeeUsernameJohn(String username) throws Throwable {
		commondMethods.fillForm(AddNewEmployeePage.userName, username);
	}

	@When("^I create an employee password \"([^\"]*)\"$")
	public void iCreateAnEmployeePassword(String userpassword) throws Throwable {
		commondMethods.fillForm(AddNewEmployeePage.userPassword, userpassword);
	}

	@When("^I confirm the employee password \"([^\"]*)\"$")
	public void iConfirmTheEmployeePassword(String confirm) throws Throwable {
		commondMethods.fillForm(AddNewEmployeePage.confirmPassword, confirm);
	}

	@When("^I choose the status Enabled$")
	public void iChooseTheStatusEnabled() throws Throwable {

	}

	@When("^I click on the button save$")
	public void iClickOnTheButtonSave() throws Throwable {
      addNewEmployeePage.saveButtonClick();
	}

	@Then("^The employee profile is created$")
	public void theEmployeeProfileIsCreated() throws Throwable {
    
	}

}
