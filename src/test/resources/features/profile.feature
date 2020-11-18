Feature: Configure profile

  Background: user is loged on page
    Given user is loged on page with email "administrador@gmail.com" and Password "password"

  Scenario: User can change his profile name
    When user changes profile name Super usuario
    Then the system should show the message Ha cambiado su nombre correctamente.

  @uno
  Scenario: User can change his profile photo
    When user changes profile photo Super usuario
    Then the system should show the message Ha cambiado su foto correctamente.
