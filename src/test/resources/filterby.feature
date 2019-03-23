Feature: filterby
  As a end user
  I want to apply filter on the results
  So that i view results of my filter choice
@k
  Scenario: filter by rating
    Given i am on homepage
    When i search for a product "nike"
    And i apply filter "4or more" on result page
    Then i should see all products "review" are filtered "4.0"