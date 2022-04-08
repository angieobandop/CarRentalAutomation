package co.com.kellton.certification.carrentalautomation.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;

import static co.com.kellton.certification.carrentalautomation.userinterfaces.Home.COUNTRY;
import static co.com.kellton.certification.carrentalautomation.userinterfaces.SearchPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SearchCars implements Task {

    private final Target searchCars;

    public SearchCars(Target searchCars) {
        this.searchCars = searchCars;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Enter.theValue("France").into(COUNTRY));
        actor.attemptsTo(Enter.theValue("Paris").into(CITY));
        actor.attemptsTo(Enter.theValue("Toyota").into(MODEL));
        actor.attemptsTo(Click.on(PICK_UP_DATE),Clear.field(PICK_UP_DATE),Enter.theValue("2022-04-11").into(PICK_UP_DATE));
        actor.attemptsTo(Click.on(DROP_OFF_DATE),Clear.field(DROP_OFF_DATE),Enter.theValue("2022-04-13").into(DROP_OFF_DATE));
        actor.attemptsTo(Click.on(BTN_SEARCH));
    }

    public static SearchCars data(Target searchCars) {

        return instrumented(SearchCars.class,searchCars);
    }
}
