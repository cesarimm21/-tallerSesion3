Feature: my first feature

  Scenario: As an user i want to ..
    Given estoy en facebook
    When ingreso mi usuario: "cesar"
    And ingreso mi password: "ingcesar"
    And realizo click en el boton iniciar sesion
    Then yo deberia de ingresar a la aplicacion

  Scenario Outline: As an user i want to ..
    Given estoy en facebook
    When ingreso mi usuario: "<user>"
    And ingreso mi password: "<pass>"
    And realizo click en el boton iniciar sesion
    Then <verificación>
    Examples:
      | user  | pass  | verificación|
      | cesar | 12345 |  yo deberia de ingresar a la aplicacion           |
      | jb    | 2222  |    yo deberia de ingresar a la aplicacion         |
