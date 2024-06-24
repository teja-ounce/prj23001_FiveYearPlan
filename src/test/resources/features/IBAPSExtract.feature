Feature: Title of your feature
  I want to use this template for my feature file

  @IBAPSExtract
  Scenario Outline: Verify IBAPSExtract
    Given User launch URL
    When User enters username and password
    And User clicks on login button
    Then Dashboard should display
    When User clicks on five year plan button
    And User click on IBAPS Extract
    Then IBAPS Extract page will display
    When User can select fiscal year <selectFiscalYear>
    And User click on generate IBAPS extract button
    Then Extract toast message will display
    Then User will logout

    Examples: 
      | selectFiscalYear |
      |             2024 |
