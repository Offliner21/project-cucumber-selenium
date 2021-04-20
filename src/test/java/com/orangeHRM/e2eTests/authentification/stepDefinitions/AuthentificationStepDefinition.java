package com.orangeHRM.e2eTests.authentification.stepDefinitions;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import com.orangeHRM.e2eTests.authentification.pages.AuthentificationPage;
import com.orangeHRM.e2eTests.utils.CommonMethods;
import com.orangeHRM.e2eTests.utils.Setup;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AuthentificationStepDefinition extends CommonMethods {
	public WebDriver driver;
	private AuthentificationPage authentificationPage = new AuthentificationPage();
	private CommonMethods commonMethods = new CommonMethods();

	public AuthentificationStepDefinition() {
		driver = Setup.driver;
	}

	@Given("^Je me connecte a l'application OrangeHRM$")
	public void jeMeConnecteALApplicationOrangeHRM() throws Throwable {
		logger.info("Je me connecte a l'application OrangeHRM");
		commonMethods.openApplicationWithConfigFile("url-test");
	}

	@When("^Je saisie Username \"([^\"]*)\"$")
	public void jeSaisieUsername(String name) throws Throwable {
		logger.info("Je saisie Username");
		PageFactory.initElements(driver, AuthentificationPage.class);
		authentificationPage.fillUserName(name);  
	}

	@When("^Je saisie Password \"([^\"]*)\"$")
	public void jeSaisiePassword(String password) throws Throwable {
		logger.info("Je saisie Password");
		authentificationPage.fillPassword(password);
	}

	@When("^Je clique sur le boutton login$")
	public void jeCliqueSurLeBouttonLogin() throws Throwable {
		logger.info("Je clique sur le boutton login");
		authentificationPage.clickButtonLogin();
	}

	@Then("^Redirection vers le compte admin \"([^\"]*)\"$")
	public void redirectionVersLeCompteAdmin(String message) throws Throwable {
		logger.info("Redirection vers le compte admin");
        String welcomeMessage = AuthentificationPage.messageWelcome.getText();
        Assert.assertTrue(welcomeMessage.contains(message));
        
	}
}
