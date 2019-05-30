@Login
  Feature: Login Test

  Scenario Outline: As a user i want to login successfully
    Given I go to the Home Page
    And I click the login link
    And I enter my email "<email>" address
    And I enter my password "<password>"
    When I click the login button
    Then I verify that "<user>" is logged in successfully
    And I sign out

    Examples:
      | email             | password |user            |
      | abisola@yahoo.com | abisola  |Abisola ogunleye|
      | larry@yahoo.com   | abisola  |Abi larry       |

    @ignore
    Scenario Outline: As a user i want to see error message when I Login incorrectly
      Given I go to the Home Page
      And I click the login link
      And I enter my email "<email>" address
      And I enter my password "<password>"
      When I click the login button
      Then I see an error "<errormessage>" message details

      Examples:
      |email           |password|errormessage                  |
      |bisola@yahoo.com|        |Password is required.         |
     |                | abisola|An email address required.     |
      |bisola@yahoo.com|abisola1|      Authentication failed.  |
      |                |        | An email address required.   |


