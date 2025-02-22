package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ReusableFunctions.SeleniumReusable;
import com.baseclass.Library;

public class Filter_pages extends Library {
	SeleniumReusable se;
	public Filter_pages(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}	
	
	@FindBy(xpath="//*[@id='container']/div/div[3]/div[1]/div[1]/div/div[1]/div/section[2]/div[4]/div[1]/select")
	WebElement minimumAmount;
	
	@FindBy(xpath="//*[@id='container']/div/div[3]/div[1]/div[1]/div/div[1]/div/section[2]/div[4]/div[3]/select")
	WebElement MaxmimumAmount;
	
	@FindBy(xpath= "//div[text()='SAMSUNG']/preceding-sibling::div")
	WebElement Brand;
	
	@FindBy(xpath= "//div[text()='3 GB']/preceding-sibling::div")
	WebElement Ram;
	
	@FindBy(xpath= "//*[@id='container']/div/div[3]/div[1]/div[1]/div/div[1]/div/section[9]/div[1]/div")
	WebElement BatteryArrow;
	
	@FindBy(xpath= "//div[text()='4000 - 4999 mAh']/preceding-sibling::div")
	WebElement BatteryCapacity;
	
	
	
	public void Min() {
		
		se = new SeleniumReusable(driver);
		se.Dropdown(minimumAmount, "10000");
	}
	
public void Max() {
				se.Dropdown(MaxmimumAmount, "20000");	
	}

public void Brand() {
	se.click(Brand);
}

public void Ram() {
	se.page_Scrolldown(Ram);
	se.click(Ram);
}
public void Battery() throws InterruptedException {
	se.page_Scrolldown(BatteryArrow);
	se.click(BatteryArrow);
	se.click(BatteryCapacity);
}
	
}
