package co.edu.udea.calidad.pruebas_automatizacion.tasks;

import co.edu.udea.calidad.pruebas_automatizacion.interactions.AccionesAgregarProducto;
import co.edu.udea.calidad.pruebas_automatizacion.interactions.AccionesAgregarUnidadesProducto;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class AgregarUnidadesDeProductos implements Task {

    private final String unidades;

    public AgregarUnidadesDeProductos(String unidades) {
        this.unidades = unidades;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(AccionesAgregarUnidadesProducto.alCarrito(unidades));
    }

    public static AgregarUnidadesDeProductos carritoCompras(String unidades) {
        return Tasks.instrumented(AgregarUnidadesDeProductos.class, unidades);
    }
}
