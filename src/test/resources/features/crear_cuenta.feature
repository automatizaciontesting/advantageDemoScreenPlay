  Feature: Crear cuenta
  Yo quiero crear una cuenta en Advantage Demo

  @tag1
  Scenario: Realizar registro en Advantage Demo para crear cuenta
    Given El usuario ingresa a la pagina de Advantage Demo
    When Ingresa una nueva cuenta
    Then Se creo cuenta exitosamente