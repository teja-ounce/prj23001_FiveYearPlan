package com.flc.stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.flc.pageObject.DashboardObject;
import com.flc.utils.DriverFactory;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DashboardSteps {

	private WebDriver driver = DriverFactory.getDriver();
	private DashboardObject dashboardObject = new DashboardObject(driver);

	@When("User clicks on five year plan button")
	public void User_clicks_on_five_year_plan_button() throws InterruptedException {
		dashboardObject.clickFiveYearPlan();
	}

	@And("User click on consolidated statement button")
	public void user_click_on_consolidated_statement_button() throws Exception {

		dashboardObject.clickConsolidateStatement();

	}

	@Then("User navigate to consolidate statement")
	public void user_navigate_to_consolidate_statement() throws Exception {

		dashboardObject.openConsolidateStatement();

	}

	@And("User validate consolidated statement")
	public void user_validate_consolidated_statement() throws Exception {
		dashboardObject.validate();
	}

	@When("User click on allocation plan button")
	public void user_click_on_allocation_plan_button() throws InterruptedException {
		dashboardObject.clickAllocationPlan();
		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		Thread.sleep(1000);
		dashboardObject.inap = driver.findElement(By.xpath(
				"//*[@id='single-spa-application:@flc/fiveyearplan-app']/div/div[2]/div/div[3]/div/div[3]/div/div/div/div/div/div[2]/div/table/thead[2]/tr[1]/th[1]"))
				.getText();
	}

	@Then("user navigate to allocation plan")
	public void user_navigate_to_allocation_plan() {
		System.out.println("User is on allocation plan");
	}

	@And("User validate allocation plan")
	public void user_validate_allocation_plan() throws InterruptedException {
		if (dashboardObject.inap.contains(dashboardObject.outname)) {
			System.out.println("Matched, Allocation plan opened");
			driver.navigate().back();
			Thread.sleep(3000);
		}
	}

	 @Then("Select logout from five year plan app options")
	 public void  Select_logout_from_five_year_plan_app_options() throws InterruptedException {
		 dashboardObject.clickProfileButton();
	 }
	 
	@Then("User must logout")
	public void user_should_logout() throws InterruptedException {
		dashboardObject.logout();

	}

}
