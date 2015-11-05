package com.evo.tests.wiki.junit;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.evo.sites.wiki.steps.EndUserSteps;

@RunWith(SerenityRunner.class)
public class SearchByKeywordStory {

	@Managed
//	@Managed(uniqueSession = true)
	public WebDriver webdriver;

//	@ManagedPages(defaultUrl = "http://en.wiktionary.org/wiki/Wiktionary")
//	public Pages pages;

	@Steps
	public EndUserSteps endUser;
	
	
//	@Before
//	public void setUp() throws MalformedURLException{
//		DesiredCapabilities capabilities = new DesiredCapabilities();
//		capabilities.setCapability("platformName", "Android");
////	    capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "EmuNexus");
//	    capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "GT-I9300");
//	    capabilities.setCapability(MobileCapabilityType.APPIUM_VERSION, "1.4.13");
//
//	    capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "Browser");
////		webdriver =new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), AndroidDriver.getDesiredCapabilities("192.21.168.56:5555"));
//		webdriver =new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
////		webdriver =new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), getDesiredCapabilities("192.21.168.56:5555"));
//	}

//	@Issue("#WIKI-1")
	@Test
	public void searching_by_keyword_apple_should_display_the_corresponding_article() {
		endUser.is_the_home_page();
		endUser.looks_for("apple");
		endUser.should_see_definition("A common, round fruit produced by the tree Malus domestica, cultivated in temperate climates.");
	}

}