Feature: To test userapi
  @TestSuite
  Scenario: To valide getUser call
    Given I performs a get request to "/api/articles.json"
    When and perform the get request
    Then the response code should be 200
