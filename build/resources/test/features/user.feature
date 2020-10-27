Feature: Manage user

  Background: User is loged on page
    Given user is loged on page with email "administrador@gmail.com" and Password "password"


  Scenario: User can consult the information of a user
    When user searches for the employee Marcos
    Then user sees employee information Marcos


  Scenario Outline: User can register employee successfully
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
    When user looks for employee Socorro to update their information
    And user enters new data
      | name   | email   | id   | role   |
      | <name> | <email> | <id> | <role> |
    And user searches for the employee <name>
    And user sees the detailed information of the employee <name>
    Then user sees updated employee information
      | name   | email   | id   | role   |
      | <name> | <email> | <id> | <role> |
    Examples:
      | name      | email              | id         | role                       |
      | Socorrito | socor48@prueba.com | 1547518001 | administrador de servicios |


  Scenario Outline: User can consult the details of a employee
    When user searches for the employee <email>
    And user sees the detailed information of the employee <email>
    Then user sees employee information
      | name   | email   | id   | role   |
      | <name> | <email> | <id> | <role> |
    Examples:
      | name  | email                    | id         | role          |
      | Ortiz |  jsortiz29@misena.edu.co | 12345678   | super usuario |


  Scenario Outline: User can enable an employee
    When user searches for the employee <email>
    And user select a employee disable "<email>"
    And User closes session
    And user enter email "<email>" and Password "<password>" and click the log In button
    Then user go to the Inicio | COC S.A.S page
    Examples:
      | email                   | password  |
      | jsortiz29@misena.edu.co | 12345678  |


  Scenario: User can enable an employee
    When user searches for the employee jsortiz29@misena.edu.co
    And user select a employee disable jsortiz29@misena.edu.co
    Then user sees state enable in employee jsortiz29@misena.edu.co


  Scenario Outline: User can cancel update for an employee
    When user looks for employee Ortiz to update their information
    And user enters same data
      | name  | email                  | id      | role    |
      | Ortiz | cancelar@misena.edu.co | 1346367 | técnico |
    Then user sees updated employee information
      | name   | email   | id   | role   |
      | <name> | <email> | <id> | <role> |
    Examples:
      | name  | email                   | id       | role          |
      | Ortiz | jsortiz29@misena.edu.co | 12345678 | super usuario |
