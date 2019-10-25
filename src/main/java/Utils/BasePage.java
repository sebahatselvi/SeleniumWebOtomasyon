package Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {
    public BasePage(WebDriver driver){
        this.driver = driver;
    }

    public WebDriver driver;
    public WebElement element(By Locator){
        return driver.findElement(Locator);
    }
    public void sendKeys(By locator,String value){
        element(locator).sendKeys(value);
    }
}
