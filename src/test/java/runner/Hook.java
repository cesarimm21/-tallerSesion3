package runner;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hook {
    @Before
    public void beforeScenario(){
        System.out.println("Antes del scenario: ");
    }
    @After
    public void afterScenario(){
        System.out.println("Despues del scenario: ");
    }
}
