package com.orangeHRM.e2eTests.checkBoxAndRadioButton.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class CheckBoxAndRadioBoxPage {
	
	/*Locators*/
	final static String HOBBIESSPORT_XPATH = "//*[@id=\\\"hobbiesWrapper\\\"]/div[2]/div[1]/label";
	final static String GENDER_XPATH = "//*[@id=\"genterWrapper\"]/div[2]/div[1]";
	
	/*FindBy*/
	@FindBy(how = How.XPATH,using = HOBBIESSPORT_XPATH)
	public static WebElement hobbiesSport;
	@FindBy(how = How.XPATH, using = GENDER_XPATH)
	public static WebElement gender;
	
	/*Methods*/
	
	public void checkBox() {
		hobbiesSport.click();
	}
   
	public void radioButton() {
		Select radio = new Select(gender);
		radio.selectByValue("Male");
	}
}
