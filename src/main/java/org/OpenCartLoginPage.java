package org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.utils.ElementUtil;

public class OpenCartLoginPage {
    private WebDriver driver;
    private ElementUtil eu;
    private String eid = "input-email";
    private String pwd = "input-password";
    private final By EMAILID = By.id("input-email");
    private By password = By.id("input-password");
    private By submitBtn = By.xpath("//input[@value='Login']");

    public OpenCartLoginPage(WebDriver driver)
    {
        this.driver = driver;
        eu = new ElementUtil(driver);
    }

    public void doLogin(String emailId, String pswd)
    {
//        eu.doSendKeys(EMAILID,eid);
//        eu.doSendKeys(password,pwd);
        eu.doSendKeys("id",eid,emailId);
        eu.doSendKeys("id",pwd,pswd);
        eu.clickButton(submitBtn);
    }
}
