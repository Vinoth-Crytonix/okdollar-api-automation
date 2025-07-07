Feature: Login API Test

  Scenario: Successful login with valid credentials
    Given the API endpoint is available
    When I send a login request with username "test" and password "pass"
    Then the response status code should be 200
