Feature: Login Feature

  Scenario: Valid Login
    Given user launches the application
    When user enters username "influencer@test.com" and password "Test123!"
    And clicks on login button
    Then user should be navigated to home page