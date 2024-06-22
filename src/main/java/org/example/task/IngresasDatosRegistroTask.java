package org.example.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static org.example.ui.HomePage.*;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IngresasDatosRegistroTask implements Task {

    private final String userName;
    private final String password;

    public IngresasDatosRegistroTask(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_SINGUP),
                WaitUntil.the(USER_NAME_SING, isVisible()).forNoMoreThan(15).seconds(),
                Enter.theValue(userName).into(USER_NAME_SING),
                Enter.theValue(password).into(PASSWORD_SING));
    }


    public static IngresasDatosRegistroTask ingresasDatosRegistro(String userName, String password){
        return instrumented (IngresasDatosRegistroTask.class, userName,password);
    }
}
