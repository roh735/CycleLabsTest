@run
Feature: CycleLabs Resources pages verification

  Scenario: User on one of the resources pages should be able to go to next page
    Given User at home page
    Then User hover resources menu and click following:
      |rTestAutomationServices            |
      |rSupport                           |
      |rSupport2                          |
      |rBehaviorDrivenVsModelBasedTesting |
      |rBlog                              |
      |rProductTour                       |
      |rUnderMenuVideo                    |
    When User at resources page