Feature: OKDollar Login API

  Scenario: Login with valid credentials
    Given I hit the OKDollar login API with username "demo" and password "demo123"
    Then I should get status code 200
