Feature: School Department Functionality

  Background:
    Given User is on login page
    When User enter admin credentials
    Then User should login successfully

  Scenario: Add school department
    Given User navigate to top menu
    When User create school department
    Then Success message displayed

  Scenario: Add school department again
    Given User navigate to top menu
    When User create school department again
    Then Alert message should be displayed

  Scenario: Add same school different code
    Given User navigate to top menu
    When User add same school with different code
    Then Second Alert message should be displayed

   Scenario: Add different school same code
     Given User navigate to top menu
     When User add different school and same code
     Then Third Alert message should be displayed

  Scenario: Edit school and code in department
    Given User navigate to top menu
    When User edit school and code in department
    Then Verifying After Edit message should be displayed

  Scenario: Delete department
    Given User navigate to top menu
    When User delete departments
    Then User should see success message



