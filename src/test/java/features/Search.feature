Feature: The user is able to search car
  As a web user,
  The user wants to search the cars

  Scenario: The user filter car by price
    Given The user goes to Search Page
    When The user order the list by price descending
    And The user fills the search
    Then The user should see cars that fit on the search order by price descending