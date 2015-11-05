package com.evo.sites.cms.pages.home;

import java.util.concurrent.TimeUnit;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import org.junit.Assert;
import org.openqa.selenium.support.FindBy;

public class MyDashboardMainPage extends PageObject{


	/**
	 * User menu page elements
	 */
	
	@FindBy(id = "global_x002e_header_x0023_default-user_user-button")
	WebElementFacade fullnameText;

	@FindBy(css = "#global_x002e_header_x0023_default-usermenu_user")
	WebElementFacade userAccountDropdown;

	@FindBy(css = "#yui-gen12")
	WebElementFacade myProfile;

	@FindBy(css = "#yui-gen13")
	WebElementFacade help;

	@FindBy(css = "#yui-gen14")
	WebElementFacade logout;

	/**
	 * Main page header elements
	 *
	 */

	@FindBy(css = "#global_x002e_header_x0023_default-app_my-dashboard-button")
	WebElementFacade myDashboard;

	@FindBy(css = "#global_x002e_header_x0023_default-app_sites-button")
	WebElementFacade sitesDropdown;

	@FindBy(css = "#yui-gen34 > a")
	WebElementFacade sitesSearchForSites;

	@FindBy(css = "#yui-gen33 > a")
	WebElementFacade sitesCreateASite;

	@FindBy(css = "#global_x002e_header_x0023_default-app_people-button")
	WebElementFacade peoples;

	@FindBy(css = "#global_x002e_header_x0023_default-app_repository-button")
	WebElementFacade repository;

	@FindBy(css = "#global_x002e_header_x0023_default-app_more-button")
	WebElementFacade moreOptions;

	/**
	 * My ... menu
	 */

	@FindBy (css = "#yui-gen7 > a")
	WebElementFacade moreMyTasks;

	@FindBy (css = "#yui-gen8 > a")
	WebElementFacade moreWorkflowsIveStarted;

	@FindBy (css = "#yui-gen9 > a")
	WebElementFacade moreMyContent;

	@FindBy (css = "#yui-gen10 > a")
	WebElementFacade moreMySites;

	@FindBy (css = "#yui-gen11 > a")
	WebElementFacade moreMyProfile;

	/**
	 * Admin Tools
	 */

	@FindBy (css = "#yui-gen0 > a")
	WebElementFacade application;

	@FindBy (css = "#yui-gen1 > a")
	WebElementFacade groups;

	@FindBy (css = "#yui-gen2 > a")
	WebElementFacade replicationJobs;

	@FindBy (css = "#yui-gen3 > a")
	WebElementFacade moreAdminRepository;

	@FindBy (css = "#yui-gen4 > a")
	WebElementFacade trashcan;

	@FindBy (css = "#yui-gen5 > a")
	WebElementFacade users;

	@FindBy (css = "#yui-gen6 > a")
	WebElementFacade moreDetailsMenu;

	/**
	 * Search elements
	 */

	@FindBy (css = "#global_x002e_header_x0023_default > div.header > div > a")
	WebElementFacade advancedSearch;

	@FindBy (css = "#global_x002e_header_x0023_default-searchText")
	WebElementFacade keywordSearch;

	/**
	 *  Customize dashboard
	 */

	@FindBy (linkText = "Customize Dashboard")
	WebElementFacade customizeDashboard;
	
	
	public void verifyUsernameOnMyDashBoardPage(String fullName){
		element(fullnameText).withTimeoutOf(15, TimeUnit.SECONDS).waitUntilPresent();
		Assert.assertTrue(element(fullnameText).containsText(fullName));
	}

	public void clickOnAdvancedSearchLink(){
		advancedSearch.withTimeoutOf(10, TimeUnit.SECONDS).waitUntilClickable().click();
	}
}
