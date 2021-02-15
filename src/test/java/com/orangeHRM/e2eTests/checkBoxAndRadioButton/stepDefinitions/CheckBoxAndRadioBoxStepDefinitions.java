package com.orangeHRM.e2eTests.checkBoxAndRadioButton.stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import com.orangeHRM.e2eTests.checkBoxAndRadioButton.pages.CheckBoxAndRadioBoxPage;
import com.orangeHRM.e2eTests.utils.CommonMethods;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CheckBoxAndRadioBoxStepDefinitions extends CommonMethods{
    public WebDriver driver;
    private CheckBoxAndRadioBoxPage checkBoxAndRadioBoxPage = new CheckBoxAndRadioBoxPage();
    private CommonMethods commonMethods = new CommonMethods();
    
	
	@Given("^I connect to the QAtools website check box and radio buttons page$")
	public void iConnectToTheQAtoolsWebsiteCheckBoxAndRadioButtonsPage() throws Throwable {
		PageFactory.initElements(driver, checkBoxAndRadioBoxPage);
	    commonMethods.openApplicationWithConfigFile("url-checkbox-radiobutton");
	}

	@When("^I click on the check box sports$")
	public void iClickOnTheCheckBoxSports() throws Throwable {
	    checkBoxAndRadioBoxPage.checkBox();
	}

	@When("^I select the radio button male$")
	public void iSelectTheRadioButtonMale() throws Throwable {
	    checkBoxAndRadioBoxPage.radioButton();
	}

	@Then("^The checkbox is checked$")
	public void theCheckboxIsChecked() throws Throwable {
	    
	}

	@Then("^The radio button is selected$")
	public void theRadioButtonIsSelected() throws Throwable {
	  
	}

}
