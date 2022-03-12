@Project17
Feature: Login functionality tests

  @First
  Scenario: User can log in with valid credentials
    # It will login automatically sign in because BeforeAll annotations will run
    Then Verify user page opens
    And User signs out

  Scenario Outline: User cannot log in with invalid credentials
    Given Enter username "<username>"
    And Enter password "<password>"
    When Click on Login button
    Then Verify the login error message

    Examples:
      | username      | password      |
      | fake_username | QWEasd@1901   |
      | i.muratov     | fake_password |
      | fake_username | fake_password |

  Scenario Outline: User cannot log in if at least one of the credentials is left blank
    Given Refresh login page
    And Enter username "<username>"
    And Enter password "<password>"
    When Click on Login button
    Then Verify "<username>" or "<password>" required message

    Examples:
      | username  | password    |
      | i.muratov |             |
      |           | QWEasd@1901 |
      |           |             |