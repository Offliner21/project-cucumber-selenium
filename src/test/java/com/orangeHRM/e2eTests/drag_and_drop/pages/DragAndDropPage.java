package com.orangeHRM.e2eTests.drag_and_drop.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DragAndDropPage {

	/* Locators */
	final static String FROM_ID = "draggable";
	final static String TO_ID = "droppable";

	/* FindBy */
	@FindBy(how = How.ID, using = FROM_ID)
	public static WebElement from;
	@FindBy(how = How.ID, using = TO_ID)
	public static WebElement to;
	public static Actions act;

	/* Methods */
	public void dragAndDrop() {
		act.dragAndDrop(from, to).perform();
	}

	public void verifyPageChange(String textTo) {
		textTo = to.getText();
		if (textTo.equals("Dropped!")) {

			System.out.println("Pass: Source is dropped to target as expected");

		} else {

			System.out.println("Fail: Source couldn't be dropped to target as expected");
		}
	}
}
