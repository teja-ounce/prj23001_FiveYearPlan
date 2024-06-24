package com.flc.stepDefinition;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.flc.pageObject.LoginObject;
import com.flc.utils.DriverFactory;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	private WebDriver driver = DriverFactory.getDriver();
	private LoginObject loginObject = new LoginObject(driver);

	@Given("User launch URL")
	public void user_launch_url() {
		loginObject.openURL();
	}

	@When("User enters username and password")
	public void user_enters_username_and_password() {
		loginObject.enterUsername();
		loginObject.enterPassword();
	}

	@When("User clicks on login button")
	public void user_clicks_on_login_button() {
		loginObject.clickLoginButton();
	}

	@Then("Dashboard should display")
	public void dashboard_should_display() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(loginObject.fiveYearPlanButton));
	}

	@When("User clicks on profile picture")
	public void user_clicks_on_profile_picture() throws InterruptedException {
		loginObject.clickProfileButton();
		Thread.sleep(2000);

	}

	@And("Select logout from options")
	public void select_logout_from_options() throws InterruptedException {
		loginObject.clickLogout();
		Thread.sleep(2000);
	}

	@Then("User will logout")
	public void user_will_logout() {
		System.out.println("User get logout successfully	" + driver.getTitle());
	}

}