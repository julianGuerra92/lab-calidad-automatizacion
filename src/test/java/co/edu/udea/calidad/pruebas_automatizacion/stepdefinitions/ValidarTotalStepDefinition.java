package co.edu.udea.calidad.pruebas_automatizacion.stepdefinitions;

import co.edu.udea.calidad.pruebas_automatizacion.questions.TextValidation;
import co.edu.udea.calidad.pruebas_automatizacion.tasks.AgregarUnidadesDeProductos;
import co.edu.udea.calidad.pruebas_automatizacion.userinterfaces.StoreInterface;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.openqa.selenium.WebDriver;

import static co.edu.udea.calidad.pruebas_automatizacion.userinterfaces.StoreInterface.*;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

public class ValidarTotalStepDefinition {

    public WebDriver driver;
    private Actor client = new Actor("client");
    StoreInterface storeInterface = new StoreInterface();

    @Before
    public void config(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("client");
        client.can(BrowseTheWeb.with(driver));
    }

    @And("dentro del detalle del producto agregoo 3 unidades al carrito")
    public void agregroUnidadesAlCarrito() {
        client.attemptsTo(AgregarUnidadesDeProductos.carritoCompras("3"));
    }

    @And("al ingresar al carrito de compras")
    public void alIngresarAlCarritoDeCompras() {
        client.attemptsTo(Click.on(BOTON_VIEW_CART));
    }

    @Then("el total del carrito debería reflejar la suma total de los precios de los productos")
    public void elValorTotalDelcarrito() {
        client.should(seeThat(TextValidation.containsText(PRECIO_TOTAL_PRIMER_PRODUCTO_CARRITO, "1000"), equalTo(true)));
        client.attemptsTo(Click.on(BOTON_ELIMINAR_PRIMER_PRODUCTO_CARRITO));
    }

}
