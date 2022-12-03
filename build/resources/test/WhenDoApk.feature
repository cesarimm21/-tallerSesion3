Feature: APK When Do
  @TestWhenDo
  Scenario: As an user I want to add note in WhenDo
    Given que tengoo acceso a mi apk
    When presiono en agregar nota
    And ingresamos titulo de nota "test taller 3"
    And ingresamos mensaje de nota "Notas para el taller 3"
    And guardamos la nota
    And validamos la nota guardado "test taller 3"
