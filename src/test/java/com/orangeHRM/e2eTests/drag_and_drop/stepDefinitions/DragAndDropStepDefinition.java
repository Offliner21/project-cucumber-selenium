package com.orangeHRM.e2eTests.drag_and_drop.stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.orangeHRM.e2eTests.drag_and_drop.pages.DragAndDropPage;
import com.orangeHRM.e2eTests.utils.CommonMethods;
import com.orangeHRM.e2eTests.utils.Setup;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DragAndDropStepDefinition extends CommonMethods {

	public WebDriver driver;
	private DragAndDropPage draganddroppage = new DragAndDropPage();
	private CommonMethods commonMethods = new CommonMethods();

	public DragAndDropStepDefinition() {
		driver = Setup.driver;
	}

	@Given("^That I connect to the demoqa application$")
	public void thatIConnectToTheDemoqaApplication() throws Throwable {
		logger.info("That I connect to the demoqa application");
		commonMethods.openApplicationWithConfigFile("url-droppable");
		
	}

	@When("^I drag the webelement dragme$")
	public void iDragTheWebelementDragme() throws Throwable {
		logger.info("I drag the webelement dragme");
		PageFactory.initElements(driver, DragAndDropPage.class);
		draganddroppage.dragAndDrop();

	}

	@Then("^The webelement drag me is now over the webelement drag here$")
	public void theWebelementDragMeIsNowOverTheWebelementDragHere() throws Throwable {
		logger.info("The webelement drag me is now over the webelement drag here");
		draganddroppage.verifyPageChange("textTo");

	}
}