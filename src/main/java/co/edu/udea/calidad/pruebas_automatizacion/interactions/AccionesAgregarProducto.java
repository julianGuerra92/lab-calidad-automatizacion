package co.edu.udea.calidad.pruebas_automatizacion.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.edu.udea.calidad.pruebas_automatizacion.userinterfaces.StoreInterface.*;

public class AccionesAgregarProducto  implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BOTON_AGEGAR_PRIMER_PRODUCTO),
                Click.on(BOTON_CONTINUAR_COMPRANDO),
                Click.on(BOTON_CARRITO)
        );
    }

    public static AccionesAgregarProducto alCarrito() {
        return Tasks.instrumented(AccionesAgregarProducto.class);
    }
}