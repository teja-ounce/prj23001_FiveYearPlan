package com.flc.pageObject;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

public class DashboardObject extends BaseClass {

	public DashboardObject(WebDriver driver) {
		super(driver);
	}


	public String inname;
	public String outname;
	public String inap;
	public String readcenter;
	public String readinallo;

	@FindBy(xpath = "//*[@id='single-spa-application:@flc/fiveyearplan-app']/div/div[2]/div/div/div[2]/div[2]/div[2]/div/table/thead/tr[1]/th[2]")
	public WebElement innerName;
	@FindBy(xpath = "//*[@id='single-spa-application:@flc/core-app']/div/div[1]/div[2]/div/div/div/div[4]/div/div[2]")
	public WebElement fiveYearPlanButton;

	@FindBy(xpath = "//*[@id='single-spa-application:@flc/fiveyearplan-app']/div/div[2]/div[2]/div/div/div/div/div/div[2]/div/div/div/div[1]/div/div[3]/h6")
	public WebElement outerName;

	@FindBy(xpath = "//*[@id='single-spa-application:@flc/fiveyearplan-app']/div/div[2]/div[2]/div/div/div/div/div/div[2]/div/div/div/div[1]/div/div[4]/button")
	public WebElement csbtn;

	@FindBy(xpath = "//*[@id='single-spa-application:@flc/fiveyearplan-app']/div/div[2]/div[2]/div/div/div/div/div/div[2]/div/div/div/div[1]/div/div[5]/button")
	public WebElement allocationbtn;
	@FindBy(xpath = "//*[@id='dataBy-radio-buttons-group']/div/label[2]/span[1]/input")
	public WebElement centerbtn;
	@FindBy(xpath = "//*[@id='single-spa-application:@flc/fiveyearplan-app']/div/div[2]/div/div[3]/div/div[3]/div/div/div/div/div/div[1]/div/div[2]/div/div/button[2]")
	public WebElement savebtn;

	@FindBy(xpath = "//*[@id='single-spa-application:@flc/fiveyearplan-app']/div/div[2]/div/div/div[2]/div[2]/div[2]/div")
	public WebElement scrollableTable;
	@FindBy(xpath = "//*[@id='single-spa-application:@flc/fiveyearplan-app']/div/header/div/div/div/div[3]/div")
	public WebElement profilebtn;

	@FindBy(xpath = "//*[@id='simple-menu']/div[3]/ul/li[3]")
	public WebElement logout;
	
	@FindBy(xpath = "//*[@id='single-spa-application:@flc/fiveyearplan-app']/div/header/div/div/div/div[3]/button")
	public WebElement userChangeButton;
	
	@FindBy(xpath = "//*[@id='shareViaEmail']/div/div/div/div/label[2]/span[1]/input")
	public WebElement adminButton;
	
	

	public void clickFiveYearPlan() throws InterruptedException {
		fiveYearPlanButton.click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(outerName));
		userChangeButton.click();
		Thread.sleep(2000);
		adminButton.click();
		Thread.sleep(2000);
	}

	public void clickConsolidateStatement() throws InterruptedException {
		outname = outerName.getText();
		Thread.sleep(2000);
		csbtn.click();
	}

	public void openConsolidateStatement() throws InterruptedException {
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait1.until(ExpectedConditions.elementToBeClickable(innerName));
		inname = innerName.getText();
		System.out.println("Inner Name is :	"+inname);
	}

	public void validate() throws InterruptedException, IOException {
		Thread.sleep(2000);
		if (inname.equals(outname)) {
			System.out.println("Matched, consolidate satatement opened ");
			driver.navigate().back();
			Thread.sleep(4000);

		} else {

			System.out.println("User fee not matched");
			TakesScreenshot ss = (TakesScreenshot) driver;
			File source = ss.getScreenshotAs(OutputType.FILE);
			Thread.sleep(1000);
			File destination = new File(
					"C:\\Users\\Teja-OUNCE\\OneDrive - proounce.com\\Documents\\GitHub\\BDD\\CucumberMaven\\screenshots\\cs.png");
			Files.copy(source, destination);
			Thread.sleep(2000);
		}
	}

	public void clickAllocationPlan() {
		allocationbtn.click();

	}

	public void logout()  {
		logout.click();
	}
	public void clickProfileButton() throws InterruptedException {
		profilebtn.click();
		Thread.sleep(1000);
		
	}

}
