package com.TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	    features = "src/test/resources/Features",
	    		glue = {"com.StepDefinitions"}, // Adjust according to your package structure
	    	    plugin = {"com.aventstack.extentreports.cucumber7.adapter.ExtentCucumberAdapter:"})
public class Runner {

}
