package org.example.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.example.models.ValoresDTO;
import org.openqa.selenium.By;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static org.example.ui.HomePage.*;

public class ContenidoCarritoQuestions implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        String originalProduct = ValoresDTO.getProductoName();
        Target PRODUCTO_EN_CARRITO = Target.the("Producto en carrito").located(By.xpath("//td[contains(text(),'"+originalProduct+"')]"));

        actor.attemptsTo(
                WaitUntil.the(BTN_PLACE_ORDER, isVisible()).forNoMoreThan(15).seconds());

        return PRODUCTO_EN_CARRITO.resolveFor(actor).isPresent();
    }

    public static ContenidoCarritoQuestions contenidoCarrito(){
        return new ContenidoCarritoQuestions();
    }
}
