package com.orangeHRM.e2eTests.pmi_module.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddNewEmployeePage {

	/* Locators */
	final static String ADMIN_ID = "txtUsername";
	final static String PASSWORD_ID = "txtPassword";
	final static String LOGINBTN_ID = "btnLogin";
	final static String PIM_XPATH = "//b[contains(text(),'PIM')]";
	final static String PIMADDEMPLOYEE_ID = "menu_pim_addEmployee";
	final static String FIRSTNAME_ID = "firstName";
	final static String MIDDLENAME_ID = "middleName";
	final static String FAMILYNAME_ID = "lastName";
	final static String EMPLOYEEID_ID = "employeeId";
	final static String PHOTOGRAPH_ID = "photofile";
	final static String CHECKLOGIN_ID = "chkLogin";
	final static String USERNAME_ID = "user_name";
	final static String USERPASSWORD_ID = "user_password";
	final static String CONFIRMPASSWORD_ID = "re_password";
	final static String STATUS_ID = "status";
	final static String SAVEBUTTON_ID = "btnSave";

	/* FindBy */
	@FindBy(how = How.ID, using = ADMIN_ID)
	public static WebElement admin;
	@FindBy(how = How.ID, using = PASSWORD_ID)
	public static WebElement pass;
	@FindBy(how = How.ID, using = LOGINBTN_ID)
	public static WebElement login;
	@FindBy(how = How.XPATH, using = PIM_XPATH)
	public static WebElement pimModule;
	@FindBy(how = How.ID, using = PIMADDEMPLOYEE_ID)
	public static WebElement addEmployee;
	@FindBy(how = How.ID, using = FIRSTNAME_ID)
	public static WebElement firstName;
	@FindBy(how = How.ID, using = MIDDLENAME_ID)
	public static WebElement middleName;
	@FindBy(how = How.ID, using = FAMILYNAME_ID)
	public static WebElement familyName;
	@FindBy(how = How.ID, using = EMPLOYEEID_ID)
	public static WebElement employeeId;
	@FindBy(how = How.ID, using = PHOTOGRAPH_ID)
	public static WebElement photograph;
	@FindBy(how = How.ID, using = CHECKLOGIN_ID)
	public static WebElement checkLogin;
	@FindBy(how = How.ID, using = USERNAME_ID)
	public static WebElement userName;
	@FindBy(how = How.ID, using = USERPASSWORD_ID)
	public static WebElement userPassword;
	@FindBy(how = How.ID, using = CONFIRMPASSWORD_ID)
	public static WebElement confirmPassword;
	@FindBy(how = How.ID, using = STATUS_ID)
	public static WebElement status;
	@FindBy(how = How.ID, using = SAVEBUTTON_ID)
	public static WebElement saveButton;

	/* Methods */
	public void pmiClick() {
		pimModule.click();
	}

	public void addEmployeeClick() {
		addEmployee.click();
	}

	public void loginClick() {
		login.click();
	}

	public void addPhotograh() {

	}

	public void checkLoginClick() {
		checkLogin.click();
	}

	public void saveButtonClick() {
		saveButton.click();
	}

}
