package co.com.chami.certificacion.advantagedemo.stepdefinitions;

import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import co.com.chami.certificacion.advantagedemo.questions.ValidaAdvantageDemoRegistro;
import co.com.chami.certificacion.advantagedemo.tasks.RegistroAdvantageDemoTask;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

import java.util.Map;

public class AdvantageDemoCrearCuentaStepDefinitions {
	Actor chami = Actor.named("Chami");
	
	@Managed(driver="chrome")
	WebDriver hisdriver;
	
	@Before
	public void conf() {
		chami.can(BrowseTheWeb.with(hisdriver));
	}
	@Given("^El usuario ingresa a la pagina de Advantage Demo$")
	public void elUsuarioAbreUrlAdvantageDemo() {
		chami.wasAbleTo(Open.url("https://www.advantageonlineshopping.com/"));
	}
	@When("^Ingresa una nueva cuenta$")
	public void ingresarNuevaCuenta(Map<String,String> data) {
		chami.attemptsTo(RegistroAdvantageDemoTask.registroUsuario(data));
	}
	@Then("^Se creo cuenta exitosamente$")
	public void validarCreacionCuenta(){
		chami.should(seeThat(ValidaAdvantageDemoRegistro.registroExitoso(), Matchers.is("editRiano")));
	}
	
	
}
