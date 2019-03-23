Feature: basket
  As a customer
  i want to add product in the basket
  so that i can buy product
@regression
  Scenario:
    Given i am on homepage
    When i search for a product "nike"
    And i  select any product
    And i  add product  in the basket
    Then i can see the product in to the basket




