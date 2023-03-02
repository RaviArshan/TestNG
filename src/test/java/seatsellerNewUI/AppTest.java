package seatsellerNewUI;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void sampleTest() {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.redbus.in/");
        System.out.println("my  changes");
    }
}
