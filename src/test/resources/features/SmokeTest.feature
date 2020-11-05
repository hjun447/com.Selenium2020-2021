@smoke_test
Feature: Smoke test

  Background: Open login page and login as store manager
    Given User is on the login page
    Then user logs in as store manager

  Scenario: Verify dashboard page
    And user verifies correct page sub title

  Scenario: Verify Manage Dashboards page
    And user navigates to "Dashboard" then to "Manage Dashboards"
    Then user verifies correct page sub title

  Scenario: Verify Vehicle page
    And user navigates to "Fleet" then to "Vehicles"
    Then user verifies correct page sub title

  Scenario: Verify Accounts Page
    And user navigates to "Calendars" then to "Accounts"
    Then user verifies correct page sub title