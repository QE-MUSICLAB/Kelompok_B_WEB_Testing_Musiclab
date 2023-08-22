Feature: Get chat student to mentor, and chat mentor to student with valid data


  @Musiclab @PositiveCase @Chat
    #BUG TIDAK MUNCUL MENTOR
Scenario: Student user chat to mentor
  Given User already on login page
  And   User click login menu on musiclab website
  Then  User already on login page musiclab web
  And   User input "tigorwidodo@gmail.com" as email,input "tigor123" as password and select "Student" as role
  And   User click the login button
  Then  User will get the pop up  message login succes
  And   user click the succes login button
  And   User will direct to  homepage
  And   User click find mentors button
  And   user already on page find mentor
  And   user searches for a mentor in the search option by selecting "wahid sitorus" as a mentor
  And   user clicks on the selected mentor
  And   user already in mentor page
  And   user click lihat chat button
  And   user writes message for mentor with word "Mantap bg wahid penjelasannya"
  And   user click send chat mentor after create value
  And   user click close button
  And   user already in mentor page
  When  user logs out of the mentor page
  And   User will get the pop up messages succes logout
  And   User click pop up succes logout button
  Then  User already on login page musiclab web


  @Musiclab @PositiveCase @Chat
  Scenario: mentor user chat to student
    Given User already on login page
    And   User click login menu on musiclab website
    Then  User already on login page musiclab web
    And   User input "aditpandapotan@gmail.com" as email,input "adit1234" as password and select "Mentor" as role
    And   User click the login button
    Then  User will get the pop up  message login succes
    And   user click the succes login button
    And   User will direct to  homepage
    And   User click the profile menu on hompage
    And   User already in profile student page
    When  user clicks the chat button
    And   user already in page mentor chat students
    And   User click see message student
    And   user writes message for student with word "tolong dipelajari lagi, jangan malas bikin tugas"
    And   user click send chat mentor after create value
    And   user click close button
    And   user click back page button



