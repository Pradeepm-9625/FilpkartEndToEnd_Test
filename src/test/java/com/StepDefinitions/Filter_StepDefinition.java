package com.StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Pages.Filter_pages;
import com.ReusableFunctions.SeleniumReusable;
import com.baseclass.Library;

import io.cucumber.java.en.Then;

public class Filter_StepDefinition extends Library{
	Filter_pages fp;
	SeleniumReusable se;
	@Then("Select min and Max amout")
	public void select_min_and_max_amout() throws InterruptedException {
		fp = new Filter_pages(driver);
		String beforefilter=driver.findElement(By.xpath("//*[@id='container']/div/div[3]/div[1]/div[2]/div[2]/div/div/div/a/div[2]/div[1]")).getText();
		System.out.println("Before Filter="+ beforefilter);
		fp.Min();
		se = new SeleniumReusable(driver);
		se.Wait();
		fp.Max();
		se.Wait(); 
	}

	@Then("Select the Brand")
	public void select_the_brand() throws InterruptedException {
	    fp.Brand();
	    se.Wait();
	}

	@Then("Select the Ram")
	public void select_the_ram() throws InterruptedException {
	  fp.Ram();
	  se.Wait();
	}

	@Then("Select the Battery capacity")
	public void select_the_battery_capacity() throws InterruptedException {
	    fp.Battery();
	    se.Wait();
	}

	@Then("It should display the relevent result")
	public void it_should_display_the_relevent_result() {
		System.out.println("********************************************************************");
		String Afterfilter=driver.findElement(By.xpath("//*[@id='container']/div/div[3]/div[1]/div[2]/div[2]/div/div/div/a/div[2]/div[1]")).getText();
		System.out.println("After Filter="+ Afterfilter);
	}

}
