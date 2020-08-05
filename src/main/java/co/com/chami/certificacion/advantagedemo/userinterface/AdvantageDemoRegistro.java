package co.com.chami.certificacion.advantagedemo.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class AdvantageDemoRegistro {
	public static final Target ICONO_USUARIO = Target.the("Icono para acceder opciones usuario").
			locatedBy("//*[@id='menuUser']");
	
	public static final Target BOTON_NUEVA_CUENTA = Target.the("Boton crear nueva cuenta").
			locatedBy("//a[@class='create-new-account ng-scope']");
      
      public static final Target CAMPO_USERNAME = Target.the("Campo ingresar userName").
			locatedBy("//*[@name='usernameRegisterPage']");
	
	public static final Target CAMPO_EMAIL = Target.the("Campo ingresar Email").
			locatedBy("//input[@name='emailRegisterPage']");
	
	public static final Target CAMPO_CLAVE = Target.the("Campo ingresar Clave").
			locatedBy("//input[@name='passwordRegisterPage']");
	
	public static final Target CAMPO_CONFIRMACION_CLAVE = Target.the("Campo confirmar Clave").
			locatedBy("//input[@name='confirm_passwordRegisterPage']");
      
      public static final Target CAMPO_FIRSTNAME = Target.the("Campo Ingresar Primer Nombre").
			locatedBy("//input[@name='first_nameRegisterPage']");
	
	public static final Target CAMPO_LASTNAME = Target.the("Campo Ingresar Apellido").
			locatedBy("//input[@name='last_nameRegisterPage']");
	
	public static final Target CAMPO_PHONE = Target.the("Campo Ingresar Telefono").
			locatedBy("//input[@name='phone_numberRegisterPage']");
      
  public static final  Target SELECT_PAIS = Target.the("Campo para seleccionar el pais").
			locatedBy("//select[@name='countryListboxRegisterPage']");
      
	public static final  Target CAMPO_CIUDAD = Target.the("Campo para ingresar pais").
			locatedBy("//input[@name='cityRegisterPage']");
      
	public static final  Target CAMPO_DIRECCION = Target.the("Campo para ingresar direccion").
			locatedBy("//input[@name='addressRegisterPage']");
      
	public static final  Target CAMPO_ESTADO = Target.the("Campo para ingresar estado").
			locatedBy("//input[@name='state_/_province_/_regionRegisterPage']");
      
	public static final  Target CAMPO_CODIGOPOSTAL = Target.the("Campo para ingresar codigo postal").
			locatedBy("//input[@name='postal_codeRegisterPage']");
	
	public static final Target  CHECKBOX_OFFERS = Target.the("checkbox seleccionable").
			locatedBy("//input[@name='allowOffersPromotion']");
	
	public static final Target CHECK_I_AGREE = Target.the("Aceptar acuerdo")
			.locatedBy("//*[@name='i_agree']");
	
	public static final Target  BOTON_REGISTER = Target.the("Boton registro").
			locatedBy("//*[@id='register_btnundefined']");
	
	public static final Target LABEL_ACCOUNT_SUCCESSED = Target.the("Valida la creación de la cuenta correcta").
			locatedBy("//*[@class='hi-user containMiniTitle ng-binding']");
  

}
