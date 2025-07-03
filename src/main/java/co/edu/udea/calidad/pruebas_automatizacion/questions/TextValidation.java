package co.edu.udea.calidad.pruebas_automatizacion.questions;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.edu.udea.calidad.pruebas_automatizacion.userinterfaces.StoreInterface.TITULO_PRIMER_PRODUCTO_CARRITO;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class TextValidation implements Question<Boolean> {

    private final Target target;
    private final String expectedText;

    public TextValidation(Target target, String expectedText) {
        this.target = target;
        this.expectedText = expectedText;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(
                WaitUntil.the(target, isVisible()).forNoMoreThan(5).seconds()
        );
        String actualText = Text.of(target).answeredBy(actor);
        System.out.println("Actual text: " + actualText);
        return actualText.contains(expectedText);
    }

    public static TextValidation containsText(Target target, String expectedText) {
        return new TextValidation(target, expectedText);
    }

}