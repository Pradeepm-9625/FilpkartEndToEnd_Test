package com.ReusableFunctions;

import java.io.File;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.ScreenshotException;
import org.openqa.selenium.support.ui.Select;
import com.baseclass.Library;

import io.cucumber.java.Scenario;


public class SeleniumReusable extends Library {
	Actions act;
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

public void multipleGetText(List<WebElement> elements) {
    System.out.println("Total elements: " + elements.size());
    System.out.println("***************************************************");
    
    elements.forEach(e -> {
        System.out.println(e.getText());
        System.out.println("***************************************************");
    });
}

public void Getvalue(WebElement element) {
	try {
		System.out.println(element.getText());

	}catch(Exception e){
		System.out.println("No element founded");
	}
}
public void Dropdown(WebElement element, String text) {
Select drp = new Select(element);
drp.selectByValue(text);
}

public void Scrolldown(WebElement element) {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].click()", element);
}

	public void page_Scrolldown(WebElement element) {
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center'});", element);
	}

public void Wait() throws InterruptedException {
	Thread.sleep(2000);
}

public void MouseHover(WebElement element) {
act = new Actions(driver);
act.moveToElement(element).build().perform();
}

public void MovetoElement(WebElement element) {
act.moveToElement(element).click().build().perform();
}
public void Screenshot(String path) {

	TakesScreenshot tc = (TakesScreenshot) driver;
	File scource = tc.getScreenshotAs(OutputType.FILE);
	try {
		FileUtils.copyFile(scource, new File(path));
	}catch(Exception e) {
		System.out.println("couldnt take screenshot");
	}
}

public void Windowshanding(WebElement element) {
String parrentwindow = driver.getWindowHandle();
element.click();
System.out.println(parrentwindow);

Set<String>allwindow=driver.getWindowHandles();
System.out.println(allwindow.size());
for(String childwindow:allwindow) {
	driver.switchTo().window(childwindow);
	System.out.println(childwindow);
}

}
public void AttachScreenshot(Scenario CucumberScenario) {
final  byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
CucumberScenario.attach(screenshot, "image/png", "FlipkartAutomation");
}

public void closeapp() {
driver.close();
System.out.println("Brower has been closed");
}
}
