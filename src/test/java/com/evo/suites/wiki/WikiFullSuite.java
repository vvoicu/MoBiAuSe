package com.evo.suites.wiki;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.evo.tests.wiki.cucumber.WikiDefinitionsTest;
import com.evo.tests.wiki.junit.DefinitionTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({ DefinitionTest.class, WikiDefinitionsTest.class })
public class WikiFullSuite {

}
