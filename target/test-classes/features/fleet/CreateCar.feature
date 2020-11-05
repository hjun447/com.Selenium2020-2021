@create_new_car
Feature: Create new car

  @create_car
  Scenario: Verify column names
    Given User is on the login page
    And user logs in as store manager
    Then user navigates to "Fleet" then to "Vehicles"
    And user click on "Create Car" button
    Then user adds new car information:


      | License Plate | Driver      | Location        | Model Year | Color |
      | TestPlates    | Test Driver | Washington D.C. | 2020       | Black |

    And user logs out

  @create_car
  Scenario: Create opportunity
    Given User is on the login page
    And user logs in as store manager
    Then user navigates to "Sales" then to "Opportunities"
    And user click on "Create Opportunity" buttons
    Then user adds new car information


      | Opportunity Name |
      | Some Name        |
    And user logs out