Feature: Manage user

  Background: user is loged on page
    Given user is loged on page with email "administrador@gmail.com" and Password "password"

  Scenario: User can consult the information of a user
    When user searches for the user "Administrador de flotas"
    Then user sees user information "Administrador de flotas"
