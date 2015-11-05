package com.evo.sites.cms.glue;

import net.thucydides.core.annotations.Steps;

import com.evo.sites.cms.steps.MyDashboardSteps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class MyDashboardDefinitionSteps {

	@Steps
	MyDashboardSteps myDashboardSteps;


	@Then("^I see my full name \"(.*?)\" displayed on central banner of My User Dashboard page$")
	public void i_see_my_full_name_displayed_on_central_banner_of_My_User_Dashboard_page(String fullName) throws InterruptedException {
		myDashboardSteps.verifyUsernameOnMyDashBoardPage(fullName);
	}
	
	@Given("^I click on Advanced Search link from top of the page$")
	public void i_click_on_advanced_search_link_from_top_of_the_page(){
		myDashboardSteps.clickOnAdvancedSearchLink();
	}

}