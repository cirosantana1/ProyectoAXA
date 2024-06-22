package org.example.task;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

import static org.example.ui.HomePage.*;
import static org.example.models.Constantes.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CompletarPedidoTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BTN_PLACE_ORDER),
                Enter.theValue(NAME).into(TXT_NAME),
                Enter.theValue(COUNTRY).into(TXT_COUNTRY),
                Enter.theValue(CITY).into(TXT_CITY),
                Scroll.to(BTN_PURCHASE),
                Enter.theValue(CREDIT_CARD).into(TXT_CREDIT_CARD),
                Enter.theValue(MONTH).into(TXT_MONTH),
                Enter.theValue(YEAR).into(TXT_YEAR));
        Serenity.takeScreenshot();
        actor.attemptsTo(
                Click.on(BTN_PURCHASE));
    }

    public static CompletarPedidoTask completarPedido(){
        return instrumented (CompletarPedidoTask.class);
    }
}
