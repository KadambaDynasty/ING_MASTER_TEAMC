package com.ui.stepdefinations;

import com.app.base.UITestBase;
import com.ui.firstcry.pages.FCHomePage;
import com.ui.firstcry.pages.PlayschoolsCentresPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ValidateNavigateAllCategories extends UITestBase {

	FCHomePage homePage;
	PlayschoolsCentresPage centerPage;

	public ValidateNavigateAllCategories() {
		super();
	}

	@Given("Luncht the browser and hit the url")
	public void luncht_the_browser_and_hit_the_url() {
		initialization();
		homePage = new FCHomePage();

	}

	@When("Navigate to All Categories Link")
	public void navigate_to_All_Categories_Link() throws InterruptedException {
		
		

		homePage.getAllCategories();

	}

	@When("Hover on Stores and playschools")
	public void hoverOnStoresAndPlayschools() {

		homePage.getStoresAndSchools();
	}

	@When("Hover to Playschools tab")
	public void hoverToPlayschoolsTab() {

		homePage.getPlaySchools();
	}

	@When("click on location pin Bengaluru")
	public void clickOnLocationPinBengaluru() {
		
		homePage.getPinBengaluru();

	}

	@When("click the city Bengaluru")
	public void clickTheCityBengaluru() {
		
		centerPage.getCentreBangalore();
	}

	@When("click on the centers and select Bangalore")
	public void clickOnTheCentersAndSelectBangalore() {
	    
	}
	
	@Then("Validate the Navigation from All Categories link")
	public void validate_the_Navigation_from_All_Categories_link() {

	}

}
