Feature: Login Functionality tests for Campus website

  @Regression
  Scenario: User can log in with valid credentials
    Given User enter valid username
    When User enter valid password
    Then Click login button

  @Regression
  Scenario Outline: User cannot log in with invalid credentials
    Given  with an invalid "<username>" and a valid "<password>"
    Then   And User verify login "<message>"

    Examples:
      |username  |password   |message                     |
      |abc       |QWEasd@1901|Invalid username or password|
      |i.muratov |def        |Invalid username or password|
      |efg       |hij        |Invalid username or password|

  @Regression
  Scenario Outline: User cannot log in if at least one of the credentials is left blank
    Given with an valid "<username>" but no "<password>"

    Examples:
      |username |password   |
      |i.muratov|           |
      |         |QWEasd@1901|
      |         |           |