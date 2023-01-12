package Com.zerobank.stepdefinitions;

import Com.zerobank.pages.DashboardPage;
import Com.zerobank.pages.LoginPage;
import Com.zerobank.utilities.BrowserUtils;
import Com.zerobank.utilities.ConfigurationReader;
import Com.zerobank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Login_StepDefs {

    LoginPage loginPage=new LoginPage();

    DashboardPage dashboardPage=new DashboardPage();

    @Given("The user is on the login page")
    public void the_user_is_on_the_login_page() {
        Driver.get().get(ConfigurationReader.get("url"));
        loginPage.signBtn_loc.click();
        BrowserUtils.waitFor(1);
    }
    @When("The user enters with {string} and {string} credentials")
    public void the_user_enters_with_and_credentials(String username, String password) {

        loginPage.login(username, password);

    }
    @Then("verify valid credential {string}")
    public void verify_valid_credential(String expectedMessage) {

        loginPage.verifySummaryMessage(expectedMessage);
    }

    @Then("verify invalid credential {string}")
    public void verifyInvalidCredential(String expextedMessage) {

        loginPage.verifyInvalidMessage(expextedMessage);

    }


    @When("The user enters invalid {string} and {string} credentials")
    public void theUserEntersInvalidAndCredentials(String username, String password) {

        loginPage.negativeLogin(username, password);
    }
}
