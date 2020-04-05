Feature: Login

  Scenario: Successful Login with Valid Credentials
    Given User launch application
    When User click login button
    Then User enter username as "goknurbati"
    And User enter password "nesine123"
    And  User click login
