package com.ui.firstcry.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.app.base.UITestBase;

public class PlayschoolsCentresPage extends UITestBase{
	
	@FindBy(xpath="//*[contains(text(),'Bangalore']")
	private WebElement centreBangalore;
	
	public PlayschoolsCentresPage() {

		PageFactory.initElements(driver, PlayschoolsCentresPage.class);

	}

	public WebElement getCentreBangalore() {
		centreBangalore.click();
		return centreBangalore;
	}

	
	
	
}
