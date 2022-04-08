package co.com.kellton.certification.carrentalautomation.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

import static co.com.kellton.certification.carrentalautomation.userinterfaces.SearchPage.BTN_RENT;


public class VerifySearchCars implements Question<String>{

	private Target target;

	public VerifySearchCars(Target target) {
			this.target = target;

		}
	public static VerifySearchCars of(Target target) {
		return new VerifySearchCars(target);
	}
	@Override
	public String answeredBy(Actor actor) {
		return String.valueOf(Text.of(BTN_RENT).viewedBy(actor).equals("Rent"));
	}

}
