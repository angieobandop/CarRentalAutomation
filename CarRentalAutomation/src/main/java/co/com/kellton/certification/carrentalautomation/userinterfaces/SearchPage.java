package co.com.kellton.certification.carrentalautomation.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class SearchPage extends PageObject {

    public static final Target CITY = Target.the("Label city").locatedBy("//*[@id=\"city\"]");
    public static final Target MODEL = Target.the("Label to model car").locatedBy("//*[@id=\"model\"]");
    public static final Target PICK_UP_DATE = Target.the("Label pick up date").locatedBy("//*[@id=\"pickup\"]");
    public static final Target DROP_OFF_DATE = Target.the("label drop off date").locatedBy("//*[@id=\"dropoff\"]");
    public static final Target BTN_SEARCH = Target.the("Button to search").locatedBy("//*[@id=\"search_form\"]/button");


    public static final Target BTN_RENT = Target.the("Button to Rent").locatedBy("//*[@id=\"search-results\"]/tbody/tr[1]/td[6]/a");
    public static final Target MSG_ACTION = Target.the("Message Action").locatedBy("//*[@id=\"search-results\"]/thead/tr/th[7]");

    public static final Target BTN_RENTT = Target.the("Button to Rent").locatedBy("/*[@id=\"content\"]/div/div/div[2]/a");
    public static final Target MSG_SUMMARY = Target.the("Message Action").locatedBy("//*[@id=\"content\"]/div/div/h2");

    public static final Target NAME = Target.the("Label name").locatedBy("//*[@id=\"name\"]");
    public static final Target LAST_NAME = Target.the("Label to last name").locatedBy("//*[@id=\"last_name\"]");
    public static final Target CARD_NUMBER = Target.the("Label card number").locatedBy("//*[@id=\"card_number\"]");
    public static final Target EMAIL = Target.the("label to email").locatedBy("//*[@id=\"email\"]");
    public static final Target BTN_RENT_CONFIRMATION = Target.the("Button to Rent confirmation").locatedBy("//*[@id=\"rent_form\"]/button");
    public static final Target CONFIRMATION = Target.the("message confirmation").locatedBy("//*[@id=\"rent_form\"]/button");


}