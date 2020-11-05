Feature: User navigates around module and submodule

  @test_navigation
  Scenario Outline: User should be able to navigate through <module> and <submodule>
    Given user is on the login page
    When user enters "storemanager228" username and "UserUser123" password
    Then user clicks "<module>" module and "<submodule>" submodule
    Examples: navigation
      | module | submodule         |
      | Fleet  | Vehicles          |
      | Fleet  | Vehicle Odometer  |
      | Fleet  | Vehicle Costs     |
      | Fleet  | Vehicle Contracts |
