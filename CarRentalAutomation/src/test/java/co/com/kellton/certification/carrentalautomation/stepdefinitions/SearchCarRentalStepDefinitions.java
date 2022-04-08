package co.com.kellton.certification.carrentalautomation.stepdefinitions;


import co.com.kellton.certification.carrentalautomation.questions.Validation;
import co.com.kellton.certification.carrentalautomation.questions.VerifySearchCars;
import co.com.kellton.certification.carrentalautomation.tasks.ContinueRent;
import co.com.kellton.certification.carrentalautomation.tasks.GoTo;
import co.com.kellton.certification.carrentalautomation.tasks.OpenTheBrowser;
import co.com.kellton.certification.carrentalautomation.tasks.SearchCars;
import co.com.kellton.certification.carrentalautomation.userinterfaces.Home;
import co.com.kellton.certification.carrentalautomation.userinterfaces.SearchPage;
import co.com.kellton.certification.carrentalautomation.utils.PrepareActor;
import cucumber.api.Scenario;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.thucydides.core.annotations.Managed;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

import static co.com.kellton.certification.carrentalautomation.userinterfaces.Home.COUNTRY;
import static co.com.kellton.certification.carrentalautomation.userinterfaces.SearchPage.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.core.IsEqual.equalTo;


public class SearchCarRentalStepDefinitions {

    @Managed(driver = "chrome")
    private WebDriver hisBrowser;
    private Home home;
    private SearchPage searchPage;


    @Before
    public void prepareStage(Scenario scenario) {
        PrepareActor.theAbilities();
        WebDriverManager.chromedriver().setup();
    }


    @Given("^\"([^\"]*)\" enters the website$")
    public void somethingEntersTheWebsite(String Actor) {

        theActorCalled(Actor).wasAbleTo(OpenTheBrowser.on(home),
                GoTo.option(COUNTRY));
    }

    @When("^ select country, city, model and date to search$")
    public void selectCountryCityModelAndDateToSearch() {
        theActorInTheSpotlight().attemptsTo(SearchCars.data(CITY));
    }

    @And("^  user must select car to rent, confirm and send personal data$")
    public void userMustSelectCarToRentConfirmAndSendPersonalData() {
        theActorInTheSpotlight().should(seeThat(Validation.of(MSG_ACTION), equalTo("Action")));
        theActorInTheSpotlight().attemptsTo(ContinueRent.data(BTN_RENT));

    }

    @Then("^ user validate confirm rent$")
    public void userValidateConfirmRent() {
        theActorInTheSpotlight().should(seeThat(Validation.of(MSG_SUMMARY), equalTo("Summary")));
        theActorInTheSpotlight().should(seeThat(Validation.of(BTN_RENT_CONFIRMATION), equalTo("Rent")));
        theActorInTheSpotlight().should(seeThat(Validation.of(CONFIRMATION), equalTo("Confirmation")));

    }

    //scenario2
    @Then("^ user validate car rental list$")
    public void userValidateCarRentalList() {
        theActorInTheSpotlight().should(seeThat(VerifySearchCars.of(BTN_RENT)));
    }

}
