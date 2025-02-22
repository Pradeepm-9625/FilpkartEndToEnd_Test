package com.TestRunner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(
	    features = "src/test/resources/Features", // Corrected feature path
	    glue = {"com.StepDefinitions", "com.Hooks"},
	    plugin = {"pretty", "html:target/cucumber-reports.html"},
	    tags = "@tc003"
	)

	public class Runner extends AbstractTestNGCucumberTests {
	}
