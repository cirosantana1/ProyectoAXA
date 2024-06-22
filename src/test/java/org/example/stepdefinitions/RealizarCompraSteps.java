package org.example.stepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.core.Serenity;
import org.example.questions.ContenidoCarritoQuestions;
import org.example.questions.DetalleProductoQuestions;
import org.example.questions.GraciasPorSuCompraQuestions;
import org.example.questions.ProductoAgregadoExitosoQuestions;
import org.example.task.*;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class RealizarCompraSteps {

    @When("^El usuario selecciona la \"([^\"]*)\"$")
    public void elUsuarioSeleccionaLa(String categoria) {
        theActorInTheSpotlight().attemptsTo(SeleccionarCategoriaTask.seleccionarCategoria(categoria));
        Serenity.takeScreenshot();
    }

    @And("^Selecciona el \"([^\"]*)\" a comprar$")
    public void seleccionaElAComprar(String producto){
        theActorInTheSpotlight().attemptsTo(SeleccionarProductoTask.seleccionarProducto(producto));
        Serenity.takeScreenshot();
    }

    @Then("^Se muestra el producto seleccionado junto a su descripción$")
    public void seMuestraElProductoSeleccionadoJuntoASuDescripcion() {
        DetalleProductoQuestions.detalleProducto().answeredBy(theActorInTheSpotlight());
        Serenity.takeScreenshot();
    }

    @When("^Selecciona la opción agregar al carrito$")
    public void seleccionaLaOpcionAgregarAlCarrito() {
        theActorInTheSpotlight().attemptsTo(SeleccionarAgregarCarritoTask.seleccionarAgregarCarrito());
        Serenity.takeScreenshot();
    }

    @Then("^El sistema notificá al usuario que el producto se agrego al carrito exitosamente$")
    public void elSistemaNotificaAlUsuarioQueElProductoSeAgregoAlCarritoExitosamente() {
        ProductoAgregadoExitosoQuestions.productoAgregadoExitoso().answeredBy(theActorInTheSpotlight());
        Serenity.takeScreenshot();
    }

    @When("^Selecciona la opción Carro$")
    public void seleccionaLaOpcionCarro() {
        theActorInTheSpotlight().attemptsTo(SeleccionarCarroTask.seleccionarCarro());
        Serenity.takeScreenshot();
    }

    @Then("^Se muestra el carrito con el producto previamente agregado$")
    public void seMuestraElCarritoConElProductoPreviamenteAgregado() {
        ContenidoCarritoQuestions.contenidoCarrito().answeredBy(theActorInTheSpotlight());
        Serenity.takeScreenshot();
    }

    @When("^Completa el proceso para generar pedido$")
    public void completaElProcesoParaGenerarPedido() {
        theActorInTheSpotlight().attemptsTo(CompletarPedidoTask.completarPedido());
        Serenity.takeScreenshot();
    }

    @Then("^El sistema notificara al usuario Gracias por su compra$")
    public void elSistemaNotificaraAlUsuarioGraciasPorSuCompra() {
        GraciasPorSuCompraQuestions.graciasPorSuCompra().answeredBy(theActorInTheSpotlight());
        Serenity.takeScreenshot();
    }
}
