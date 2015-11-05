package com.evo.sites.cms.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import com.evo.sites.cms.pages.home.LoginMainPage;



public class LoginSteps extends ScenarioSteps{

	private static final long serialVersionUID = 3191168095520965788L;
	
	LoginMainPage loginMainPage;
	
	@Step
	public void insertCMS_username(String username) {
		loginMainPage.insertCMS_username(username);
	}
	
	@Step
	public void insertCMS_password(String password) {
		loginMainPage.insertCMS_password(password);
	}
	
	@Step
	public void clickOnCMS_LoginButton() {
		loginMainPage.clickOnCMS_LoginButton();
	}

}
