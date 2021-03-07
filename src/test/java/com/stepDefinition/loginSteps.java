package com.stepDefinition;

import com.pages.loginPage;
import com.qa.factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class loginSteps {

    private loginPage loginPage = new loginPage(DriverFactory.getDriver());
    private static String title = "";

    @Given("user is on login page")
    public void user_is_on_login_page() {
        DriverFactory.getDriver().get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
    }

    @When("user gets the title of the page")
    public void user_gets_the_title_of_the_page() {
        title = loginPage.getLoginPageTitle();
    }

    @Then("page title should be {string}")
    public void page_title_should_be(String expectedTitleName) {
        Assert.assertTrue(title.equals(expectedTitleName));
    }

    @Then("forget your password link should be displayed")
    public void forget_your_password_link_should_be_displayed() {
        Assert.assertTrue(loginPage.isForgetPasswordLink());
    }

    @When("user enters username {string}")
    public void user_enters_username(String string) {
        loginPage.enterUsername(string);
    }

    @When("user enters password {string}")
    public void user_enters_password(String string) {
        loginPage.enterPassword(string);
    }

    @When("user clicks on Login button")
    public void user_clicks_on_login_button() {
        loginPage.clickLogin();
    }

    @Then("user gets the title of page")
    public void user_gets_the_title_of_page() {
        title = loginPage.getLoginPageTitle();
    }

    @Then("Homepage title should be {string}")
    public void Home_page_title_should_be(String expectedTitleName) {
        String title = loginPage.getLoginPageTitle();
        Assert.assertTrue(title.equals(expectedTitleName));
    }

}
