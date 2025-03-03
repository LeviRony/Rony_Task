import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class test {
    @Test
    public static void main() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://connecteam.com/careers/5428476004/");
        Thread.sleep(3000);
        WebElement button = driver.findElement(By.tagName("BUTTON"));
        System.out.println("Submit button display: " + button.isDisplayed());
        WebElement Name = driver.findElement(By.tagName("First Name"));
        Name.click();
        Name.sendKeys("Rony");

    }
}
