@calendar_events
Feature: All calendar events

  Scenario: Verify column names
    Given User is on the login page
    And user logs in as "store manager" role
    Then user navigates to "Activities" then to "Calendar Events"
    And user verifies that column names are displayed
      | TITLE             |
      | CALENDAR          |
      | START             |
      | END               |
      | RECURRENT         |
      | RECURRENCE        |
      | INVITATION STATUS |

  Scenario: Verify column names
    Given user is on the login page
    And user logs in as store manager
    Then user navigates to "Fleet" then to "Vehicles"
    And user click on "Create Car" button
    Then user adds new car information:

      | License Plate | Driver      | Location        | Model Year | Color |
      | TestPlates    | Test Driver | Washington D.C. | 2020       | Black |