@run @ui
Feature: CycleLabs Product pages verification

  Scenario: User on one of the product pages should be able to go to next page
    Given User at home page
    Then User hover product menu and click following:
      |pTest       |
      |pPerformance|
      |pWeb        |
      |pMegaVideo  |
    When User at product page