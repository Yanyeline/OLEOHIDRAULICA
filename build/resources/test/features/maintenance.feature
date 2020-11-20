Feature: Manage maintenance

  Background: User is loged on page
    Given user is loged on page with email "tecnico@gmail.com" and Password "password"


  Scenario Outline: User can consult a maintenance details
    When user searches for the maintenance's customer hv6-809
    And user selects the maintenance details hv6-809
    Then user sees maintenance information
      | cotizacion     | cliente    |
      | <cotizacion>   | <cliente>  |
    Examples:
      | cotizacion   | cliente    |
      |457           |TELEMEDELLIN|

    Scenario Outline: User can update an maintenance
      When usuer searches for the maintenance's customer hv6-809
      And user enters imformation data
      |  |
      |<>|
      And user update maintenance
      When user sees maintenance information
      Examples:





