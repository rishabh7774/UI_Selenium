package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class accountPage {
    private WebDriver driver;
    private By accountSections = By.cssSelector("div#center_column span");

    public accountPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getTitle() {
        return driver.getTitle();
    }

    public int getAccountSectionCount() {
        return driver.findElements(accountSections).size();
    }

    public List<String> getAccountsSectionsList() {
        List<WebElement> accountsHeaderList = driver.findElements(accountSections);
        List<String> accountList = new ArrayList<>();
        for (WebElement e : accountsHeaderList) {
            accountList.add(e.getText().toLowerCase());
            System.out.println(e.getText().toLowerCase());
        }
        return accountList;
    }
}
