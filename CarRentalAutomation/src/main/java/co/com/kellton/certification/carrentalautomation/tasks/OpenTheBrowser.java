package co.com.kellton.certification.carrentalautomation.tasks;


import co.com.kellton.certification.carrentalautomation.userinterfaces.Home;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.pages.PageObject;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpenTheBrowser implements Task {

    private final PageObject page;

    public OpenTheBrowser(PageObject page) {
        this.page = page;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(page));
    }

    public static OpenTheBrowser on(Home page) {
        return instrumented(OpenTheBrowser.class, page);
    }
}
