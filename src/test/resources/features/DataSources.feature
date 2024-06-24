Feature: Testing data sources tabs

  Background: 
    Given User launch URL
    When User enters username and password
    And User clicks on login button
    Then Dashboard should display
    When User clicks on five year plan button
    And User click on data sources

  @UFNetActivity
  Scenario: Check upload and validation of UF net activity tab files
    Then User on UF net activity tab
    When User clicks on upload button
    And User upload word document
    Then Document should not accept
    When User upload excel file
    Then Documnet will upload succesfully
    When User validate UF net activity document
    Then User get logout

  @Collections
  Scenario: Check upload and validation of Collections tab files
    Then User on Collections tab
    When User clicks on collections upload button
    And User upload word document
    Then Document should not accept
    When User upload excel file
    Then Documnet will upload succesfully
    When User validate uploaded document
    Then User get logout

  @Rent
  Scenario: Check upload and validation of rent tab files
    Then User on rent tab
    When User clicks on upload button
    And User upload word document
    Then Document should not accept
    When User upload excel file
    Then Documnet will upload succesfully
    When User validate uploaded document
    Then User get logout

  @WCF
  Scenario: Check upload and validation of wcf tab files
    Then User on wcf tab
    When User clicks on upload button
    And User upload word document
    Then Document should not accept
    When User upload excel file
    Then Documnet will upload succesfully
    When User validate uploaded document
    Then User get logout

  @Actuals
  Scenario: Check upload and validation of actuals tab files
    Then User on actuals tab
    When User clicks on upload button
    And User upload word document
    Then Document should not accept
    When User upload excel file
    Then Documnet will upload succesfully
    When User validate uploaded document
    Then User get logout

  @ConsumptionModel
  Scenario: Check upload and validation of consumption model tab files
    Then User on consumption model tab
    When User clicks on upload button
    And User upload word document
    Then Document should not accept
    When User upload excel file
    Then Documnet will upload succesfully
    When User validate uploaded document
    Then User get logout

  @FTE
  Scenario: Check upload and validation of fte tab
    Then User on fte tab
    When User clicks on upload button
    And User upload word document
    Then Document should not accept
    When User upload excel file
    Then Documnet will upload succesfully
    When User validate uploaded document
    Then User get logout

  @ProcessCostAllocation
  Scenario: Check upload and validation of process cost allocation tab
    Then User on process cost allocation tab
    When User clicks on process cost allocation upload button
    And User upload word document
    Then Document should not accept
    When User upload excel file
    Then Documnet will upload succesfully
    When User validate uploaded document
    Then User get logout

  @ObligationExtract
  Scenario: Check upload and validation of obligations extract tab
    Then User on obligations extract tab
    When User clicks on obligations extract upload button
    And User upload word document
    Then Document should not accept
    When User upload excel file
    Then Document should not accept
    And Close file upload tab
    Then User get logout

  @MDUFAUnearnedRevenue
  Scenario: Check upload and validation of MDUFA unearned revenue extract tab
    Then User on MDUFAUnearnedRevenue tab
    When User clicks on mdufa upload button
    And User upload word document
    Then Document should not accept
    When User upload excel file
    Then Documnet will upload succesfully
    When User validate MDUFA file document
    Then User get logout
