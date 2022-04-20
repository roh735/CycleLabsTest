Feature: CycleLabs Company pages verification

  Scenario: User on one of the company pages should be able to go to next page
    Given User at home page
    Then User hover company menu and click following:
      |comAboutCycleLabs|
      |comMissionValues |
      |comNewsRelease   |
      |comPartners      |
      |comCareers       |
      |comEvents        |
      |comModex         |
      |cLSecuresFunding |
    When User at company page