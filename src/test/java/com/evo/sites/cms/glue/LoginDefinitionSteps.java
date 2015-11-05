package com.evo.sites.cms.glue;

import net.thucydides.core.annotations.Steps;

import com.evo.sites.cms.steps.LoginSteps;
import com.evo.tools.Constants;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;


public class LoginDefinitionSteps {

	@Steps
	LoginSteps loginSteps;
	
	
	@Given("^I am on CMS login page$")
	public void navigateToCMSLoginPage()throws InterruptedException{
		loginSteps.getDriver().get(Constants.CMS_HOST);
	}
	
	@When("^I insert my username \"(.*?)\"$")
	public void insertCMS_username(String username)throws InterruptedException{
		loginSteps.insertCMS_username(username);
	}
	
	@And("^I type my password \"(.*?)\"$")
	public void insertCMS_password(String password)throws InterruptedException{
		loginSteps.insertCMS_password(password);
	}
	
	@And("^I click on login button$")
	public void clickOnCMS_LoginButton()throws InterruptedException{
		loginSteps.clickOnCMS_LoginButton();

	}
	
}
