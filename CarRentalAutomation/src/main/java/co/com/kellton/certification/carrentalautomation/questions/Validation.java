package co.com.kellton.certification.carrentalautomation.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

import static co.com.kellton.certification.carrentalautomation.userinterfaces.SearchPage.BTN_RENT;


public class Validation implements Question<String>{

	private Target target;

	public Validation(Target target) {
			this.target = target;

		}
	public static Validation of(Target target) {
		return new Validation(target);
	}
	@Override
	public String answeredBy(Actor actor) {
		return Text.of(BTN_RENT).viewedBy(actor).asString();
	}

}
