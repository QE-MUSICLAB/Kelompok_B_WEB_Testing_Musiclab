Feature: as a user i want edit mentor profile

#  @EditMentorProfile
#  Scenario: Edit mentor profile with valid data
#    Given User already on musiclab website
#    When  User click login menu
#    Then  User already in login page
#    And   User input "rolandotigorr@gmail.com as email,and input "rolando12" as password, and select "Mentor" as role
#    And   User click login button
#    Then  User will see pop up message login success
#    And   User will direct to homepage
#    And   User click ok button
#    When  User click profile button
#    And   User click edit profile button
#    And   User will input "zakynabannn" as namaLengkap, input "Best Bass teacher in this town" as deskripsi select "Male" as jenisKelamin, "085542156745" as noHp, input "zakynababann@gmail.com" asemail, input "@zakysmart" as instagram account link, and input "Jalan Babarsari" as alamat
#    When  User click update button
#    And   User will get the pop up message success update mentor profile
#
  @EditMentorProfile
  Scenario: Edit mentor profile with incomplete data
    Given User already on musiclab website
    When  User click login menu
    Then  User already in login page
    And   User input "rolandotigorr@gmail.com" as email,and input "rolando12" as password, and select "Mentor" as role
    And   User click login button
    Then  User will see pop up message login success
    And   User will direct to homepage
    And   User click ok button
    When  User click profile button
    And   User click edit profile button
    And   User will input "rolandotigorr" as namaLengkap, input "I am best bass teacher" as deskripsi select "Male" as jenisKelamin, "" as noHp, input "rolandotigorr@gmail.com" asemail, input "@tigorcute" as instagram account link, and input "Parung" as alamat
    When  User click update button
    And   User will get the pop up message Please Fill The Form with Correct Format

#  @EditMentorProfile
#  Scenario: Edit mentor profile with empty data
#    Given User already on musiclab website
#    When  User click login menu
#    Then  User already in login page
#    And   User input "rolandotigorr@gmail.com" as email,and input "rolando12" as password, and select "Mentor" as role
#    And   User click login button
#    Then  User will see pop up message login success
#    And   User will direct to homepage
#    And   User click ok button
#    When  User click profile button
#    And   User click edit profile button
#    And   User clear all data
#    When  User click update button
#    And   User will get the pop up message Please Fill The Form with Correct Format

#  @EditMentorProfile
#  Scenario: Update mentor instrument
#    Given User already on musiclab website
#    When  User click login menu
#    Then  User already in login page
#    And   User input "rolandotigorr@gmail.com" as email,and input "rolando12" as password, and select "Mentor" as role
#    And   User click login button
#    Then  User will see pop up message login success
#    And   User will direct to homepage
#    And   User click ok button
#    When  User click profile button
#    And   User click edit profile button
#    And   User select "Piano" as instrument
#    When  User click update instument button
#    And   User will get the pop up message success add mentor instrument
#    And   User click ok on pop up message

#  @EditMentorProfile
#  Scenario: Update mentor instrument without select anything
#    Given User already on musiclab website
#    When  User click login menu
#    Then  User already in login page
#    And   User input "rolandotigorr@gmail.com" as email,and input "rolando12" as password, and select "Mentor" as role
#    And   User click login button
#    Then  User will see pop up message login success
#    And   User will direct to homepage
#    And   User click ok button
#    When  User click profile button
#    And   User click edit profile button
#    When  User click update instument button
#    Then  User will get the pop up message Failed
#    And   User click ok on pop up message Failed
#
#  @EditMentorProfile
#  Scenario: Update mentor Genre
#    Given User already on musiclab website
#    When  User click login menu
#    Then  User already in login page
#    And   User input "rolandotigorr@gmail.com" as email,and input "rolando12" as password, and select "Mentor" as role
#    And   User click login button
#    Then  User will see pop up message login success
#    And   User will direct to homepage
#    And   User click ok button
#    When  User click profile button
#    And   User click edit profile button
#    And   User select "Pop" as genre
#    When  User click update genre button
#    And   User will get the pop up message success add mentor genre
#    And   User click ok on pop up message
#
#  @EditMentorProfile
#  Scenario: Update mentor genre without select anything
#    Given User already on musiclab website
#    When  User click login menu
#    Then  User already in login page
#    And   User input "rolandotigorr@gmail.com" as email,and input "rolando12" as password, and select "Mentor" as role
#    And   User click login button
#    Then  User will see pop up message login success
#    And   User will direct to homepage
#    And   User click ok button
#    When  User click profile button
#    And   User click edit profile button
#    When  User click update genre button
#    And   User will get the pop up message Failed
#    And   User click ok on pop up message Failed

#
#  @EditMentorProfile
#  Scenario: Update mentor password with valid data
#    Given User already on musiclab website
#    When  User click login menu
#    Then  User already in login page
#    And   User input "rolandotigorr@gmail.com" as email,and input "rolando12" as password, and select "Mentor" as role
#    And   User click login button
#    Then  User will see pop up message login success
#    And   User will direct to homepage
#    And   User click ok button
#    When  User click profile button
#    And   User click edit profile button
#    And   User input "rolando12" as old password, input "rolando12" as new password and input "rolando12" as confirmation password
#    When  User click update password button
#    And   User will see pop up message Password Succesfully Updated
#    And   User click ok on pop up message Password Succesfully Updated
#
#  @EditMentorProfile
#  Scenario Outline: Update mentor password with incomplete data
#    Given User already on musiclab website
#    When  User click login menu
#    Then  User already in login page
#    And   User input "rolandotigorr@gmail.com" as email,and input "rolando12" as password, and select "Mentor" as role
#    And   User click login button
#    Then  User will see pop up message login success
#    And   User will direct to homepage
#    And   User click ok button
#    When  User click profile button
#    And   User click edit profile button
#    And   User input "<oldpassword>" as old password, input "<newpassword>" as new password and input "<confirmpassword>" as confirmation password
#    When  User click update password button
#    And   User will see pop up message Please Fill with Incorrect Format
#    And   User click ok on pop up message Password Please Fill with Incorrect Format
#    Examples:
#      | oldpassword | newpassword      | confirmpassword  |
#      |             | rolando121234567 | rolando121234567 |
#      | rolando12   |                  | rolando121234567 |
#      | rolando12   | rolando121234567 |                  |

#  @EditMentorProfile
#  Scenario Outline: Update mentor password with unmatch new pasword and old password
#    Given User already on musiclab website
#    When  User click login menu
#    Then  User already in login page
#    And   User input "rolandotigorr@gmail.com" as email,and input "rolando12" as password, and select "Mentor" as role
#    And   User click login button
#    Then  User will see pop up message login success
#    And   User will direct to homepage
#    And   User click ok button
#    When  User click profile button
#    And   User click edit profile button
#    And   User input "<oldpassword>" as old password, input "<newpassword>" as new password and input "<confirmpassword>" as confirmation password
#    When  User click update password button
#    And   User will see pop up message Please Fill with Incorrect Format
#    And   User click ok on pop up message Password Please Fill with Incorrect Format
#    Examples:
#      | oldpassword | newpassword      | confirmpassword   |
#      | rolando12   | rolando121234567 | rolando12123      |
#      | rolando12   | rolando121234    | rolando1211111111 |

#  @EditMentorProfile
#  Scenario: Update mentor certificate with valid data
#    Given User already on musiclab website
#    When  User click login menu
#    Then  User already in login page
#    And   User input "rolandotigorr@gmail.com" as email,and input "rolando12" as password, and select "Mentor" as role
#    And   User click login button
#    Then  User will see pop up message login success
#    And   User will direct to homepage
#    And   User click ok button
#    When  User click profile button
#    And   User click edit profile button
#    And   User select "Internasional" as Tipe Sertifikat, input "Bass Master" as nama sertifikat, choose a file under "500kb"
#    When  User click the upload sertifikat button
#    And   User will get the pop up message success update mentor password
#    And   User click ok on pop up message success update mentor password
#
#
#  @EditMentorProfile
#    Scenario: Update mentor certificate with invalid data
#    Given User already on musiclab website
#    When  User click login menu
#    Then  User already in login page
#    And   User input "rolandotigorr@gmail.com" as email,and input "rolando12" as password, and select "Mentor" as role
#    And   User click login button
#    Then  User will see pop up message login success
#    And   User will direct to homepage
#    And   User click ok button
#    When  User click profile button
#    And   User click edit profile button
#    And   User select "Internasional" as Tipe Sertifikat, User don't select nama sertifikat, choose a file under "500kb"
#    When  User click the upload sertifikat button
#    And   User will get the pop up message error bind data
#    And   User click ok on pop up message error bind data

#  @EditMentorProfile
#  Scenario: Update mentor certificate with empty data
#    Given User already on musiclab website
#    When  User click login menu
#    Then  User already in login page
#    And   User input "rolandotigorr@gmail.com" as email,and input "rolando12" as password, and select "Mentor" as role
#    And   User click login button
#    Then  User will see pop up message login success
#    And   User will direct to homepage
#    And   User click ok button
#    When  User click profile button
#    And   User click edit profile button
#    When  User click the upload sertifikat button
#    And   User will get the pop up message error bind data
#    And   User click ok on pop up message error bind data

#  @EditMentorProfile
#    BUG
#  Scenario: Update mentor profile picture with valid data
#    Given User already on musiclab website
#    When  User click login menu
#    Then  User already in login page
#    And   User input "rolandotigorr@gmail.com" as email,and input "rolando12" as password, and select "Mentor" as role
#    And   User click login button
#    Then  User will see pop up message login success
#    And   User will direct to homepage
#    And   User click ok button
#    When  User click profile button
#    And   User click edit profile button
#    And   User click choose profile picture file
#    When  User click update button
#    And   User will get the pop up message Please Fill The Form with Correct Format
#    And   User click ok on pop up message
#
#  @EditMentorProfile
#    #BUG
#  Scenario: Update mentor profile picture with empty data
#    Given User already on musiclab website
#    When  User click login menu
#    Then  User already in login page
#    And   User input "rolandotigorr@gmail.com" as email,and input "rolando12" as password, and select "Mentor" as role
#    And   User click login button
#    Then  User will see pop up message login success
#    And   User will direct to homepage
#    And   User click ok button
#    When  User click profile button
#    And   User click edit profile button
#    When  User click update button
#    And   User will get the pop up message Please Fill The Form with Correct Format
#    And   User click ok on pop up message



