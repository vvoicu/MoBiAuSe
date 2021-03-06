package com.evo.tests.cms.cucumber;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(glue= {"com.evo.sites.cms.glue"} , features="src/test/resources/features/cms/login/Login.feature")
//@CucumberOptions(glue= {"com.evo.sites.cms.glue"} , features="src/test/resources/features/cms/")
//@CucumberOptions(dryRun = true, glue= {"com.evo.sites.wiki.glue"} , features="src/test/resources/features/wiki/consult_dictionary/")
//@CucumberOptions(glue= {"com.evo.sites.wiki.glue"} , features="src/test/resources/features/wiki/consult_dictionary/LookupADefinition.feature")
public class CMSDefinitionsTest {}
