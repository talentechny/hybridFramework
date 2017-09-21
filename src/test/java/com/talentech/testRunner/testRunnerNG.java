package com.talentech.testRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features = {"features/newTours/registerPage.feature"},
		glue = {"com.talentech.stepdefs"}
		)
public class testRunnerNG extends AbstractTestNGCucumberTests{

}
