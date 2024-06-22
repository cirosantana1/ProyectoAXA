package org.example.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.example.models.ValoresDTO;

import static org.example.ui.HomePage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class DetalleProductoQuestions implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(
                WaitUntil.the(LBL_PRODUCT_NAME, isVisible()).forNoMoreThan(15).seconds());

        String originalProductName = ValoresDTO.getProductoName();
        String currentProductName = LBL_PRODUCT_NAME.resolveFor(actor).getText();


        if(originalProductName.equals(currentProductName)){
            return LBL_DESCRIPCION.resolveFor(actor).isPresent();
        }else {
            throw new AssertionError("Error en nombre del producto");
        }
    }

    public static DetalleProductoQuestions detalleProducto(){
        return new DetalleProductoQuestions();
    }
}
