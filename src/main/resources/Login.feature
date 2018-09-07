@Login
Feature: Login into account
  Existing Stackoverflow user should be able to log into account using correct credentials

Scenario: Log into account with correct data
  Given User navigates to Stackoverflow website
  And User clicks on the login button on homepage
  And User enters a valid username
  And User enters a valid password
  When User clicks on the login button
  Then User should be successfully logged in