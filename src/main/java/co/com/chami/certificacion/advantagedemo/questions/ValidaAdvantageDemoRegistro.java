package co.com.chami.certificacion.advantagedemo.questions;

import co.com.chami.certificacion.advantagedemo.userinterface.AdvantageDemoRegistro;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidaAdvantageDemoRegistro implements Question<String>{

	@Override
	public String answeredBy(Actor actor) {
		return Text.of(AdvantageDemoRegistro.LABEL_ACCOUNT_SUCCESSED).viewedBy(actor).asString();
	}

	public static ValidaAdvantageDemoRegistro registroExitoso() {
		return new ValidaAdvantageDemoRegistro();
	}
}
