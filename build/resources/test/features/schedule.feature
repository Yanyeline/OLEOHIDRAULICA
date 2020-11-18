Feature: Manage schedule


  Background: User is loged on page
    Given user is loged on page with email "administrador@gmail.com" and Password "password"


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

  @uno
  Scenario Outline: User can modify schedule register
    When user looks for schedule 456789 to update their information
    And user enters new schedule data
      | planta   | ejecutor   | ubicacion   | fechaInicial   | equipo   | fechaFin   | denominacion   | horaInicio   | orden   | horaFin   | operacion   |
      | <planta> | <ejecutor> | <ubicacion> | <fechaInicial> | <equipo> | <fechaFin> | <denominacion> | <horaInicio> | <orden> | <horaFin> | <operacion> |
    And user searches for the shedule 4567891
    And user sees the detailed information of the schedule <orden>
    Then user sees updated schedule information
      | planta   | ejecutor   | ubicacion   | fechaInicial   | equipo   | fechaFin   | denominacion   | horaInicio   | orden   | horaFin   | operacion   |
      | <planta> | <ejecutor> | <ubicacion> | <fechaInicial> | <equipo> | <fechaFin> | <denominacion> | <horaInicio> | <orden> | <horaFin> | <operacion> |
    Examples:
      | planta                   | ejecutor | ubicacion | fechaInicial | equipo     | fechaFin   | denominacion                     | horaInicio | orden   | horaFin | operacion  |
      | Correas - Sistema motriz | Juan     | GUAYABAL  | 09/11/2020   | prueba dos | 10/11/2020 | esta es una prueba de actualizar | 0345AM     | 4567891 | 0445PM  | prueba dos |
