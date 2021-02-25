package com.orangeHRM.e2eTests.checkBoxRadioButton.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CheckBoxRadioButtonPage {

	/*Locators*/
	final static String HOBBIESSPORT_XPATH = "//*[@id=\"hobbiesWrapper\"]/div[2]/div[1]/label";
	final static String GENDER_XPATH = "//*[@id=\"genterWrapper\"]/div[2]/div[1]";
	final static String VALUE_TXT = "Male";
	
	/*Findby*/
	@FindBy(how = How.XPATH, using = HOBBIESSPORT_XPATH)
    public static WebElement hobbiesSport;
	@FindBy(how = How.XPATH, using = GENDER_XPATH)
	public static WebElement gender;
	@FindBy(how = How.LINK_TEXT, using = VALUE_TXT)
	public static WebElement value;	
	/*Methods*/
	public void chooseHobbies() {
		hobbiesSport.click();
	}
	

}
