Feature: Search
  As a end user
  I want to search for product
  So that i can view product
@smoke
  Scenario:
    Given i am on homepage
    When i search for a product "nike"
    Then i should be able to see the respective results