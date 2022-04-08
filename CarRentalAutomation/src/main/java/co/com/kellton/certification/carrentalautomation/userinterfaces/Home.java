package co.com.kellton.certification.carrentalautomation.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;


@DefaultUrl("http://qalab.pl.tivixlabs.com/")
public class Home extends PageObject {
    public static final Target COUNTRY = Target.the("Label country").locatedBy("//*[@id=\"country\"]");


}
