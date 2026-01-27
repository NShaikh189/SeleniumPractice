package org.example;



import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.utils.BrowserUtil;

/**
 * Unit test for simple App.
 */
public class AppTest {

    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() throws InterruptedException {

        ChromeOptions co = new ChromeOptions();
        co.addArguments("--headless");
        co.addArguments("--incognito");

        BrowserUtil bu = new BrowserUtil();

        WebDriver driver = bu.launchBrowser("CHROME");
        driver.get("https://www.google.com");
      driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://youtube.com");
//        driver.switchTo().newWindow(WindowType.TAB);
//        driver.get("https://cricbuzz.com");
            Thread.sleep(5000);

     //   driver.close();
    //    driver.getTitle(); //No such session exception: Invalid Session ID
        driver.quit();
    //    driver.getTitle(); //No such session exception: Session ID is null
        System.out.println("Finished");
        }
}
