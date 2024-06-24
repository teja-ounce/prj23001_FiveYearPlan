package com.flc.stepDefinition;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.flc.pageObject.DataSourcesObject;
import com.flc.utils.DriverFactory;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DataSourcesStep {

	private WebDriver driver = DriverFactory.getDriver();
	private DataSourcesObject dataSources = new DataSourcesObject(driver);

	@And("User click on data sources")
	public void User_click_on_data_sources() throws InterruptedException {
		dataSources.clickDataSourcesTab();
	}

	@Then("User on UF net activity tab")
	public void user_on_uf_net_activity_tab() throws InterruptedException {

		dataSources.openUFNetActivity();
	}

	@When("User clicks on upload button")
	public void user_clicks_on_upload_button() throws InterruptedException {
		dataSources.clickOutsideUpload();
	}

	@When("User clicks on collections upload button")
	public void user_clicks_collections_on_upload_button() throws InterruptedException {
		dataSources.clickCollectionsUploadButton();
	}

	@When("User clicks on process cost allocation upload button")
	public void user_clicks_on_process_cost_allocation_upload_button() throws InterruptedException {
		dataSources.clickProcessCostUploadButton();
	}

	@When("User clicks on obligations extract upload button")
	public void user_clicks_on_obligations_extract_upload_button() throws InterruptedException {
		dataSources.clickObligationUploadButton();
	}

	@When("User clicks on mdufa upload button")
	public void user_clicks__on_mdufa_upload_button() throws InterruptedException {
		dataSources.clickMdufaUploadButton();
	}

	@When("User upload word document")
	public void user_upload_word_document() throws InterruptedException {
		dataSources.uploadword();

	}

	@Then("Document should not accept")
	public void document_should_not_accept() throws InterruptedException {
		dataSources.wordDocReject();

	}

	@When("User upload excel file")
	public void user_upload_excel_file() throws InterruptedException {
		dataSources.uploadExcel();
		dataSources.clickInsideUpload();
	}

	@Then("Documnet will upload succesfully")
	public void documnet_will_upload_succesfully() throws InterruptedException {
		dataSources.excelFileAccept();
	}

	@And("Close file upload tab")
	public void close_file_upload_tab() throws InterruptedException {
		dataSources.closeUploadTab();

	}

	@When("User validate UF net activity document")
	public void user_validate_UF_net_activity_document() throws InterruptedException, IOException {
		dataSources.countUFNetActivityFileRows();

		if (dataSources.uploadStatus.contains("Uploaded Successfully") && dataSources.UFRowcount.equals("0")) {

			dataSources.clickUFnetActivityDelete();
			System.out.println("File deleted");
		} else {
			System.out.println("File is accepted but not in use");

			dataSources.clickUFnetActivityDelete();
		}

	}

	@When("User validate MDUFA file document")
	public void user_validate_MDUFA_file_document() throws InterruptedException, IOException {
		dataSources.countMdufaFileRows();

		if (dataSources.uploadStatus.contains("Uploaded Successfully") && dataSources.mdufaRowcount.equals("0")) {

			dataSources.clickMdufaDelete();
			System.out.println("File deleted");
		} else {
			System.out.println("File is accepted but not in use");

			dataSources.clickMdufaDelete();
		}

	}

	@When("User validate uploaded document")
	public void user_validate_uploaded_document() throws InterruptedException, IOException {
		dataSources.countFileRows();

		if (dataSources.uploadStatus.contains("Uploaded Successfully") && dataSources.rowCount.equals("0")) {

			dataSources.clickDelete();
			System.out.println("File deleted");
		} else {
			System.out.println("File is accepted but not in use");

			dataSources.clickDelete();
		}

	}

	@Then("User on Collections tab")
	public void user_on_collections_tab() throws InterruptedException {
		dataSources.clickCollectionsTab();
	}
	
	@Then("User on MDUFAUnearnedRevenue tab")
	public void user_on_MDUFAUnearnedRevenue_tab() throws InterruptedException {
		dataSources.clickMDUFAUnearnedRevenue();
	}
	
	@Then("User on rent tab")
	public void user_on_rent_tab() throws InterruptedException {
		dataSources.clickRentTab();
	}

	@Then("User on wcf tab")
	public void user_on_wcf_tab() throws InterruptedException {
		dataSources.WCFTab();
	}

	@Then("User on actuals tab")
	public void user_on_actuals_tab() throws InterruptedException {
		dataSources.actuals();
	}

	@Then("User on consumption model tab")
	public void user_on_consumption_model_tab() throws InterruptedException {
		dataSources.consumptionModel();
	}

	@Then("User on fte tab")
	public void user_on_fte_tab() throws InterruptedException {
		dataSources.fteTab();
	}

	@Then("User on process cost allocation tab")
	public void user_on_process_cost_allocation_tab() throws InterruptedException {
		dataSources.clickProcessCostAllocationsTab();
	}

	@Then("User on obligations extract tab")
	public void user_on_obligations_extract_tab() throws InterruptedException {
		dataSources.clickObligationsExtractTab();
	}

	@Then("MDUFA unearned revenue extract tab")
	public void user_on_MDUFA_unearned_revenue_extract_tab() throws InterruptedException {
		dataSources.clickMDUFAUnearnedRevenueTab();
	}

	@Then("User get logout")
	public void Then_User_get_logout() throws InterruptedException {
		dataSources.clickLogout();
	}

}