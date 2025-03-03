import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.WaitUtils;

import java.time.Duration;


public class actionUtils {

    // it can wait x sec's if needed before clicking the button
    public static void clickOnCareerButton(WebDriver driver, By xpath, int timeoutInSeconds) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds));
        WebElement button = wait.until(ExpectedConditions.visibilityOfElementLocated(xpath));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", button);
        button.click();
    }

    public static void dropdownRndDepartment(WebDriver driver, By xpath, int timeoutInSeconds) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds));
        WebElement dropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(xpath));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", dropdown);
        Select select = new Select(dropdown);
        select.selectByContainsVisibleText("R&D");
    }

    public static void clickOnAppleNow(WebDriver driver) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement button = driver.findElement(homePage.AppleNow_Button);
        js.executeScript("arguments[0].scrollIntoView(true);", button);
        js.executeScript("arguments[0].click();", button);
    }

    public static void appleFormValidation(WebDriver driver, int timeoutInSeconds, String User_First_Name) {
        WaitUtils.waitForElementByCssSelector(driver, careersPage.Apple_Form_Frame, timeoutInSeconds);


        WebElement SubmitButton = driver.findElement(careersPage.input_First_Name);
        SubmitButton.click();
        SubmitButton.sendKeys(User_First_Name);

    }
//    public static void fillAppleJobForm(WebDriver driver, int timeoutInSeconds, String User_First_Name){
//        appleFormValidation(driver, timeoutInSeconds);
//        userInfoApple(driver, User_First_Name);
//
//    }
}
