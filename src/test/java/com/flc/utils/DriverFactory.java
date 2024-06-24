package com.flc.utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DriverFactory {
	private static WebDriver driver;
	private static String path = "C:\\Users\\Teja-OUNCE\\OneDrive - proounce.com\\Documents\\GitHub\\prj231001CucumberBDD\\src\\test\\resources\\files\\msedgedriver.exe";

	@SuppressWarnings("deprecation")
	public static WebDriver getDriver() {
		if (driver == null) {

			System.setProperty("webdriver.edge.driver", path);
			driver = new EdgeDriver();

//			WebDriverManager.chromedriver().setup();

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
