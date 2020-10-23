Feature: Configure profile

  Background: user is loged on page
    Given user is loged on page with email "administrador@gmail.com" and Password "password"

  Scenario: User can change his profile name
    When user changes profile name Prueba
    Then the system should show the message Ha cambiado su nombre correctamente.

