package org.seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LocatorsConcept {
    WebDriver driver;
    LocatorsConcept(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(id="username")
    private WebElement userName;


    @FindBy(id="password")
    private WebElement password;

    @FindBy(xpath = "//input[@value='Login']")
    private WebElement submitButton;

    public void doLogin(String unm, String pwd)
    {
        userName.sendKeys(unm);
        password.sendKeys(pwd);
        submitButton.click();

    }
}
