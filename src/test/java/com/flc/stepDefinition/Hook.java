package com.flc.stepDefinition;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.flc.utils.DriverFactory;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hook {
	private WebDriver driver;

	@Before
	public void setUp() {
		driver = DriverFactory.getDriver();
	}

	@After
	public void tearDown(Scenario scenario) {
		if (scenario.isFailed()) {
			// Take screenshot if the scenario fails
			if (driver instanceof TakesScreenshot) {
				final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
				scenario.attach(screenshot, "image/png", "Screenshot");
				DriverFactory.closeDriver();
			}
		} else {
			DriverFactory.closeDriver();
		}
	}

	public WebDriver getDriver() {
		return driver;
	}
}
