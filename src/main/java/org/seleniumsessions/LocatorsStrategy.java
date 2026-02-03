package org.seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.utils.ElementUtil;

public class LocatorsStrategy {
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        driver = new ChromeDriver();
        driver.navigate().to("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
        ElementUtil eu = new ElementUtil(driver);
        By fn = By.id("input-firstname");
        By ln = By.name("lastname");
        By search = By.className("form-control");
        By fn_xpath = By.xpath("//input[@id='input-firstname']");
        //id
       // driver.findElement(By.id("input-firstname")).sendKeys("Nayum");
        eu.doSendKeys(fn,"Nayum");

        Thread.sleep(2000);
        //name
        //driver.findElement(By.name("lastname")).sendKeys("Shaikh");
        eu.doSendKeys(ln, "Shaikh");
        Thread.sleep(2000);
        //classname
       // driver.findElement(By.className("form-control")).sendKeys("testing");
        eu.doSendKeys(search,"testing");
        Thread.sleep(2000);
        //xpath
        //driver.findElement(By.xpath("//input[@id='input-firstname']")).sendKeys("Chandan");
        eu.doSendKeys(fn_xpath,"Chandan");
        Thread.sleep(2000);
        //linkText
        By loginLink = By.linkText("Login");
        driver.findElement(loginLink).click();

        //partialLinkText
        By forgotPasswordLink = By.partialLinkText("Forgotten");
        driver.findElement(forgotPasswordLink).click();


        //tagName
        By pageHeader = By.tagName("h1");
        String headerValue = eu.doGetElementText(pageHeader);
                //driver.findElement(pageHeader).getText();
        System.out.println(headerValue);

        //cssSelector

    }
}
