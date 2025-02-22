package com.StepDefinitions;

import com.Pages.MultipleeSearch_page;
import com.ReusableFunctions.SeleniumReusable;
import com.baseclass.Library;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MultipleSearches_StepDefenitions extends Library {
	MultipleeSearch_page mp;
	SeleniumReusable se;
	
	@Given("User enters {string} in the search field")
	public void user_enters_in_the_search_field(String searchtext) {
		se = new SeleniumReusable(driver);
		System.out.println("Before search title");
		se.gettitle();
		mp = new MultipleeSearch_page(driver);
		mp.EnterSearch(searchtext);
		
	}

	@When("clicking on the search button")
	public void clicking_on_the_search_button() {
	    mp.clicksearch();
	}

	@Then("It should navigate the next page and display the corresponding pages")
	public void it_should_navigate_the_next_page_and_display_the_corresponding_pages() {
	   se.gettitle();
	   System.out.println("*******************************************");
	   se.screenshot("src/test/resources/Screenshots/search.png");
	}

	
}
