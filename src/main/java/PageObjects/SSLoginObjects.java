package PageObjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SSLoginObjects
{
    WebDriver driver;
    public SSLoginObjects(WebDriver driver)
    {
        this.driver=driver;
    }
    By userName=By.id("emailbox");
    By passWord=By.id("password");
    By submit=By.id("signin_button");

    public WebElement  userNameMethod()
    {
    return driver.findElement(userName);
    }
    public WebElement  passWordMethod()
    {
        return driver.findElement(passWord);
    }
    public WebElement  submitMethod()
    {
        return driver.findElement(submit);
    }
}
