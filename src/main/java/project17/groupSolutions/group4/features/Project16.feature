Feature: School Department Tests

  @Project16
  Scenario: "Create School Department" Happy Path Testing
    Given Navigate to School Departments Menu
    And Click on Plus Icon
    And Enter School Department with name "High School" and code "HS-1"
    And Open Section Tab
    And Create section with name "Junior Classes" and short name "Juniors"
    And Create section with name "Senior Classes" and short name "Seniors"
    When Save the School Department
    Then Verify School Department with name "High School" and code "HS-1"
    And Click on School Department row with name "High School"
    And Open Section Tab
    And Verify Section with name "Junior Classes" and short name "Juniors"
    And Verify Section with name "Senior Classes" and short name "Seniors"
    And Close modal window
    And Click on Plus Icon

  @Project16
  Scenario Outline: "Create School Department" Negative Testing
    Given Enter School Department with name "<department name>" and code "<code>"
    When Save the School Department
    Then Verify dialog box message "<message>"
    Examples:
      | department name     | code  | message                                                |
      | High School         | HS-1  | There is already Department with \"High School\" name! |
      | High School         | HSC-1 | There is already Department with \"High School\" name! |
      | High School Classes | HS-1  | There is already Department with \"HS-1\" code!        |

  @Project16
  Scenario: Edit School Department Test
    Given Close modal window
    And Click on School Department row with name "High School"
    And Enter School Department with name "High School Classes" and code "HSC-1"
    When Save the School Department
    Then Verify School Department with name "High School Classes" and code "HSC-1"
    And Verify School Department with name "High School" and code "HS-1" does not exist
    And Click on School Department row with name "High School Classes"
    And Open Section Tab

  @Project16
  Scenario Outline: Create Sections Test
    When Create section with name "<name>" and short name "<short name>"
    Then Verify Section with name "<name>" and short name "<short name>"
    Examples:
      | name                         | short name   |
      | Freshman Classes             | Freshmen     |
      | Sophomore Classes            | Sophomores   |
      | College Credit Plus Students | CC+ Students |

  @Project16
  Scenario: Delete School Department Test
    Given Close modal window
    When Delete School Department
    Then Verify School Department with name "High School Classes" deleted