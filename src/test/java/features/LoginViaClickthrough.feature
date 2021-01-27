Feature: Doctor UI Regression test for Stage environment
  Scenario: Validate doctor is redirected to the compose page after login to the application
    Given user is located in the stage environment
    When user insert the doctor data xml
    And user click in the go button
    Then user should be redirected to compose page
