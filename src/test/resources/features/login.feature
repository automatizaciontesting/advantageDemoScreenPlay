Feature: Login webpage AdvantageDemo
  Yo como usuario personal quiero loguearme en advantegedemo para hacer una compra

  @tag2
  Scenario: Loguin en la pagina advantagedemo
    Given el usuario abre la pagina advantagedemo
    When busca la opcion de loguin e ingresa 'hervin23' y 'Ingreso2020'
    Then el usuario podra ver 'hervin23' en pantalla