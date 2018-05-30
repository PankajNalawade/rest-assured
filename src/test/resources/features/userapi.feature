Feature: To test userapi
  @TestSuite
  Scenario: To valide getUser call
    Given I performs a get request to "/platforms/f0af7e43-f7cf-4ad7-8c86-79777e1dce6d/users"
    When I add the following parameters
    | Content-Type | application/json |
    | X-Client-ID  | MH001            |
    And and perform the get request
    Then the response code should be 200
