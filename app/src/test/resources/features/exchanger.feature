Feature: Exchange Operations
  As a user
  I want to convert Euro to Yen

  Scenario: Convert Euro to Yen
    Given I have a currency converter
    When I convert euros to yen
    Then the result should be 2127.72