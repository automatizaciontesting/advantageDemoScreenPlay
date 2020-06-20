package co.com.chami.certificacion.advantagedemo.questions;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import co.com.chami.certificacion.advantagedemo.userinterface.AdvantageDemoLogin;

public class ValidarLoginUsuario implements Question<String>{

	@Override
	public String answeredBy(Actor actor) {
		return Text.of(AdvantageDemoLogin.SING_IN_USER).viewedBy(actor).asString();
	}
	
	public static ValidarLoginUsuario enPantalla() {
		return new ValidarLoginUsuario();
	}
}
