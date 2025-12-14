Feature: Exchange Operations
  As a user
  I want to convert Yen to Euro and vice versa

  Scenario: Convert Euro to Yen
    Given I Euro to Yen exchange rate is 177.31
    When I input 12
    Then the result should be 2127.72

  Scenario: Convert Yen to Euro
    Given I Yen to Euro exchange rate is 0.0056
    When I input 3005
    Then the result should be 16.83