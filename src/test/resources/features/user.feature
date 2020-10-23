Feature: Manage user

  Background: User is loged on page
    Given user is loged on page with email "administrador@gmail.com" and Password "password"


  Scenario: User can consult the information of a user
    When user searches for the employee Marcos
    Then user sees employee information Marcos


  Scenario Outline: User can register employee successfull
    When user enters registration data
      | name   | email   | id   | role   |
      | <name> | <email> | <id> | <role> |
    And user saves registration data
    Then user registers employee <name>
    Examples:
      | name         | email              | id         | role                       |
      | Miguel Bueno | miguelb@prueba.com | 1005590081 | administrador de servicios |


  Scenario Outline: User can cancel register employee
    When user enters registration data
      | name   | email   | id   | role   |
      | <name> | <email> | <id> | <role> |
    And user cancels employee registration
    Then user go to the Usuarios | COC S.A.S page
    Examples:
      | name   | email               | id         | role                    |
      | Andres | andres12@prueba.com | 1855518081 | administrador de flotas |


  Scenario Outline: User can modify register employee
    When user looks for employee Socorrito to update their information
    And user enters new data
      | name   | email   | id   | role   |
      | <name> | <email> | <id> | <role> |
    And user searches for the employee <name>
    And user sees the detailed information of the employee <name>
    Then user sees updated employee information
      | name   | email   | id   | role   |
      | <name> | <email> | <id> | <role> |
    Examples:
      | name    | email             | id         | role                       |
      | Socorro | soco48@prueba.com | 1847518001 | administrador de servicios |

  Scenario Outline: User can modify user status
      when the super user modifies the state of a user
        | status   |
        | <status> |
      superuser can change users status from active to naive
      Examples:
        | status    |
        | Inactivo  |



