Feature: User

  @FilterInstrumentAndRating @SearchAndFilter
  Scenario Outline: Select Filter Instrument And Filter Rating
  Given User already on musiclab website
    When  User click login menu
    Then User already in login page
    And User input "fahrulbarus@gmail.com" as email,and input "fahrulbarus12344" as password, and select "Student" as role
    And User click login button
    Then User will see pop up message login success
    And User will direct to homepage
    And User click ok button
    And User click find mentor button
    Then User will direct to searching page
    And User select "<filter_instrument>" as filter_instrument and "<filter_rating>" as filter_rating
    Examples:
      | filter_instrument | filter_rating |
      | Piano             | 3             |

  @FilterInstrument @SearchAndFilter
  Scenario Outline: Select Filter Instrument And Leave The Filter Rating Blank
    Given User already on musiclab website
    When  User click login menu
    Then User already in login page
    And User input "fahrulbarus@gmail.com" as email,and input "fahrulbarus12344" as password, and select "Student" as role
    And User click login button
    Then User will see pop up message login success
    And User will direct to homepage
    And User click ok button
    And User click find mentor button
    Then User will direct to searching page
    And User select "<filter_instrument>" as filter_instrument
    Examples:
      | filter_instrument |
      | Guitar            |

  @FilterRating @SearchAndFilter
  Scenario Outline: Select Filter Rating And Leave The Filter Instrument Blank
    Given User already on musiclab website
    When  User click login menu
    Then User already in login page
    And User input "fahrulbarus@gmail.com" as email,and input "fahrulbarus12344" as password, and select "Student" as role
    And User click login button
    Then User will see pop up message login success
    And User will direct to homepage
    And User click ok button
    And User click find mentor button
    Then User will direct to searching page
    And User select "<filter_rating>" as filter_rating
    Examples:
      | filter_rating |
      | 5             |

  @AllFilterBlank @SearchAndFilter
  Scenario: Leave All Filter Blank
  Given User already on musiclab website
    When  User click login menu
    Then User already in login page
    And User input "fahrulbarus@gmail.com" as email,and input "fahrulbarus12344" as password, and select "Student" as role
    And User click login button
    Then User will see pop up message login success
    And User will direct to homepage
    And User click ok button
    And User click find mentor button
    Then User will direct to searching page

  @SearchAndFilterRating @SearchAndFilter
  Scenario Outline: Search Mentor And Select Filter Rating
  Given User already on musiclab website
    When  User click login menu
    Then User already in login page
    And User input "fahrulbarus@gmail.com" as email,and input "fahrulbarus12344" as password, and select "Student" as role
    And User click login button
    Then User will see pop up message login success
    And User will direct to homepage
    And User click ok button
    And User click find mentor button
    Then User will direct to searching page
    And User click search field
    And User "<search>" as search_mentor_name and select "<filter_rating>" as filter_rating
    Examples:
      | search | filter_rating |
      | Adit   |   5           |

  @SearchAndFilterRatingBlank @SearchAndFilter
  Scenario: Leave Search Field And Filter Rating Blank
  Given User already on musiclab website
    When  User click login menu
    Then User already in login page
    And User input "fahrulbarus@gmail.com" as email,and input "fahrulbarus12344" as password, and select "Student" as role
    And User click login button
    Then User will see pop up message login success
    And User will direct to homepage
    And User click ok button
    And User click find mentor button
    Then User will direct to searching page
    And User click search field