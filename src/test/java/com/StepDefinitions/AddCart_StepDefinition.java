package com.StepDefinitions;

import org.openqa.selenium.WebDriver;

import com.Pages.UptoAddcart;
import com.ReusableFunctions.SeleniumReusable;
import com.baseclass.Library;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddCart_StepDefinition extends Library {
	UptoAddcart ad;
	SeleniumReusable se;
	
	@Given("User can move to the login")
	public void user_can_move_to_the_login() {
		se = new SeleniumReusable(driver);
System.out.println("Parrent window");
se.gettitle();
		ad=new UptoAddcart(driver);
		ad.MoveLogin();
	}

	@When("User can click the filpkart plus zone")
	public void user_can_click_the_filpkart_plus_zone() {
	  ad.MovingFlipkartplus();
	}

	@When("Mouse move to the Home&Furniture link")
	public void mouse_move_to_the_home_furniture_link() {
	  ad.MovingHomeAndAppliance();
	}

	@When("Going to click the wall lamp")
	public void going_to_click_the_wall_lamp() {
	  ad.clickLamp();
	}

	@When("Scroll down the page and click on the particullar result")
	public void scroll_down_the_page_and_click_on_the_particullar_result() {
		ad.SelectOneLamp();

	}

	@When("Enter the deveviry pincode and click on the check link")
	public void enter_the_deveviry_pincode_and_click_on_the_check_link() {
	   ad.EnterPincode("641045");
	}

	@Then("Pincode should be checked and displayed and verify the titles")
	public void pincode_should_be_checked_and_displayed_and_verify_the_titles() {
	    ad.Checkpincode();
	    System.out.println("ChildWindow title");
	    se.gettitle();
	    se.screenshot("/src/test/resources/Screenshots/uploadcart.png");
	}

	
	
}
