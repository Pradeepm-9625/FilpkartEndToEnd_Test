package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ReusableFunctions.SeleniumReusable;
import com.baseclass.Library;

public class Fashion_page extends Library {

	SeleniumReusable se;
	public Fashion_page(WebDriver driver) {
this.driver = driver;
PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath = "//span[text()='Fashion']")
	WebElement fashionlink;
	
	@FindBy(xpath="//a[text()='Kids']")
	WebElement kidslink;
	
	@FindBy(xpath="//a[text()='Girls Dresses']")
	WebElement Girlsdress;
	
	@FindBy(xpath="//div[text()='Price -- Low to High']")
	WebElement PriceLowToHigh;
	
	public void movefashionLink() {
		se = new SeleniumReusable(driver);
		se.MouseHover(fashionlink);
		
	}
	
	public void MoveToKidsLink() {
se.MouseHover(kidslink);
	}
	
	public void ClickGirlsLink() {
se.MovetoElement(Girlsdress);
	}
	public void clickPrice() {
se.click(PriceLowToHigh);
	}
	
	
}
