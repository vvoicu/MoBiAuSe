package com.evo.sites.cms.steps;


import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import com.evo.sites.cms.pages.home.MyDashboardMainPage;

public class MyDashboardSteps extends ScenarioSteps {

	private static final long serialVersionUID = 6548508716353863624L;
	
	MyDashboardMainPage myDashboardMainPage;
	
	@Step
	public void verifyUsernameOnMyDashBoardPage(String fullName){
		myDashboardMainPage.verifyUsernameOnMyDashBoardPage(fullName);
	}
	
	@Step
	public void clickOnAdvancedSearchLink(){
		myDashboardMainPage.clickOnAdvancedSearchLink();
	}
	
	
}
