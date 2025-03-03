


import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import utilities.WaitUtils;

import static utilities.endpoints.Base_URL;
import static utilities.endpoints.Careers;
import static utilities.log.Log;

public class submit_CV extends browserDriver {

    //another way to start browser before test or Test-Suit....
//    @BeforeTest
    public void startTest() {
        browserDriver.setup(Base_URL);
    }

    @AfterTest
    public void endTest() {
        closingBrowser();
    }

    @Test(testName = " ")
    public static void submit_cv() throws Exception {
        browserDriver.openChrome(Base_URL + Careers + "/5428476004/");
//        Log.info("Start testing");
//        WaitUtils.waitForElementByClassName(driver, homePage.Careers_Element, 10);
//        actionUtils.clickOnCareerButton(driver, homePage.Careers_Button, 10);
//        actionUtils.dropdownRndDepartment(driver,careersPage.Department_List,5);
//        actionUtils.clickOnAppleNow(driver);
        actionUtils.appleFormValidation(driver,20, "Rony");

        //actionUtils.fillAppleJobForm(driver, 10, "Rony");
        Thread.sleep(5000);  // Sleep for 200 milliseconds
    }
}
