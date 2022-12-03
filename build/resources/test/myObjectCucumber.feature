Feature: Object

  Scenario: Example Object
    Given accedo al manejador de contactos
    When creo un contacto completo con:
      | nombre | apellido  | direccion    | telefono  | alias    | email        |
      | cesar  | ilachoque | av los incas | 931269503 | cesarimm | jc@gmail.com |
    Then el contacto deberia estar creado


