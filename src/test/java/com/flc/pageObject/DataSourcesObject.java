package com.flc.pageObject;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.google.common.io.Files;

public class DataSourcesObject extends BaseClass {

	public DataSourcesObject(WebDriver driver) {
		super(driver);
	}

	public String wordFile = "C:\\Users\\Teja-OUNCE\\eclipse-workspace\\prj231001CucumberBDD\\src\\test\\resources\\files\\testingPurpose.docx";
	public String excel = "C:\\Users\\Teja-OUNCE\\git\\repository\\prj231001CucumberBDD\\src\\test\\resources\\files\\testingExcel.xlsx";

	@FindBy(xpath = "//*[@id='single-spa-application:@flc/core-app']/div/div[1]/div[2]/div/div/div/div[4]/div/div[2]")

	public WebElement fiveYearPlanbtn;

	public String uploadStatus;
	public String UFRowcount;
	public String rowCount;
	public String mdufaRowcount;

	@FindBy(linkText = "UF Net Activity")
	public WebElement ufNetActivity;

	@FindBy(linkText = "Data Sources")
	public WebElement dataSources;

	@FindBy(linkText = "Collections")
	public WebElement collections;

	@FindBy(linkText = "Rent/ORR")
	public WebElement rent;

	@FindBy(linkText = "WCF")
	public WebElement WCF;

	@FindBy(linkText = "Actuals")
	public WebElement actuals;

	@FindBy(linkText = "Consumption Model")
	public WebElement consumptionModel;

	@FindBy(linkText = "FTE")
	public WebElement fte;

	@FindBy(linkText = "Process Cost Allocations")
	public WebElement processCostAllocation;

	@FindBy(linkText = "Obligations Extract")
	public WebElement obligationsExtract;

	@FindBy(linkText = "MDUFA Unearned Revenue")
	public WebElement MDUFAUnearnedRevenue;

	@FindBy(xpath = "//*[@id='single-spa-application:@flc/fiveyearplan-app']/div/div[4]/div/div/div[1]/p")
	public WebElement tabName;

//Outside upload buttons

	@FindBy(xpath = "//*[@id='single-spa-application:@flc/fiveyearplan-app']/div/div[4]/div/div/div[2]/div[2]/div/div/div[1]/div/div[3]/button")
	public WebElement outsideUploadButton;

	@FindBy(xpath = "//*[@id='single-spa-application:@flc/fiveyearplan-app']/div/div[4]/div/div/div[2]/div[2]/div/div/div[1]/div/div[4]/button")
	public WebElement collectionsTabOutsideUploadButton;

	@FindBy(xpath = "//*[@id='single-spa-application:@flc/fiveyearplan-app']/div/div[4]/div/div/div[2]/div/div/div/div[1]/div/div[4]/button")
	public WebElement processCostTabOutsideUploadButton;

	@FindBy(xpath = "//*[@id='single-spa-application:@flc/fiveyearplan-app']/div/div[4]/div/div/div[2]/div[2]/div/div/div[1]/div/div[3]/button")
	public WebElement obligationTabOutsideUploadButton;

//delete buttons

	@FindBy(xpath = "//*[@id='customTableTitle']/tbody/tr[1]/td[9]/button[3]")
	public WebElement deletebtn;

	@FindBy(xpath = "//*[@id='customTableTitle']/tbody/tr[1]/td[11]/div/button[3]")
	public WebElement UFNetActivityDeletebtn;

	@FindBy(xpath = "//*[@id='customTableTitle']/tbody/tr/td[9]/button")
	public WebElement obligationDeletebtn;

	@FindBy(xpath = "//*[@id='customTableTitle']/tbody/tr/td[11]/div/button[3]")
	public WebElement mdufaDeletebtn;

	@FindBy(xpath = "/html/body/div[2]/div[3]/div/div[2]/button[1]")
	public WebElement deleteConformationbtn;

//row count 

	@FindBy(xpath = "//*[@id='customTableTitle']/tbody/tr[1]/td[7]/div/span")
	public WebElement fileRowCount;

	@FindBy(xpath = "//*[@id='customTableTitle']/tbody/tr[1]/td[9]/div/span")
	public WebElement UFNetActivityFilerowCount;

	@FindBy(xpath = "//*[@id='customTableTitle']/tbody/tr/td[9]/div/span")
	public WebElement mdufaFilerowCount;

	@FindBy(id = "fileName")
	public WebElement chooseFile;

	@FindBy(xpath = "//*[@id='uploadFile']/div[2]/button")
	public WebElement insideUploadButton;

	@FindBy(xpath = "//*[@id='an id']")
	public WebElement toast;

	@FindBy(xpath = "/html/body/div[2]/div[3]/div/h2/div/button")
	public WebElement cancleUpload;

	@FindBy(xpath = "//*[@id='single-spa-application:@flc/fiveyearplan-app']/div/header/div/div/div/div[3]/div")
	public WebElement profilebtn;

	@FindBy(xpath = "//*[@id='simple-menu']/div[3]/ul/li[3]")
	public WebElement logout;

	public void openDataSources() throws InterruptedException {
		fiveYearPlanbtn.click();
		Thread.sleep(5000);
	}

	public void clickDataSourcesTab() throws InterruptedException {
		dataSources.click();
		Thread.sleep(3000);

	}

	public void clickLogout() throws InterruptedException {
		profilebtn.click();
		Thread.sleep(1000);
		logout.click();
	}

	public void openUFNetActivity() {
		ufNetActivity.click();

	}

//Outside upload buttons 

	public void clickOutsideUpload() throws InterruptedException {
		outsideUploadButton.click();
		Thread.sleep(2000);
	}

	public void clickCollectionsUploadButton() throws InterruptedException {
		collectionsTabOutsideUploadButton.click();
		Thread.sleep(3000);
	}

	public void clickProcessCostUploadButton() throws InterruptedException {
		processCostTabOutsideUploadButton.click();
		Thread.sleep(3000);
	}

	public void clickObligationUploadButton() throws InterruptedException {
		obligationTabOutsideUploadButton.click();
		Thread.sleep(3000);
	}

	public void clickMDUFAUnearnedRevenue() throws InterruptedException {
		MDUFAUnearnedRevenue.click();
		Thread.sleep(3000);
	}

	public void clickMdufaUploadButton() throws InterruptedException {
		obligationTabOutsideUploadButton.click();
		Thread.sleep(3000);
	}

	public void clickInsideUpload() throws InterruptedException {
		insideUploadButton.click();
		Thread.sleep(3000);
	}

	public void uploadword() throws InterruptedException {
		chooseFile.sendKeys(wordFile);
		Thread.sleep(3000);
		insideUploadButton.click();
		Thread.sleep(1000);
		System.out.println(toast.getText());
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//		wait.until(ExpectedConditions.elementToBeClickable(insideUploadButton));
		Thread.sleep(5000);
	}

	public void wordDocReject() {
		System.out.println(toast.getText());

	}

	public void uploadExcel() throws InterruptedException {
		chooseFile.sendKeys(excel);
		Thread.sleep(3000);

	}

	public void excelFileAccept() {
		uploadStatus = toast.getText();
		System.out.println(uploadStatus);

	}

	public void closeUploadTab() throws InterruptedException {
		cancleUpload.click();
		Thread.sleep(2000);
	}

//Row count

	public void countUFNetActivityFileRows() throws InterruptedException {

		UFRowcount = UFNetActivityFilerowCount.getText();

	}

	public void countFileRows() throws InterruptedException {

		rowCount = fileRowCount.getText();

	}

	public void countMdufaFileRows() throws InterruptedException {

		mdufaRowcount = mdufaFilerowCount.getText();

	}

//Delete button

	public void clickDelete() throws InterruptedException {
		deletebtn.click();
		Thread.sleep(1000);
		deleteConformationbtn.click();
		Thread.sleep(5000);
	}

	public void clickUFnetActivityDelete() throws InterruptedException {
		UFNetActivityDeletebtn.click();
		Thread.sleep(1000);
		deleteConformationbtn.click();
		Thread.sleep(1000);
	}

	public void clickObligationDelete() throws InterruptedException {
		obligationDeletebtn.click();
		Thread.sleep(1000);
		deleteConformationbtn.click();
		Thread.sleep(5000);
	}

	public void clickMdufaDelete() throws InterruptedException {
		mdufaDeletebtn.click();
		Thread.sleep(1000);
		deleteConformationbtn.click();
		Thread.sleep(5000);
	}

//	public void takeScreenshot() throws IOException, InterruptedException {
//
//		TakesScreenshot ss = (TakesScreenshot) driver;
//		File source = ss.getScreenshotAs(OutputType.FILE);
//		File destination = new File(
//				"C:\\Users\\Teja-OUNCE\\git\\repository\\prj231001CucumberBDD\\src\\test\\resources\\screenshots"
//						+ ".png");
//		Files.copy(source, destination);
//		Thread.sleep(2000);
//
//	}

	public void clickCollectionsTab() throws InterruptedException {
		collections.click();
		Thread.sleep(4000);
	}

	public void clickRentTab() throws InterruptedException {
		rent.click();
		Thread.sleep(4000);
	}

	public void WCFTab() throws InterruptedException {
		WCF.click();
		Thread.sleep(4000);
	}

	public void actuals() throws InterruptedException {
		WCF.click();
		Thread.sleep(4000);
		actuals.click();
		Thread.sleep(4000);
	}

	public void consumptionModel() throws InterruptedException {
		WCF.click();
		Thread.sleep(4000);
		consumptionModel.click();
		Thread.sleep(4000);
	}

	public void fteTab() throws InterruptedException {
		fte.click();
		Thread.sleep(4000);
	}

	public void clickProcessCostAllocationsTab() throws InterruptedException {
		processCostAllocation.click();
		Thread.sleep(5000);
	}

	public void clickObligationsExtractTab() throws InterruptedException {
		obligationsExtract.click();
		Thread.sleep(4000);
	}

	public void clickMDUFAUnearnedRevenueTab() throws InterruptedException {
		MDUFAUnearnedRevenue.click();
		Thread.sleep(4000);
	}

}
