Feature: Register
  as a user i want register new account


  @Register @Musiclab
  Scenario: User do register new student account with valid  data
    Given User already on musiclab website
    When  User click login menu
    Then  User already in login page
    And   User click register on login page
    Then  User already in register page
    And   User input "TigorSumarjaa" as namaLengkap, select "Student" as role, input "tigorsumarjaa@gmail.com" as email and input "tigor123" as password
    And   User click register button
    Then  User will get the pop up message "success create account"

  @Register @Musiclab
  Scenario: User do register new student account with email has been registered
    Given User already on musiclab website
    When  User click login menu
    Then  User already in login page
    And   User click register on login page
    Then  User already in register page
    And   User input "RolandoTigor" as namaLengkap, select "Student" as role, input "rolandotigor25@gmail.com" as email and input "tigor123" as password
    And   User click register button
    Then  User will get the pop up message email has been registered

  @Register @Musiclab
  Scenario Outline: User do register new student account with invalid email
    Given User already on musiclab website
    When  User click login menu
    Then  User already in login page
    And   User click register on login page
    Then  User already in register page
    And   User input "<name>" as namaLengkap, select "<role>" as role, input "<email>" as email and input "<password>" as password
    And   User click register button
    And   User will see error
    Examples:
      | name  |  | role    |  | email                    |  | password  |
      | wahid |  | Student |  | wahidsaragih@gmail.commm |  | wahudcute |
      | wahid |  | Student |  | wahidsaragih@gmail       |  | wahudcute |

  @Register @Musiclab
  Scenario Outline: User do register new student account with invalid data when using special character or using number in name
    Given User already on musiclab website
    When  User click login menu
    Then  User already in login page
    And   User click register on login page
    Then  User already in register page
    And   User input "<name>" as namaLengkap, select "<role>" as role, input "<email>" as email and input "<password>" as password
    And   User click register button
    And   User will see error registred failed
    Examples:
      | name     |  | role    |  | email                   |  | password  |
      | wahid@@  |  | Student |  | wahidsaragihh@gmail.com |  | wahudcute |
      | wahid123 |  | Student |  | wahidsaragihh@gmail.com |  | wahudcute |

    @Register @Musiclab
  Scenario: User do register new mentor account with valid data
    Given User already on musiclab website
    When  User click login menu
    Then  User already in login page
    And   User click register on login page
    Then  User already in register page
    And   User input "TigorSumardi" as namaLengkap, select "Mentor" as role, input "tigorsumardi@gmail.com" as email and input "sumardi123" as password
    And   User click register button
    Then  User will get the pop up message "success create account"

    @Register @Musiclab
  Scenario: User do register new mentor account with email has been registered
    Given User already on musiclab website
    When  User click login menu
    Then  User already in login page
    And   User click register on login page
    Then  User already in register page
    And   User input "TigorSumardi" as namaLengkap, select "Mentor" as role, input "tigorsumardi@gmail.com" as email and input "sumardi123" as password
    And   User click register button
    Then  User will get the pop up message email has been registered

  @Register @Musiclab
  Scenario Outline: User do register new mentor account with invalid email
    Given User already on musiclab website
    When  User click login menu
    Then  User already in login page
    And   User click register on login page
    Then  User already in register page
    And   User input "<name>" as namaLengkap, select "<role>" as role, input "<email>" as email and input "<password>" as password
    And   User click register button
    And   User will see error
    Examples:
      | name  |  | role   |  | email                |  | password  |
      | tigor |  | Mentor |  | tigorsihombing@gmail |  | tigorcute |

  @Register @Musiclab
  Scenario Outline: User do register new mentor account with invalid data when using special character or using number in name
    Given User already on musiclab website
    When  User click login menu
    Then  User already in login page
    And   User click register on login page
    Then  User already in register page
    And   User input "<name>" as namaLengkap, select "<role>" as role, input "<email>" as email and input "<password>" as password
    And   User click register button
    And   User will see error registred failed
    Examples:
      | name    |  | role   |  | email              |  | password  |
      | tigor## |  | Mentor |  | tigor25@gmail.com  |  | tigorcute |
      | tigor88 |  | Mentor |  | tigors25@gmail.com |  | tigorcute |