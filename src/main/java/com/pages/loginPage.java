package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage {
    private WebDriver driver;

    // 1. By Locators.
    private By emailId = By.id("email");
    private By password = By.id("passwd");
    private By signInButton = By.id("SubmitLogin");
    private By forgetPassword = By.linkText("Forgot your password?");

    //2. Constructor of the Page Class
    public loginPage(WebDriver driver) {
        this.driver = driver;
    }

    //3. Page Actions
    public String getLoginPageTitle() {
        return driver.getTitle();
    }

    public boolean isForgetPasswordLink() {
        return driver.findElement(forgetPassword).isDisplayed();
    }

    public void enterUsername(String username) {
        driver.findElement(emailId).sendKeys(username);
    }

    public void enterPassword(String pwd) {
        driver.findElement(password).sendKeys(pwd);
    }

    public void clickLogin() {
        driver.findElement(signInButton).click();
    }

    public accountPage doLogin(String username, String password) {
        enterUsername(username);
        enterPassword(password);
        clickLogin();
        System.out.println("User has logged in");
        return new accountPage(driver);
    }
}
