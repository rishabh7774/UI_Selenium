package com.stepDefinition;

import com.pages.accountPage;
import com.pages.loginPage;
import com.qa.factory.DriverFactory;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

public class accountSteps {
    private accountPage accountPage;
    private com.pages.loginPage loginPage = new loginPage(DriverFactory.getDriver());

    @Given("user has already logged in to application")
    public void user_has_already_logged_in_to_application(DataTable dataTable) {
        List<Map<String, String>> credList = dataTable.asMaps();
        String username = credList.get(0).get("username");
        String password = credList.get(0).get("password");
        DriverFactory.getDriver().get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
        accountPage = loginPage.doLogin(username, password);
    }

    @Given("user is on Accounts page")
    public void user_is_on_accounts_page() {
        String s = accountPage.getTitle();
        Assert.assertTrue(s.equals("My account - My Store"));
        System.out.println(s);
    }

    @Then("user gets accounts section")
    public void user_gets_accounts_section(DataTable sectionsTable) {
        List<String> expected = sectionsTable.asList();
        List<String> actual = accountPage.getAccountsSectionsList();
        Assert.assertTrue(actual.containsAll(expected));
    }

    @And("account section count should be {int}")
    public void account_section_count_should_be(int x) {
        Assert.assertEquals(accountPage.getAccountSectionCount(), x);
    }
}
