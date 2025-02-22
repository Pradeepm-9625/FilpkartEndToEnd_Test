package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ReusableFunctions.SeleniumReusable;
import com.baseclass.Library;

public class UptoAddcart extends Library {
	SeleniumReusable se;
	
	public UptoAddcart(WebDriver driver) {
this.driver=driver;
PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(linkText="Login")
	WebElement login;
	
	@FindBy(xpath="//li[text()='Flipkart Plus Zone']")
	WebElement FlipkartPlusZone;
	
	@FindBy(xpath="//span[text()='Home & Furniture']")
	WebElement MoveHomeAndFurniture;
	
	@FindBy(xpath="//a[text()='Wall Lamp']")
	WebElement ClickWallLamp;
	
	@FindBy(xpath="//div[@data-id='WLMH494NZTKRRHVU']/div")
	WebElement ClickOneLamp;
	
	@FindBy(id="pincodeInputId")
	WebElement pincode;
	
	@FindBy(xpath="//span[text()='Check']")
	WebElement check;
	
	
	public void MoveLogin() {
		se = new SeleniumReusable(driver);
		se.MouseHover(login);
	}
	
	public void MovingFlipkartplus() {
se.MovetoElement(FlipkartPlusZone);
	}
	
	public void MovingHomeAndAppliance() {
se.MovetoElement(MoveHomeAndFurniture);
	}
	public void clickLamp() {
		
se.MovetoElement(ClickWallLamp);
	}
	public void SelectOneLamp() {

		se.page_Scrolldown(ClickOneLamp);

	}
	
	public void EnterPincode(String Num) {
		se.Windowshanding(ClickOneLamp);
se.EnterValue(pincode, Num);
	}
	
	public void Checkpincode() {
se.click(check);
	}
	
}
