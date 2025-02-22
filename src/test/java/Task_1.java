import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Task_1 {

    @Test
    public void switchingScreenshots() {
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
        driver.get("https://demo.opencart.com");
        WebElement buttonForSwitchScreenshot = driver.findElement(By.className("carousel-control-next"));
        buttonForSwitchScreenshot.click();
        WebElement clickElementOnMainScreen = driver.findElement(By.className("carousel-inner"));
        clickElementOnMainScreen.click();
    }

}
