package com.orangeHRM.e2eTests.GloablAppForm.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class GlobalAppFormPage {
	
	/*Locators*/
	final static String MULTCHOICE_ID = "i5";
    final static String CHECKBOX_ID = "i22";
    final static String MENUSELECT_XPATH = "//body/div[1]/div[2]/form[1]/div[2]/div[1]/div[2]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]";
    final static String DROPDOWN_XPATH = "//body/div[1]/div[2]/form[1]/div[2]/div[1]/div[2]/div[3]/div[1]/div[1]/div[2]/div[1]/div[2]/div[5]/span[1]";
    final static String TEXT_XPATH = "//body/div[1]/div[2]/form[1]/div[2]/div[1]/div[2]/div[4]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]";
    final static String CALENDAR_XPATH = "//body/div[1]/div[2]/form[1]/div[2]/div[1]/div[2]/div[5]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/input[1]";
    final static String SCALE_XPATH = "//body/div[1]/div[2]/form[1]/div[2]/div[1]/div[2]/div[6]/div[1]/div[1]/div[2]/div[1]/span[1]/div[1]/label[2]/div[2]/div[1]/div[1]/div[3]/div[1]";
    final static String SUBMITBTN_XPATH = "//body/div[1]/div[2]/form[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]";
    final static String RESPONSE_XPATH= "Submit another response";
    
    
    /*FindBY*/
    @FindBy(how = How.ID, using = MULTCHOICE_ID)
    public static WebElement multi;
    @FindBy(how = How.ID, using = CHECKBOX_ID)
    public static WebElement checkBox;
    @FindBy(how = How.XPATH, using = DROPDOWN_XPATH)
    public static WebElement drop;
    @FindBy(how = How.XPATH, using = MENUSELECT_XPATH)
    public static WebElement selectMenu;
    @FindBy(how = How.XPATH, using = TEXT_XPATH)
    public static WebElement text;
    @FindBy(how = How.XPATH, using = CALENDAR_XPATH)
    public static WebElement cal;
    @FindBy(how = How.XPATH, using = SCALE_XPATH)
    public static WebElement scale;
    @FindBy(how = How.XPATH, using = SUBMITBTN_XPATH)
    public static WebElement submitBtn;
    @FindBy(how = How.LINK_TEXT, using = RESPONSE_XPATH)
    public static WebElement resp;
    
    
    /*Methods*/
    
    public void optionClick() {	
    	multi.click();
    }
    
    public void checkboxClick() {
    	checkBox.click();
    }
    
    public void scaleClick () {
    	scale.click();
    }
    
    public void submitClick() { 	
    	submitBtn.click();
    }
    
    public void selectOption() {
    	selectMenu.click();
    	drop.click();
    	
    }
    
}
