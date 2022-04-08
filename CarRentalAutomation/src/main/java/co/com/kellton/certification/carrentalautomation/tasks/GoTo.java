package co.com.kellton.certification.carrentalautomation.tasks;

import co.com.kellton.certification.carrentalautomation.userinterfaces.Home;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class GoTo implements Task {

    private final Target searchCarsPage;

    public GoTo(Target searchCarsPage) {
        this.searchCarsPage = searchCarsPage;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(Home.COUNTRY));
    }

    public static GoTo option(Target searchCarsPage) {

        return instrumented(GoTo.class, searchCarsPage);
    }
}
