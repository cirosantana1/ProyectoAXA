package org.example.task;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.targets.Target;
import org.example.models.ValoresDTO;
import org.openqa.selenium.By;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SeleccionarProductoTask implements Task {

    private final String producto;

    public SeleccionarProductoTask(String producto) {
        this.producto = producto;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        Target PRODUCTO = Target.the("Producto").located(By.xpath("//a[contains(text(),'"+ producto +"')]"));

        actor.attemptsTo(
                Scroll.to(PRODUCTO));
        Serenity.takeScreenshot();
        actor.attemptsTo(
                Click.on(PRODUCTO));

        ValoresDTO.setProductoName(producto);

    }


    public static SeleccionarProductoTask seleccionarProducto(String producto){
        return instrumented (SeleccionarProductoTask.class, producto);
    }
}
