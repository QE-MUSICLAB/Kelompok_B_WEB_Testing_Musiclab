Feature: User want to login musiclab


  @Login @Musiclab @PositiveCase
  Scenario: Login student with valid data
    Given User already on musiclab website
    When  User click login menu
    Then  User already in login page
    And   User input "tigorsumarjaa@gmail.com" as email,and input "tigor123" as password, and select "Student" as role
    And   User click login button
    Then  User will see pop up message login success
    And   User will direct to homepage

  @Login @Musiclab @NegativeCase
  Scenario: Login student with unregistered data
    Given User already on musiclab website
    When  User click login menu
    Then  User already in login page
    And   User input "tigorpakpahan@gmail.com" as email,and input "tigor123" as password, and select "Student" as role
    And   User click login button
    Then  User will see pop up message data not found

  @Login @Musiclab @NegativeCase
  Scenario: Login student with deleted account
    #BUG SHOULD CANT LOGIN
    Given User already on musiclab website
    When  User click login menu
    Then  User already in login page
    And   User input "sihombingtigor@gmail.com" as email,and input "sihombing123" as password, and select "Student" as role
    And   User click login button
    Then  User will see pop up message data not found

  @Login @Musiclab @PositiveCase
  Scenario: Login mentor with valid data
    Given User already on musiclab website
    When  User click login menu
    Then  User already in login page
    And   User input "aditpandapotan@gmail.com" as email,and input "adit1234" as password, and select "Mentor" as role
    And   User click login button
    Then  User will see pop up message login success
    And   User will direct to homepage

  @Login @Musiclab @NegativeCase
    Scenario: Login mentor with unregistered data
    Given User already on musiclab website
    When  User click login menu
    Then  User already in login page
    And   User input "aditgurusinga@gmail.com" as email,and input "aditguru123" as password, and select "Mentor" as role
    And   User click login button
    Then  User will see pop up message data not found

  @Login @Musiclab @NegativeCase
  Scenario: Login mentor with deleted account
    #BUG SHOULD CANT LOGIN
    Given User already on musiclab website
    When  User click login menu
    Then  User already in login page
    And   User input "wahidthorir@gmail.com" as email,and input "wahid123" as password, and select "Mentor" as role
    And   User click login button
    Then  User will see pop up message data not found
