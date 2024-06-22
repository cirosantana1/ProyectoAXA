package org.example.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.demoblaze.com/")

public class HomePage extends PageObject{

    private HomePage(){}

    //Registro usuario
    public static final Target BTN_SINGUP = Target.the("Boton registro")
            .located(By.xpath("//a[@id='signin2']"));
    public static final Target USER_NAME_SING = Target.the("Nombre usuario registro")
            .located(By.xpath("//input[@id='sign-username']"));
    public static final Target PASSWORD_SING = Target.the("Clave registro")
            .located(By.xpath("//input[@id='sign-password']"));
    public static final Target BTN_SINGUP_SING = Target.the("Boton registrar usuario")
            .located(By.xpath("//button[contains(text(),'Sign up')]"));

    //Autenticación usuario
    public static final Target BTN_LOGIN = Target.the("Boton login")
            .located(By.xpath("//a[@id='login2']"));
    public static final Target USER_NAME_LOGIN = Target.the("Nombre usuario login")
            .located(By.xpath("//input[@id='loginusername']"));
    public static final Target PASSWORD_LOGIN = Target.the("Clave login")
            .located(By.xpath("//input[@id='loginpassword']"));
    public static final Target BTN_LOGIN_LOGIN = Target.the("Boton login usuario")
            .located(By.xpath("//button[contains(text(),'Log in')]"));
    public static final Target TXT_USERNAME = Target.the("Texto nombre de usuario")
            .located(By.xpath("//a[@id='nameofuser']"));

    //Comprar producto
    public static final Target LBL_DESCRIPCION = Target.the("Descripción producto")
            .located(By.xpath("//strong[contains(text(),'Product description')]"));
    public static final Target LBL_PRODUCT_NAME = Target.the("Nombre del producto")
            .located(By.xpath("//h2"));
    public static final Target BTN_ADDCAR = Target.the("Boton agregar carrito")
            .located(By.xpath("//a[contains(text(),'Add to cart')]"));
    public static final Target BTN_CART = Target.the("Boton carrito")
            .located(By.xpath("//a[@id='cartur']"));
    public static final Target BTN_PLACE_ORDER = Target.the("Boton realizar pedido")
            .located(By.xpath("//button[contains(text(),'Place Order')]"));

    //Información pedido
    public static final Target TXT_NAME = Target.the("Texto nombre")
            .located(By.xpath("//input[@id='name']"));
    public static final Target TXT_COUNTRY = Target.the("Texto pais")
            .located(By.xpath("//input[@id='country']"));
    public static final Target TXT_CITY = Target.the("Texto ciudad")
            .located(By.xpath("//input[@id='city']"));
    public static final Target TXT_CREDIT_CARD = Target.the("Texto tarjeta de credito")
            .located(By.xpath("//input[@id='card']"));
    public static final Target TXT_MONTH = Target.the("Texto mes")
            .located(By.xpath("//input[@id='month']"));
    public static final Target TXT_YEAR = Target.the("Texto anio")
            .located(By.xpath("//input[@id='year']"));
    public static final Target BTN_PURCHASE = Target.the("Boton compra")
            .located(By.xpath("//button[contains(text(),'Purchase')]"));

    public static final Target LBL_THANKYOU_PURCHASE = Target.the("Gracias por su compra")
            .located(By.xpath("//h2[contains(text(),'Thank you for your purchase!')]"));
}
