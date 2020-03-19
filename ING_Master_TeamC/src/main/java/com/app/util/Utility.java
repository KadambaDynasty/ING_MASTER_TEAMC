package com.app.util;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.app.base.UITestBase;

public class Utility extends UITestBase {
	
	public static void wait(WebElement element, String type) {

		WebDriverWait wait = new WebDriverWait(driver, 40);
		switch (type) {
		case "allEles":
			wait.until(ExpectedConditions.visibilityOfAllElements(element));
			break;

		case "visible":
			wait.until(ExpectedConditions.visibilityOf((element)));
			break;
		case "clickable":
			wait.until(ExpectedConditions.elementToBeClickable(element));
			break;

		default:
			break;
		}

	}

	
	
}
