package co.com.chami.certificacion.advantagedemo.stepdefinitions;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.thucydides.core.annotations.Managed;

public class AdvantageDemoCompraStepDefinitions {

	public class AdvantageDemoCrearCuentaStepDefinitions {
		Actor chami = Actor.named("Chami");
		
		@Managed(driver="chrome")
		WebDriver hisdriver;
	
		@Given("^el usuario ingreso a la seccion tables$")
		public void elUsuarioIngresoALaSecciNTables() {
			
		}
	
	
		@When("^el selecciona el articulo 'HP ELITEPAD (\\d+) G(\\d+) TABLET'$")
		public void elSeleccionaElArticuloHPELITEPADGTABLET(int arg1, int arg2) {

		}
	
		@Then("^el pordra ver seleccionar 'HP ELITEPAD (\\d+) G(\\d+) TABLET' en la pantalla$")
		public void elPordraVerSeleccionarHPELITEPADGTABLETEnLaPantalla(int arg1, int arg2) {

		}
		

	}
}