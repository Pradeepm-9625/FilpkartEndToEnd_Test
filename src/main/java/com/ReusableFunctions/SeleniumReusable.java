package com.ReusableFunctions;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.baseclass.Library;

public class SeleniumReusable extends Library {
	public SeleniumReusable(WebDriver driver) {
    this.driver=driver;
	
	}
public void EnterValue(WebElement element, String Text) {
	
	try {
		element.sendKeys(Text);
	}catch(Exception e) {
		System.out.println("No such element Exception");
	}
	
}
public void click(WebElement element) {
	
	try {
		element.click();
	}catch (Exception e) {
		System.out.println("No such element Exception");
	}
}

public void gettitle() {
	try {
		System.out.println(driver.getTitle());
		
	}catch(Exception e) {
		System.out.println("Couldn't find the Title");
	}
}

public void screenshot(String path) {
	TakesScreenshot TS=(TakesScreenshot)driver;
	File source = TS.getScreenshotAs(OutputType.FILE);
	try {
		FileUtils.copyFile(source, new File(path));
	}catch (Exception e) {
		System.out.println("Screenshot not found");
	}
	
}
}
