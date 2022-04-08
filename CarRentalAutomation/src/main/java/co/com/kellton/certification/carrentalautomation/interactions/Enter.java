package co.com.kellton.certification.carrentalautomation.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;

import java.awt.*;
import java.awt.event.KeyEvent;

public class Enter  implements Interaction {


	@Override
	public <T extends Actor> void performAs(T Actor) {

		Robot robot = null;
		try {
			robot = new Robot();
		} catch (AWTException e) {
			e.printStackTrace();
		}
		robot.keyPress(KeyEvent.VK_ENTER); //press enter key
		robot.keyRelease(KeyEvent.VK_ENTER); //release enter key
		robot.delay(200);

	}

	public static Enter Windows(int vkEnter) {

		return Tasks.instrumented(Enter.class);
	}
}
