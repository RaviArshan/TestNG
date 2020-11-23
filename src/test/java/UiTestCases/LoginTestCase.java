package UiTestCases;

import BasePackage.BaseClass;
import PageObjects.SRPPage;
import PageObjects.SSHomeObjects;
import PageObjects.SSLandingPageObjects;
import PageObjects.SSLoginObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class LoginTestCase extends BaseClass
{
    @Test
    public void loginTest() throws InterruptedException, IOException {

        WebDriver driver=getDriverObject();
       // ChromeOptions op=new ChromeOptions();
        //op.addArguments("--disable-notifications");
        //System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
        //WebDriver driver = new ChromeDriver(op);
        //Disable the notifications
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        SSHomeObjects homeObj=new SSHomeObjects(driver);
        homeObj.loginMethod().click();
        SSLoginObjects loginObj=new SSLoginObjects(driver);
        loginObj.userNameMethod().sendKeys("ravi.cse413@gmail.com");
        loginObj.passWordMethod().sendKeys("Ravi@123");
        loginObj.submitMethod().click();
        SSLandingPageObjects landingObj=new SSLandingPageObjects(driver);
        landingObj.fromCityMethod().sendKeys("Pun");
        List<WebElement> toCities1= driver.findElements(By.cssSelector("td[role='menuitem']"));
        System.out.println(toCities1);
        for(int i=0;i<toCities1.size();i++)
        {
            if(toCities1.get(i).getText().equalsIgnoreCase("Pune"))
            {
                toCities1.get(i).click();
                break;
            }
        }
        landingObj.toCityMethod().sendKeys("Mum");
        List<WebElement> toCities= driver.findElements(By.cssSelector("td[role='menuitem']"));
        for(int i=0;i<toCities.size();i++)
        {
            if(toCities.get(i).getText().equalsIgnoreCase("Mumbai"))
            {
                toCities.get(i).click();
                break;
            }
        }
        landingObj.dojMethod().click();
        landingObj.dojMeth().click();
        landingObj.searchBusMethod().click();

        ////table[@class='search']/tbody/tr
       // SRPPage srp=new SRPPage(driver);
        //srp.sortFareMethod().click();

    }
}
