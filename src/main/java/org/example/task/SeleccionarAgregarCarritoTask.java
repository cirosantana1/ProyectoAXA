package org.example.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import static org.example.ui.HomePage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SeleccionarAgregarCarritoTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BTN_ADDCAR));
    }

    public static SeleccionarAgregarCarritoTask seleccionarAgregarCarrito(){
        return instrumented (SeleccionarAgregarCarritoTask.class);
    }
}
