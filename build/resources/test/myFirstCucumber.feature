Feature: my first feature
  @SmokeTest @Regression @SanityTest
  Scenario: As an user i want to ..
    Given estoy en facebook
    When ingreso mi usuario: "cesar"
    And ingreso mi password: "ingcesar"
    And realizo click en el boton iniciar sesion
    Then yo deberia de ingresar a la aplicacion
