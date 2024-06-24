package com.flc.utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
	private static WebDriver driver;
	private static String path = "C:\\Users\\Teja-OUNCE\\git\\repository\\prj231001CucumberBDD\\src\\test\\resources\\files\\msedgedriver.exe";

	@SuppressWarnings("deprecation")
	public static WebDriver getDriver() {
		if (driver == null) {

//			System.setProperty("webdriver.edge.driver",System.getenv(path));
//			WebDriver driver = new EdgeDriver();
			WebDriverManager.edgedriver().setup();
			EdgeOptions options = new EdgeOptions();
			driver = new EdgeDriver(options);
			
			options.addArguments("--headless"); // Enable headless mode
			options.addArguments("--disable-gpu");
			options.setCapability("ms:edgeOptions", options);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
		}
		return driver;
	}

	public static void quitDriver() {
		if (driver != null) {
			driver.quit();
		}
	}

}
