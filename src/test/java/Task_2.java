import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Task_2 {

    @Test
    public void switchOfCurrency(){
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
        driver.get("https://demo.opencart.com");
        WebElement clickDropMenu = driver.findElement(By.className("dropdown-toggle"));
        clickDropMenu.click();
        List<WebElement> switchCurrencyEuro = driver.findElements(By.className("dropdown-item"));
        switchCurrencyEuro.get(0).click();
        WebElement clickDropMenu1 = driver.findElement(By.className("dropdown-toggle"));
        clickDropMenu1.click();
        List<WebElement> switchCurrencyDollar = driver.findElements(By.className("dropdown-item"));
        switchCurrencyDollar.get(2).click();
    }
}
