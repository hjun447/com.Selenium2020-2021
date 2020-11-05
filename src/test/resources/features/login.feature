@login
Feature: User should be able to login with different credentials

  @login_storemanager
  Scenario: User should be able to login as a store manager using valid store manager login information
    Given User is on the login page
    Then user enters "storemanager228" username and "UserUser123" password


  @login_roles
  Scenario Outline: User should be able to login with <roles>
    Given User is on the login page
    Then user enters "<role>" role to login
    Examples: role
      | role          |
      | truck_driver  |
      | store_manager |
      | sales_manager |

  @login_credentials
  Scenario Outline: User log in as all role
    Given user is on the login page
    Then user enters "<username>" username and "<password>" password
    Examples: login
      | username        | password    |
      | user160         | UserUser123 |
      | storemanager228 | UserUser123 |
      | salesmanager110 | UserUser123 |

  @negative_test
  Scenario: Verify that warning message is displayed when username is not correct
    Given User is on the login page
    Then user enters "wrong_username" username and "UserUser123" passsword
    And user verifies that "Invalid user name or password." message is displayed

  @driver_with_data_table
  Scenario: Login as driver (data table example)
    Given User is on the login page
    Then user logs in as driver with following credentials
      | username | user160     |
      | password | UserUser123 |
    And user verifies that "Dashboard" page subtitle is displayed

  @login_with_role
  Scenario: Login as driver
    Given User is on the login page
    Then user logs in as "driver"
    And user logs out


  @login_with_role
  Scenario: Login as store manager
    Given User is on the login page
    Then user logs in as "store manager"
    And user logs out


  @login_with_role
  Scenario: Login as sales manager
    Given User is on the login page
    Then user logs in as "sales manager"
    And user logs out


  @loginss
  Scenario Outline: User logs in with different roles
    Given User is on the login page
    When user enters "<role>" input
    And user logs out
    Examples: role
      | role          |
      | driver        |
      | store manager |
      | sales manager |

  @login_with_roles_ddt_2
  Scenario Outline: Login as <role> and verify <title> page title is correct
    Given User is on the login page
    And user logs in as "<role>"
    When user navigates to "<module>" then to "<sub module>"
    Then the page title should be "<title>"
    Then user logs out

    Examples: drivers
      | role   | module     | sub module      | title                                                        |
      | driver | Fleet      | Vehicles        | Car - Entities - System - Car - Entities - System      |
      | driver | Fleet      | Vehicles Model  | Vehicles Model - Entities - System - Car - Entities - System |
      | driver | Customers  | Accounts        | Accounts - Customers                                         |
      | driver | Customers  | Contacts        | Contacts - Customers                                         |
      | driver | Activities | Calendar Events | Calendar Events - Activities                                 |
      | driver | System     | Jobs            | Jobs - System                                                |


    Examples: sales managers
      | role          | module     | sub module      | title                                                        |
      | sales manager | Fleet      | Vehicles        | Car - Entities - System - Car - Entities - System            |
      | sales manager | Fleet      | Vehicles Model  | Vehicles Model - Entities - System - Car - Entities - System |
      | sales manager | Customers  | Accounts        | Accounts - Customers                                         |
      | sales manager | Customers  | Contacts        | Contacts - Customers                                         |
      | sales manager | Activities | Calendar Events | Calendar Events - Activities                                 |
      | sales manager | System     | Jobs            | Jobs - System                                                |

    Examples: store managers
      | role          | module     | sub module      | title                                                        |
      | store manager | Fleet      | Vehicles        | Car - Entities - System - Car - Entities - System            |
      | store manager | Fleet      | Vehicles Model  | Vehicles Model - Entities - System - Car - Entities - System |
      | store manager | Customers  | Accounts        | Accounts - Customers                                         |
      | store manager | Customers  | Contacts        | Contacts - Customers                                         |
      | store manager | Activities | Calendar Events | Calendar Events - Activities                                 |
      | store manager | System     | Jobs            | Jobs - System                                                |

