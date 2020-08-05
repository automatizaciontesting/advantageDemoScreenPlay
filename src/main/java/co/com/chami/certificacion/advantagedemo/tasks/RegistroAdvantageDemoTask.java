package co.com.chami.certificacion.advantagedemo.tasks;

import java.util.HashMap;
import java.util.Map;

import co.com.chami.certificacion.advantagedemo.userinterface.AdvantageDemoRegistro;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class RegistroAdvantageDemoTask implements Task{
	private String userNameAccount;
	private String mailAccount;
	private String passwordAccount;
	private String confirmPassAccount;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String country;
	private String city;
	private String address;
	private String state;
	private String postalCode;
	HashMap<String, String> datoFormulario = new HashMap<>(); 
	 
	public RegistroAdvantageDemoTask (Map<String, String> data) {
		this.userNameAccount=data.get("userNameAccount");
		this.mailAccount=data.get("mailAccount");
		this.passwordAccount=data.get("passwordAccount");
		this.confirmPassAccount=data.get("confirmPassAccount");
		this.firstName=data.get("firstName");
		this.lastName=data.get("lastName");
		this.phoneNumber=data.get("phoneNumber");
		this.country=data.get("country");
		this.city=data.get("city");
		this.address=data.get("address");
		this.state=data.get("state");
		this.postalCode=data.get("postalCode");
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(WaitUntil.the(AdvantageDemoRegistro.ICONO_USUARIO,WebElementStateMatchers.isVisible()).forNoMoreThan(120).seconds(),
		Click.on(AdvantageDemoRegistro.ICONO_USUARIO),
		Click.on(AdvantageDemoRegistro.BOTON_NUEVA_CUENTA),
		Enter.theValue(userNameAccount).into(AdvantageDemoRegistro.CAMPO_USERNAME),
		Enter.theValue(mailAccount).into(AdvantageDemoRegistro.CAMPO_EMAIL),
		Enter.theValue(passwordAccount).into(AdvantageDemoRegistro.CAMPO_CLAVE),
		Enter.theValue(confirmPassAccount).into(AdvantageDemoRegistro.CAMPO_CONFIRMACION_CLAVE),
		Enter.theValue(firstName).into(AdvantageDemoRegistro.CAMPO_FIRSTNAME),
		Enter.theValue(lastName).into(AdvantageDemoRegistro.CAMPO_LASTNAME),
		Enter.theValue(phoneNumber).into(AdvantageDemoRegistro.CAMPO_PHONE),
		SelectFromOptions.byVisibleText(country).from(AdvantageDemoRegistro.SELECT_PAIS),
		Enter.theValue(city).into(AdvantageDemoRegistro.CAMPO_CIUDAD),
		Enter.theValue(address).into(AdvantageDemoRegistro.CAMPO_DIRECCION),
		Enter.theValue(state).into(AdvantageDemoRegistro.CAMPO_ESTADO),
		Enter.theValue(postalCode).into(AdvantageDemoRegistro.CAMPO_CODIGOPOSTAL),
		Click.on(AdvantageDemoRegistro.CHECK_I_AGREE),
		Click.on(AdvantageDemoRegistro.BOTON_REGISTER)
		);
	
	}
	public static RegistroAdvantageDemoTask registroUsuario(Map<String,String> data) {
	 	return new RegistroAdvantageDemoTask (data);	
	}
	
}
