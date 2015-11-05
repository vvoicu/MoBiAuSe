package com.evo.sites.cms.pages.home;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;


/**
 * Login Elements
 * 
 */

public class LoginMainPage extends PageObject {

	@FindBy(id = "username")
	WebElementFacade cmsUsername;

	@FindBy(id = "password")
	WebElementFacade cmsPassword;

	@FindBy(id = "btn-login")
	WebElementFacade login;

	public void insertCMS_username(String username) {
		element(cmsUsername).waitUntilVisible();
		cmsUsername.sendKeys(username);
	}

	public void insertCMS_password(String password) {
		element(cmsPassword).waitUntilVisible();
		cmsPassword.sendKeys(password);
	}

	public void clickOnCMS_LoginButton() {
		login.click();
	}

}