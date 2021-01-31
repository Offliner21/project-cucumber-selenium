package com.orangeHRM.e2eTests.stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.orangeHRM.e2eTests.pageObject.AuthentificationPage;
import com.orangeHRM.e2eTests.utils.CommonMethods;
import com.orangeHRM.e2eTests.utils.Setup;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AuthentificationStepDefinition {
	public WebDriver driver;
	private AuthentificationPage authentificationPage = new AuthentificationPage();
	private CommonMethods commonMethods = new CommonMethods();

	public AuthentificationStepDefinition() {
		driver = Setup.driver;
	}

	@Given("^Je me connecte a l'application OrangeHRM$")
	public void jeMeConnecteALApplicationOrangeHRM() throws Throwable {
		commonMethods.openApplicationWithConfigFile();
	}

	@When("^Je saisie Username$")
	public void jeSaisieUsername() throws Throwable {
		PageFactory.initElements(driver, AuthentificationPage.class);
		authentificationPage.fillUserName();
	}

	@When("^Je saisie Password$")
	public void jeSaisiePassword() throws Throwable {
		authentificationPage.fillPassword();
	}

	@When("^Je clique sur le boutton login$")
	public void jeCliqueSurLeBouttonLogin() throws Throwable {
		authentificationPage.clickButtonLogin();
	}

	@Then("^Redirection vers le compte admin$")
	public void redirectionVersLeCompteAdmin() throws Throwable {

	}

}
