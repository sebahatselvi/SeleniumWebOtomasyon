package Listener;

import Utils.BaseTest;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener extends BaseTest implements ITestListener{
    public void onTestStart(ITestResult iTestResult) {
        driver.get(baseUrl);
    }

    public void onTestSuccess(ITestResult iTestResult) {
        System.out.println("Başarılı");
    }

    public void onTestFailure(ITestResult iTestResult) {
        System.out.println("Başarısız");
    }

    public void onTestSkipped(ITestResult iTestResult) {
        System.out.println("Atla");
    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    public void onStart(ITestContext iTestContext) {
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
        DesiredCapabilities capabilities=DesiredCapabilities.chrome();
        capabilities.setCapability("marionette", true);
            driver= new ChromeDriver();

    }

    public void onFinish(ITestContext iTestContext) {
        //driver.quit();
    }
}
