Feature : edit profile student

Scenario: EditStudentProfile with valid data
  Given User already on login page
  And User click login menu on musiclab website
  Then User already on login page musiclab web
  And User input "tigorsumarjaa@gmail.com" as email,input "tigor123" as password and select "Student" as role
  And User click the login button
  Then User will get the pop up  message login succes
  And User will direct to  homepage
  And User click the profile menu on hompage
  And User already in profile student page
  And User click the edit profile button at profile student page
  And User Already in edit profile student page
  And User edit photo profile
  When User input "TigorWidodo" as namalengkap, select "Male" as jeniskelamin, input "082368654421" as phone, input "tigorwidodo@gmail.com" as email and input "nusa kembangan" as alamat
  And User click the update button at edit profile student page
  Then User will get the pop up messages

