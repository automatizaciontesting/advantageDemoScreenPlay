package co.com.chami.certificacion.advantagedemo.stepdefinitions;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import co.com.chami.certificacion.advantagedemo.tasks.LoginAdvantageDemo;
import co.com.chami.certificacion.advantagedemo.questions.ValidarLoginUsuario;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class AdvantageDemoLoginStepDefinitions {
	

	Actor chami = Actor.named("Chami");
	@Managed(driver = "Chrome")
	WebDriver hisdriver;

	@Before
	public void config() {
		chami.can(BrowseTheWeb.with(hisdriver));
	}

	@Given("^el usuario abre la pagina advantagedemo$")
	public void elUsuarioAbreLaPaginaAdvantagedemo() {
		chami.wasAbleTo(Open.url("https://www.advantageonlineshopping.com/"));

	}

	@When("^busca la opcion de loguin e ingresa '(.*)' y '(.*)'$")
	public void buscaLaOpcionDeLoguinEIngresaUsuarioYClave(String usuario, String clave) {
		chami.attemptsTo(LoginAdvantageDemo.logueoUsuario(usuario, clave));

	}

	@Then("^el usuario podra ver '(.*)' en pantalla$")
	public void elUsuarioPodraVerUsuarioEnPantalla(String user) {
		chami.should(seeThat(ValidarLoginUsuario.enPantalla(), Matchers.is(user)));

	}      
}
