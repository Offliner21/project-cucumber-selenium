package com.orangeHRM.e2eTests.updateStatus.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class UpdateStatusPage {

	/* Locators */

	final static String USERNAME_ID = "txtUsername";
	final static String PASSWORD_ID = "txtPassword";
	final static String LOGINBTN_ID = "btnLogin";
	final static String BUZZMENU_ID = "menu_buzz_viewBuzz";
	final static String TEXTAREA_ID = "createPost_content";
	final static String POSTBTN_IDE = "postSubmitBtn";
	final static String POST_ID = "postContent_14";

	/* FindBy */

	@FindBy(how = How.ID, using = USERNAME_ID)
	public static WebElement username;
	@FindBy(how = How.ID, using = PASSWORD_ID)
	public static WebElement password;
	@FindBy(how = How.ID, using = LOGINBTN_ID)
	public static WebElement button;
	@FindBy(how = How.ID, using = BUZZMENU_ID)
	public static WebElement buzzMenu;
	@FindBy(how = How.ID, using = TEXTAREA_ID)
	public static WebElement textArea;
	@FindBy(how = How.ID, using = POSTBTN_IDE)
	public static WebElement poste;
	@FindBy(how = How.ID, using = POST_ID)
	public static WebElement postContent;

	/* Methods */
	public void btnClick() {
		button.click();
	}

	public void buzzClick() {
		buzzMenu.click();
	}

	public void textAreaClick() {
		textArea.click();
	}

	public void postClick() {
		postContent.click();
	}

}
