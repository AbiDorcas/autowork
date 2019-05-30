@Register
Feature: Register Test

  Scenario Outline: As a new user want to register account
    Given I go to the Home Page
    And I click the login link
    And I enter my my "<email>" email adress
    And I click on the create account button
    And I click on the female radio button
    And I enter firstname "<firstname>"
    And I enter my lastname "<lastname>"
    And I verify that email adress is prepopulated
    And I enter password "<password>"
    And I enter date of birth
    And I enter City
    And I enter state
    And I enter postal code
    And I enter country
    And I enter mobile number
    When I click on register button
    Then I verify that i am registered as a new user
    And I sign out
    #And I sign out successfully

    Examples: 
      | email           | firstname | lastname | password | date      | month | year |
      | njake@yahoo.com | nancy     | yui      | abisola  |        15 |    05 | 1996 |
     # | mark@gmail.com  | mark      | henry    | abisola  |        05 |    05 | 1996 |
      #| moon@yahoo.com  | sun       | mars     | abisola  |        11 |    05 | 1996 |
