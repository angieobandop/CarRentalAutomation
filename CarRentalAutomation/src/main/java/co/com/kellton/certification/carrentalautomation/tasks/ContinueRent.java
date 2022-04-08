package co.com.kellton.certification.carrentalautomation.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;

import static co.com.kellton.certification.carrentalautomation.userinterfaces.SearchPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ContinueRent implements Task {

    private final Target continueRent;

    public ContinueRent(Target searchCars) {
        this.continueRent = searchCars;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(BTN_RENT));
        actor.attemptsTo(Click.on(BTN_RENTT));
        actor.attemptsTo(Enter.theValue("Angie Natalia").into(NAME));
        actor.attemptsTo(Enter.theValue("Obando Pareja").into(LAST_NAME));
        actor.attemptsTo(Enter.theValue("12344321").into(CARD_NUMBER));
        actor.attemptsTo(Enter.theValue("Natalia-09@outlook.com").into(EMAIL));
        actor.attemptsTo(Click.on(BTN_RENT_CONFIRMATION));

    }

    public static ContinueRent data(Target continueRent) {

        return instrumented(ContinueRent.class,continueRent);
    }
}
