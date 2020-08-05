package co.com.chami.certificacion.advantagedemo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import co.com.chami.certificacion.advantagedemo.userinterface.AdvantageDemoLogin;

public class LoginAdvantageDemo implements Task{
	private String usuario ;
	private String clave ;
	
	public LoginAdvantageDemo(String usuario, String clave) {
		this.usuario = usuario;
		this.clave = clave;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(
				WaitUntil.the(AdvantageDemoLogin.USER_BUTTON,WebElementStateMatchers.isVisible()).forNoMoreThan(10).seconds(),
				Click.on(AdvantageDemoLogin.USER_BUTTON),
				Enter.theValue(usuario).into(AdvantageDemoLogin.USER_NAME_LOGIN),
				Enter.theValue(clave).into(AdvantageDemoLogin.PASSWORD),
				Click.on(AdvantageDemoLogin.SING_IN_BUTTON));
		
	}
	
	public static LoginAdvantageDemo logueoUsuario(String usuario, String clave) {
		return new LoginAdvantageDemo(usuario, clave);
	}
}