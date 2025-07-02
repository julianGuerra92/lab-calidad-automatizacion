package co.edu.udea.calidad.pruebas_automatizacion.questions;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.edu.udea.calidad.pruebas_automatizacion.userinterfaces.StoreInterface.TITULO_PRIMER_PRODUCTO_CARRITO;

public class Validation implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        String textoProductoCarrito = Text.of(TITULO_PRIMER_PRODUCTO_CARRITO).answeredBy(actor);
        System.out.println("Texto del producto en el carrito: " + textoProductoCarrito);
        return textoProductoCarrito.contains("Blue Top");
    }

    public static Validation delProductoEnCarrito() {
        return new Validation();
    }

}