package testCaseFunction;
import Utils.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
public class SearchTestFunction extends BasePage {
    public SearchTestFunction(WebDriver driver) {
        super(driver);
    }
    private By searchData = By.id("searchData");
    public void Arama()
    {
        sendKeys(searchData,"Bilgisayar");
        element(By.className("searchBtn")).click();
        driver.get("https://www.n11.com/arama?q=Bilgisayar&pg=2");
        driver.get("https://urun.n11.com/dizustu-bilgisayar/lenovo-v330-15ikb-81ax016mtx-intel-core-i5-8250u-8gb-256-gb-ssd-P374602189");
        String urunFiyat = element(By.className("proDetail")).findElement(By.className("newPrice")).findElement(By.tagName("ins")).getText();
        element(By.xpath("//*[@id=\"contentProDetail\"]/div/div[3]/div[2]/div[3]/div[3]/a[2]")).click();
        element(By.className("myBasket")).click();

        Assert.assertEquals(element(By.className("priceArea")).findElement(By.tagName("span")).getText(),urunFiyat);
        element(By.xpath("//*[@id=\"newCheckout\"]/div/div[1]/div[2]/div[1]/section[2]/table[2]/tbody/tr/td[3]/div[1]/div/span[1]")).click();
        String adet = element(By.className("spinnerField")).findElement(By.className("quantity")).getAttribute("value");

        Assert.assertEquals(element(By.className("spinnerField")).findElement(By.className("quantity")).getAttribute("value"),"2");
        element(By.xpath("//*[@id=\"newCheckout\"]/div/div[1]/div[2]/div[1]/section[2]/table[2]/tbody/tr/td[1]/div[3]/div[2]/span[1]")).click();
    }
}


