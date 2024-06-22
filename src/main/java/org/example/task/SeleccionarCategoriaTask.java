package org.example.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import org.openqa.selenium.By;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SeleccionarCategoriaTask implements Task {

    private final String categoria;

    public SeleccionarCategoriaTask(String categoria) {
        this.categoria = categoria;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(By.xpath("//a[contains(text(),'" + categoria +"')]"))
        );

    }


    public static SeleccionarCategoriaTask seleccionarCategoria(String categoria){
        return instrumented (SeleccionarCategoriaTask.class, categoria);
    }
}
