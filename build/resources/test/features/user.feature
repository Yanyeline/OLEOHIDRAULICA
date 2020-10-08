Feature: Manage user


  ##Scenario Outline: User can consult the information of a user

   ## Given user is loged on page with email "<email>" and Password "<password>"
   ## When user searches for the user "Administrador de flotas"
    ##Then user sees user information "Administrador de flotas"
    ##Examples:
    ####  | email                   | password |
     ## | administrador@gmail.com | password |


  Scenario: User can consult the information of a user

    Given user want consult the information of a user
    When user searches for the user "Administrador de flotas"
    Then user sees user information "Administrador de flotas"


  ##Scenario Outline: User can consult the information of a user

    ##Given "<user>" want consult the information of a user
    ##When user searches for the user "Administrador de flotas"
    ##Then user sees user information "Administrador de flotas"
    ##Examples:
     ## | user         |
     ## | Superusuario |
     ## | Técnico      |