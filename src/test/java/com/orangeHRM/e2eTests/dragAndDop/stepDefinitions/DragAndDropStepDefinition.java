package com.orangeHRM.e2eTests.dragAndDop.stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.orangeHRM.e2eTests.dragAndDop.pages.DragAndDropPage;
import com.orangeHRM.e2eTests.utils.CommonMethods;
import com.orangeHRM.e2eTests.utils.Setup;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DragAndDropStepDefinition {

	public WebDriver driver;
	private CommonMethods commondMethods = new CommonMethods();
	private DragAndDropPage dragAndDroppage = new DragAndDropPage();
	
	public DragAndDropStepDefinition() {
		driver = Setup.driver;
	}
	@Given("^That I connect to the demoqa application$")
	public void thatIConnectToTheDemoqaApplication() throws Throwable {
	    commondMethods.openApplicationWithConfigFile("url-droppable");
	    PageFactory.initElements(driver, dragAndDroppage);
	}

	@When("^I drag the webelement dragme$")
	public void iDragTheWebelementDragme() throws Throwable {
	   commondMethods.dragAndDrop(DragAndDropPage.drag, DragAndDropPage.drop);
	}

	@Then("^The webelement drag me is now over the webelement drag here$")
	public void theWebelementDragMeIsNowOverTheWebelementDragHere() throws Throwable {
	    
        String textTo = DragAndDropPage.drop.getText();
		
		if (textTo.equals("Dropped!")) {
			
			System.out.println("Pass: Source is dropped to target as expected");
			
		} else {
			
			System.out.println("Fail: Source couldn't be dropped to target as expected");
		}
	}

}
