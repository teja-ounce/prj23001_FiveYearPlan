package com.flc.stepDefinition;

import org.openqa.selenium.WebDriver;

import com.flc.pageObject.ConfigurationsObject;
import com.flc.utils.DriverFactory;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ConfigurationsStep {

	private WebDriver driver = DriverFactory.getDriver();
	private ConfigurationsObject configurations = new ConfigurationsObject(driver);

	@When("User click on configurations")
	public void user_click_on_configurations() throws InterruptedException {
		configurations.clickConfigurationsTab();
	}

	@When("User clicks on center icon")
	public void user_clicks_on_center_icon() throws InterruptedException {
		configurations.clickCenterIcon();

	}

	@Then("User fee center should display")
	public void user_fee_center_should_display() {
		configurations.readCentersPageTitle();
	}

	@When("User click on add center button")
	public void user_click_on_add_center_button() throws InterruptedException {
		configurations.clickAddCentersButton();
	}

	@When("User select center if centers are avaliable")
	public void user_select_center_if_centers_are_avaliable() throws InterruptedException {
		configurations.selectCenter();
	}

	@Then("Toast message will display")
	public void Then_Toast_message_will_display() throws InterruptedException {
		configurations.afterAdd();

	}

	@When("User clicks on users icon")
	public void user_clicks_on_users_icon() throws InterruptedException {
		configurations.clickUsersButton();
	}

	@Then("Users page should display")
	public void users_page_should_display() {
		configurations.readUsersPageTitle();

	}

	@When("User click on add user button")
	public void user_click_on_add_user_button() throws InterruptedException {
		configurations.clickAddUserButton();
	}

	@When("User can select the user")
	public void user_can_select_the_user() throws InterruptedException {
		configurations.selectUserFromDropdown();
	}

	@When("Click on user add button")
	public void click_on_user_add_button() throws InterruptedException {
		configurations.clickUserAddButton();
	}

	@Then("Toast message should display")
	public void toast_message_should_display() {
		configurations.readToast();
	}

	@And("User delete addded user")
	public void User_delete_addded_user() throws InterruptedException {
		configurations.deleteAddedUser();

	}
//Business managers

	@When("User clicks on busniess managers icon")
	public void user_clicks_on_busniess_managers_icon() throws InterruptedException {
		configurations.clickBusinessManagersIcon();
	}

	@Then("Business managers tab should display")
	public void business_managers_tab_should_display() {
		configurations.readBusinessManagersPageTitle();
	}

	@When("User clicks on add business manager button")
	public void user_clicks_on_add_business_manager_button() throws InterruptedException {
		configurations.clickAddBusinessManagersButton();
	}

	@When("User select business manager if they avaliable")
	public void user_select_business_manager_if_they_avaliable() throws InterruptedException {
		configurations.selectBusinessManagers();
	}

	@Then("Business manager Toast message will display")
	public void Business_manager_Toast_message_will_display() throws InterruptedException {
		configurations.afterAddingManagers();
	}

	@When("User clicks on copy button")
	public void user_clicks_on_copy_button() throws InterruptedException {
		configurations.clickCopyButton();
	}

	@When("User select fiscal year")
	public void user_select_fiscal_year() throws InterruptedException {
		configurations.selectFiscalyears();
	}

	@When("User click on copy button")
	public void user_click_on_copy_button() throws InterruptedException {
		configurations.copy();
	}

	@Then("Copy toast message will display")
	public void copy_toast_message_will_display() {
		configurations.readToast();
	}
//Target revenue 

	@When("User click on target revenue categories icon")
	public void user_click_on_target_revenue_categories_icon() throws InterruptedException {
		configurations.clickTargetRevenuesIcon();
	}

	@Then("Target revenue categories tab should display")
	public void target_revenue_categories_tab_should_display() {
		configurations.readTargetRevenuesPageTitle();
	}

	@When("User clicks on add revenue categories button")
	public void user_clicks_on_add_revenue_categories_button() throws InterruptedException {
		configurations.clickAddTargetRevenuesButton();
	}

	@When("Select Target revenue category if they avalibale")
	public void select_target_revenue_category_if_they_avalibale() throws InterruptedException {
		configurations.selectTargetRevenues();
	}

	@Then("Target revenue Toast message will display")
	public void Target_revenue_Toast_message_will_display() throws InterruptedException {
		configurations.afterAddingTargetRevenues();
	}

	@When("User click on inflation inputs icon")
	public void user_click_on_inflation_inputs_icon() throws InterruptedException {
		configurations.clickInflationInputIcon();
	}

	@Then("inflation inputs tab should display")
	public void inflation_inputs_tab_should_display() {
		configurations.readInflationInputPageTitle();
	}

	@When("User clicks on add inflation inputs button")
	public void user_clicks_on_add_inflation_inputs_button() throws InterruptedException {
		configurations.clickAddInflationInputButton();
	}

	@When("Select inflation inputs if they avalibale")
	public void select_inflation_inputs_if_they_avalibale() throws InterruptedException {
		configurations.selectInflationInput();
	}

	@Then("inflation inputs toast message will display")
	public void inflation_inputs_toast_message_will_display() throws InterruptedException {
		configurations.afterAddingInflationInput();
	}

	@When("User click on process ftes icon")
	public void user_click_on_process_ftes_icon() throws InterruptedException {
		configurations.clickProcessFTEIcon();
	}

	@Then("process ftes tab should display")
	public void process_ftes_tab_should_display() {
		configurations.readProcessFTEPageTitle();
	}

	@When("User clicks on add process ftes button")
	public void user_clicks_on_add_process_ftes_button() throws InterruptedException {
		configurations.clickAddProcessFTEButton();
	}

	@When("Select process ftes if they avalibale")
	public void select_process_ftes_if_they_avalibale() throws InterruptedException {
		configurations.selectProcessFTE();
	}

	@Then("process ftes toast message will display")
	public void process_ftes_toast_message_will_display() throws InterruptedException {
		configurations.afterAddingProcessFTE();
	}
//Carry over set aside 

	@When("User click on carryover setaside icon")
	public void user_click_on_carryover_setaside_icon() throws InterruptedException {
		configurations.clickCarryoverSetAsideIcon();
	}

	@Then("carryover setaside tab should display")
	public void carryover_setaside_tab_should_display() {
		configurations.readCarryoverSetAsidePageTitle();
	}

	@When("User clicks on add carryover setaside button")
	public void user_clicks_on_add_carryover_setaside_button() throws InterruptedException {
		configurations.clickAddCarryoverSetAsideButton();
	}

	@When("Select carryover setaside if they avalibale")
	public void select_carryover_setaside_if_they_avalibale() throws InterruptedException {
		configurations.selectCarryoverSetAside();
	}

	@Then("carryover setaside toast message will display")
	public void carryover_setaside_toast_message_will_display() throws InterruptedException {
		configurations.afterAddingCarryoverSetAside();
	}
//Miscellaneous adjustment

	@When("User click on miscellaneous adjustment icon")
	public void user_click_on_miscellaneous_adjustment_icon() throws InterruptedException {
		configurations.clickMiscellaneousAdjustmentIcon();
	}

	@Then("miscellaneous adjustment tab should display")
	public void miscellaneous_adjustment_tab_should_display() {
		configurations.readMiscellaneousAdjustmentPageTitle();
	}

	@When("User clicks on add miscellaneous adjustment button")
	public void user_clicks_on_add_miscellaneous_adjustment_button() throws InterruptedException {
		configurations.clickAddMiscellaneousAdjustmentButton();
	}

	@When("Select miscellaneous adjustment and type if they avalibale")
	public void select_miscellaneous_adjustment_if_they_avalibale() throws InterruptedException {
		configurations.selectMiscellaneousAdjustment();
	}

	@Then("miscellaneous adjustment toast message will display")
	public void miscellaneous_adjustment_toast_message_will_display() throws InterruptedException {
		configurations.afterAddingMiscellaneousAdjustment();
	}

//Recoveries

	@When("User click on recoveries icon")
	public void user_click_on_recoveries_icon() throws InterruptedException {
		configurations.clickRecoveriesIcon();
	}

	@Then("recoveries tab should display")
	public void recoveries_tab_should_display() {
		configurations.readRecoveriesPageTitle();
	}

	@When("User clicks on add recoveries button")
	public void user_clicks_on_add_recoveries_button() throws InterruptedException {
		configurations.clickAddRecoveriesButton();
	}

	@When("user enter forecast amount")
	public void user_enter_forecast_amount() throws InterruptedException {
		configurations.addForecastAmount();
	}

	@When("User clicks on recoveries add button")
	public void user_clicks_on_recoveries_add_button() throws InterruptedException {
		configurations.clickAddRecoveries();
	}

	@Then("recoveries toast message will display")
	public void recoveries_toast_message_will_display() throws InterruptedException {
		configurations.afterAddingRecovery();
	}

	@Then("Recoveries Copy toast message will display")
	public void Recoveries_Copy_toast_message_will_display() throws InterruptedException {
		configurations.recoveriesCopy();
	}
//Allocation categories

	@When("User click on allocation categories icon")
	public void user_click_on_allocation_categories_icon() throws InterruptedException {
		configurations.clickAllocationCategoriesIcon();
	}

	@Then("allocation categories tab should display")
	public void allocation_categories_tab_should_display() {
		configurations.readAllocationCategoriesPageTitle();
	}

	@When("User clicks on add allocation categories button")
	public void user_clicks_on_add_allocation_categories_button() throws InterruptedException {
		configurations.clickAddAllocationCategoriesButton();
	}

	@When("User fill details in allocation categories")
	public void user_fill_details_in_allocation_categories() throws InterruptedException {
		configurations.fillAllocationCategoriesDetails();
	}

	@When("User clicks on allocation categories add button")
	public void user_clicks_on_allocation_categories_add_button() throws InterruptedException {
		configurations.clickAddAllocationButton();
	}

	@Then("allocation categories toast message will display")
	public void allocation_categories_toast_message_will_display() throws InterruptedException {
		configurations.readAllocationToast();
	}

//Inflation Categories

	@When("User click on inflation categories icon")
	public void user_click_on_inflation_categories_icon() throws InterruptedException {
		configurations.clickInflationCategoriesIcon();
	}

	@Then("inflation categories tab should display")
	public void inflation_categories_tab_should_display() {
		configurations.readInflationCategoriesPageTitle();
	}

	@When("User clicks on add inflation categories button")
	public void user_clicks_on_add_inflation_categories_button() throws InterruptedException {
		configurations.clickAddInflationCategoriesButton();
	}

	@When("User fill details in inflation categories")
	public void user_fill_details_in_inflation_categories() throws InterruptedException {
		configurations.fillInflationCategoriesDetails();
	}

	@When("User clicks on inflation categories add button")
	public void user_clicks_on_inflation_categories_add_button() throws InterruptedException {
		configurations.clickAddInflationCategoryButton();
	}

	@Then("inflation categories toast message will display")
	public void inflation_categories_toast_message_will_display() throws InterruptedException {
		configurations.readInflationToast();
	}

//Lookup management
	@When("User clicks on lookups tab")
	public void user_clicks_on_lookups_tab() throws InterruptedException {
		configurations.clickLookupTab();
	}

	@Then("Lookups managemet tab should display")
	public void lookups_managemet_tab_should_display() {
		configurations.readLookupPageTitle();
	}

	@When("User clicks on add lookup button")
	public void user_clicks_on_add_lookup_button() throws InterruptedException {
		configurations.clickAddLookupButton();
	}

	@When("user fill all lookup details")
	public void user_fill_all_lookup_details() throws InterruptedException {
		configurations.fillLookupDetails();
	}

	@When("Click on lookup save button")
	public void click_on_lookup_save_button() throws InterruptedException {
		configurations.clickSaveLookupButton();
	}

	@Then("toast add lookup toast message will display")
	public void toast_add_lookup_toast_message_will_display() {
		configurations.readLookupToast();
	}

	@When("User click on lookup list button")
	public void user_click_on_lookup_list_button() throws InterruptedException {
		configurations.clickLookupListButton();
	}

	@When("click on add lookup values button")
	public void click_on_add_lookup_values_button() throws InterruptedException {
		configurations.clickAddLookupValuesButton();
	}

	@When("User fill all lookup values")
	public void user_fill_all_lookup_values() {
		configurations.fillLookupValues();
	}

	@And("Click on lookup values save button")
	public void Click_on_lookup_values_save_button() throws InterruptedException {
		configurations.clickLookupValueSaveButton();
	}

	@Then("lookup value toast message will display")
	public void lookup_value_toast_message_will_display() throws InterruptedException {
		configurations.readLookupValueToastMessage();
	}

//Email Templates

	@When("User click on email template tab")
	public void user_click_on_email_template_tab() throws InterruptedException {
		configurations.clickEmailTemplateTab();
	}

	@Then("Email templates tab should display")
	public void email_templates_tab_should_display() {
		configurations.readEmailTemplatePageTitle();
	}

	@When("User clicks on add template button")
	public void user_clicks_on_add_template_button() throws InterruptedException {
		configurations.clickAddEmailButton();
	}

	@When("Fill template details")
	public void fill_template_details() throws InterruptedException {
		configurations.fillTemplateDetails();
	}

	@When("Click on template save button")
	public void click_on_template_save_button() throws InterruptedException {
		configurations.clickEmailSaveButton();
	}

	@Then("temaplate added toast message will display")
	public void temaplate_added_toast_message_will_display() throws InterruptedException {
		configurations.readTemplateToast();
	}

//Settings
	@When("User click on settings tab")
	public void user_click_on_settings_tab() throws InterruptedException {
		configurations.clickSettingsTab();
	}

	@Then("Settings tab should display")
	public void settings_tab_should_display() {
		configurations.readSettingsPageTitle();
	}

	@When("User clicks on add Settings button")
	public void user_clicks_on_add_settings_button() throws InterruptedException {
		configurations.clickAddSettingsButton();
	}

	@When("Fill settings details")
	public void fill_settings_details() throws InterruptedException {
		configurations.fillSettingsDetails();
	}

	@When("Click on settings save button")
	public void click_on_settings_save_button() throws InterruptedException {
		configurations.clickSettingsSaveButton();
	}

	@Then("settings added toast message will display")
	public void settings_added_toast_message_will_display() throws InterruptedException {
		configurations.readSettingsToast();
	}

//profiles
	@When("User click on profiles tab")
	public void user_click_on_profiles_tab() throws InterruptedException {
		configurations.clickProfilesTab();
	}

	@Then("profiles tab should display")
	public void profiles_tab_should_display() {
		configurations.readProfilesPageTitle();
	}

	@When("User clicks on add profiles button")
	public void user_clicks_on_add_profiles_button() throws InterruptedException {
		configurations.clickAddProfilesButton();
	}

	@When("Fill profiles details")
	public void fill_profiles_details() throws InterruptedException {
		configurations.fillProfilesDetails();
	}

	@When("Click on profiles save button")
	public void click_on_profiles_save_button() throws InterruptedException {
		configurations.clickProfileSaveButton();
	}

	@Then("profiles added toast message will display")
	public void profiles_added_toast_message_will_display() {
		configurations.readProfileToast();
	}

	@When("User clicks on profile value button")
	public void user_clicks_on_profile_value_button() throws InterruptedException {
		configurations.clickProfileValueButton();
	}

	@Then("Profile values page will display")
	public void profile_values_page_will_display() {
		configurations.readProfileValuesHeader();
	}

	@When("User click on add new profile values")
	public void user_click_on_add_new_profile_values() throws InterruptedException {
		configurations.clickAddProfileValues();
	}

	@When("Fill all profile values details")
	public void fill_all_profile_values_details() {
		configurations.fillProfileValueDetails();
	}

	@When("Click on save profile values")
	public void click_on_save_profile_values() throws InterruptedException {
		configurations.clickProfileValuesSaveButton();
	}

	@Then("Profile values toast message will display")
	public void profile_values_toast_message_will_display() throws InterruptedException {
		configurations.readProfileValueToast();
	}
//Distribution

	@When("User click on distribution tab")
	public void user_click_on_distribution_tab() throws InterruptedException {
		configurations.clickDistributionTab();
	}

	@Then("distribution tab should display")
	public void distribution_tab_should_display() {
		configurations.readDistributionPageTitle();
	}

	@When("User clicks on add distribution button")
	public void user_clicks_on_add_distribution_button() throws InterruptedException {
		configurations.clickAddDistributionButton();
	}

	@When("Fill distribution details")
	public void fill_distribution_details()  {
		configurations.fillDistributionDetails();
	}

	@When("Click on distribution save button")
	public void click_on_distribution_save_button() throws InterruptedException {
		configurations.clickDistributionSaveButton();
	}

	@Then("distribution added toast message will display")
	public void distribution_added_toast_message_will_display() {
		configurations.readDistributionToast();
	}

	@When("User clicks on distribution users button")
	public void user_clicks_on_distribution_users_button() throws InterruptedException {
		configurations.clickDistributionDetailsButton();
	}

	@Then("distribution users page will display")
	public void distribution_users_page_will_display() {
		configurations.readDistributionDetailssHeader();
	}

	@When("User click on add new distribution details button")
	public void user_click_on_add_new_distribution_details_button() throws InterruptedException {
		configurations.clickAddDistributionDetails();
	}

	@When("select distribution user")
	public void select_distribution_user() {
		configurations.selectDistributionDetailsUser();
	}

	@When("Click on save distribution user")
	public void click_on_save_distribution_user() throws InterruptedException {
		configurations.clickDistributionDetailsSaveButton();
	}

	@Then("distribution user toast message will display")
	public void distribution_user_toast_message_will_display() throws InterruptedException {
		configurations.readDistributionDetailsToast();
	}

}
