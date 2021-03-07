Feature: Login Page Feature

  Scenario: Login Page Title
    Given user is on login page
    When user gets the title of the page
    Then page title should be "Login - My Store"

  Scenario: Login with correct credentials
    Given user is on login page
    When user enters username "rishabh7774@gmail.com"
    And user enters password "automation123"
    And user clicks on Login button
    Then Homepage title should be "My account - My Store"

  Scenario: Forget Password Link
    Given user is on login page
    Then forget your password link should be displayed


