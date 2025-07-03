package co.edu.udea.calidad.pruebas_automatizacion.stepdefinitions;

import co.edu.udea.calidad.pruebas_automatizacion.questions.TextValidation;
import co.edu.udea.calidad.pruebas_automatizacion.tasks.AgregarProductos;
import co.edu.udea.calidad.pruebas_automatizacion.userinterfaces.StoreInterface;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.openqa.selenium.WebDriver;

import static co.edu.udea.calidad.pruebas_automatizacion.userinterfaces.StoreInterface.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

public class AgregarProductoStepDefinition {

    public WebDriver driver;
    private Actor client = new Actor("client");
    StoreInterface storeInterface = new StoreInterface();

    @Before
    public void config(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("client");
        client.can(BrowseTheWeb.with(driver));
    }

    @Given("This method is responsible for parameterizing the instantiation of chromedriver")
    public void thisMethodIsResponsibleForParameterizingTheInstantiationOfChromedriver() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.browserOn().thePageNamed("pages.swaglabsUrl"));
    }

    @Given("que estoy en la página principal de la tienda")
    public void queEstoyEnLaPáginaPrincipalDeLaTienda() {
        client.wasAbleTo(Open.browserOn(storeInterface));
    }

    @When("identifico el primero producto del listado")
    public void identificoElPrimeroProductoDelListado() {
        client.attemptsTo(Scroll.to(TARJETA_PRIMER_PRODUCTO));
    }

    @And("lo agrego al carrito de compras")
    public void loAgregoAlCarritoDeCompras() {
        client.attemptsTo(AgregarProductos.carritoCompras());
    }


    @Then("el producto deberá aparecer en la lista de mi carrito")
    public void elProductoDeberaAparecerEnLaListaDeMiCarrito() {
        client.should(seeThat(TextValidation.containsText(TITULO_PRIMER_PRODUCTO_CARRITO, "Blue Top"), equalTo(true)));
    }

}
