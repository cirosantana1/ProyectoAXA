package org.example.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import static org.example.ui.HomePage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SeleccionarLoginTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BTN_LOGIN_LOGIN));
    }

    public static SeleccionarLoginTask seleccionarLogin(){
        return instrumented (SeleccionarLoginTask.class);
    }
}
