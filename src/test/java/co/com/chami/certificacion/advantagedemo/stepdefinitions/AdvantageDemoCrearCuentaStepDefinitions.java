package co.com.chami.certificacion.advantagedemo.stepdefinitions;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class AdvantageDemoCrearCuentaStepDefinitions {
	Actor chami = Actor.named("Chami");
	
	@Managed(driver="chrome")
	WebDriver hisdriver;
	
	@Given("^El usuario ingresa a la pagina de Advantage Demo$")
	public void elUsuarioAbreUrlAdvantageDemo() {
		chami.can(BrowseTheWeb.with(hisdriver));
	}
	@When("^Ingresa una nueva cuenta$")
	public void ingresarNuevaCuenta() {
		
	}
	@Then("^Se creo cuenta exitosamente$")
	public void validarCreacionCuenta(){
		
	}
	
	
}
