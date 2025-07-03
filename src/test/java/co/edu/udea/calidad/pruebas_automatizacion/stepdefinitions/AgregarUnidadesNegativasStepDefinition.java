package co.edu.udea.calidad.pruebas_automatizacion.stepdefinitions;

import co.edu.udea.calidad.pruebas_automatizacion.questions.TextValidation;
import co.edu.udea.calidad.pruebas_automatizacion.tasks.AgregarProductos;
import co.edu.udea.calidad.pruebas_automatizacion.tasks.AgregarUnidadesDeProductos;
import co.edu.udea.calidad.pruebas_automatizacion.userinterfaces.StoreInterface;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.openqa.selenium.WebDriver;

import static co.edu.udea.calidad.pruebas_automatizacion.userinterfaces.StoreInterface.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

public class AgregarUnidadesNegativasStepDefinition {

    public WebDriver driver;
    private Actor client = new Actor("client");
    StoreInterface storeInterface = new StoreInterface();

    @Before
    public void config(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("client");
        client.can(BrowseTheWeb.with(driver));
    }

    @And("dentro del detalle del producto agrego -2 unidades al carrito")
    public void agregroUnidadesAlCarrito() {
        client.attemptsTo(AgregarUnidadesDeProductos.carritoCompras("-2"));
    }

    @Then("no debería poder agregar el producto al carrito de compras")
    public void elProductoNoDeberaPoderAgregarseAlCarrito() {
        client.should(seeThat(TextValidation.containsText(TITULO_CONFIRMACION_PRODUCTO_AGREGADO, "Added!"), equalTo(false)));
    }

}
