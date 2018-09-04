@BDDLogin
Feature: Test the login functionality on sdet university

  Scenario Outline: The user should be able to login
    Given User navigates to login page
    And User enters email <username>
    When User enters password <password>
    Then User should be successfully logged in and gets confirmation

    Examples:
    | username | password |
    | tim@testemail.com| trpass |
    | testemail@test.com | test123! |