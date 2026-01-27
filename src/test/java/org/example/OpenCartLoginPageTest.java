package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.utils.BrowserUtil;
import org.utils.ElementUtil;

public class OpenCartLoginPageTest {

    static WebDriver driver;
    static private By emailId = By.id("input-email");
    static private By password = By.id("input-password");
    static private By submitBtn = By.xpath("//input[@value='Login']");

    public static void main(String[] args) throws InterruptedException {
        BrowserUtil bu = new BrowserUtil();
        driver = bu.launchBrowser("Chrome");
        bu.launchUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

        ElementUtil eu = new ElementUtil(driver);

        eu.doSendKeys(emailId,"Shweta@gmail.com");
        eu.doSendKeys(password,"shweta@123");
        eu.clickButton(submitBtn);

        Thread.sleep(5000);
        bu.closeBrowser();
    }
}
