Feature: User delete their account

  @MentorSchedule
  Scenario: As Mentor want too see their schedule
    Given User already on musiclab website
    When  User click login menu
    Then  User already in login page
    And   User input "aditpandapotan@gmail.com" as email,and input "adit1234" as password, and select "Mentor" as role
    And   User click login button
    Then  User will see pop up message login success
    And   User will direct to homepage
    And   User click ok button
    And   User click profile button
#    Then  User click arrow button at lihat jadwal
#    And   User will see their schedule
#
#  @MentorSchedule
#  Scenario: As Mentor want too see their history mengajar
#    Given User already on musiclab website
#    When  User click login menu
#    Then  User already in login page
#    And   User input "aditpandapotan@gmail.com" as email,and input "adit1234" as password, and select "Mentor" as role
#    And   User click login button
#    Then  User will see pop up message login success
#    And   User will direct to homepage
#    And   User click ok button
#    And   User click profile button
#    Then  User click button jadwal saya
#    And   User will see history mengajar
#
#
#
#  @MentorSchedule
#  Scenario: As Mentor want too delete their schedule
#    Given User already on musiclab website
#    When  User click login menu
#    Then  User already in login page
#    And   User input "aditpandapotan@gmail.com" as email,and input "adit1234" as password, and select "Mentor" as role
#    And   User click login button
#    Then  User will see pop up message login success
#    And   User will direct to homepage
#    And   User click ok button
#    And   User click profile button
#    Then  User click arrow button at lihat jadwal
#    And   User will see their schedule
#    And   User click one x button to delete their schedule


#  @MentorSchedule
#  Scenario: As Mentor want too their schedule and back to profile
#    Given User already on musiclab website
#    When  User click login menu
#    Then  User already in login page
#    And   User input "aditpandapotan@gmail.com" as email,and input "adit1234" as password, and select "Mentor" as role
#    And   User click login button
#    Then  User will see pop up message login success
#    And   User will direct to homepage
#    And   User click ok button
#    And   User click profile button
#    Then  User click button jadwal saya
#    And   User will see history mengajar
#    And   User click back kembali button
#    And   User back to profile page

  @MentorSchedule
  Scenario Outline: As Mentor want too add their schedule with valid data
    Given User already on musiclab website
    When  User click login menu
    Then  User already in login page
    And   User input "aditpandapotan@gmail.com" as email,and input "adit1234" as password, and select "Mentor" as role
    And   User click login button
    Then  User will see pop up message login success
    And   User will direct to homepage
    And   User click ok button
    And   User click profile button
    And   User click arrow button on tambah jadwal
    And   User input "<day>" as day,"<start_time>" as star time, and "<end_time>" as end time
    And   User click the Upload Jadwal button
    Then  User will get the pop up message success post a schedule
    Examples:
      | day      | start_time | end_time |
      | Saturday | 1200       | 1300     |
      | Monday   | 1400       | 1600     |
#  @MentorSchedule
#  Scenario Outline: As Mentor want too add their schedule incomplete data
#    Given User already on musiclab website
#    When  User click login menu
#    Then  User already in login page
#    And   User input "aditpandapotan@gmail.com" as email,and input "adit1234" as password, and select "Mentor" as role
#    And   User click login button
#    Then  User will see pop up message login success
#    And   User will direct to homepage
#    And   User click ok button
#    And   User click profile button
#    And   User click arrow button on tambah jadwal
#    And   User input "<day>" as day,"<start_time>" as star time, and "<end_time>" as end time
#    And   User click the Upload Jadwal button
#    Then  User will get the pop up message success post a schedule
#    Examples:
#      | day      | start_time | end_time |
#      | Saturday |            | 1300     |
#      | Monday   | 1400       |          |

