Feature:Department Functionality

  Background:
    Given User is on home page
    When User navigate to Department page
    Then User is on Department page

  @Regression
  Scenario: Create School Department
    Given User is on Department page
    When User create school department
    Then Success message should be displayed

  @Regression
  Scenario: Verify Created School Department
    Given User is on Department page
    When User verify the data of created school department
    Then User is on Department page

  @Regression
  Scenario: Create School Department Again
    Given User is on Department page
    When User create school department
    Then Existed school name message should be display

  @Regression
  Scenario: Create School Department With Same Name And Different Code
    Given User is on Department page
    When User create school department with same name and different code
    Then Existed school name message should be display

  @Regression
  Scenario: Create School Department With Different Name And Same Code
    Given User is on Department page
    When User create school department with different name and same code
    Then Existed school code message should be display

  @Regression
  Scenario: Edit School Department With Different Name And Code
    Given User is on Department page
    When User edit the existed department with different name and code
    Then Success message should be displayed

  @Regression
  Scenario: Verify Created School Department After Editing
    Given User is on Department page
    When User verify the data of created school department after editing
    Then User is on Department page

  @Regression
  Scenario: Add Three Sections In the High School Class
    Given User is on Department page
    When User add three sections in the high school class
    Then User is on Department page

  @Regression
  Scenario: Delete High School Class Department
    Given User is on Department page
    When User delete the high school class department
    Then Success message should be displayed