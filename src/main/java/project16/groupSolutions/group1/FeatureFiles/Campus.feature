Feature: Campus Functionality

  @Regression
  Scenario: Testing Campus Functionality
    Given User enter username and password in login page
    And User click on Departments menu
    When User create new School Departments
    And  User verifying new school are created
    And User use the same school name again to verify the message with school already created
    And User use same school name different code to verify
    And User use different school name and same code to verify
    And User edit and verify school name and code
    Then User delete the school departments and verify


