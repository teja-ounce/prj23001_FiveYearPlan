package com.flc.stepDefinition;

import org.openqa.selenium.WebDriver;

import com.flc.pageObject.IBAPSExtractObject;
import com.flc.utils.DriverFactory;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class IBAPSExtractSteps {

	private WebDriver driver = DriverFactory.getDriver();
	private IBAPSExtractObject ibapsExtract = new IBAPSExtractObject(driver);

	@When("User click on IBAPS Extract")
	public void user_click_on_ibaps_extract() throws InterruptedException {
		ibapsExtract.clickIBAPSExtractTab();
	}

	@Then("IBAPS Extract page will display")
	public void ibaps_extract_page_will_display() {
		ibapsExtract.readIBAPSExtractHeader();
	}
	
	@When("User can select fiscal year {int}")
	public void user_can_select_fiscal_year(int selectFiscalYear) throws InterruptedException {
		ibapsExtract.selectFiscalYear(selectFiscalYear);
	}

	@Then("User click on generate IBAPS extract button")
	public void user_click_on_generate_ibaps_extract_button() throws InterruptedException {
		ibapsExtract.clickGenerateIBAPSExtract();
	}

	@Then("Extract toast message will display")
	public void extract_toast_message_will_display() throws InterruptedException {
		ibapsExtract.readIBAPSToast();
	}

}
