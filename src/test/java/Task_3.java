import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Task_3 {
    @Test
    public void checkingPageEmpties() {
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
        driver.get("https://demo.opencart.com");
        WebElement dropMenuClickDesktops = driver.findElement(By.cssSelector("a.nav-link.dropdown-toggle"));
        dropMenuClickDesktops.click();
        WebElement clickOnPC = wait.until(
                ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'PC')]"))
        );
        clickOnPC.click();
        WebElement noProduct = driver.findElement(By.xpath("//p[contains(text(),'There are no products to list in this category.')]"));
        assert noProduct.getText().equals("There are no products to list in this category.");
    }
}
