package com.Hooks;

import java.io.IOException;

import com.ReusableFunctions.SeleniumReusable;
import com.baseclass.Library;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;

public class Hooks extends Library{
	public static Scenario scenario;
	SeleniumReusable se;
	
	@BeforeAll
    public void setup(Scenario scenario) throws IOException {
		
		Hooks.scenario = scenario;
        System.out.println("Launching the application for scenario: " + scenario.getName());
        
        if(driver == null) {
        	launchingApplications(); 
        }
         // Call WebDriver setup before each scenario
    }

	@AfterAll
    public void tearDown(Scenario scenario) {
        if (driver != null) {
            driver.quit();  // Close the browser after each scenario
        }
        System.out.println("Closed the browser for scenario: " + scenario.getName());
    }
	
}
