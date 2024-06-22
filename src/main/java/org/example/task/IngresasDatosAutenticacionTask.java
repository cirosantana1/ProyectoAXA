package org.example.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.example.models.ValoresDTO;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static org.example.ui.HomePage.*;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IngresasDatosAutenticacionTask implements Task {

    private final String userName;
    private final String password;

    public IngresasDatosAutenticacionTask(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_LOGIN),
                WaitUntil.the(USER_NAME_LOGIN, isVisible()).forNoMoreThan(15).seconds(),
                Enter.theValue(userName).into(USER_NAME_LOGIN),
                Enter.theValue(password).into(PASSWORD_LOGIN));

        ValoresDTO.setUserName(userName);
    }


    public static IngresasDatosAutenticacionTask ingresasDatosAutenticacion(String userName, String password){
        return instrumented (IngresasDatosAutenticacionTask.class, userName,password);
    }
}
