package runner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class MyStepList {
    @Given("ingreso a mi manejador de contactos")
    public void ingresoAMiManejadorDeContactos() {

    }

    @When("yo busco al grupo familia")
    public void yoBuscoAlGrupoFamilia() {
    }

    @Then("los siguiente contactos deberian ser mostrados")
    public void losSiguienteContactosDeberianSerMostrados(List<String> contact) {
        for (String c:contact){
            System.out.println("mi contacto esperado es: "+c);
        }
    }
}
