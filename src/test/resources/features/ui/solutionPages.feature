@run
Feature: CycleLabs Solutions pages verification

  Scenario: User on one of the solutions pages should be able to go to next page
    Given User at home page
    Then User hover solution menu and click following:
      |sEnterprise|
      |sWarehouse |
      |sBlueYonder|
    When User at solution page