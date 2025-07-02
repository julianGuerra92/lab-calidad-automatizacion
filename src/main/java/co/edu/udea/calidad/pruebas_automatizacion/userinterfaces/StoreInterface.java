package co.edu.udea.calidad.pruebas_automatizacion.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class StoreInterface extends PageObject {


    public static final Target TARJETA_PRIMER_PRODUCTO = Target.the("Tarjeta primer producto")
            .locatedBy("/html/body/section[2]/div/div/div[2]/div[1]/div[2]");

    public static final Target BOTON_AGEGAR_PRIMER_PRODUCTO = Target.the("Boton agregar primer producto")
            .locatedBy("/html/body/section[2]/div/div/div[2]/div[1]/div[2]/div/div[1]/div[1]/a");

    public static final Target BOTON_VIEW_CART = Target.the("Botón Ver Carrito")
            .locatedBy("//*[@id=\"cartModal\"]/div/div/div[2]/p[2]/a/u");

    public static final Target BOTON_CONTINUAR_COMPRANDO = Target.the("Botón Continuar Comprando")
            .locatedBy("//*[@id=\"cartModal\"]/div/div/div[3]/button");

    public static final Target BOTON_CARRITO = Target.the("Botón Carrito")
            .locatedBy("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[3]/a");

    public static final Target TITULO_PRIMER_PRODUCTO_CARRITO = Target.the("Título primer producto carrito")
            .locatedBy("//*[@id=\"product-1\"]/td[2]/h4/a");

    public static final Target PRECIO_UNIDAD_PRIMER_PRODUCTO_CARRITO = Target.the("Precio total primer producto carrito")
            .locatedBy("//*[@id=\"product-1\"]/td[3]/p");

    public static final Target PRECIO_TOTAL_PRIMER_PRODUCTO_CARRITO = Target.the("Precio total primer producto carrito")
            .locatedBy("//*[@id=\"product-1\"]/td[5]/p");
}