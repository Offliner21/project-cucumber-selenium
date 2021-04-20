package com.orangeHRM.e2eTests.GloablAppForm.StepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import com.orangeHRM.e2eTests.GloablAppForm.Pages.GlobalAppFormPage;
import com.orangeHRM.e2eTests.utils.CommonMethods;
import com.orangeHRM.e2eTests.utils.Setup;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GlobalFormAppStepDefinition {
	public WebDriver driver;
	private CommonMethods commonMethods = new CommonMethods();
	private GlobalAppFormPage globalAppPage = new GlobalAppFormPage();

	public GlobalFormAppStepDefinition() {
		driver = Setup.driver;
	}

	@Given("^That I open the GlobalApp testing form$")
	public void thatIOpenTheGlobalAppTestingForm() throws Throwable {
		PageFactory.initElements(driver, globalAppPage);
		commonMethods.openApplicationWithConfigFile("url-global");
	}

	@When("^I click on the first option from the multiple choice section$")
	public void iClickOnTheFirstOptionFromTheMultipleChoiceSection() throws Throwable {
		globalAppPage.optionClick();
	}

	@When("^I click the second option from the checkboxes section$")
	public void iClickTheSecondOptionFromTheCheckboxesSection() throws Throwable {
		globalAppPage.checkboxClick();
	}

	@When("^I select the third option from the dropdown menu$")
	public void iSelectTheThirdOptionFromTheDropdownMenu() throws Throwable {
		globalAppPage.selectOption();
	}

	@When("^I type a random text in the text field \"([^\"]*)\"$")
	public void iTypeARandomTextInTheTextField(String write) throws Throwable {
		commonMethods.fillForm(GlobalAppFormPage.text, write);
	}

	@When("^I choose a date from the calendar$")
	public void iChooseADateFromTheCalendar() throws Throwable {

	}

	@When("^I choose the second option from the scale section$")
	public void iChooseTheSecondOptionFromTheScaleSection() throws Throwable {
		globalAppPage.scaleClick();
	}

	@When("^I click on the submit button$")
	public void iClickOnTheSubmitButton() throws Throwable {
		globalAppPage.submitClick();
	}

	@Then("^The answers are recorded \"([^\"]*)\"$")
	public void theAnswersAreRecorded(String message) throws Throwable {
//		WebDriverWait wait = new WebDriverWait(driver, 30);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("resp")));
		String recordMessage = GlobalAppFormPage.resp.getText();
		Assert.assertTrue(recordMessage.contains(message));
	}

}
