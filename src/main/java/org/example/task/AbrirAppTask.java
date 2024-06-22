package org.example.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import org.example.ui.HomePage;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class AbrirAppTask implements Task {

    private HomePage homePage;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.wasAbleTo(Open.browserOn(homePage));
        getDriver().manage().window().maximize();
    }

    public static AbrirAppTask abrirApp() {
        return Tasks.instrumented(AbrirAppTask.class);
    }
}
