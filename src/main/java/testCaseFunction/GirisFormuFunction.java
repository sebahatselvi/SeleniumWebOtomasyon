package testCaseFunction;

import Utils.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class GirisFormuFunction extends BasePage {
    public GirisFormuFunction(WebDriver driver) {
        super(driver);
    }
    private By email = By.id("email");
    private By password = By.id("password");
    public void Form()
    {
        element(By.className("btnSignIn")).click();
        sendKeys(email,"seleniumwebotomasyon@gmail.com");
        sendKeys(password,"123test");
        element(By.id("loginButton")).click();
        Assert.assertEquals(element(By.className("user")).getText(),"selenium webotomasyon");
    }

}
