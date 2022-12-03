package runner;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepdefs {
    /*
    * CUCUMBER EXPRESION
    * {} ---> REEMPLAZA A CUALQUIER
    * {int} ---> reemplaza cualquier valor entero
    * {string} ---> reemplaza una cadena en comillas doble "Valor#
    * {word} ---> reemplaza una palabra - no necesita ""
    * {float} ---> reemplaza un valor flotante
    *
    * Expressiones regulares
    *
    *
    *
     */
    @Given("estoy en {}")
    public void estoyEnFacebook(String nombre) {
    }

    @When("ingreso mi usuario: {string}")
    public void ingresoMiUsuarioCesar(String usuario) {
    }

    @And("ingreso mi password: {string}")
    public void ingresoMiPasswordIngcesar(String pass) {
    }

    @And("realizo click en el boton iniciar sesion")
    public void realizoClickEnElBotonIniciarSesion() {
    }

    @Then("yo deberia de ingresar a la aplicacion")
    public void yoDeberiaDeIngresarALaAplicacion() {
    }

    @Then("yo {string} de ingresar a la aplicacion")
    public void yoNoDeberiaDeIngresarALaAplicacion(String texto) {
    }
}
