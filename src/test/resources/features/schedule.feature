Feature: Manage schedule

  Background: User is loged on page
    Given user is loged on page with email "administrador@gmail.com" and Password "password"

  @uno
  Scenario: User can consult the information of a schedule
    When user searches for the shedule 456789
    Then user sees schedule information 456789


  Scenario Outline: User can register schedule successfull
    When user enters schedule registration data
      | planta   | ejecutor   | ubicacion   | fechaInicial   | equipo   | fechaFin   | denominacion   | horaInicio   | orden   | horaFin   | operacion   |
      | <planta> | <ejecutor> | <ubicacion> | <fechaInicial> | <equipo> | <fechaFin> | <denominacion> | <horaInicio> | <orden> | <horaFin> | <operacion> |
    And user saves schedule registration data
    Then user registers schedule <orden>
    Examples:
      | planta                             | ejecutor | ubicacion | fechaInicial | equipo | fechaFin   | denominacion       | horaInicio | orden  | horaFin | operacion |
      | Bloque de valvulas - Sistema bomba | camilo   | BELLO     | 23/10/2020   | prueba | 24/10/2020 | esta es una prueba | 0245AM     | 456789 | 0345PM  | prueba    |

