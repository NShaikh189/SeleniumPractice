package org.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

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
        getElement(locator).sendKeys(value);
    }

    public void clickButton(By locator)
    {
        getElement(locator).click();
    }
}
