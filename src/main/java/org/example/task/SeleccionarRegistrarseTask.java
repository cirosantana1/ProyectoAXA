package org.example.task;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import static org.example.ui.HomePage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SeleccionarRegistrarseTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BTN_SINGUP_SING));
        Serenity.takeScreenshot();
    }


    public static SeleccionarRegistrarseTask seleccionarRegistrarse(){
        return instrumented (SeleccionarRegistrarseTask.class);
    }
}
