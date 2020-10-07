Feature: Manage user


  Scenario Outline: User can consult the information of a user

    Given user is loged on page with email "<email>" and Password "<password>"
    When user searches for the user "Administrator de flotas"
    Then user sees user information
    Examples:
      | email                   | password |
      | administrador@gmail.com | password |