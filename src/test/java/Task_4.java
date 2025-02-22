import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Task_4 {

    @Test
    public void registration() {
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
        driver.get("https://demo.opencart.com");
        WebElement clickDropMenuRegistration = driver.findElement(By.xpath("//span[text()='My Account']"));
        clickDropMenuRegistration.click();
        WebElement clickRegistration = driver.findElement(By.xpath("//a[text()='Register']"));
        clickRegistration.click();
        WebElement inputFirstName = driver.findElement(By.id("input-firstname"));
        inputFirstName.sendKeys("John");
        WebElement inputLastName = driver.findElement(By.id("input-lastname"));
        inputLastName.sendKeys("Smith");
        WebElement inputEmail = driver.findElement(By.id("input-email"));
        inputEmail.sendKeys("john.smith@gmail.com");
        WebElement inputPassword = driver.findElement(By.id("input-password"));
        inputPassword.sendKeys("password");
        WebElement clickPrivacyPolicy = driver.findElement(By.cssSelector("input.form-check-input[name='agree']"));
        if (!clickPrivacyPolicy.isSelected()) {
            clickPrivacyPolicy.click();
        }
        WebElement clickButtonContinue = driver.findElement(By.cssSelector("button.btn.btn-primary"));
        clickButtonContinue.click();




    }
}
