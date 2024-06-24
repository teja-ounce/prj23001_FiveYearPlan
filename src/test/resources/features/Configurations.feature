Feature: Testing configurations tabs

  Background: 
    Given User launch URL
    When User enters username and password
    And User clicks on login button
    Then Dashboard should display
    When User clicks on five year plan button
    And User click on configurations

  @Centers
  Scenario: Verify centers
    When User clicks on center icon
    Then User fee center should display
    When User click on add center button
    And User select center if centers are avaliable
    Then Toast message will display
    When User clicks on users icon
    Then Users page should display
    When User click on add user button
    And User can select the user
    And Click on user add button
    Then Toast message should display
    And User delete addded user
    Then User will logout

  @BusinessManagers
  Scenario: Verify business managers
    When User clicks on busniess managers icon
    Then Business managers tab should display
    When User clicks on add business manager button
    And User select business manager if they avaliable
    Then Business manager Toast message will display
    When User clicks on copy button
    And User select fiscal year
    And User click on copy button
    Then Copy toast message will display
    Then User will logout

  @TargetRevenue
  Scenario: Verify target reveneue categories
    When User click on target revenue categories icon
    Then Target revenue categories tab should display
    When User clicks on add revenue categories button
    And Select Target revenue category if they avalibale
    Then Target revenue Toast message will display
    When User clicks on copy button
    And User select fiscal year
    And User click on copy button
    Then Copy toast message will display
    Then User will logout

  @InflationInputs
  Scenario: Verify inflation inputs
    When User click on inflation inputs icon
    Then inflation inputs tab should display
    When User clicks on add inflation inputs button
    And Select inflation inputs if they avalibale
    Then inflation inputs toast message will display
    When User clicks on copy button
    And User select fiscal year
    And User click on copy button
    Then Copy toast message will display
    Then User will logout

  @ProcessFTE
  Scenario: Verify process ftes
    When User click on process ftes icon
    Then process ftes tab should display
    When User clicks on add process ftes button
    And Select process ftes if they avalibale
    Then process ftes toast message will display
    When User clicks on copy button
    And User select fiscal year
    And User click on copy button
    Then Copy toast message will display
    Then User will logout

  @CarryoverSetAside
  Scenario: Verify carryover setaside
    When User click on carryover setaside icon
    Then carryover setaside tab should display
    When User clicks on add carryover setaside button
    And Select carryover setaside if they avalibale
    Then carryover setaside toast message will display
    When User clicks on copy button
    And User select fiscal year
    And User click on copy button
    Then Copy toast message will display
    Then User will logout

  @MiscellaneousAdjustment
  Scenario: Verify miscellaneous adjustment
    When User click on miscellaneous adjustment icon
    Then miscellaneous adjustment tab should display
    When User clicks on add miscellaneous adjustment button
    And Select miscellaneous adjustment and type if they avalibale
    Then miscellaneous adjustment toast message will display
    When User clicks on copy button
    And User select fiscal year
    And User click on copy button
    Then Copy toast message will display
    Then User will logout

  @Recoveries
  Scenario: Verify recoveries
    When User click on recoveries icon
    Then recoveries tab should display
    When User clicks on add recoveries button
    And user enter forecast amount
    And User clicks on recoveries add button
    Then recoveries toast message will display
    When User clicks on copy button
    And User select fiscal year
    And User click on copy button
    Then Recoveries Copy toast message will display
    Then User will logout

  @AllocationCategories
  Scenario: Verify allocation categories
    When User click on allocation categories icon
    Then allocation categories tab should display
    When User clicks on add allocation categories button
    And User fill details in allocation categories
    And User clicks on allocation categories add button
    Then allocation categories toast message will display
    When User clicks on copy button
    And User select fiscal year
    And User click on copy button
    Then Copy toast message will display
    Then User will logout

  @InflationCategories
  Scenario: Verify inflation categories
    When User click on inflation categories icon
    Then inflation categories tab should display
    When User clicks on add inflation categories button
    And User fill details in inflation categories
    And User clicks on inflation categories add button
    Then inflation categories toast message will display
    When User clicks on copy button
    And User select fiscal year
    And User click on copy button
    Then Copy toast message will display
    Then User will logout

  @LookupManagement
  Scenario: verify lookup management
    When User clicks on lookups tab
    Then Lookups managemet tab should display
    When User clicks on add lookup button
    And user fill all lookup details
    And Click on lookup save button
    Then toast add lookup toast message will display
    When User click on lookup list button
    And click on add lookup values button
    And User fill all lookup values
    And Click on lookup values save button
    Then lookup value toast message will display
    Then User will logout

  @EmailTemplate
  Scenario: verify email template
    When User click on email template tab
    Then Email templates tab should display
    When User clicks on add template button
    And Fill template details
    And Click on template save button
    Then temaplate added toast message will display
    Then User will logout

  @Settings
  Scenario: Verify settings
    When User click on settings tab
    Then Settings tab should display
    When User clicks on add Settings button
    And Fill settings details
    And Click on settings save button
    Then settings added toast message will display
    Then User will logout
    
   @Profiles
   Scenario: verify profiles
   When User click on profiles tab
    Then profiles tab should display
    When User clicks on add profiles button
    And Fill profiles details
    And Click on profiles save button
    Then profiles added toast message will display
    When User clicks on profile value button
    Then Profile values page will display
    When User click on add new profile values
    And Fill all profile values details
    And Click on save profile values
    Then Profile values toast message will display
    Then User will logout

 @Distribution
   Scenario: verify Distribution
   When User click on distribution tab
    Then distribution tab should display
    When User clicks on add distribution button
    And Fill distribution details
    And Click on distribution save button
    Then distribution added toast message will display
    When User clicks on distribution users button
    Then distribution users page will display
    When User click on add new distribution details button
    And select distribution user
    And Click on save distribution user
    Then distribution user toast message will display
    Then User will logout








