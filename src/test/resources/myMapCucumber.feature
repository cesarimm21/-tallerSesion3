Feature: Maps

  Scenario: Example Maps
    Given accedo al manejador de contactos
    When creo un nuevo contacto
      |nombre|cesar|
      |telefono| 424343434  |
      |direccion   |av los incas|
    Then el contacto deberia estar creado


