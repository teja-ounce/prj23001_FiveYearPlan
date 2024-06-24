Feature: Testing dashboard functionality

  Scenario Outline: Check all buttons and links on dashboard
    Given User launch URL
    When User enters username and password
    And User clicks on login button
    Then Dashboard should display
    When User clicks on five year plan button
    And User click on consolidated statement button
    Then User navigate to consolidate statement
    And User validate consolidated statement
    When User click on allocation plan button
    Then user navigate to allocation plan
    And User validate allocation plan
    Then Select logout from five year plan app options
    Then User must logout
