Feature: User delete their account

  @Delete @Musiclab @DeleteAccount @PositiveCase
    #BUG harus refresh manual
  Scenario: Delete student account
    Given User already on musiclab website
    When  User click login menu
    Then  User already in login page
    And   User input "andotigor@gmail.com" as email,and input "ando1234" as password, and select "Student" as role
    And   User click login button
    Then  User will see pop up message login success
    And   User will direct to homepage
    And   User click ok button
    When  User click profile button
    And   User click delete account button
    And   User click Ya, hapus akun! button
    Then  User will direct to login page

  @Delete @Musiclab @DeleteAccount @PositiveCase
    #BUG harus refresh manual
  Scenario: Delete mentor account
    Given User already on musiclab website
    When  User click login menu
    Then  User already in login page
    And   User input "zakysinaga@gmail.com" as email,and input "zaky1234" as password, and select "Mentor" as role
    And   User click login button
    Then  User will see pop up message login success
    And   User will direct to homepage
    And   User click ok button
    When  User click profile button
    And   User click deactivate account button
    And   User click Ya, hapus akun! button
    Then  User will stay at profile page

