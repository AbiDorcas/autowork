@Register
Feature: Register Test

  Scenario Outline: As a new user want to register account
    Given I go to the Home Page
    And I click the login link
    And I enter my new email address
    And I click on the create account button
    And I click on the female radio button
    And I enter firstname "<firstname>"
    And I enter my lastname "<lastname>"
   #And I verify that email address is prepopulated
   And I enter password "<password>"
    And I enter date of birth
    #  And I enter address
   #And I enter City
    #And I enter state
    #And I enter postal code
    #And I enter country
    #And I enter mobile number
    #When I click on register button
    And I click register
    And I verify that "<user>" is logged in successfully
    And I sign out successfully

    Examples: 
      |firstname |lastname|user            |
      |Mary      |Johnson |   Mary Johnson |
      |Sam       |Dean    |   Sam Dean     |
      |Mark      | Long   |   Mark Long    |
      |Lisa      | Summer |   Lisa Summer  |
      |Nancy     | Owel   | Nancy Owel     |