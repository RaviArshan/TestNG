package BasePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class BaseClass
{
    ChromeOptions op=new ChromeOptions();
    WebDriver driver;
    public WebDriver getDriverObject() throws IOException {
        String browserName="chrome";
        op.addArguments("--disable-notifications");
        Properties prop=new Properties();
        FileInputStream inputStream=new FileInputStream("C:\\SeatsellerAutomationTestNG\\src\\main\\java\\Resources\\Properties.prop");
        prop.load(inputStream);
        String browser=prop.getProperty("browserName");
        String loginUrl=prop.getProperty("url");
        if(browserName.equals(browser))
        {
            System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Selenium 1\\chromedriver.exe");
             driver= new ChromeDriver(op);
            driver.get(loginUrl);
        }
        else if(browserName.equals("Firefox"))
        {
            System.out.println("Firefox");
        }
        return driver;
    }
}
