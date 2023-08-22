Feature: Student Schedule

  @Musiclab @Positivecase @StudentSchedule
  Scenario: The user student checks the available study schedule
    Given  User already on login page
    And    User click login menu on musiclab website
    Then   User already on login page musiclab web
    And    User input "tigorwidodo@gmail.com" as email,input "tigor123" as password and select "Student" as role
    And    User click the login button
    Then   User will get the pop up  message login succes
    And    user click the succes login button
    And    User will direct to  homepage
    And    User click the profile menu on hompage
    And    User already in profile student page
    And    User click jadwal buttons
    And    User Already jadwal page


  @Musiclab @Positivecase @StudentSchedule
  Scenario: The user student checks the available kembali button
    Given User already on login page
    And   User click login menu on musiclab website
    Then  User already on login page musiclab web
    And   User input "tigorwidodo@gmail.com" as email,input "tigor123" as password and select "Student" as role
    And   User click the login button
    Then  User will get the pop up  message login succes
    And   user click the succes login button
    And   User will direct to  homepage
    And   User click the profile menu on hompage
    And   User already in profile student page
    And   User click jadwal buttons
    And   User Already jadwal page
    When  User click kembali button
    Then  User direct to profile page
    And   User logout