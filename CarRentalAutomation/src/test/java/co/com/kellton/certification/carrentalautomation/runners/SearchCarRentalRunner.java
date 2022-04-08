package co.com.kellton.certification.carrentalautomation.runners;


import co.com.kellton.certification.carrentalautomation.utils.personalized.PersonalizedRunner;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import org.junit.runner.RunWith;

@RunWith(PersonalizedRunner.class)
@CucumberOptions(
        features = "src/test/resources/features/search_cars_rental.feature",
        glue = "co.com.kellton.certification.carrentalautomation.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)

public class SearchCarRentalRunner {
    private SearchCarRentalRunner(){

    }
}
