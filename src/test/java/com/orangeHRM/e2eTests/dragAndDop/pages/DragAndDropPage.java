package com.orangeHRM.e2eTests.dragAndDop.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DragAndDropPage {
	
	/*Locators*/
	final static String FROM_ID = "draggable";
	final static String TO_ID = "droppable";
	
    /*Findby*/
	@FindBy(how = How.ID, using = FROM_ID)
	public static WebElement drag;
	@FindBy(how = How.ID, using = TO_ID)
	public static WebElement drop;
		
}
