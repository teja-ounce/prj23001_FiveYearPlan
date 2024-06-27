package com.flc.pageObject;

import java.time.Duration;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ConfigurationsObject extends BaseClass {

	public ConfigurationsObject(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//*[@id='an id']")
	public WebElement toast;

//Centers elements

	@FindBy(linkText = "Configurations")
	public WebElement configurations;

	@FindBy(xpath = "//*[@id='customTableTitle']/tbody/tr[1]/td[2]/button")
	public WebElement centers;

	@FindBy(xpath = "//*[@id='single-spa-application:@flc/fiveyearplan-app']/div/div[4]/div/div[2]/div/div/span/span")
	public WebElement centersHeader;

	@FindBy(xpath = "//*[@id='single-spa-application:@flc/fiveyearplan-app']/div/div[4]/div/div[3]/div/div/div[1]/div/div[2]/button[1]")
	public WebElement outsideAddCentersButton;

	@FindBy(xpath = "//*[@id='mui-1']")
	public WebElement addCenterDropdown;

	@FindBy(xpath = "//*[@id='mui-2']")
	public WebElement addUserDropdown;

	@FindBy(xpath = "//*[@id='addCenter']/div[1]/div/div/div/div/div/div/div/div[1]/span")
	public WebElement selectedCenter;

	@FindBy(xpath = "//*[@id='addCenter']/div[2]/button[1]")
	public WebElement insideAddCentersButton;

	@FindBy(xpath = "//*[@id='single-spa-application:@flc/fiveyearplan-app']/div/div[4]/div[3]/div/div/div/div[1]/div/div/div[2]/button")
	public WebElement outsideAddUserButton;

	@FindBy(xpath = "//*[@id='addUser']/div[2]/button[1]")
	public WebElement insideAddUsersButton;

	@FindBy(xpath = "//*[@id='addCenter']/div/button")
	public WebElement cancleCenterButton;

	@FindBy(id = "outlined-basic")
	public WebElement searchBox;

	@FindBy(xpath = "//*[@id='single-spa-application:@flc/fiveyearplan-app']/div/div[4]/div/div[3]/div/div/div[2]/div/div[2]/div/table/tbody/tr[1]/td[6]/div/button[2]")
	public WebElement deleteCenterButton;

	@FindBy(xpath = "//*[@id='single-spa-application:@flc/fiveyearplan-app']/div/div[4]/div[3]/div/div/div/div[2]/div/div[2]/div/table/tbody/tr/td[6]/div/button[2]")
	public WebElement deleteUserButton;

	@FindBy(xpath = "/html/body/div[2]/div[3]/div/div[2]/button[1]")
	public WebElement conformationDeleteButton;

	@FindBy(xpath = "//*[@id='single-spa-application:@flc/fiveyearplan-app']/div/div[4]/div/div[3]/div/div/div[2]/div/div[2]/div/table/tbody/tr[1]/td[5]/button")
	public WebElement goToUsersButton;

	@FindBy(xpath = "//*[@id='single-spa-application:@flc/fiveyearplan-app']/div/div[4]/div[2]/div/div/span/span")
	public WebElement usersHeader;

	@FindBy(xpath = "//*[@id='addUser']/div[1]/div/div/div/div/div/div/div/div[1]")
	public WebElement selectedUser;

//Business managers

	@FindBy(xpath = "//*[@id='customTableTitle']/tbody/tr[1]/td[3]/button")
	public WebElement businessManagers;

	@FindBy(xpath = "//*[@id='single-spa-application:@flc/fiveyearplan-app']/div/div[4]/div[2]/div/div/span/span")
	public WebElement businessManagersHeader;

	@FindBy(xpath = "//*[@id='single-spa-application:@flc/fiveyearplan-app']/div/div[4]/div[3]/div/div/div/div[1]/div/div[3]/button[2]")
	public WebElement outsideAddBusinessManagerButton;

	@FindBy(xpath = "//*[@id='mui-1']")
	public WebElement selectBusinessManagersDropdown;

	@FindBy(xpath = "//*[@id='addService']/div[2]/button[1]")
	public WebElement insideAddUBusinessManagerButton;

	@FindBy(xpath = "//*[@id='addService']/div[2]/button[2]")
	public WebElement cancleBusinessManagerButton;

	@FindBy(xpath = "//*[@id='selectedFiscalYear3']")
	public WebElement selectToFiscalYearDropdown;

	@FindBy(xpath = "//*[@id='selectedFiscalYear2']")
	public WebElement selectFromFiscalYearDropdown;

	@FindBy(xpath = "//*[@id='selectedFiscalYear']")
	public WebElement fiscalYear;

	@FindBy(xpath = "//*[@id='single-spa-application:@flc/fiveyearplan-app']/div/div[4]/div[3]/div/div/div/div[1]/div/div[3]/button[1]")
	public WebElement outsideCopyButton;

	@FindBy(xpath = "//*[@id='addNewHires']/div[2]/button[1]")
	public WebElement insideCopyButton;

	@FindBy(xpath = "/html/body/div[3]/div[3]/div/div[2]/button[1]")
	public WebElement confirmCopy;

	@FindBy(xpath = "//*[@id='addService']/div[1]/div/div/div/div/div/div/div/div[1]")
	public WebElement selectedBusinessManager;

	@FindBy(xpath = "//*[@id='single-spa-application:@flc/fiveyearplan-app']/div/div[4]/div[3]/div/div/div/div[2]/div/div[2]/div/table/tbody/tr[1]/td[5]/div/button[2]")
	public WebElement deleteManagerButton;

//Target Revenue

	@FindBy(xpath = "//*[@id='customTableTitle']/tbody/tr[1]/td[4]/button")
	public WebElement targetRevenueCategories;

	@FindBy(xpath = "//*[@id='single-spa-application:@flc/fiveyearplan-app']/div/div[4]/div[2]/div/div/span/span")
	public WebElement targetRevenueCategoriesHeader;

	@FindBy(xpath = "//*[@id='single-spa-application:@flc/fiveyearplan-app']/div/div[4]/div[3]/div/div/div/div[1]/div/div[3]/button[2]")
	public WebElement outsideAddTargetRevenueButton;

	@FindBy(xpath = "//*[@id='addTR']/div[2]/button[1]")
	public WebElement insideAddTargetRevenueButton;

	@FindBy(xpath = "//*[@id='mui-1']")
	public WebElement selectTargetRevenueDropdown;

	@FindBy(xpath = "//*[@id='addTR']/div[2]/button[2]")
	public WebElement cancleTargetRevenueButton;

	@FindBy(xpath = "//*[@id='addTR']/div[1]/div/div/div/div/div/div/div/div[1]/span")
	public WebElement selectedTargetRevenue;

	@FindBy(xpath = "//*[@id='single-spa-application:@flc/fiveyearplan-app']/div/div[4]/div[3]/div/div/div/div[2]/div/div[2]/div/table/tbody/tr[1]/td[7]/div/button[2]")
	public WebElement deleteTargetButton;

//Inflation inputs

	@FindBy(xpath = "//*[@id='customTableTitle']/tbody/tr[1]/td[5]/button")
	public WebElement inflationInputs;

	@FindBy(xpath = "//*[@id='single-spa-application:@flc/fiveyearplan-app']/div/div[4]/div[2]/div/div/span/span")
	public WebElement inflationInputsHeader;

	@FindBy(xpath = "//*[@id='single-spa-application:@flc/fiveyearplan-app']/div/div[4]/div[3]/div/div/div/div[1]/div/div[3]/button[2]")
	public WebElement outsideAddInflationInputsButton;

	@FindBy(xpath = "//*[@id='addInfltn']/div[2]/button[1]")
	public WebElement insideAddInflationInputsButton;

	@FindBy(xpath = "//*[@id='mui-1']")
	public WebElement selectInflationInputDropdown;

	@FindBy(xpath = "//*[@id='addInfltn']/div[2]/button[2]")
	public WebElement cancleInflationInputButton;

	@FindBy(xpath = "//*[@id='addInfltn']/div[1]/div/div/div/div/div/div/div/div[1]/span")
	public WebElement selectedInflationInput;

	@FindBy(xpath = "//*[@id='single-spa-application:@flc/fiveyearplan-app']/div/div[4]/div[3]/div/div/div/div[2]/div/div[2]/div/table/tbody/tr[1]/td[7]/div/button[2]")
	public WebElement deleteInflationButton;

//Process FTEs

	@FindBy(xpath = "//*[@id='customTableTitle']/tbody/tr[1]/td[6]/button")
	public WebElement processFTE;

	@FindBy(xpath = "//*[@id='single-spa-application:@flc/fiveyearplan-app']/div/div[4]/div[2]/div/div/span/span")
	public WebElement processFTEHeader;

	@FindBy(xpath = "//*[@id='single-spa-application:@flc/fiveyearplan-app']/div/div[4]/div[3]/div/div/div/div[1]/div/div[3]/button[2]")
	public WebElement outsideAddProcessFTEButton;

	@FindBy(xpath = "//*[@id='addPrsFTE']/div[2]/button[1]")
	public WebElement insideAddProcessFTEButton;

	@FindBy(xpath = "//*[@id='mui-1']")
	public WebElement selectProcessFTEDropdown;

	@FindBy(xpath = "//*[@id='addPrsFTE']/div[1]/div/div/div/div/div/div/div/div[1]/span")
	public WebElement selectedProcessFTE;

	@FindBy(xpath = "//*[@id='addPrsFTE']/div[2]/button[2]")
	public WebElement cancleProcessFTEButton;

	@FindBy(xpath = "//*[@id='single-spa-application:@flc/fiveyearplan-app']/div/div[4]/div[3]/div/div/div/div[2]/div/div[2]/div/table/tbody/tr[1]/td[14]/div/button[2]")
	public WebElement deleteProcessFTEButton;

//Carry over set aside

	@FindBy(xpath = "//*[@id='customTableTitle']/tbody/tr[1]/td[7]/button")
	public WebElement carryoverSetasides;

	@FindBy(xpath = "//*[@id='single-spa-application:@flc/fiveyearplan-app']/div/div[4]/div[2]/div/div/span/span")
	public WebElement carryoverSetasidesHeader;

	@FindBy(xpath = "//*[@id='single-spa-application:@flc/fiveyearplan-app']/div/div[4]/div[3]/div/div/div/div[1]/div/div[3]/button[2]")
	public WebElement outsideAddCarryoverSetasideButton;

	@FindBy(xpath = "//*[@id='addCarry']/div[2]/button[1]")
	public WebElement insideAddCarryoverSetasideButton;

	@FindBy(xpath = "//*[@id='mui-1']")
	public WebElement selectCarryoverSetasideDropdown;

	@FindBy(xpath = "//*[@id='addCarry']/div[2]/button[2]")
	public WebElement cancleCarryoverSetasideButton;

	@FindBy(xpath = "//*[@id='addCarry']/div[1]/div/div[1]/div/div/div/div/div/div[1]/span")
	public WebElement selectedCarryoverSetAside;

	@FindBy(xpath = "//*[@id='single-spa-application:@flc/fiveyearplan-app']/div/div[4]/div[3]/div/div/div/div[2]/div/div[2]/div/table/tbody/tr[1]/td[7]/div/button[2]")
	public WebElement deleteCarryOverButton;

//Miscellaneous Adjustments

	@FindBy(xpath = "//*[@id='customTableTitle']/tbody/tr[1]/td[8]/button")
	public WebElement miscellaneousAdjustment;

	@FindBy(xpath = "//*[@id='single-spa-application:@flc/fiveyearplan-app']/div/div[4]/div[2]/div/div/span/span")
	public WebElement miscellaneousAdjustmentHeader;

	@FindBy(xpath = "//*[@id='single-spa-application:@flc/fiveyearplan-app']/div/div[4]/div[3]/div/div/div/div[1]/div/div[3]/button[2]")
	public WebElement outsideAddMiscellaneousAdjustmentButton;

	@FindBy(xpath = "//*[@id='addMiscAdj']/div[2]/button[1]")
	public WebElement insideAddMiscellaneousAdjustmentButton;

	@FindBy(xpath = "//*[@id='mui-1']")
	public WebElement selectMiscellaneousAdjustmentDropdown;

	@FindBy(xpath = "//*[@id='selectedMiscAdjType']")
	public WebElement selectMiscellaneousAdjustmentTypeDropdown;

	@FindBy(xpath = "//*[@id='addMiscAdj']/div[1]/div/div[1]/div/div/div/div/div/div[1]/span")
	public WebElement selectedMiscellaneousAdjustment;

	@FindBy(xpath = "//*[@id='addMiscAdj']/div[2]/button[1]")
	public WebElement cancleMiscellaneousAdjustmentButton;

	@FindBy(xpath = "//*[@id='single-spa-application:@flc/fiveyearplan-app']/div/div[4]/div[3]/div/div/div/div[2]/div/div[2]/div/table/tbody/tr[1]/td[7]/div/button[2]")
	public WebElement deleteMiscellaneousButton;

// Recoveries
	@FindBy(xpath = "//*[@id='customTableTitle']/tbody/tr[1]/td[9]/button")
	public WebElement recoveries;

	@FindBy(xpath = "//*[@id='single-spa-application:@flc/fiveyearplan-app']/div/div[4]/div[2]/div/div/span/span")
	public WebElement recoveriesHeader;

	@FindBy(xpath = "//*[@id='single-spa-application:@flc/fiveyearplan-app']/div/div[4]/div[3]/div/div/div/div[1]/div/div[3]/button[2]")
	public WebElement outsideAddRecoveriesButton;

	@FindBy(xpath = "//*[@id='addInfltn']/div[2]/button[1]")
	public WebElement insideAddRecoveriesButton;

	@FindBy(xpath = "//*[@id='addInfltn']/div[1]/div/div[2]/input")
	public WebElement forecastAmount;

	@FindBy(xpath = "//*[@id='addInfltn']/div[2]/button[1]")
	public WebElement cancleRecoveriesButton;

	@FindBy(xpath = "//*[@id='single-spa-application:@flc/fiveyearplan-app']/div/div[4]/div[3]/div/div/div/div[2]/div/div[2]/div/table/tbody/tr/td[4]/button[2]")
	public WebElement deleteRecoveriesButton;

// Allocation categories

	@FindBy(xpath = "//*[@id='customTableTitle']/tbody/tr[1]/td[10]/button")
	public WebElement allocationCategories;

	@FindBy(xpath = "//*[@id='single-spa-application:@flc/fiveyearplan-app']/div/div[4]/div[2]/div/div/span/span")
	public WebElement allocationCategoriesHeader;

	@FindBy(xpath = "//*[@id='single-spa-application:@flc/fiveyearplan-app']/div/div[4]/div[3]/div/div/div/div[1]/div/div[3]/button[2]")
	public WebElement outsideAddAllocationCategoriesButton;

	@FindBy(xpath = "//*[@id='addAllocationCategory']/div[2]/button[1]")
	public WebElement insideAddAllocationCategoriesButton;

	@FindBy(xpath = "//*[@id='selectAllocationCategory']")
	public WebElement selectAllocationCategoriesButton;

	@FindBy(id = "formulaName")
	public WebElement formulaName;

	@FindBy(id = "formulaDesc")
	public WebElement formulaDescription;

	@FindBy(xpath = "//*[@id='addAllocationCategory']/div[2]/button[2]")
	public WebElement cancleAllocationCategoriesButton;

	@FindBy(xpath = "//*[@id='customTableTitle']/tbody/tr[1]/td[9]/div/button[2]")
	public WebElement deleteAllocationButton;

// Inflation categories

	@FindBy(xpath = "//*[@id='customTableTitle']/tbody/tr[1]/td[11]/button")
	public WebElement inflationCategories;

	@FindBy(xpath = "//*[@id='single-spa-application:@flc/fiveyearplan-app']/div/div[4]/div[2]/div/div/span/span")
	public WebElement inflationCategoriesHeader;

	@FindBy(xpath = "//*[@id='single-spa-application:@flc/fiveyearplan-app']/div/div[4]/div[3]/div/div/div/div[1]/div/div[3]/button[2]")
	public WebElement outsideAddInflationCategoriesButton;

	@FindBy(xpath = "//*[@id='addAllocationCategory']/div[2]/button[1]")
	public WebElement insideAddInflationCategoriesButton;

	@FindBy(xpath = "//*[@id='selectAllocationCategory']")
	public WebElement selectInflationCategoryDropdown;

	@FindBy(xpath = "//*[@id='addAllocationCategory']/div[2]/button[2]")
	public WebElement cancleInflationCategoriesButton;

	@FindBy(xpath = "//*[@id='customTableTitle']/tbody/tr[1]/td[7]/div/button[2]")
	public WebElement deleteInflationCategoryButton;

//Lookup Management

	@FindBy(linkText = "Lookups")
	public WebElement lookupsLinkText;

	@FindBy(xpath = "//*[@id='single-spa-application:@flc/fiveyearplan-app']/div/div[4]/div/div[3]/div/div/div/div[1]/div/div/div[2]/button")
	public WebElement addLookupButton;

	@FindBy(xpath = "//*[@id='single-spa-application:@flc/fiveyearplan-app']/div/div[4]/div/div[2]/div/ul/li")
	public WebElement lookupHeader;

	@FindBy(id = "lookupType")
	public WebElement lookupType;

	@FindBy(id = "groupType")
	public WebElement lookupName;

	@FindBy(id = "roleName")
	public WebElement lookupDescription;

	@FindBy(xpath = "//*[@id='lookupGroupModel']/div[2]/button[1]")
	public WebElement lookupSaveButton;

	@FindBy(xpath = "//*[@id='customTableTitle']/table/tbody/tr/td[5]/button")
	public WebElement lookupListButton;

	@FindBy(xpath = "//*[@id='single-spa-application:@flc/fiveyearplan-app']/div/div[4]/div/div[3]/div/div/div[1]/div/div/div[2]/button")
	public WebElement addLookupValuesButton;

	@FindBy(id = "id1")
	public WebElement lookupValue;

	@FindBy(id = "groupType")
	public WebElement lookupValueCode;

	@FindBy(id = "groupTy")
	public WebElement lookupValueDisplayOrder;

	@FindBy(id = "groupTyp")
	public WebElement lookupValueDescription;

	@FindBy(xpath = "//*[@id='userGroupModel']/div[2]/button[1]")
	public WebElement lookupValueSaveButton;

	@FindBy(xpath = "//*[@id='customTableTitle']/tbody/tr[1]/td[6]/button[2]")
	public WebElement lookupValueDeleteButton;

	@FindBy(xpath = "//*[@id='customTableTitle']/table/tbody/tr[1]/td[6]/button[2]")
	public WebElement lookupDeleteButton;

//Email templates
	@FindBy(linkText = "Email Templates")
	public WebElement emailTemplateButton;

	@FindBy(xpath = "//*[@id='single-spa-application:@flc/fiveyearplan-app']/div/div[4]/div/div[2]/div/ul/li")
	public WebElement emailTemplateHeader;

	@FindBy(xpath = "//*[@id='single-spa-application:@flc/fiveyearplan-app']/div/div[4]/div/div[3]/div/div/div/div[1]/div/div/div[2]/button")
	public WebElement addEmailButton;

	@FindBy(id = "templateName")
	public WebElement templateName;

	@FindBy(id = "templateSubject")
	public WebElement templateSubject;

	@FindBy(xpath = "//*[@class='cke_wysiwyg_frame cke_reset']")
	public WebElement emailBody;

	@FindBy(xpath = "//*[@id='emailModal']/div[2]/button[1]")
	public WebElement emailSaveButton;

	@FindBy(xpath = "//*[@id='customTableTitle']/tbody/tr/td[5]/button[2]")
	public WebElement emailDeleteButton;
	
//Settings
	
	@FindBy(linkText = "Settings")
	public WebElement SettingsButton;

	@FindBy(xpath = "//*[@id='single-spa-application:@flc/fiveyearplan-app']/div/div[4]/div/div[2]/div/ul/li")
	public WebElement SettingsHeader;

	@FindBy(xpath = "//*[@id='single-spa-application:@flc/fiveyearplan-app']/div/div[4]/div/div[3]/div/div/div/div[1]/div/div/div[2]/button")
	public WebElement addSettingsButton;

	@FindBy(id = "settingName")
	public WebElement SettingName;

	@FindBy(id = "settingCode")
	public WebElement SettingCode;

	@FindBy(id = "settingValue")
	public WebElement SettingValue;

	@FindBy(id = "settingDesc")
	public WebElement SettingDescription;

	@FindBy(id = "settingValueDesc")
	public WebElement SettingValueDescription;
	
	@FindBy(xpath = "//*[@id='settingModal']/div[2]/button[1]")
	public WebElement SettingSaveButton;
	
	@FindBy(xpath = "//*[@id='customTableTitle']/tbody/tr/td[6]/button[2]")
	public WebElement SettingDeleteButton;

//Profiles
	
	@FindBy(linkText = "Profiles")
	public WebElement ProfilesButton;

	@FindBy(xpath = "//*[@id='single-spa-application:@flc/fiveyearplan-app']/div/div[4]/div/div[2]/div/ul/li")
	public WebElement ProfilesHeader;

	@FindBy(xpath = "//*[@id='single-spa-application:@flc/fiveyearplan-app']/div/div[4]/div/div[3]/div/div/div/div[1]/div/div/div[2]/button")
	public WebElement addProfilesButton;

	@FindBy(id = "profileName")
	public WebElement ProfilesName;

	@FindBy(id = "roleName")
	public WebElement ProfileDescription;

	@FindBy(xpath = "//*[@id='profileGroupModel']/div[2]/button[1]")
	public WebElement profileSaveButton;
	
	@FindBy(xpath = "//*[@id='customTableTitle']/tbody/tr[1]/td[3]/button")
	public WebElement goToProfileValueButton;
	
	@FindBy(xpath = "//*[@id='single-spa-application:@flc/fiveyearplan-app']/div/div[4]/div/div[2]/div/div/span/span")
	public WebElement ProfilesValueHeader;
	
	@FindBy(xpath = "//*[@id='single-spa-application:@flc/fiveyearplan-app']/div/div[4]/div/div[3]/div/div/div[1]/div/div/div[2]/button")
	public WebElement addProfileValueButton;
	
	@FindBy(id = "selectedProfileLevel")
	public WebElement ProfileLevelDropdown;

	@FindBy(id = "selectedProfileLevelValue")
	public WebElement ProfileLevelValueDropdown;
	
	@FindBy(id = "groupTy")
	public WebElement profileValue;
	
	@FindBy(id = "groupTyp")
	public WebElement profileDescription;
	
	@FindBy(xpath = "//*[@id='userGroupModel']/div[2]/button[1]")
	public WebElement saveProfileValueButton;
	
	@FindBy(xpath = "//*[@id='customTableTitle']/tbody/tr/td[4]/button[2]")
	public WebElement deleteProfileButton;

//Distribution
	
	@FindBy(linkText = "Distribution")
	public WebElement DistributionButton;

	@FindBy(xpath = "//*[@id='single-spa-application:@flc/fiveyearplan-app']/div/div[4]/div/div[2]/div/ul/li")
	public WebElement DistributionHeader;

	@FindBy(xpath = "//*[@id='single-spa-application:@flc/fiveyearplan-app']/div/div[4]/div/div[3]/div/div/div/div[1]/div/div/div[2]/button")
	public WebElement addDistributionButton;

	@FindBy(id = "groupName")
	public WebElement groupName;

	@FindBy(id = "description")
	public WebElement DistributionDescription;

	@FindBy(xpath = "//*[@id='distributionGroupModel']/div[2]/button[1]")
	public WebElement DistributionSaveButton;
	
	@FindBy(xpath = "//*[@id='customTableTitle']/tbody/tr/td[3]/button")
	public WebElement goToDistributionDetailsButton;
	
	@FindBy(xpath = "//*[@id='single-spa-application:@flc/fiveyearplan-app']/div/div[4]/div/div[2]/div/div/span/span")
	public WebElement DistributionDetailsHeader;
	
	@FindBy(xpath = "//*[@id='single-spa-application:@flc/fiveyearplan-app']/div/div[4]/div/div[3]/div/div/div[1]/div/div/div[2]/button")
	public WebElement addDistributionDetailsButton;
	
	@FindBy(id = "selectedUser")
	public WebElement userDropdown;

	@FindBy(xpath = "//*[@id='userGroupModel']/div[2]/button[1]")
	public WebElement saveDistributionDetailsButton;
	
	@FindBy(xpath = "//*[@id='customTableTitle']/tbody/tr/td[4]/button[2]")
	public WebElement deleteDistributionDetailsButton;
	
// Variables

	public String addedUser;
	public String addedManager;
	public String addedTargetRevenue;
	public String addedInflationInput;
	public String addededProcessFTE;
	public String addedCarryoverSetAside;
	public String addedCenter;
	public String addedMiscellaneousAdjustment;
	public String message = "Mandatory fileds are not filled";

// Centers 

	public void clickConfigurationsTab() throws InterruptedException {
		configurations.click();
		Thread.sleep(4000);
	}

	public void clickCenterIcon() throws InterruptedException {
		centers.click();
		Thread.sleep(4000);
	}

	public void readCentersPageTitle() {
		System.out.println(centersHeader.getText());
	}

	public void clickAddCentersButton() throws InterruptedException {
		outsideAddCentersButton.click();
		Thread.sleep(3000);
	}

	public void selectCenter() throws InterruptedException {
		addCenterDropdown.click();
		Thread.sleep(1000);
		addCenterDropdown.sendKeys(Keys.ARROW_DOWN);
		addCenterDropdown.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		addedCenter = selectedCenter.getText();
		System.out.println(addedCenter);
		insideAddCentersButton.click();
		Thread.sleep(1000);
		System.out.println(toast.getText());
	}

	public void afterAdd() throws InterruptedException {
		if (toast.getText().contains(message)) {
			System.out.println("No options are left");
			cancleCenterButton.click();
			Thread.sleep(3000);
		} else {
			Thread.sleep(2000);
			System.out.println(toast.getText());
			searchBox.clear();
			String[] parts = addedCenter.split(" -");
			if (parts.length >= 2) {
				String text = parts[0];
				System.out.println(text);
				searchBox.sendKeys(text);
				Thread.sleep(1000);
				deleteCenterButton.click();
				Thread.sleep(1000);
				conformationDeleteButton.click();
				Thread.sleep(7000);
			}
		}

	}

	public void clickUsersButton() throws InterruptedException {
		goToUsersButton.click();
		Thread.sleep(4000);
	}

	public void readUsersPageTitle() {
		System.out.println(usersHeader.getText());

	}

	public void clickAddUserButton() throws InterruptedException {
		outsideAddUserButton.click();
		Thread.sleep(1000);
	}

	public void selectUserFromDropdown() throws InterruptedException {
		addUserDropdown.click();
		Thread.sleep(1000);
		addUserDropdown.sendKeys(Keys.ARROW_DOWN);
		addUserDropdown.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		addedUser = selectedUser.getText();
		System.out.println(addedUser);

	}

	public void clickUserAddButton() throws InterruptedException {
		insideAddUsersButton.click();
		Thread.sleep(2000);
	}

	public void readToast() {
		System.out.println(toast.getText());

	}

	public void deleteAddedUser() throws InterruptedException {
		searchBox.clear();
		String pattern = "\\((.*?)\\)";
		Pattern r = Pattern.compile(pattern);
		Matcher m = r.matcher(addedUser);
		if (m.find()) {
			searchBox.sendKeys(m.group(1));
			Thread.sleep(1000);
		}

		deleteUserButton.click();
		Thread.sleep(1000);
		conformationDeleteButton.click();
		Thread.sleep(7000);

	}
// Business mangers

	public void clickBusinessManagersIcon() throws InterruptedException {
		businessManagers.click();
		Thread.sleep(4000);
	}

	public void readBusinessManagersPageTitle() {
		System.out.println(businessManagersHeader.getText());
	}

	public void clickAddBusinessManagersButton() throws InterruptedException {
		outsideAddBusinessManagerButton.click();
		Thread.sleep(3000);

	}

	public void selectBusinessManagers() throws InterruptedException {
		selectBusinessManagersDropdown.click();
		Thread.sleep(1000);
		selectBusinessManagersDropdown.sendKeys(Keys.ARROW_DOWN);
		selectBusinessManagersDropdown.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		addedManager = selectedBusinessManager.getText();
		System.out.println(addedManager);
		insideAddUBusinessManagerButton.click();
		Thread.sleep(2000);
		System.out.println(toast.getText());
	}

	public void afterAddingManagers() throws InterruptedException {

		if (toast.getText().equals(message)) {

			cancleBusinessManagerButton.click();
			Thread.sleep(1000);
			System.out.println(toast.getText());

		} else {
			Thread.sleep(2000);
			System.out.println(toast.getText());
			searchBox.clear();
			searchBox.sendKeys(addedManager);
			Thread.sleep(1000);
			deleteManagerButton.click();
			Thread.sleep(1000);
			conformationDeleteButton.click();
			Thread.sleep(7000);

		}
	}

	public void clickCopyButton() throws InterruptedException {
		fiscalYear.click();
		Thread.sleep(1000);
		fiscalYear.sendKeys("2025");
		Thread.sleep(1000);
		fiscalYear.sendKeys(Keys.ARROW_DOWN);
		fiscalYear.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		outsideCopyButton.click();
		Thread.sleep(2000);

	}

	public void selectFiscalyears() throws InterruptedException {
		selectFromFiscalYearDropdown.click();
		Thread.sleep(1000);
		selectFromFiscalYearDropdown.clear();
		Thread.sleep(1000);
		selectFromFiscalYearDropdown.sendKeys("2023");
		Thread.sleep(1000);
		selectFromFiscalYearDropdown.sendKeys(Keys.ARROW_DOWN);
		selectFromFiscalYearDropdown.sendKeys(Keys.ENTER);
	}

	public void copy() throws InterruptedException {
		insideCopyButton.click();
		Thread.sleep(1000);
		confirmCopy.click();
		Thread.sleep(2000);
		System.out.println(toast.getText());

	}

//Target revenues

	public void clickTargetRevenuesIcon() throws InterruptedException {
		targetRevenueCategories.click();
		Thread.sleep(4000);
	}

	public void readTargetRevenuesPageTitle() {
		System.out.println(targetRevenueCategoriesHeader.getText());

	}

	public void clickAddTargetRevenuesButton() throws InterruptedException {
		outsideAddTargetRevenueButton.click();
		Thread.sleep(3000);

	}

	public void selectTargetRevenues() throws InterruptedException {
		selectTargetRevenueDropdown.click();
		Thread.sleep(1000);
		selectTargetRevenueDropdown.sendKeys(Keys.ARROW_DOWN);
		selectTargetRevenueDropdown.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		addedTargetRevenue = selectedTargetRevenue.getText();
		System.out.println(addedTargetRevenue);
		insideAddTargetRevenueButton.click();
		Thread.sleep(2000);
		System.out.println(toast.getText());
	}

	public void afterAddingTargetRevenues() throws InterruptedException {

		if (toast.getText().equals(message)) {
			cancleTargetRevenueButton.click();
			Thread.sleep(1000);
			System.out.println(toast.getText());
		} else {
			Thread.sleep(2000);
			System.out.println(toast.getText());
			searchBox.click();
			searchBox.sendKeys(addedTargetRevenue);
			Thread.sleep(1000);
			deleteTargetButton.click();
			Thread.sleep(1000);
			conformationDeleteButton.click();
			Thread.sleep(7000);

		}
	}
//Inflation Inputs

	public void clickInflationInputIcon() throws InterruptedException {
		inflationInputs.click();
		Thread.sleep(4000);
	}

	public void readInflationInputPageTitle() {
		System.out.println(inflationInputsHeader.getText());

	}

	public void clickAddInflationInputButton() throws InterruptedException {
		outsideAddInflationInputsButton.click();
		Thread.sleep(3000);

	}

	public void selectInflationInput() throws InterruptedException {
		selectInflationInputDropdown.click();
		Thread.sleep(1000);
		selectInflationInputDropdown.sendKeys(Keys.ARROW_DOWN);
		selectInflationInputDropdown.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		addedInflationInput = selectedInflationInput.getText();
		System.out.println(addedInflationInput);
		insideAddInflationInputsButton.click();
		Thread.sleep(2000);
		System.out.println(toast.getText());
	}

	public void afterAddingInflationInput() throws InterruptedException {

		if (toast.getText().equals(message)) {
			cancleInflationInputButton.click();
			Thread.sleep(1000);
			System.out.println(toast.getText());

		} else {
			Thread.sleep(3000);
			System.out.println(toast.getText());
			searchBox.click();
			searchBox.sendKeys(addedInflationInput);
			Thread.sleep(1000);
			deleteInflationButton.click();
			Thread.sleep(1000);
			conformationDeleteButton.click();
			Thread.sleep(7000);
		}
	}

//Process FTE
	public void clickProcessFTEIcon() throws InterruptedException {
		processFTE.click();
		Thread.sleep(4000);
	}

	public void readProcessFTEPageTitle() {
		System.out.println(processFTEHeader.getText());

	}

	public void clickAddProcessFTEButton() throws InterruptedException {
		outsideAddProcessFTEButton.click();
		Thread.sleep(3000);

	}

	public void selectProcessFTE() throws InterruptedException {
		selectProcessFTEDropdown.click();
		Thread.sleep(1000);
		selectProcessFTEDropdown.sendKeys(Keys.ARROW_DOWN);
		selectProcessFTEDropdown.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		addededProcessFTE = selectedProcessFTE.getText();
		System.out.println(addededProcessFTE);
		insideAddProcessFTEButton.click();
		Thread.sleep(2000);
		System.out.println(toast.getText());
	}

	public void afterAddingProcessFTE() throws InterruptedException {

		if (toast.getText().equals(message)) {
			cancleProcessFTEButton.click();
			Thread.sleep(1000);
			System.out.println(toast.getText());

		} else {
			Thread.sleep(3000);
			System.out.println(toast.getText());
			searchBox.click();
			String[] parts = addededProcessFTE.split(" -");
			if (parts.length >= 2) {
				String text = parts[0];
				System.out.println(text);
				searchBox.sendKeys(text);
				Thread.sleep(1000);
				deleteProcessFTEButton.click();
				Thread.sleep(1000);
				conformationDeleteButton.click();
				Thread.sleep(7000);
			}
		}
	}
//Carry over set aside

	public void clickCarryoverSetAsideIcon() throws InterruptedException {
		carryoverSetasides.click();
		Thread.sleep(4000);
	}

	public void readCarryoverSetAsidePageTitle() {
		System.out.println(carryoverSetasidesHeader.getText());

	}

	public void clickAddCarryoverSetAsideButton() throws InterruptedException {
		outsideAddCarryoverSetasideButton.click();
		Thread.sleep(3000);

	}

	public void selectCarryoverSetAside() throws InterruptedException {
		selectCarryoverSetasideDropdown.click();
		Thread.sleep(1000);
		selectCarryoverSetasideDropdown.sendKeys(Keys.ARROW_DOWN);
		selectCarryoverSetasideDropdown.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		addedCarryoverSetAside = selectedCarryoverSetAside.getText();
		System.out.println(addedCarryoverSetAside);
		insideAddCarryoverSetasideButton.click();
		Thread.sleep(2000);
		System.out.println(toast.getText());
	}

	public void afterAddingCarryoverSetAside() throws InterruptedException {

		if (toast.getText().equals(message)) {
			cancleCarryoverSetasideButton.click();
			Thread.sleep(1000);
			System.out.println(toast.getText());

		} else {
			Thread.sleep(3000);
			System.out.println(toast.getText());
			searchBox.click();
			searchBox.sendKeys(addedCarryoverSetAside);
			Thread.sleep(1000);
			deleteCarryOverButton.click();
			Thread.sleep(1000);
			conformationDeleteButton.click();
			Thread.sleep(7000);
		}
	}
//Miscellaneous adjustment

	public void clickMiscellaneousAdjustmentIcon() throws InterruptedException {
		miscellaneousAdjustment.click();
		Thread.sleep(4000);
	}

	public void readMiscellaneousAdjustmentPageTitle() {
		System.out.println(miscellaneousAdjustmentHeader.getText());

	}

	public void clickAddMiscellaneousAdjustmentButton() throws InterruptedException {
		outsideAddMiscellaneousAdjustmentButton.click();
		Thread.sleep(3000);

	}

	public void selectMiscellaneousAdjustment() throws InterruptedException {
		selectMiscellaneousAdjustmentDropdown.click();
		Thread.sleep(1000);
		selectMiscellaneousAdjustmentDropdown.sendKeys(Keys.ARROW_DOWN);
		selectMiscellaneousAdjustmentDropdown.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		selectMiscellaneousAdjustmentTypeDropdown.click();
		Thread.sleep(1000);
		selectMiscellaneousAdjustmentTypeDropdown.sendKeys(Keys.ARROW_DOWN);
		selectMiscellaneousAdjustmentTypeDropdown.sendKeys(Keys.ENTER);
		Thread.sleep(2000);

		addedMiscellaneousAdjustment = selectedMiscellaneousAdjustment.getText();
		System.out.println(addedMiscellaneousAdjustment);
		insideAddMiscellaneousAdjustmentButton.click();
		Thread.sleep(2000);
		System.out.println(toast.getText());
	}

	public void afterAddingMiscellaneousAdjustment() throws InterruptedException {

		if (toast.getText().equals(message)) {
			cancleMiscellaneousAdjustmentButton.click();
			Thread.sleep(1000);
			System.out.println(toast.getText());

		} else {
			Thread.sleep(3000);
			System.out.println(toast.getText());
			searchBox.click();
			String[] parts = addedMiscellaneousAdjustment.split(" -");
			if (parts.length >= 2) {
				String text = parts[0];
				System.out.println(text);
				searchBox.sendKeys(text);
				Thread.sleep(1000);
				deleteMiscellaneousButton.click();
				Thread.sleep(1000);
				conformationDeleteButton.click();
				Thread.sleep(7000);
			}
		}
	}

//Recoveries

	public void clickRecoveriesIcon() throws InterruptedException {
		recoveries.click();
		Thread.sleep(4000);
	}

	public void readRecoveriesPageTitle() {
		System.out.println(recoveriesHeader.getText());

	}

	public void clickAddRecoveriesButton() throws InterruptedException {
		fiscalYear.click();
		Thread.sleep(1000);
		fiscalYear.sendKeys("2025");
		Thread.sleep(1000);
		fiscalYear.sendKeys(Keys.ARROW_DOWN);
		fiscalYear.sendKeys(Keys.ENTER);
		Thread.sleep(3000);

		if (outsideAddInflationInputsButton.isDisplayed()) {
			outsideAddInflationInputsButton.click();
			Thread.sleep(3000);
		} else {
			System.out.println("Inflation is alredy added to this year");
			deleteRecoveriesButton.click();
			Thread.sleep(1000);
			conformationDeleteButton.click();
			Thread.sleep(7000);
			outsideAddInflationInputsButton.click();
			Thread.sleep(3000);

		}
	}

	public void addForecastAmount() throws InterruptedException {
		forecastAmount.click();
		Thread.sleep(1000);
		forecastAmount.clear();
		forecastAmount.sendKeys("200");
	}

	public void clickAddRecoveries() throws InterruptedException {
		insideAddRecoveriesButton.click();
		Thread.sleep(3000);
	}

	public void afterAddingRecovery() throws InterruptedException {
		System.out.println(toast.getText());
		Thread.sleep(1000);
		deleteRecoveriesButton.click();
		Thread.sleep(1000);
		conformationDeleteButton.click();
		Thread.sleep(7000);
	}

	public void recoveriesCopy() throws InterruptedException {
		deleteRecoveriesButton.click();
		Thread.sleep(1000);
		conformationDeleteButton.click();
		Thread.sleep(7000);
	}
//Allocation Categories

	public void clickAllocationCategoriesIcon() throws InterruptedException {
		allocationCategories.click();
		Thread.sleep(4000);
	}

	public void readAllocationCategoriesPageTitle() {
		System.out.println(allocationCategoriesHeader.getText());

	}

	public void clickAddAllocationCategoriesButton() throws InterruptedException {
		outsideAddAllocationCategoriesButton.click();
		Thread.sleep(3000);

	}

	public void fillAllocationCategoriesDetails() throws InterruptedException {
		selectAllocationCategoriesButton.click();
		Thread.sleep(1000);
		selectAllocationCategoriesButton.sendKeys(Keys.ARROW_DOWN);
		selectAllocationCategoriesButton.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		formulaName.sendKeys("Testing");
		formulaDescription.sendKeys("Testing purpose description");

	}

	public void clickAddAllocationButton() throws InterruptedException {
		insideAddAllocationCategoriesButton.click();
		Thread.sleep(3000);

	}

	public void readAllocationToast() throws InterruptedException {
		System.out.println(toast.getText());
		searchBox.sendKeys("testing");
		Thread.sleep(1000);
		deleteAllocationButton.click();
		Thread.sleep(1000);
		conformationDeleteButton.click();
		Thread.sleep(7000);
	}

//Inflation categories

	public void clickInflationCategoriesIcon() throws InterruptedException {
		inflationCategories.click();
		Thread.sleep(4000);
	}

	public void readInflationCategoriesPageTitle() {
		System.out.println(inflationCategoriesHeader.getText());

	}

	public void clickAddInflationCategoriesButton() throws InterruptedException {
		outsideAddInflationCategoriesButton.click();
		Thread.sleep(3000);

	}

	public void fillInflationCategoriesDetails() throws InterruptedException {
		selectInflationCategoryDropdown.click();
		Thread.sleep(1000);
		selectInflationCategoryDropdown.sendKeys(Keys.ARROW_DOWN);
		selectInflationCategoryDropdown.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		formulaName.sendKeys("Testing");
		formulaDescription.sendKeys("Testing purpose description");

	}

	public void clickAddInflationCategoryButton() throws InterruptedException {
		insideAddInflationCategoriesButton.click();
		Thread.sleep(3000);

	}

	public void readInflationToast() throws InterruptedException {
		System.out.println(toast.getText());
		searchBox.sendKeys("testing");
		Thread.sleep(1000);
		deleteInflationCategoryButton.click();
		Thread.sleep(1000);
		conformationDeleteButton.click();
		Thread.sleep(7000);
	}
//Lookups

	public void clickLookupTab() throws InterruptedException {
		lookupsLinkText.click();
		Thread.sleep(3000);
	}

	public void readLookupPageTitle() {
		System.out.println(lookupHeader.getText());

	}

	public void clickAddLookupButton() throws InterruptedException {
		addLookupButton.click();
		Thread.sleep(2000);

	}

	public void fillLookupDetails() throws InterruptedException {
		lookupType.sendKeys("Testing");
		lookupName.sendKeys("Testing Lookup");
		lookupDescription.sendKeys("Testing purpose description");

	}

	public void clickSaveLookupButton() throws InterruptedException {
		lookupSaveButton.click();
		Thread.sleep(3000);

	}

	public void readLookupToast() {
		System.out.println(toast.getText());
		searchBox.sendKeys("Testing");
	}

	public void clickLookupListButton() throws InterruptedException {
		lookupListButton.click();
		Thread.sleep(4000);
	}

	public void clickAddLookupValuesButton() throws InterruptedException {
		addLookupValuesButton.click();
		Thread.sleep(2000);
	}

	public void fillLookupValues() {
		lookupValue.sendKeys("Test");
		lookupValueCode.sendKeys("QA");
		lookupValueDisplayOrder.sendKeys("1");
		lookupValueDescription.sendKeys("Testing purpose");

	}

	public void clickLookupValueSaveButton() throws InterruptedException {
		lookupValueSaveButton.click();
		Thread.sleep(2000);
	}

	public void readLookupValueToastMessage() throws InterruptedException {

		System.out.println(toast.getText());
		Thread.sleep(1000);
//		lookupValueDeleteButton.click();
//		conformationDeleteButton.click();
//		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(3000);
		searchBox.sendKeys("Testing");
		Thread.sleep(2000);
		lookupDeleteButton.click();
		Thread.sleep(1000);
		conformationDeleteButton.click();
		Thread.sleep(7000);
	}
//Email templates
	
	public void clickEmailTemplateTab() throws InterruptedException {
		emailTemplateButton.click();
		Thread.sleep(5000);
	}
	
	public void readEmailTemplatePageTitle() {
		System.out.println(emailTemplateHeader.getText());
	}
	
	public void clickAddEmailButton() throws InterruptedException {
		addEmailButton.click();
		Thread.sleep(4000);
		
	}
	public void fillTemplateDetails() throws InterruptedException {
		
		templateName.sendKeys("Testing");
		templateSubject.sendKeys("Testing purpose");
		Thread.sleep(1000);
		
		emailBody.click();
		emailBody.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		emailBody.sendKeys("NA123");
		Thread.sleep(2000);
	}
	
	public void clickEmailSaveButton() throws InterruptedException {
		emailSaveButton.click();
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait1.until(ExpectedConditions.elementToBeClickable(emailTemplateButton));
		Thread.sleep(3000);
	}
	
	
	public void readTemplateToast() throws InterruptedException {
		System.out.println(toast.getText());
		Thread.sleep(2000);
		searchBox.sendKeys("Testing");
		Thread.sleep(1000);
		emailDeleteButton.click();
		Thread.sleep(1000);
		conformationDeleteButton.click();
		Thread.sleep(7000);
	}

//Settings
	
	public void clickSettingsTab() throws InterruptedException {
		SettingsButton.click();
		Thread.sleep(5000);
	}
	
	public void readSettingsPageTitle() {
		System.out.println(SettingsHeader.getText());
	}
	
	public void clickAddSettingsButton() throws InterruptedException {
		addSettingsButton.click();
		Thread.sleep(4000);
		
	}
	public void fillSettingsDetails() throws InterruptedException {
		
		SettingName.sendKeys("Testing");
		SettingCode.sendKeys("QA");
		SettingValue.sendKeys("2024");
		SettingDescription.sendKeys("Testing purpose");
		SettingValueDescription.sendKeys("Test 2024 ");
		Thread.sleep(1000);
			}
	
	public void clickSettingsSaveButton() throws InterruptedException {
		SettingSaveButton.click();
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait1.until(ExpectedConditions.elementToBeClickable(emailTemplateButton));
		Thread.sleep(3000);
	}
	
	
	public void readSettingsToast() throws InterruptedException {
		System.out.println(toast.getText());
		Thread.sleep(2000);
		searchBox.sendKeys("Testing");
		Thread.sleep(1000);
		SettingDeleteButton.click();
		Thread.sleep(1000);
		conformationDeleteButton.click();
		Thread.sleep(7000);
	}
	
//Profiles
	
	public void clickProfilesTab() throws InterruptedException {
		ProfilesButton.click();
		Thread.sleep(5000);
	}
	
	public void readProfilesPageTitle() {
		System.out.println(ProfilesHeader.getText());
	}
	
	public void clickAddProfilesButton() throws InterruptedException {
		addProfilesButton.click();
		Thread.sleep(4000);
		
	}
	public void fillProfilesDetails() throws InterruptedException {
		
		ProfilesName.sendKeys("Testing");
		ProfileDescription.sendKeys("Testing purpose");
		Thread.sleep(1000);
			}
	public void clickProfileSaveButton() throws InterruptedException {
		profileSaveButton.click();
		Thread.sleep(3000);
	}
	public void readProfileToast() {
		System.out.println(toast.getText());
	}
	
	public void clickProfileValueButton() throws InterruptedException {
		searchBox.sendKeys("Testing");
		Thread.sleep(1000);
		goToProfileValueButton.click();
		Thread.sleep(3000);
	}
	public void readProfileValuesHeader() {
		System.out.println(ProfilesValueHeader.getText());
	}
	public void clickAddProfileValues() throws InterruptedException {
		addProfileValueButton.click();
		Thread.sleep(2000);
	}
	public void fillProfileValueDetails() {
		ProfileLevelDropdown.click();
		ProfileLevelDropdown.sendKeys(Keys.ARROW_DOWN);
		ProfileLevelDropdown.sendKeys(Keys.ENTER);
		
		ProfileLevelValueDropdown.click();
		ProfileLevelValueDropdown.sendKeys(Keys.ARROW_DOWN);
		ProfileLevelValueDropdown.sendKeys(Keys.ENTER);
		
		profileValue.sendKeys("QA");
		profileDescription.sendKeys("Testing purpose");
		
	}
	public void clickProfileValuesSaveButton() throws InterruptedException {
		saveProfileValueButton.click();
		Thread.sleep(4000);
	}
	public void readProfileValueToast() throws InterruptedException {
		System.out.println(toast.getText());
		Thread.sleep(1000);
		ProfilesButton.click();
		Thread.sleep(4000);
		searchBox.sendKeys("Testing");
		Thread.sleep(1000);
		deleteProfileButton.click();
		Thread.sleep(1000);
		conformationDeleteButton.click();
		Thread.sleep(7000);
	}
	
//Distribution
	
	public void clickDistributionTab() throws InterruptedException {
		DistributionButton.click();
		Thread.sleep(4000);
	}
	
	public void readDistributionPageTitle() {
		System.out.println(DistributionHeader.getText());
	}
	
	public void clickAddDistributionButton() throws InterruptedException {
		addDistributionButton.click();
		Thread.sleep(3000);
		
	}
	public void fillDistributionDetails() {
		groupName.sendKeys("Testing");
		DistributionDescription.sendKeys("Testing purpose");
			}
	
	public void clickDistributionSaveButton() throws InterruptedException {
		DistributionSaveButton.click();
		Thread.sleep(3000);
	}
	public void readDistributionToast() {
		System.out.println(toast.getText());
	}
	
	public void clickDistributionDetailsButton() throws InterruptedException {
		searchBox.sendKeys("Testing");
		Thread.sleep(1000);
		goToDistributionDetailsButton.click();
		Thread.sleep(3000);
	}
	public void readDistributionDetailssHeader() {
		System.out.println(DistributionDetailsHeader.getText());
	}
	public void clickAddDistributionDetails() throws InterruptedException {
		addDistributionDetailsButton.click();
		Thread.sleep(2000);
	}
	public void selectDistributionDetailsUser() {
		userDropdown.click();
		userDropdown.sendKeys(Keys.ARROW_DOWN);
		userDropdown.sendKeys(Keys.ENTER);
	}
	public void clickDistributionDetailsSaveButton() throws InterruptedException {
		saveDistributionDetailsButton.click();
		Thread.sleep(4000);
	}
	public void readDistributionDetailsToast() throws InterruptedException {
		System.out.println(toast.getText());
		Thread.sleep(1000);
		DistributionButton.click();
		Thread.sleep(4000);
		searchBox.sendKeys("Testing");
		Thread.sleep(1000);
		deleteDistributionDetailsButton.click();
		Thread.sleep(1000);
		conformationDeleteButton.click();
		Thread.sleep(7000);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
