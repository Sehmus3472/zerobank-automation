package Com.zerobank.stepdefinitions;

import Com.zerobank.pages.DashboardPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AccountSummary_StepDefs {

    DashboardPage dashboardPage = new DashboardPage();

    @Then("The user see the {string} and verify")
    public void the_user_see_the_and_verify(String category) {

        dashboardPage.verifyAccountsTab(category);
    }

    @Then("The user verify the {string}")
    public void the_user_verify_the(String product) {

        dashboardPage.verifyAccountModule(product);
    }
}
