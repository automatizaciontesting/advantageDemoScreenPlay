Feature: Crear cuenta
  Yo quiero crear una cuenta en Advantage Demo

  @tag2
  Scenario: Realizar registro en Advantage Demo para crear cuenta
    Given El usuario ingresa a la pagina de Advantage Demo
    When Ingresa una nueva cuenta
      | userNameAccount    | editRiano                  |
      | mailAccount        | ediesperanzarm08@gmail.com |
      | passwordAccount    | Ingreso2020                |
      | confirmPassAccount | Ingreso2020                |
      | firstName          | Edit                       |
      | lastName           | Riano                      |
      | phoneNumber        |                 3184228320 |
      | country            | Colombia                   |
      | city               | Bogota                     |
      | address            | Cra 106 # 141 -32          |
      | state              | Suba                       |
      | postalCode         |                         57 |
    Then Se creo cuenta exitosamente

  @tag3
  Scenario Outline: Realizar registro en Advantage Demo para crear cuenta
    Given El usuario ingresa a la pagina de Advantage Demo
    When Ingresa una nueva cuenta
      | userNameAccount    | <userNameAccount> |
      | mailAccount        | <mailAccount>     |
      | passwordAccount    | <passwordAccount> |
      | confirmPassAccount | <passwordAccount> |
      | firstName          | <firstName>       |
      | lastName           | <lastName>        |
      | phoneNumber        | <phoneNumber>     |
      | country            | <country>         |
      | city               | <city>            |
      | address            | <address>         |
      | state              | <state>           |
      | postalCode         | <postalCode>      |
    Then Se creo cuenta exitosamente

    Examples: 
      | userNameAccount | mailAccount                | passwordAccount | firstName | lastName | phoneNumber | country  | city   | address           | state | postalCode |
      | hervinCamargo       | carlierher@yahoo.com | Ingreso2020     | Edit      | Riano    |  3184228320 | Colombia | Bogota | Cra 106 # 141 -32 | Suba  |         57 |
