package com.orangeHRM.e2eTests.checkBoxRadioButton.stepDefinistions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.orangeHRM.e2eTests.checkBoxRadioButton.pages.CheckBoxRadioButtonPage;
import com.orangeHRM.e2eTests.utils.CommonMethods;
import com.orangeHRM.e2eTests.utils.Setup;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class CheckBoxRadioButtonStepDefinitions {
    public WebDriver driver;
    private CheckBoxRadioButtonPage checkButtonRadioButtonPage = new CheckBoxRadioButtonPage();
    private CommonMethods commonMethods = new CommonMethods();
    
	public CheckBoxRadioButtonStepDefinitions() {
		driver = Setup.driver;
	}
	@Given("^I connect to the QAtools website$")
	public void iConnectToTheQAtoolsWebsite() throws Throwable {
	    PageFactory.initElements(driver, checkButtonRadioButtonPage);
	    commonMethods.openApplicationWithConfigFile("url-checkbox-radiobutton");
	}

	@When("^I click on the check box sports$")
	public void iClickOnTheCheckBoxSports() throws Throwable {
	   checkButtonRadioButtonPage.chooseHobbies();
	}

	@When("^I select the radio button male$")
	public void iSelectTheRadioButtonMale() throws Throwable {
		commonMethods.selectDropDownListByValue(CheckBoxRadioButtonPage.gender, "Male");
	}
}
