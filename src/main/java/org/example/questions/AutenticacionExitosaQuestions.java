package org.example.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.example.models.ValoresDTO;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static org.example.ui.HomePage.*;

public class AutenticacionExitosaQuestions implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(
                WaitUntil.the(TXT_USERNAME, isVisible()).forNoMoreThan(15).seconds());

        String originalUserName = ValoresDTO.getUserName();
        String currentUserName = TXT_USERNAME.resolveFor(actor).getText();


        if(currentUserName.contains(originalUserName)){
            return true;
        }else {
            throw new AssertionError("Error evaluando el nombre de usuario");
        }

    }

    public static AutenticacionExitosaQuestions autenticacionExitosa(){
        return new AutenticacionExitosaQuestions();
    }
}
