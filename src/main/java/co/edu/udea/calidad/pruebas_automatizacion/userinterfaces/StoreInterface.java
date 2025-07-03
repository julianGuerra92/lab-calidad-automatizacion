package co.edu.udea.calidad.pruebas_automatizacion.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class StoreInterface extends PageObject {


    public static final Target TARJETA_PRIMER_PRODUCTO = Target.the("Tarjeta primer producto")
            .locatedBy("/html/body/section[2]/div/div/div[2]/div[1]/div[2]");

    public static final Target BOTON_AGEGAR_PRIMER_PRODUCTO = Target.the("Boton agregar primer producto")
            .locatedBy("/html/body/section[2]/div/div/div[2]/div[1]/div[2]/div/div[1]/div[1]/a");

    public static final Target BOTON_VER_DETALLES_PRIMER_PRODUCTO = Target.the("Botón Ver Detalles Primer Producto")
            .locatedBy("/html/body/section[2]/div/div/div[2]/div/div[2]/div/div[2]/ul/li/a");

    public static final Target BOTON_VIEW_CART = Target.the("Botón Ver Carrito")
            .locatedBy("//*[@id=\"cartModal\"]/div/div/div[2]/p[2]/a/u");

    public static final Target BOTON_CONTINUAR_COMPRANDO = Target.the("Botón Continuar Comprando")
            .locatedBy("//*[@id=\"cartModal\"]/div/div/div[3]/button");

    public static final Target BOTON_CARRITO = Target.the("Botón Carrito")
            .locatedBy("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[3]/a");

    public static final Target BOTON_AGREGAR_CARRITO_DETALLE_PRODUCTO = Target.the("Botón Agregar al Carrito Detalle Producto")
            .locatedBy("/html/body/section/div/div/div[2]/div[2]/div[2]/div/span/button");

    public static final Target INPUT_CANTIDAD_DETALLE_PRODUCTO = Target.the("Input Cantidad Detalle Producto")
            .locatedBy("//*[@id=\"quantity\"]");

    public static final Target TITULO_PRIMER_PRODUCTO_CARRITO = Target.the("Título primer producto carrito")
            .locatedBy("//*[@id=\"product-1\"]/td[2]/h4/a");

    public static final Target TITULO_CONFIRMACION_PRODUCTO_AGREGADO = Target.the("Título confirmación agregar producto")
            .locatedBy("/html/body/section/div/div/div[2]/div[1]/div/div/div[1]/h4");

    public static final Target PRECIO_UNIDAD_PRIMER_PRODUCTO_CARRITO = Target.the("Precio primer producto carrito")
            .locatedBy("//*[@id=\"product-1\"]/td[3]/p");

    public static final Target PRECIO_TOTAL_PRIMER_PRODUCTO_CARRITO = Target.the("Precio total primer producto carrito")
            .locatedBy("//*[@id=\"product-1\"]/td[5]/p");

    public static final Target TITULO_CARRITO_VACIO = Target.the("Título carrito vacío")
            .locatedBy("/html/body/section/div/div[2]/span/p/b");

    public static final Target BOTON_ELIMINAR_PRIMER_PRODUCTO_CARRITO = Target.the("Botón eliminar primer producto carrito")
            .locatedBy("/html/body/section/div/div[2]/table/tbody/tr/td[6]/a");
}