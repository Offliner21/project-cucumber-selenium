package com.orangeHRM.e2eTests.updateStatus.StepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.orangeHRM.e2eTests.updateStatus.Pages.UpdateStatusPage;
import com.orangeHRM.e2eTests.utils.CommonMethods;
import com.orangeHRM.e2eTests.utils.Setup;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UpdateStatusStepDefinition extends CommonMethods{
	public WebDriver driver;
	private UpdateStatusPage updateStatusPage = new UpdateStatusPage();
	private CommonMethods commonMethods = new CommonMethods();
	
	public UpdateStatusStepDefinition() {
		
		driver = Setup.driver;
	}
	
	@Given("^that I open the OrangeHRM application$")
	public void thatIOpenTheOrangeHRMApplication() throws Throwable {
	    commonMethods.openApplicationWithConfigFile("url-test");
	}

	@When("^I enter the admin username \"([^\"]*)\"$")
	public void iEnterTheAdminUsername(String user) throws Throwable {
	   commonMethods.fillForm(UpdateStatusPage.username, user);
	}

	@When("^I open the Buzz Module$")
	public void iOpenTheBuzzModule() throws Throwable {
	   updateStatusPage.buzzClick();
	}

	@When("^I click on the update status section$")
	public void iClickOnTheUpdateStatusSection() throws Throwable {
	    PageFactory.initElements(driver, updateStatusPage);
	    updateStatusPage.textAreaClick();
	}

	@When("^I type my post in the update status text area \"([^\"]*)\"$")
	public void iTypeMyPostInTheUpdateStatusTextArea(String post) throws Throwable {
	    commonMethods.fillForm(UpdateStatusPage.textArea, post);
	}

	@When("^I click on the post button$")
	public void iClickOnThePostButton() throws Throwable {
	    updateStatusPage.postClick();
	}
	
	@Then("^My status should be posted$")
	public void myStatusShouldBePosted(String status) throws Throwable {
		String statusText = UpdateStatusPage.postContent.getText();
        Assert.assertTrue(statusText.contains(status));
	}
	
}
