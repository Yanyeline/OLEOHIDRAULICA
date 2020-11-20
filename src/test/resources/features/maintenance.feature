
Feature: Manage maintenance

  Background: User is loged on page
    Given user is loged on page with email "adminservicios@gmail.com" and Password "password"


  Scenario Outline: User can consult a maintenance details
    When user searches for the maintenance's customer hv6-809
    And user selects the maintenance details hv6-809
    Then user sees maintenance information
      | cotizacion     | cliente    |
      | <cotizacion>   | <cliente>  |
    Examples:
      | cotizacion   | cliente    |
      |457           |TELEMEDELLIN|

@uno
  Scenario Outline: User can update an maintenance
      When user searches for the maintenance's customer hv6-809
      And user enters imformation data
      | N_cot | F_cot | Tipo_cot | Cliente |  ot | trabajo | equipo | f_in | f_sal | km | h_in | h_sal | ubicacion | placa | horometro | mixer | autobomba | cargador | b_estacionaria | planta | personal | especialidad_v| fecha_v | costo_hotel| costo_alimentacion | costo_trans| descripcion_t | costo | aui | personal_m | especialidad_m | f_salida | diurno | nocturno | festivo | h_trabajadas | descripcion_r  | cantidad_r | valor_r | aiu_r |iva | img1 | img2 | f_pago | vigencia | l_entrega | att | obs |
      | <N_cot> | <F_cot> | <Tipo_cot> | <Cliente> |  <ot> | <trabajo> | <equipo> | <f_in> | <f_sal> | <km> | <h_in> | <h_sal> | <ubicacion> | <placa> | <horometro> | <mixer> | <autobomba> | <cargador> | <b_estacionaria> | <planta> | <personal> | <especialidad_v>| <fecha_v> | <costo_hotel>| <costo_alimentacion> | <costo_trans>| <descripcion_t> | <costo> | <aui> | <personal_m> | <especialidad_m> | <f_salida> | <diurno> | <nocturno> | <festivo> | <h_trabajadas> | <descripcion_r>  | <cantidad_r> | <valor_r> | <aiu_r> |<iva> | <img1> | <img2> | <f_pago> | <vigencia> | <l_entrega> | <att> | <obs> |
      And user update maintenance
      When user sees update information
      Examples:
        | N_cot | F_cot | Tipo_cot | Cliente |  ot | trabajo | equipo | f_in | f_sal | km | h_in | h_sal | ubicacion | placa | horometro | mixer | autobomba | cargador | b_estacionaria | planta | personal | especialidad_v| fecha_v | costo_hotel| costo_alimentacion | costo_trans| descripcion_t | costo | aui | personal_m | especialidad_m | f_salida | diurno | nocturno | festivo | h_trabajadas | descripcion_r  | cantidad_r | valor_r | aiu_r |iva | img1 | img2 | f_pago | vigencia | l_entrega | att | obs |
        | 1 | 03/02/2020 | inicial | TELEMEDELLIN |  120987654321 | <trabajo> | <equipo> | <f_in> | <f_sal> | <km> | <h_in> | <h_sal> | <ubicacion> | <placa> | <horometro> | <mixer> | <autobomba> | <cargador> | <b_estacionaria> | <planta> | <personal> | <especialidad_v>| <fecha_v> | <costo_hotel>| <costo_alimentacion> | <costo_trans>| <descripcion_t> | <costo> | <aui> | <personal_m> | <especialidad_m> | <f_salida> | <diurno> | <nocturno> | <festivo> | <h_trabajadas> | <descripcion_r>  | <cantidad_r> | <valor_r> | <aiu_r> |<iva> | <img1> | <img2> | <f_pago> | <vigencia> | <l_entrega> | <att> | <obs> |





