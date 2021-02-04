package com.orangeHRM.e2eTests.authentification_outline.stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.orangeHRM.e2eTests.authentification.pages.AuthentificationPage;
import com.orangeHRM.e2eTests.utils.Setup;

import cucumber.api.java.en.When;

public class AuthentificationOutlineStepDefinitions {

	public WebDriver driver;
	private AuthentificationPage authentificationPage = new AuthentificationPage();
	//private CommonMethods commonMethods = new CommonMethods();

	public AuthentificationOutlineStepDefinitions() {
		driver = Setup.driver;
	}

//	@Given("^je me connecte a l'application OrangeHRM$")
//	public void jeMeConnecteALApplicationOrangeHRM() throws Throwable {
//		commonMethods.openApplicationWithConfigFile("url-test");
//	}

	@When("^je saisie Username \"([^\"]*)\"$")
	public void jeSaisieUsername(String name) throws Throwable {
		PageFactory.initElements(driver, AuthentificationPage.class);
		authentificationPage.fillUserName(name);
	}

	@When("^je saisie Password \"([^\"]*)\"$")
	public void jeSaisiePassword(String password) throws Throwable {
		authentificationPage.fillPassword(password);
	}

//	@When("^je clique sur le boutton login$")
//	public void jeCliqueSurLeBouttonLogin() throws Throwable {
//		authentificationPage.clickButtonLogin();
//	}
}
