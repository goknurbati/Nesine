Feature: Kupondas

  Background:
    Given User launch application
    When User click login button
    Then User enter username as "goknurbati"
    And User enter password "nesine123"
    And  User click login

  Scenario: Go to Kupondas and play
    When User click kupondas button
    And User click all shares button
    And User click play now button
    Then verify first activity name as "Juventus FC - Diriangen FC"
    And verify second activity name as "FC Bgu Minsk - Minskin Kupondas fefff"


