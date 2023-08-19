Feature: student user buy course
@case7
  Scenario: Student user buy course with valid data
    Given User already on login page
    And User click login menu on musiclab website
    Then User already on login page musiclab web
    And User input "tigorwidodo@gmail.com" as email,input "tigor123" as password and select "Student" as role
    And User click the login button
    Then User will get the pop up  message login succes
    And user click the succes login button
    And User will direct to  homepage
    And user clicks find mentor button
    And user already in find mentor page
    When user selects favorite mentor with name "Adit Pandapotan"
    And the user clicks on the desired mentor
    And User already on course mentor page
    And The user selects the desired course
    Then user is already on the training shopping page
    When User click beli kursus button
    Then User already in checkout page
    When User input "19082023" as check availibility, and "Friday" as pilih hari to make payment
    And user click check visibiliti button
    Then will bring up a success pop up
    When user click oke
    Then User already in checkout page
    And user click to payment button
