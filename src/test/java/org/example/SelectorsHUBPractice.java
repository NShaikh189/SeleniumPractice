package org.example;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.utils.BrowserUtil;
import org.utils.ElementUtil;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class UserData
{
    public String getUserName() {
        return userName;
    }

    public String getUserRole() {
        return userRole;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getStatus() {
        return status;
    }

    private String userName;
    private String userRole;
    private String employeeName;
    private String status;

    public UserData(String userName, String userRole, String employeeName, String status)
    {
        this.userName = userName;
        this.userRole = userRole;
        this.employeeName = employeeName;
        this.status = status;
    }
}
public class SelectorsHUBPractice {
    static WebDriver driver;
    static WebDriverWait wait;

    public static void main(String[] args) throws InterruptedException {
        BrowserUtil browserUtil = new BrowserUtil();

        driver = browserUtil.launchBrowser("chrome");
        ElementUtil elementUtil = new ElementUtil(driver);

        browserUtil.launchUrl("https://selectorshub.com/xpath-practice-page/");

        if (elementUtil.isPageLoaded(3)) {
            By userEmail = By.name("email");
            By password = By.id("pass");
            By company = By.name("company");
            By mobileNumber = By.name("mobile number");
            By country = By.xpath("//label[text()='Country']/input");
            //  By submit = By.xpath("//button[@value = 'Submit']");
            By firstCrush = By.cssSelector("#inp_val");
            //By downloadLink = By.linkText("Download Link");
            //  By downloadLink = By.xpath("//*[@id='content']/div[2]/div/div[2]/div/div[1]/div[2]/div/div/span/a");

            elementUtil.doSendKeys(userEmail, "abc@gmail.com");
            elementUtil.doSendKeys(password, "#1243@Test");
            elementUtil.doSendKeys(company, "CTS");
            elementUtil.doSendKeys(mobileNumber, "342423423");
            elementUtil.doSendKeys(country, "India");
            elementUtil.doSendKeys(firstCrush, "Hoor");
 /*           elementUtil.doClick(downloadLink);
            String text = driver.findElement(downloadLink).getText();
            System.out.println(text);
            Actions act = new Actions(driver);
            act.scrollToElement(driver.findElement(downloadLink)).click().build().perform();
            System.out.println(browserUtil.getPageTitle());
        WebElement submitButton = driver.findElement(submit);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
        wait.until(ExpectedConditions.elementToBeClickable(submit))
        .click();


            By downloadLink = By.partialLinkText("DownLoad");

            WebElement link = driver.findElement(downloadLink);

            String parent = driver.getWindowHandle();

            ((JavascriptExecutor) driver)
                    .executeScript("arguments[0].scrollIntoView(true); arguments[0].click();", link);

            for (String win : driver.getWindowHandles()) {
                if (!win.equals(parent)) {
                    driver.switchTo().window(win);
                    break;
                }
            }

            System.out.println("New Page Title: " + driver.getTitle());
        }
        else {
            System.out.println("Page not loaded");
        }
            Thread.sleep(3000);
*/

            List<String> users = Arrays.asList("Joe.Root","Garry.White","Kevin.Mathews");
            getUsersData(users);

            driver.quit();
        }


    }
    public static void getUsersData (List<String> users) {
            Actions act = new Actions(driver);
            By userData = By.xpath("(//table[@class='table hover']/tbody/tr)");
            wait = new WebDriverWait(driver, Duration.ofSeconds(3));
            List<WebElement> userTable = wait.until(ExpectedConditions.visibilityOfAllElements(driver.findElements(userData)));
            List<UserData> userDataList = new ArrayList<>();
            String roleName;
            String empName;
            String status;
            for (int i = 0; i < userTable.size(); i++) {
                WebElement row = userTable.get(i);
                WebElement namecell = row.findElement(By.xpath("./td[2]"));

                wait.until(ExpectedConditions.visibilityOf(namecell));
                act.scrollToElement(driver.findElement(By.cssSelector("#resultTable"))).build().perform();
                String name = namecell.getText();

                System.out.println(name);
                act.scrollToElement(namecell).build().perform();
               // if(name.trim().equalsIgnoreCase("Joe.Root"))

                if(users.contains(name))
                {

                    WebElement checkbox = row.findElement(By.xpath("./td[1]/input[@type='checkbox']"));
                    wait.until(ExpectedConditions.elementToBeClickable(checkbox));
                    roleName = row.findElement(By.xpath("./td[3]")).getText();
                    empName = row.findElement(By.xpath("./td[4]")).getText();
                    status = row.findElement(By.xpath("./td[5]")).getText();

                    try {

                        if (!checkbox.isSelected())
                            checkbox.click();

                        wait.until(driver -> checkbox.isSelected());
                        userDataList.add( new UserData(name,roleName,empName,status));

                        System.out.println("Clicked");
                    } catch (ElementClickInterceptedException e) {
                    //    ((JavascriptExecutor) driver).executeScript("arguments[0].click();", checkbox);
                        System.out.println(e.getMessage());
                    }

                }

            }
        System.out.println("=======================");

        for(UserData u: userDataList) {
             System.out.println(u.getUserName());
            System.out.println(u.getUserRole());
            System.out.println(u.getEmployeeName());
            System.out.println(u.getStatus());
            System.out.println("=======================");
        }
    }

}


