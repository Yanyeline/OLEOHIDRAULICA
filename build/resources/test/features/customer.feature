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
        | Telme | servicio@tmx.com | 88822117-2 | Cll 8 - 78A | 4488123 |  Cris      | Dnch@gmail.com | 3066786789|

  @uno
    Scenario Outline: User can consult customer details
      When user search an customer <name>
      And user select an customer <name>
      Then user sees customer information
        | name   | email   | nit   | address   | tel   | contact   | emailcontact   | cel  |
        | <name> | <email> | <nit> | <address> | <tel> | <contact> | <emailcontact> | <cel>|
      Examples:
        | name   | email   | nit   | address   | tel   | contact   | emailcontact   | cel  |
        | CONCRETOS ARGOS S.A | mantenimientozno@argos.com.co | 860350697-4 | CALLE 72 #  64C - 55 Medellín | 3456778 | ING. ALEJANDRO TABORDA | mgiraldoe@argos.com.co |3006786789|


    Scenario Outline: User can edit an customer
      When user looks for customer TELEMEDELLIN to update their information
      And user enters data
        | name   | email   | nit   | address   | tel   | contact   | emailcontact   | cel  |
        | <name> | <email> | <nit> | <address> | <tel> | <contact> | <emailcontact> | <cel>|
      And user search an customer <name>
      And user select an customer <name>
      Then user sees customer information
        | name   | email   | nit   | address   | tel   | contact   | emailcontact   | cel  |
        | <name> | <email> | <nit> | <address> | <tel> | <contact> | <emailcontact> | <cel>|
      Examples:
        | name   | email   | nit   | address   | tel   | contact   | emailcontact   | cel  |
        | CANAL1 | mantenimiento@tv.com.co | 863257191-4 | CR 81 # 6 | 4428123 | Servicio al cliente | servicioalcliente@TV.com | 01800067958 |




