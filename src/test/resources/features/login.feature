Feature: Login webpage AdvantageDemo
  Yo como usuario personal quiero loguearme en advantegedemo para hacer una compra

  @tag2
  Scenario: Loguin en la pagina advantagedemo
    Given el usuario abre la pagina advantagedemo
    When busca la opcion de loguin e ingresa 'luis.vegliante' y 'Lucho2011'
    Then el usuario podra ver 'luis.vegliante' en pantalla