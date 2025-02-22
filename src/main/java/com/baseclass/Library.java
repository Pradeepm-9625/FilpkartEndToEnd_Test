package com.baseclass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Library {
    public static Properties prop;
    public static WebDriver driver;

    @SuppressWarnings("deprecation")
	public void launchingApplications() throws IOException {
        FileInputStream input = new FileInputStream("C:\\Users\\Lenovo\\git\\FilpkartEndToEnd_Test\\src\\test\\resources\\Properties\\config.Properties");
        prop = new Properties();
        prop.load(input);

        try {
            String browser = prop.getProperty("browser").toLowerCase();
            
            switch (browser) {
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;
                default:
                    throw new IllegalArgumentException("Invalid browser specified in config file: " + browser);
            }

            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            driver.get(prop.getProperty("url"));

        } catch (Exception e) {
            System.out.println("Browser didn't launch due to: " + e.getMessage());
            e.printStackTrace();  // Prints full error details
        }
    }

    public void teardown() {
        if (driver != null) {
            try {
                Thread.sleep(2000);  // Wait for 2 seconds before quitting
                driver.quit();
                System.out.println("Browser closed successfully.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Driver is null, nothing to close.");
        }
    }
}
