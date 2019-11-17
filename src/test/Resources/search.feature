Feature: As a user
  I want to search
  So that we can see desired product

  Scenario: Search for a product
    Given I am on homepage
    When I search for a Nike
    Then I should be able to see desired product
