Feature: Manage user

  Background: User is loged on page
    Given user is loged on page with email "administrador@gmail.com" and Password "password"

  Scenario: User can consult the information of a user
    When user searches for the user "Administrador de flotas"
    Then user sees user information "Administrador de flotas"

  @uno
  Scenario Outline: User can register employee successfull
    When user enters registration data
      | name   | email   | id   | role   |
      | <name> | <email> | <id> | <role> |
    Then user registers employee "<name>"
    Examples:
      | name  | email              | id         | role                    |
      | Jonny | jonny12@prueba.com | 1875518281 | administrador de flotas |

