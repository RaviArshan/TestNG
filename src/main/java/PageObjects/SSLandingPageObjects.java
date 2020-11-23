package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SSLandingPageObjects
{
    WebDriver driver;
    public SSLandingPageObjects(WebDriver driver)
    {
        this.driver=driver;
    }
    By fromCity=By.xpath("//input[@placeholder='From']");
    By toCity=By.xpath("//input[@placeholder='To']");
    By dojDate=By.cssSelector("input[class='searchPanel_date']");
    By doj=By.xpath("//table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr[6]/td[5]");
    By searchBus=By.xpath("//div[text()='SEARCH BUS']");


    public WebElement fromCityMethod()
  {
      return driver.findElement(fromCity);
  }
    public WebElement toCityMethod()
    {
        return driver.findElement(toCity);
    }
    public WebElement dojMethod()
    {
        return  driver.findElement(dojDate);
    }
    public WebElement dojMeth()
    {
        return  driver.findElement(doj);
    }
    public  WebElement searchBusMethod()
    {
        return driver.findElement(searchBus);
    }


}
