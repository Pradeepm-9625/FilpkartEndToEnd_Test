package com.StepDefinitions;

import org.openqa.selenium.WebDriver;

import com.Pages.Fashion_page;
import com.ReusableFunctions.SeleniumReusable;
import com.baseclass.Library;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Fashion_StepDefinitions extends Library{
	Fashion_page fp;
	SeleniumReusable se;
	
	
	@Given("User to move the fashion link")
	public void user_to_move_the_fashion_link() {
		
		se = new SeleniumReusable(driver);
		System.out.println("Before clicking fashion link");
		se.gettitle();
		fp = new Fashion_page(driver);
		fp.movefashionLink();
	}

	private SeleniumReusable SeleniumReusable(WebDriver driver) {
		// TODO Auto-generated method stub
		return null;
	}

	@When("the cursor move to the kids link")
	public void the_cursor_move_to_the_kids_link() {
	   fp.MoveToKidsLink();
	}

	@When("Move to girls dress and click")
	public void move_to_girls_dress_and_click() {
	  fp.ClickGirlsLink();
	}

	@When("Click the price to low link")
	public void click_the_price_to_low_link() {
	   fp.clickPrice();
	}

	@Then("It should display the relevent results and get the titel")
	public void it_should_display_the_relevent_results_and_get_the_titel() {
	   System.out.println("After clicking fashion link");
	   se.gettitle();
	}

	
}
