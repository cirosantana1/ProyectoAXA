package org.example.stepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.core.Serenity;
import org.example.questions.AutenticacionExitosaQuestions;
import org.example.questions.RegistroExitosoQuestions;
import org.example.task.*;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class RegistrarUsuarioSteps {

    @Given("^El usuario (.*) se encuentra en la aplicacion$")
    public void elUsuarioCiroSeEncuentraEnLaAplicacion(String nombreUser) {
        theActorCalled(nombreUser).wasAbleTo(AbrirAppTask.abrirApp());
    }

    @When("^El usuario ingresa sus datos de registro \"([^\"]*)\",\"([^\"]*)\"$")
    public void elUsuarioIngresaSusDatosDeRegistro(String userName, String password){
        theActorInTheSpotlight().attemptsTo(IngresasDatosRegistroTask.ingresasDatosRegistro(userName,password));
        Serenity.takeScreenshot();
    }

    @And("^Selecciona la opción registrarse$")
    public void seleccionaLaOpcionRegistrarse() {
        theActorInTheSpotlight().attemptsTo(SeleccionarRegistrarseTask.seleccionarRegistrarse());
        Serenity.takeScreenshot();
    }

    @Then("^El sistema notificara al usuario que el registro fue exitoso$")
    public void elSistemaNotificaraAlUsuarioQueElRegistroFueExitoso() {
        RegistroExitosoQuestions.registroExitoso().answeredBy(theActorInTheSpotlight());
        Serenity.takeScreenshot();
    }

    @When("^El usuario ingresa sus datos de autenticación \"([^\"]*)\",\"([^\"]*)\"$")
    public void elUsuarioIngresaSusDatosDeAutenticacion(String userName, String password) {
        theActorInTheSpotlight().attemptsTo(IngresasDatosAutenticacionTask.ingresasDatosAutenticacion(userName, password));
        Serenity.takeScreenshot();
    }

    @And("^Selecciona la opción login$")
    public void seleccionaLaOpcionLogin() {
        theActorInTheSpotlight().attemptsTo(SeleccionarLoginTask.seleccionarLogin());
        Serenity.takeScreenshot();
    }

    @Then("^El sistema autenticara al usuario exitosamente y le muestra su username$")
    public void elSistemaAutenticaraAlUsuarioExitosamenteYLeMuestraSuUsername() {
        AutenticacionExitosaQuestions.autenticacionExitosa().answeredBy(theActorInTheSpotlight());
        Serenity.takeScreenshot();
    }
}
