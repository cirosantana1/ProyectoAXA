package org.example.questions;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import java.util.concurrent.TimeUnit;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class ProductoAgregadoExitosoQuestions implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        Serenity.takeScreenshot();
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        String alertText = getDriver().switchTo().alert().getText();
        getDriver().switchTo().alert().accept();


        System.out.println("Texto de la alerta: " + alertText);

        if(alertText.equals("Product added")){
            return true;
        }else {
            throw new AssertionError("Error al agregar el producto");
        }

    }

    public static ProductoAgregadoExitosoQuestions productoAgregadoExitoso(){
        return new ProductoAgregadoExitosoQuestions();
    }
}
