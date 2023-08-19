Feature: Mycoursementor
@case6
  Scenario: mentor user verifies his available course schedule
    Given User already on login page
    And User click login menu on musiclab website
    Then User already on login page musiclab web
    And User input "aditpandapotan@gmail.com" as email,input "adit1234" as password and select "Mentor" as role
    And User click the login button
    Then User will get the pop up  message login succes
    And user click the succes login button
    And User will direct to  homepage
    And User click the profile menu on hompage
    And User already in profile student page
    When User click kursus saya button
    Then User already on kursus saya mentor page

  @case6
  Scenario: the user verifies that the course selection has appeared on the mentor's profile homepage
    Given User already on login page
    And User click login menu on musiclab website
    Then User already on login page musiclab web
    And User input "aditpandapotan@gmail.com" as email,input "adit1234" as password and select "Mentor" as role
    And User click the login button
    Then User will get the pop up  message login succes
    And user click the succes login button
    And User will direct to  homepage
    And User click the profile menu on hompage
    And User already in profile student page
    When User click kursus saya button
    Then User already on kursus saya mentor page
    And User back to home profile click kembali button
    When user mentor logout