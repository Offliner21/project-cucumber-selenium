package com.orangeHRM.e2eTests.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CommonMethods {

	public static WebDriver driver;
	public static Properties prop;

	public CommonMethods() {
		driver = Setup.driver;
	}

	protected static final Logger logger = LoggerFactory.getLogger(AbstractPage.class);

	public void scrollerBottom() {

		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,400)", "");
	}

	public void openApplicationWithConfigFile(String url) throws IOException {
		prop = new Properties();
		FileInputStream fis = new FileInputStream("src/test/resources/configs/config.properties");
		prop.load(fis);
		driver.get(prop.getProperty(url));
	}

	public void selectDropDownListByVisibleText(WebElement element, String text) {
		Select dropDownList = new Select(element);
		dropDownList.selectByVisibleText(text);
	}

	public void selectDropDownListByVisibleIndex(WebElement element, int index) {
		Select dropDownIndex = new Select(element);
		dropDownIndex.selectByIndex(index);
	}

	public void selectDropDownListByValue(WebElement element, String text) {
		Select dropDownValue = new Select(element);
		dropDownValue.selectByVisibleText(text);
	}

	public void dragAndDrop(WebElement element1, WebElement element2) {
		Actions actions = new Actions(driver);
		WebElement from = element1;
		WebElement to = element2;
		actions.dragAndDrop(from, to).perform();
	}

}
