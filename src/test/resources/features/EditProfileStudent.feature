Feature: edit profile student

Scenario: EditStudentProfile with valid data
  Given User already on login page
  And User click login menu on musiclab website
  Then User already on login page musiclab web
  And User input "tigorwidodo@gmail.com" as email,input "tigor123" as password and select "Student" as role
  And User click the login button
  Then User will get the pop up  message login succes
  And user click the succes login button
  And User will direct to  homepage
  And User click the profile menu on hompage
  And User already in profile student page
  And User click edit profile
  And User Already on edit profile page
  And User edit foto profile
  When User input "TigorWidodoRi1" as namalengkap, select "Male" as jeniskelamin, input "082368754421" as phone, input "tigorwidodoRI@gmail.com" as email and input "nusa kembangan" as alamat
  And User click the update button at edit profile student page
  Then User will get the pop up messages

  Scenario: EditStudentProfile to update pasword with valid data
    Given User already on login page
    And User click login menu on musiclab website
    Then User already on login page musiclab web
    And User input "tigorwidodo@gmail.com" as email,input "tigor123" as password and select "Student" as role
    And User click the login button
    Then User will get the pop up  message login succes
    And user click the succes login button
    And User will direct to  homepage
    And User click the profile menu on hompage
    And User already in profile student page
    And User click edit profile
    And User Already on edit profile page
    When User input "tigor123" as old password, select "tigor1234" as new password , and input "tigor1234" as confirmation password
    And User click the update password button at edit profile student page
    Then User will get the pop up messages update password
    When user click button popup message update password
    And User Already on edit profile page before click logout button
    And user logout account
    And User will get the pop up messages succes logout
    And User click pop up succes logout button
    Then User already on login page musiclab web

  Scenario: EditStudentProfile to update pasword with wrog old password
    Given User already on login page
    And User click login menu on musiclab website
    Then User already on login page musiclab web
    And User input "fahmim.khairul951@gmail.com" as email,input "k4irul95" as password and select "Student" as role
    And User click the login button
    Then User will get the pop up  message login succes
    And user click the succes login button
    And User will direct to  homepage
    And User click the profile menu on hompage
    And User already in profile student page
    And User click edit profile
    And User Already on edit profile page
    When User input "tigor123" as old password, select "tigor1234" as new password , and input "tigor1234" as confirmation password
    And User click the update password button at edit profile student page

  Scenario: EditStudentProfile to update pasword with not match new password and confirmation password
    Given User already on login page
    And User click login menu on musiclab website
    Then User already on login page musiclab web
    And User input "fahmim.khairul951@gmail.com" as email,input "k4irul95" as password and select "Student" as role
    And User click the login button
    Then User will get the pop up  message login succes
    And user click the succes login button
    And User will direct to  homepage
    And User click the profile menu on hompage
    And User already in profile student page
    And User click edit profile
    And User Already on edit profile page
    When User input "k4irul95" as old password, select "k4irul93" as new password , and input "tigor1234" as confirmation password
    And User click the update password button at edit profile student page

  Scenario Outline: EditStudentProfile to update pasword with incomplate data
    Given User already on login page
    And User click login menu on musiclab website
    Then User already on login page musiclab web
    And User input "fahmim.khairul951@gmail.com" as email,input "k4irul95" as password and select "Student" as role
    And User click the login button
    Then User will get the pop up  message login succes
    And user click the succes login button
    And User will direct to  homepage
    And User click the profile menu on hompage
    And User already in profile student page
    And User click edit profile
    And User Already on edit profile page
    When User input "<oldpassword>", select "<newpassword>", and input "<confirmationpassword>"
    And User click the update password button at edit profile student page
    Examples:
    |oldpassword|newpassword|confirmationpassword|
    | k4irul95  |           | k4irul93           |
    |           | k4irul93  | k4irul93           |
    |k4irul95   |k4irul93   |                    |


