package com.ui.firstcry.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.app.base.UITestBase;
import com.sun.tools.javac.util.List;

public class PlayschoolPage extends UITestBase{

	
	
	@FindBy(css="li[id='menu-item-1607']")
	private WebElement centers;

	@FindBy(css="a[title='Bangalore']")
	private WebElement bengalore;
	
	@FindBy(xpath="//div[@id='sidebar-nav']/ul")
	List<WebElement> listAecsLaypouts;
	
	public List<WebElement> getListAecsLaypouts() {
		
		return listAecsLaypouts;
	}

	



	
	
	public PlayschoolPage() {
		
		PageFactory.initElements(driver, PlayschoolPage.class);
	}
	
	public WebElement getBengalore() {
		bengalore.click();
		return bengalore;
	}

	

	
	public WebElement getCenters() {
		
		centers.click();
		return centers;
	}

	
	
}
