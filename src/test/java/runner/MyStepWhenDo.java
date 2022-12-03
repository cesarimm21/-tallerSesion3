package runner;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class MyStepWhenDo {
    AppiumDriver driver;
    @Given("que tengoo acceso a mi apk")
    public void queTengooAccesoAMiApk() throws MalformedURLException {
        DesiredCapabilities capabilities= new DesiredCapabilities();
        capabilities.setCapability("deviceName","192.168.120.102:5555");
        capabilities.setCapability("platformVersion","9.0");
        capabilities.setCapability("appPackage","com.vrproductiveapps.whendo");
        capabilities.setCapability("appActivity","com.vrproductiveapps.whendo.ui.HomeActivity");
        capabilities.setCapability("platformName","Android");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
        // implicit waits
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @When("presiono en agregar nota")
    public void presionoEnAgregarNota() {
        // click +
        driver.findElement(By.id("com.vrproductiveapps.whendo:id/fab")).click();
    }

    @And("ingresamos titulo de nota {string}")
    public void ingresamosTituloDeNota(String nota) {
        // set title
        driver.findElement(By.id("com.vrproductiveapps.whendo:id/noteTextTitle")).sendKeys(nota);
    }

    @And("ingresamos mensaje de nota {string}")
    public void ingresamosMensajeDeNota(String mensaje) {
        //set nota
        driver.findElement(By.id("com.vrproductiveapps.whendo:id/noteTextNotes")).sendKeys(mensaje);
    }

    @And("guardamos la nota")
    public void guardamosLaNota() {
        // click save
        driver.findElement(By.id("com.vrproductiveapps.whendo:id/saveItem")).click();
    }

    @And("validamos la nota guardado {string}")
    public void validamosLaNotaGuards(String nota) {
        // verification
        String expectedResult="test taller 2";
        String actualResult=driver.findElement(By.id("com.vrproductiveapps.whendo:id/home_list_item_text")).getText();
        Assertions.assertEquals(nota,actualResult,"ERROR!! no se creo el la lista");
    }
}
