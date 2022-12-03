Feature: List
  @SmokeTest
  Scenario: Example list
    Given ingreso a mi manejador de contactos
    When yo busco al grupo familia
    Then los siguiente contactos deberian ser mostrados
    |eyner@gmail.com|
    |jb@gmail.cm    |
    |gg@gmail.com   |

