package com.flc.pageObject;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IBAPSExtractObject extends BaseClass {

	public IBAPSExtractObject(WebDriver driver) {
		super(driver);
	}
	@FindBy(linkText = "IBAPS Extract")
	public WebElement IBAPSExtractButton;

	@FindBy(xpath = "//*[@id='single-spa-application:@flc/fiveyearplan-app']/div/div[2]/div/div[2]/div[2]/div/div[2]/div/div[1]/div/div[2]/button")
	public WebElement generateIBAPSExtractButton;
	
	@FindBy(xpath = "//*[@id='single-spa-application:@flc/fiveyearplan-app']/div/div[2]/div/div[1]/div/p")
	public WebElement IBAPSExtractHeader;
	
	@FindBy(xpath = "//*[@id='selectedFiscalYear']")
	public WebElement fiscalYear;
	
	@FindBy(xpath = "//*[@id='an id']")
	public WebElement toast;
	
	public void clickIBAPSExtractTab() throws InterruptedException {
		IBAPSExtractButton.click();
		Thread.sleep(4000);
	}
	
	public void readIBAPSExtractHeader() {
		System.out.println("Opend tab: -  "+ IBAPSExtractHeader.getText());
	}
	
	public void selectFiscalYear(int selectFiscalYear) throws InterruptedException {
		fiscalYear.click();
		Thread.sleep(1000);
		fiscalYear.sendKeys(String.valueOf(selectFiscalYear));
		fiscalYear.sendKeys(Keys.ARROW_DOWN);
		fiscalYear.sendKeys(Keys.ENTER);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(generateIBAPSExtractButton));
		Thread.sleep(1000);
	}
	public void clickGenerateIBAPSExtract() throws InterruptedException {
		generateIBAPSExtractButton.click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(toast));
		Thread.sleep(1000);
	}
	public void readIBAPSToast() throws InterruptedException {
		System.out.println("Status of Generation of IBAPSExtract :  "+toast.getText());
		Thread.sleep(5000);
	}

}
