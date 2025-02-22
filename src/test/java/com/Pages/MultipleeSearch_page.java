package com.Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ReusableFunctions.SeleniumReusable;
import com.baseclass.Library;

public class MultipleeSearch_page extends Library {
	SeleniumReusable se;
	
	public MultipleeSearch_page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@name='q']")
	WebElement Searchfield;
	
	public void EnterSearch(String searchtext) {
		se = new SeleniumReusable(driver);
		se.EnterValue(Searchfield, searchtext);
	}
	public void clicksearch() {
		
		try {
			Searchfield.sendKeys(Keys.ENTER);

		}catch(Exception e) {
			System.out.println("Value does not entered");
		}
	}
}
