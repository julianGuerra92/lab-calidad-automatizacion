package co.edu.udea.calidad.pruebas_automatizacion.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.edu.udea.calidad.pruebas_automatizacion.userinterfaces.StoreInterface.*;

public class AccionesAgregarUnidadesProducto implements Interaction {

    private final String unidades;

    public AccionesAgregarUnidadesProducto(String unidades) {
        this.unidades = unidades;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BOTON_VER_DETALLES_PRIMER_PRODUCTO),
                Click.on(INPUT_CANTIDAD_DETALLE_PRODUCTO),
                Clear.field(INPUT_CANTIDAD_DETALLE_PRODUCTO),
                Enter.theValue(unidades).into(INPUT_CANTIDAD_DETALLE_PRODUCTO),
                Click.on(BOTON_AGREGAR_CARRITO_DETALLE_PRODUCTO)
        );
    }

    public static AccionesAgregarUnidadesProducto alCarrito(String unidades) {
        return Tasks.instrumented(AccionesAgregarUnidadesProducto.class, unidades);
    }

}
