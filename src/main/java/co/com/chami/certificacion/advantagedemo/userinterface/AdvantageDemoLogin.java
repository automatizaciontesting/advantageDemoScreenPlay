package co.com.chami.certificacion.advantagedemo.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class AdvantageDemoLogin {
	public static final Target USER_BUTTON = Target.the("Boton de inicio")
			.locatedBy("//a[@id='menuUserLink']");
	
	public static final Target USER_NAME_LOGIN = Target.the("Nombre de usuario")
			.locatedBy("//input[@name='username']");

	public static final Target PASSWORD = Target.the("Contraseña del usuario")
			.locatedBy("//input[@name='password']");

	
	public static final Target SING_IN_BUTTON = Target.the("Boton iniciar sesion")
			.locatedBy("//button[@id='sign_in_btnundefined']");
	
  	public static final Target SING_IN_USER= Target.the("Usuario logueado")
			.locatedBy("//span[@class='hi-user containMiniTitle ng-binding']");
}
