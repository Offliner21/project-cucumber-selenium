package com.orangeHRM.e2eTests.apprentus_authentification.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AuthentificationPage {

	/*Locators*/
	final static String MENU_XPATH = "//body/div[@id='wrap']/div[@id='AppContainer-react-component-7b3449d8-438c-48b9-a2e3-b3998d448987']/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/*[1]";
	final static String SIGNIN_XPATH = "//a[contains(text(),'Sign in')]";
	final static String USERNAME_XPATH = "//body/div[@id='wrap']/div[@id='AppContainer-react-component-e7a98eaa-5888-4b2b-b4c4-4084521791c2']/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/form[1]/input[2]";
	final static String PASSWORD_XPATH = "//body/div[@id='wrap']/div[@id='AppContainer-react-component-e7a98eaa-5888-4b2b-b4c4-4084521791c2']/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/form[1]/input[3]";
	final static String LOGIN_XPATH = "//button[contains(text(),'Log In')]";
	
	/*FindBy*/
	@FindBy(how = How.XPATH, using = MENU_XPATH)
	public static WebElement menu;
	
			
}
