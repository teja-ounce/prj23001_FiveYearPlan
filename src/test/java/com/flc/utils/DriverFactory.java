package com.flc.utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
	private static WebDriver driver;
	private static String path = "C:\\Users\\Teja-OUNCE\\OneDrive - proounce.com\\Documents\\GitHub\\prj231001CucumberBDD\\src\\test\\resources\\files\\msedgedriver.exe";

	@SuppressWarnings("deprecation")
	public static WebDriver getDriver() {
		if (driver == null) {

//			System.setProperty("webdriver.edge.driver", path);
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();

			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			EdgeOptions options = new EdgeOptions();
	        options.addArguments("--headless"); // Run in headless mode
	        options.addArguments("--disable-gpu"); // Disable GPU (often used with headless)
	        options.addArguments("--no-sandbox"); 
		}
		return driver;
	}

	public static void quitDriver() {
		if (driver != null) {
			driver.quit();
		}
	}

}
