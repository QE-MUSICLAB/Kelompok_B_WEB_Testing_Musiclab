Feature: Upload Course

  @UploadValidCourse @UploadCourse @Musiclab @PositiveCase
  Scenario Outline: Mentor wants to add a new course with valid data
    Given User already on musiclab website
    When  User click login menu
    Then  User already in login page
    And   User input "aditpandapotan@gmail.com" as email,and input "adit1234" as password, and select "Mentor" as role
    And   User click login button
    Then  User will see pop up message login success
    And   User will direct to homepage
    And   User click ok button
    And   User click profile button
    And   User click kursus saya button
    Then  User will direct to kursus saya page
    And   User click upload new course button
    Then  User will direct to upload course page
    And   User upload file on choose file field
    And   User input "<judul_kursus>" as judulkursus, and select "<level>" as level, and input "<deskripsikhusus>" as deskripsikhusus,and input "<apayangdipelajari>" as apayangdipelajari, and input "<prasyaratkhusus>" as prasyaratkhusus, and input "<untuksiapakursusini>" as untuksiapakursusini, and input "<hargakursus>" as hargakursus,and input "<durasikursus>" as duration
    And   User click the Upload Kursus button
    Then  User will get the pop up messages success post a course
    Examples:
      | judul_kursus | level | deskripsikhusus | apayangdipelajari | prasyaratkhusus | untuksiapakursusini | hargakursus | durasikursus |
      | Bass Class   | Basic | Lorem ipsum     | Lorem ipsum       | Lorem ipsum     | Lorem ipsum         | 30000       | 15           |

  @UploadEmptyCourse @UploadCourse @Musiclab @NegativeCase
  Scenario: Mentor wants to add a new course with empty data
    Given User already on musiclab website
    When  User click login menu
    Then  User already in login page
    And   User input "aditpandapotan@gmail.com" as email,and input "adit1234" as password, and select "Mentor" as role
    And   User click login button
    Then  User will see pop up message login success
    And   User will direct to homepage
    And   User click ok button
    And   User click profile button
    And   User click kursus saya button
    Then  User will direct to kursus saya page
    And   User click upload new course button
    Then  User will direct to upload course page
    And   User click the Upload Kursus button
    Then  User will get the pop up messages failed post a course
    And   User click OK button

  @UpdateValidCourse @UploadCourse @Musiclab @PositiveCase
    #BUG, harus di refresh manual ketika step Then User will direct to kursus saya page
  Scenario Outline: Mentor wants to update course with valid data
    Given User already on musiclab website
    When  User click login menu
    Then  User already in login page
    And   User input "aditpandapotan@gmail.com" as email,and input "adit1234" as password, and select "Mentor" as role
    And   User click login button
    Then  User will see pop up message login success
    And   User will direct to homepage
    And   User click ok button
    And   User click profile button
    And   User click kursus saya button
    Then  User will direct to kursus saya page
    And   User click edit course button
    Then  User will direct to update course page
    And   User clear all field data
    And   User upload file on choose file field
    And   User input "<judul_kursus>" as judulkursus, and select "<level>" as level, and input "<deskripsikhusus>" as deskripsikhusus,and input "<apayangdipelajari>" as apayangdipelajari, and input "<prasyaratkhusus>" as prasyaratkhusus, and input "<untuksiapakursusini>" as untuksiapakursusini, and input "<hargakursus>" as hargakursus,and input "<durasikursus>" as duration
    And   User click the Update Kursus button
    Then  User will get the pop up messages success update a course
    Examples:
      | judul_kursus | level | deskripsikhusus | apayangdipelajari | prasyaratkhusus | untuksiapakursusini | hargakursus | durasikursus |
      | Bass Class   | Basic | Lorem ipsum     | Lorem ipsum       | Lorem ipsum     | Lorem ipsum         | 30000       | 15           |

  @UpdateEmptyCourse @UploadCourse @Musiclab @NegativeCase
    #BUG, harus di refresh manual ketika step Then User will direct to kursus saya page
  Scenario: Mentor wants to update course with empty data
    Given User already on musiclab website
    When  User click login menu
    Then  User already in login page
    And   User input "aditpandapotan@gmail.com" as email,and input "adit1234" as password, and select "Mentor" as role
    And   User click login button
    Then  User will see pop up message login success
    And   User will direct to homepage
    And   User click ok button
    And   User click profile button
    And   User click kursus saya button
    Then  User will direct to kursus saya page
    And   User click edit course button
    Then  User will direct to update course page
    And   User clear all field data
    And   User click the Update Kursus button
    Then  User will get the pop up messages failed update a course

  @DeleteCourse @UploadCourse @Musiclab @PositiveCase
    #BUG, harus di refresh manual ketika step Then User will direct to kursus saya page
  Scenario: Mentor wants to delete course
    Given User already on musiclab website
    When  User click login menu
    Then  User already in login page
    And   User input "aditpandapotan@gmail.com" as email,and input "adit1234" as password, and select "Mentor" as role
    And   User click login button
    Then  User will see pop up message login success
    And   User will direct to homepage
    And   User click ok button
    And   User click profile button
    And   User click kursus saya button
    Then  User will direct to kursus saya page
    And   User click delete course button