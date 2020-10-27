Feature: Manage customer

  Background: User is loged on page
   Given user is loged on page with email "administrador@gmail.com" and Password "password"

    Scenario Outline: User can register an customer
      When user enter data
        | name   | email   | nit   | address   | tel   | contact   | emailcontact   | cel  |
        | <name> | <email> | <nit> | <address> | <tel> | <contact> | <emailcontact> | <cel>|
      And user save data
      Then user sees register on customer table <nit>
      Examples:
        | name   | email               | nit         | address     | tel     | contact   | emailcontact    | cel       |
        | TigUne | servicio@tigune.com | 888881117-2 | Cll 8 - 79A | 4478123 |  Tim      | Yanye@gmail.com | 3016786789|

