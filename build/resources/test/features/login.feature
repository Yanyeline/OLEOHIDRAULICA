Feature: Login
@uno
  Scenario Outline: User can successfully login

    Given user is on the login page
    When user enter email "<email>" and Password "<password>" and click the log In button
    Then user go to the Inicio | COC S.A.S page
    Examples:
      | email                           | password |
      | administrador@gmail.com         | password |



  Scenario Outline: User cannot login successfully
    Given user is on the login page
    When user enter email "<email>" and Password "<password>" and click the log In button
    Then user sees the message Estas credenciales no coinciden con nuestros registros.
    Examples:
      | email                           | password   |
      | administrador@gmail.com         | incorrecto |
      | tecnico@gmail.com               | incorrecto |
      | administradordeflotas@gmail.com | incorrecto |
      | adminservicios@gmail.com        | incorrecto |
      | mecanico@gmail.com              | incorrecto |


  Scenario Outline: User can log out
    Given user is on the login page
    When user enter email "<email>" and Password "<password>" and click the log In button
    And user go to the Inicio | COC S.A.S page
    Then User closes session
    And user go to the COC SAS - Inicio de sesión page

    Examples:
      | email                           | password |
      | administrador@gmail.com         | password |
      | tecnico@gmail.com               | password |
      | administradordeflotas@gmail.com | password |
      | adminservicios@gmail.com        | password |
      | mecanico@gmail.com              | password |


  Scenario Outline: User can recover password
    Given user is on the login page
    When user selects recover password and enter email "<email>"
    Then user recover password

    Examples:
      | email                           |
      | administrador@gmail.com         |
      | tecnico@gmail.com               |
      | administradordeflotas@gmail.com |
      | adminservicios@gmail.com        |
      | mecanico@gmail.com              |
