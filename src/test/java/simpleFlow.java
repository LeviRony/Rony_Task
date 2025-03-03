import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.time.Duration;

import static org.testng.Assert.assertTrue;

public class simpleFlow {

    //A quick & dirty code for fast and data information for the automation
    @Test
    public static void main() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://connecteam.com/careers/5428476004/");
        Thread.sleep(3000);
        WebElement button = driver.findElement(By.tagName("BUTTON"));
        assertTrue(button.isDisplayed());
        System.out.println("Submit button display: " + button.isDisplayed());
        driver.switchTo().frame(0);  // Switch to the first iframe
        WebElement FirstName = driver.findElement(By.xpath("//*[@id=\"first_name\"]"));
        FirstName.click();
        FirstName.sendKeys("Rony");
        WebElement LastName = driver.findElement(By.xpath("//*[@id=\"last_name\"]"));
        LastName.click();
        LastName.sendKeys("Levi");
        WebElement Email = driver.findElement(By.xpath("//*[@id=\"email\"]"));
        Email.click();
        Email.sendKeys("ronylevi99@gmail.com");
        WebElement Phone = driver.findElement(By.xpath("//*[@id=\"phone\"]"));
        Phone.click();
        Phone.sendKeys("054273287");
        File uploadFile = new File("src/main/resources/example_cv.pdf");
        WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"resume\"]"));
        fileInput.sendKeys(uploadFile.getAbsolutePath());
        Thread.sleep(5000); //Time to review
        driver.quit();
    }
}
