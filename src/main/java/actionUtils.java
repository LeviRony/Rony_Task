import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.WaitUtils;

import java.io.File;
import java.time.Duration;


public class actionUtils {
    public static WebDriver driver = browserDriver.driver;

    // it can wait x sec's if needed before clicking the button
    public static void clickOnCareerButton(By xpath, int timeoutInSeconds) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds));
        WebElement button = wait.until(ExpectedConditions.visibilityOfElementLocated(xpath));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", button);
        button.click();
    }

    public static void dropdownRndDepartment(By xpath, int timeoutInSeconds) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds));
        WebElement dropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(xpath));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", dropdown);
        Select select = new Select(dropdown);
        select.selectByContainsVisibleText("R&D");
    }

    public static void clickOnAppleNow() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement button = driver.findElement(homePage.AppleNow_Button);
        js.executeScript("arguments[0].scrollIntoView(true);", button);
        js.executeScript("arguments[0].click();", button);
    }

    public static void appleFormValidation(int timeoutInSeconds, String User_First_Name, String User_Last_Name, String User_Phone, String User_Email, String File_Name) throws InterruptedException {
        WaitUtils.waitForElement(driver, careersPage.Submit_Button, timeoutInSeconds);
        Thread.sleep(2000);
        iFrameSwitcher(); //Switching to Apple frame
        formFirstName(User_First_Name); // Entering user first name
        formLastName(User_Last_Name); //Entering user last name
        formEmail(User_Email); //Entering email address
        formPhone(User_Phone); //Enter phone number
        upload(File_Name); //Upload CV file
    }

    public static void iFrameSwitcher() {
        browserDriver.driver.switchTo().frame(0);
    }

    public static void upload(String File_Name) {
        File uploadFile = new File(File_Name);
        WebElement fileInput = driver.findElement(careersPage.UploadResume);
        fileInput.sendKeys(uploadFile.getAbsolutePath());
    }


    public static void formFirstName(String User_First_Name) {
        WebElement LastName = driver.findElement(careersPage.input_First_Name);
        LastName.click();
        LastName.sendKeys(User_First_Name);
    }

    public static void formLastName(String User_Last_Name) {
        WebElement LastName = driver.findElement(careersPage.input_Last_Name);
        LastName.click();
        LastName.sendKeys(User_Last_Name);
    }

    public static void formEmail(String User_Email) {
        WebElement LastName = driver.findElement(careersPage.input_Email);
        LastName.click();
        LastName.sendKeys(User_Email);
    }

    public static void formPhone(String User_Phone) {
        WebElement LastName = driver.findElement(careersPage.input_Phone);
        LastName.click();
        LastName.sendKeys(User_Phone);
    }
}
