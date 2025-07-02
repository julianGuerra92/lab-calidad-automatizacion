package co.edu.udea.calidad.pruebas_automatizacion.tasks;

import co.edu.udea.calidad.pruebas_automatizacion.interactions.AccionesAgregarProducto;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class AgregarProductos implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(AccionesAgregarProducto.alCarrito());
    }

    public static AgregarProductos carritoCompras() {
        return Tasks.instrumented(AgregarProductos.class);
    }
}