Feature: my first feature

  Background:
    Given estoy en facebook

  Scenario: As an user i want to ..
    When ingreso mi usuario: "cesar"
    And ingreso mi password: "ingcesar"
    And realizo click en el boton iniciar sesion
    Then yo "deberia" de ingresar a la aplicacion

  Scenario: Scenario2
    When ingreso mi usuario: "noexiste"
    And ingreso mi password: "noexiste"
    And realizo click en el boton iniciar sesion
    Then yo "no deberia" de ingresar a la aplicacion

  Scenario: Scenario3
    When ingreso mi usuario: "cesar"
    And ingreso mi password: "ingcesar"
    And realizo click en el boton iniciar sesion
    Then yo "no deberia" de ingresar a la aplicacion