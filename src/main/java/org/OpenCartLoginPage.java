package org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.utils.ElementUtil;

public class OpenCartLoginPage {
    private WebDriver driver;
    private ElementUtil eu;
    private final By EMAILID = By.id("input-email");
    private By password = By.id("input-password");
    private By submitBtn = By.xpath("//input[@value='Login']");

    public OpenCartLoginPage(WebDriver driver)
    {
        this.driver = driver;
        eu = new ElementUtil(driver);
    }

    public void doLogin(String eid, String pwd)
    {
        eu.doSendKeys(EMAILID,eid);
        eu.doSendKeys(password,pwd);
        eu.clickButton(submitBtn);
    }
}
