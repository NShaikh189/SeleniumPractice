package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.utils.BrowserUtil;
import org.utils.ElementUtil;

public class RegPageTest {
    private static WebDriver driver;

    public static void main(String[] args) {
        BrowserUtil bu = new BrowserUtil();
        ElementUtil eu = new ElementUtil(driver);

        driver = bu.launchBrowser("chrome");
        bu.launchUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

        By fname
                By lname
    }
}
