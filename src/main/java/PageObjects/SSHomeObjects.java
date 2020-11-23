package PageObjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SSHomeObjects
{
WebDriver driver;
public SSHomeObjects(WebDriver driver)
{this.driver=driver; }
By login=By.xpath("//a[text()='Log In']");

public WebElement loginMethod()
{
return driver.findElement(login);
}

}
