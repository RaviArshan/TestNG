package PageObjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SRPPage
{
    WebDriver driver;
    public  SRPPage(WebDriver driver)
    {
        this.driver=driver;
    }
By sortFare=By.xpath("//span[text()='Fare']");
public WebElement sortFareMethod()
{
return driver.findElement(sortFare);
}
}

