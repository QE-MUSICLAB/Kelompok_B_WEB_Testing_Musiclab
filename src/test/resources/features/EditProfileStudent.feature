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
    And user click button popup message update password
    And User Already on edit profile page

