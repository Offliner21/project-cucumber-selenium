package com.orangeHRM.e2eTests.alertDemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertDemoPage {

	WebDriver driver = new ChromeDriver();

	/* Locators */
	final static String ALERTBOUTOON_ID = "alertButton";

	/* FindBy */
	@FindBy(how = How.ID, using = ALERTBOUTOON_ID)
	public static WebElement alertButton;

	/* Methods */

	public void clickAlert() {
		alertButton.click();
	}

	public void acceptAlert() {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 2);
			wait.until(ExpectedConditions.alertIsPresent());
			driver.switchTo().alert().accept();

		} catch (Exception e) {
			// exception handling
		}
	}

	public void getTitle() {
		String title = driver.getTitle();
		System.out.println("The title of this page is: " + title);
	}
}
