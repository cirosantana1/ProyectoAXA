package org.example.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.example.models.ValoresDTO;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static org.example.ui.HomePage.*;

public class GraciasPorSuCompraQuestions implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(
                WaitUntil.the(LBL_THANKYOU_PURCHASE, isVisible()).forNoMoreThan(15).seconds());


        return LBL_THANKYOU_PURCHASE.resolveFor(actor).isPresent();
    }

    public static GraciasPorSuCompraQuestions graciasPorSuCompra(){
        return new GraciasPorSuCompraQuestions();
    }
}
