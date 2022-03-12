Feature: Login Functionality tests for Campus website

  Background:
    Given Validate user is on login page

  @Project17
  Scenario: User can log in with valid credentials
    When User enter valid credentials
    Then User should login successfully

  @Project17
  Scenario Outline: User cannot log in with invalid credentials
    When User enters invalid username "<username>" or password "<password>"
    Then User should stay on login page
    And Invalid username or password message should appear
    Examples:
      | username  | password    |
      | i.murato  | QWEasd@1901 |
      | i.muratov | QWEasd@1900 |
      | imuratov  | QWEasd@1902 |

  @Project17
  Scenario Outline: User cannot log in if at least one of the credentials is left blank (is not entered)
    When User enters invalid username "<username>" or password "<password>"
    Then User should stay on login page
    Examples:
      | username  | password    |
      | i.muratov |             |
      |           | QWEasd@1901 |
      |           |             |





