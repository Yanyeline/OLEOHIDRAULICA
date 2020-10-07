Feature: Configure profile


  Scenario Outline: User can change his profile name

    Given user is loged on page with email "<email>" and Password "<password>"
    When user changes profile name Prueba
    Then the system should show the message Ha cambiado su nombre correctamente.
    Examples:
      | email                   | password |
      | administrador@gmail.com | password |


