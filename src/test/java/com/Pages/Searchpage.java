package com.Pages;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ReusableFunctions.SeleniumReusable;
import com.baseclass.Library;

public class Searchpage extends Library{
	SeleniumReusable se;
public Searchpage(WebDriver driver) {
this.driver=driver;	
PageFactory.initElements(driver, this);
}

@FindBy(xpath="//input[@name='q']")
WebElement SearchText;

@FindBy(xpath="//html[@lang='en-IN']")
WebElement HoemPage;

@FindBy(xpath="//div[@class='nt6sNV JxFEK3 _48O0EI']")
WebElement searchresults;

@FindBy(xpath="//*[@id='container']/div/div[3]/div[1]/div[2]/div/div/div/div/a/div[2]/div[1]")
List<WebElement> entireresult;

@FindBy(xpath="//*[@id='container']/div/div[3]/div[1]/div[2]/div[4]/div/div/div/a/div[2]/div[1]")
List<WebElement> Thirdresult;

public void Search(String Text) {
	se =new SeleniumReusable(driver);
	se.EnterValue(SearchText, Text);

}

public void Homescreen() {
	System.out.println(HoemPage.isDisplayed());
}

public void Clicksearch() {
	SearchText.sendKeys(Keys.ENTER);
	
}

public void Results() {
	System.out.println(searchresults.isDisplayed());
	System.out.println(driver.getTitle());
}
public void printentireresult() {
	se.multipleGetText(entireresult);
}
public void Print3rdresult() {
	se.multipleGetText(Thirdresult);
}
}
