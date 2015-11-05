package com.evo.tools;

import net.serenitybdd.core.pages.PageObject;

public class AbstractPage extends PageObject{

	
	public void elementFocus(String element) {
		evaluateJavascript("var element =jQuery(' " + element + " ');element.focus();");
	}

	public void elementjQueryMouseOver(String element) {
		evaluateJavascript("var dd =jQuery(' " + element + " ').eq(1);dd.mouseover(); ");
	}
	
	public void elementjQueryClick(String element) {

		evaluateJavascript("var dd =jQuery(' " + element + " ').eq(0);dd.click(); ");
	}
	
	public void scrollPageBottom(){
		waitABit(2000);
		evaluateJavascript("window.scrollTo(0, document.body.scrollHeight);");
		waitABit(2000);
	}
}
