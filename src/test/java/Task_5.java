import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Task_5 {

    @Test
    public void search() {
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
        driver.get("https://demo.opencart.com");
        WebElement inputTextInSearch = driver.findElement(By.cssSelector("input.form-control.form-control-lg"));
        inputTextInSearch.sendKeys("mac");
        WebElement clickInButtonSearch = driver.findElement(By.cssSelector("button.btn.btn-light.btn-lg"));
        clickInButtonSearch.click();
    }

}
