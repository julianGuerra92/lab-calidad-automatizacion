package co.edu.udea.calidad.pruebas_automatizacion.stepdefinitions;

import co.edu.udea.calidad.pruebas_automatizacion.questions.TextValidation;
import co.edu.udea.calidad.pruebas_automatizacion.userinterfaces.StoreInterface;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.openqa.selenium.WebDriver;

import static co.edu.udea.calidad.pruebas_automatizacion.userinterfaces.StoreInterface.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

public class ValidarCarritoVacioStepDefinition {

    @Managed
    public WebDriver driver;
    private Actor client = new Actor("client");
    StoreInterface storeInterface = new StoreInterface();

    @Before
    public void config(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("client");
        client.can(BrowseTheWeb.with(driver));
    }

    @When("ingreso al carrito de compras sin agregar productos")
    public void alIngresarAlCarritoDeCompras() {
        client.attemptsTo(Click.on(BOTON_CARRITO));
    }

    @And("el carrito debería estar vacío")
    public void elCarritoDeberiaEstarVacio() {
        client.should(seeThat(TextValidation.containsText(TITULO_CARRITO_VACIO, "Cart is empty"), equalTo(true)));
    }

}
