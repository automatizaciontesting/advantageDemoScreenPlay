package co.com.chami.certificacion.advantagedemo.runners;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/features/compra_tablet.feature", 
				 glue="co.com.chami.certificacion.advantagedemo.stepdefinitions",
				 snippets = SnippetType.CAMELCASE)

public class CompraTabletAdvantageDemo {

}
