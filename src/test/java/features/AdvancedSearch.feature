Feature: The user is able to search car
  As a web user,
  The user wants to search the cars

  Scenario: The user filter car by price
    Given The user goes to Search Page
    When The user fills the advanced filters
    Then The user should see cars that fit on the search
