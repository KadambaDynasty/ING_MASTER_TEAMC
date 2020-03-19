package com.ui.firstcry.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.app.base.UITestBase;
import com.app.util.Utility;

import net.bytebuddy.description.DeclaredByType;

public class FCHomePage extends UITestBase {

	@FindBy(css = "div[class='menu-container'] ul li[class='B14_42 allcat'] a")
	// @FindBy(xpath="//*[contains(text(),' All Categories']")

	private WebElement allCategories;

	// @FindBy(xpath = "//*[contains(text(),'STORES & PLAYSCHOOLS')]")
	// @FindBy(xpath="//div[@class='all-category-container']/ul/li[18]/a")
	@FindBy(xpath = "//div[@class='all-category-container']//*[contains(text(),'STORES & PLAYSCHOOLS')]")
	private WebElement storesAndSchools;

	@FindBy(xpath = "//a[@title='Playschools']")
	private WebElement playSchools;

	@FindBy(css = "map[name='indiaschoolmap'] area[alt='Bengaluru']")
	private WebElement pinBengaluru;

	@FindBy(id = "deny")
	WebElement denyBtn;

	public FCHomePage() {

		PageFactory.initElements(driver, this);

	}

	public WebElement getAllCategories() throws InterruptedException {

		String handle = driver.getWindowHandle();

		driver.switchTo().frame("webpush-onsite");

		Utility.wait(denyBtn, "visible");

		/*
		 * JavascriptExecutor js=(JavascriptExecutor)driver;
		 * js.executeScript("arguments[0].click();", denyBtn);
		 */

		denyBtn.click();

		// deny.click();

		driver.switchTo().window(handle);

		Thread.sleep(5000);

		Actions action = new Actions(driver);

		action.moveToElement(allCategories).perform();

		return allCategories;
	}

	public WebElement getStoresAndSchools() {
		// Utility.wait(storesAndSchools, "visible");
		// act.moveToElement(storesAndSchools).build().perform();
		Actions storeact = new Actions(driver);
		storeact.moveToElement(storesAndSchools).perform();
		return storesAndSchools;
	}

	public WebElement getPlaySchools() {
		// Utility.wait(playSchools, "visible");
		// act.moveToElement(playSchools).build().perform();
		Actions playSch = new Actions(driver);
		playSch.moveToElement(playSchools).perform();
		return playSchools;
	}

	public WebElement getPinBengaluru() {
		// Utility.wait(pinBengaluru, "clickable");
		pinBengaluru.click();
		return pinBengaluru;
	}

}
