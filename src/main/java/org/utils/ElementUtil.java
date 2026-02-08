package org.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ElementUtil {
    private WebDriver driver;

    public ElementUtil(WebDriver driver)
    {
        this.driver = driver;

    }

    public By getBy(String locatorType, String locatorValue)
    {
        By locator=null;

        switch (locatorType.trim().toLowerCase())
        {
            case "id": locator = By.id(locatorValue);
            break;

            case "name": locator = By.name(locatorValue);
            break;

            case "classname": locator = By.className(locatorValue);
            break;

            case "xpath": locator = By.xpath(locatorValue);
            break;

            case "cssselector": locator = By.cssSelector(locatorValue);
                break;

            case "linktext" : locator = By.linkText(locatorValue);
            break;

            case "partiallinktext": locator = By.partialLinkText(locatorValue);
            break;

            case "tagname": locator = By.tagName(locatorValue);
            break;
            default: break;
         }
    return locator;
    }

    public WebElement getElement(String locatorType, String locatorValue)
    {
        return getElement(getBy(locatorType,locatorValue));
    }

    public WebElement getElement(By locator)
    {
        return driver.findElement(locator);
    }

    public void doSendKeys(String locatorType, String locatorValue, String value)
    {
        doSendKeys(getBy(locatorType,locatorValue),value);
     //   getElement(locatorType,locatorValue).sendKeys(value);
    }
    public void doSendKeys(By locator, String value)
    {
        //getElement(locator).clear();
        if(getElement(locator).getText().length()!=0)
            getElement(locator).clear();
        else
        getElement(locator).sendKeys(value);
    }

    public void doClick(String locatorType, String locatorValue)
    {
        getElement(locatorType, locatorValue).click();
    }

    public void doClick(By locator)
    {
        getElement(locator).click();
    }

    public String doGetElementText(By locator)
    {
       return getElement(locator).getText();
    }


    public boolean isPageLoaded(int time) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));

        return Boolean.parseBoolean(wait.until(ExpectedConditions.jsReturnsValue("return document.readyState==='complete'")).toString());
    }


}
