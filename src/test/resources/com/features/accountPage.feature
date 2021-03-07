Feature: Account Page Feature

  Background:
    Given user has already logged in to application
      | username              | password      |
      | rishabh7774@gmail.com | automation123 |

  Scenario: Accounts page title
    Given user is on Accounts page

  Scenario: Accounts section count
    Given user is on Accounts page
    And account section count should be 6
    Then user gets accounts section
      | order history and details |
      | my credit slips           |
      | my addresses              |
      | my personal information   |
      | my wishlists              |
