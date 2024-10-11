package com.StepDefinitions;

import java.io.IOException;

import com.Pages.Searchpage;
import com.baseclass.Library;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SerachMobile_Testcase extends Library{
	Searchpage sp;
	@Given("Launch the Flipkart Application")
	public void launch_the_flipkart_application() throws IOException {
		lanchingApplications();
	}

	@When("Close the popup")
	public void close_the_popup() {
		System.out.println(driver.getTitle());
	}

	@Then("It should navigate to the Home page")
	public void it_should_navigate_to_the_home_page() {
		
		 sp= new Searchpage(driver);
		 sp.Homescreen();
	}

	@Given("User enters the text in the search field")
	public void user_enters_the_text_in_the_search_field() {
	 
		sp.Search("Mobile");
	}

	@When("User clicks the search button")
	public void user_clicks_the_search_button() {
		sp.Clicksearch();
	 
	}

	@Then("It should navigate to the search results page and display the relevant results")
	public void it_should_navigate_to_the_search_results_page_and_display_the_relevant_results() {
	  sp.Results();
	}
}
