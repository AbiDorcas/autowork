@Login
  Feature: Login Test

  Scenario Outline: As a user i want to login successfull
    Given I go to the Home Page
    And I click the login link
    And I enter my email "<email>" address
    And I enter my password "<password>"
    When I click the login button
    And I sign out

    Examples:
      | email             | password |
      | abisola@yahoo.com | abisola  |
     # | larry@yahoo.com   | abisola  |

