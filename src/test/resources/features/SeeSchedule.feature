Feature: See Schedule

  @SeeSchedule @Musiclab @PositiveCase
  Scenario: Student wants to see schedule
    Given User already on musiclab website
    When  User click login menu
    Then  User already in login page
    And   User input "fahrulbarus@gmail.com" as email,and input "fahrulbarus12344" as password, and select "Student" as role
    And   User click login button
    Then  User will see pop up message login success
    And   User will direct to homepage
    And   User click ok button
    And   User click profile button
    And   User will direct to profile page
    And   User click jadwal button
    Then  User will direct to history belajar page