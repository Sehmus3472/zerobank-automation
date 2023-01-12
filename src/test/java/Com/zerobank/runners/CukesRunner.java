package Com.zerobank.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class) // Bu bize CukesRunner calistirir bu clas olmasa cukesRunneri calistiramayiz.
@CucumberOptions(
        plugin = {"json:target/cucumber.json",
                "html:target/default-html-reports.html",


        },
        features = "src/test/resources/features",
        glue = "Com/zerobank/stepdefinitions",
        dryRun =false,
        tags = "@wip"
)



public class CukesRunner {
}
