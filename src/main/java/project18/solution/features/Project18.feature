@Project18
Feature: Student Representative Tests

  @First
  Scenario: Open Add Representative Modal Page
    When Navigate to Students page
    Then Go to Representatives Tab

  Scenario Outline: Create Representative Negative Tests
    Given Open Add Representative Modal Page
    When Enter representative's country "<country>"
    And Enter representative's first name "<first name>"
    And Enter representative's last name "<last name>"
#    And Fail the scenario
    And Enter representative's mobile phone "<mobile phone>"
    And Enter representative "<representative type>"
    Then Verify add button is not active
    Examples:
      | representative type | first name | last name | mobile phone | country                  |
      |                     | Fatma      | Adiguzel  | 123456       | Kazakhstan               |
      | Mother              |            | Kaya      | 123456       | Turkey                   |
      | Father              | George     |           | 123456       | United States of America |
      | Guardian            | Uche       | Amokachi  |              | Nigeria                  |
      | Self                | Askar      | Ahmeduly  | 123456       |                          |

  Scenario Outline: Create new representative of each type and delete it
    Given Open Add Representative Modal Page
    And Enter representative "<representative type>"
    And Enter representative's first name "<first name>"
#    And Fail the scenario
    And Enter representative's last name "<last name>"
    And Enter representative's mobile phone "123456789"
    When Click on Add button
    Then Verify creation of "<representative type>" with name "<first name>" "<last name>"
    #    And Fail the scenario
    When Delete the representative
    Then Verify representative is deleted
    Examples:
      | representative type | first name | last name |
      | Mother              | Aisha      | Rosemary  |
      | Father              | Li         | Chen      |
      | Guardian            | Amadou     | Williams  |
      | Self                | Alexander  | Ivanov    |
