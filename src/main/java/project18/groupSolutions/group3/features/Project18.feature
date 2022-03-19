@Project18
Feature: Student representatives function test

  @First
  Scenario: Create a representative in student
    Given Navigate to Student Function Page
    And Navigate to representative adding page
    When Create a representative "Self" with firstname "Andy" and lastname "Lee" and mobile phone "6461234567" and country "China"
    Then Verify representative "Self" with firstname "Andy" and lastname "Lee"

  Scenario Outline: Verify that a representative cannot be created
    When Create a representative "<representative>" with firstname "<firstname>" and lastname "<lastname>" and mobile phone "<mobilePhone>" and country "<country>"
    Then Verify representative "<if can be created or not>"
      Examples:
        |representative   |firstname    |lastname     |mobilePhone      |country          |if can be created or not |
        |                 |Andy         |Lee          |6461234567       |China            |false                    |
        |Self             |             |Lee          |6461234567       |China            |false                    |
        |Self             |Andy         |             |6461234567       |United Kingdom   |false                    |
        |Self             |Andy         |Lee          |                 |United Kingdom   |true                     |
        |Self             |Andy         |Lee          |6461234567       |                 |true                     |
        |Mother           |Joyce        |Hoo          |                 |China            |false                    |

  @Second
  Scenario Outline: Verify that a new representative of Father, Mother, Guardian or Self can be created
    When Create a representative "<representative>" with firstname "<firstname>" and lastname "<lastname>" and mobile phone "<mobilePhone>" and country "<country>"
    Then Verify representative "<representative>" with firstname "<firstname>" and lastname "<lastname>"
      Examples:
        |representative   |firstname    |lastname     |mobilePhone      |country          |
        |Father           |Andy         |Lee          |6461234567       |China            |
        |Mother           |joyce        |Hoo          |6461232342       |China            |
        |Guardian         |Tim          |Chow         |6461231093       |United Kingdom   |
        |Self             |John         |Lee          |6461231011       |United Kingdom   |

  Scenario: Verify that delete an existing representative.
    When Delete all representatives
    Then Verify that delete all representatives


