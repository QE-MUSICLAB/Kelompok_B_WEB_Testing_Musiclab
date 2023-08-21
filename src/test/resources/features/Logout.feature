Feature: as a user i want do logout musiclab

  @Logout
  Scenario: Logout student with valid data
    Given User already on musiclab website
    When  User click login menu
    Then  User already in login page
    And   User input "tigorsumarjaa@gmail.com" as email,and input "tigor123" as password, and select "Student" as role
    And   User click login button
    Then  User will see pop up message login success
    And   User will direct to homepage
    And   User click ok button
    When  User click logout button
    Then  User will see pop up message You have been Logged out

  @Logout
  Scenario: Logout mentor with valid data
    Given User already on musiclab website
    When  User click login menu
    Then  User already in login page
    And   User input "rolandotigorr@gmail.com" as email,and input "rolando12" as password, and select "Mentor" as role
    And   User click login button
    Then  User will see pop up message login success
    And   User will direct to homepage
    And   User click ok button
    When  User click logout button
    Then  User will see pop up message You have been Logged out
