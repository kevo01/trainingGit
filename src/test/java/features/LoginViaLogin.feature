Feature: Doctor UI Regression test for Stage environment on UX2
  Scenario: Validate doctor is redirected to the select location page after login to the application
    Given user is located in the login page
    When user insert the user
    And user insert the password
    And user click in the login button
    Then user should be redirected to select patient page
