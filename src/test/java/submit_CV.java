
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import utilities.WaitUtils;

import static utilities.endpoints.Base_URL;
import static utilities.log.Log;

public class submit_CV extends browserDriver {

    // another way to start browser before test or Test-Suit....
//    @BeforeTest
//    public void startTest() {
//        browserDriver.setup(Base_URL);
//
//    }

    @AfterTest
    public void endTest() {
        Log.info("Closing browser");
        closingBrowser();
    }

    @Test(testName = "Submit a CV file to a QA Manager role")
    public static void submit_cv() throws Exception {
        browserDriver.openChrome(Base_URL);
        Log.info("Start testing");
        WaitUtils.waitForElement(driver, homePage.Careers_Element, 10);
        actionUtils.clickOnCareerButton(homePage.Careers_Button, 10);
        Log.info("Careers screen was loaded");
        actionUtils.dropdownRndDepartment(careersPage.Department_List, 5);
        Log.info("Filtering by: R&D");
        actionUtils.clickOnAppleNow();
        actionUtils.appleFormValidation(10, "Rony", "Levi", "0544273287", "ronylevi99@gmail.com", careersPage.CV_File);
        Thread.sleep(10000);  // Sleep for you to be able to review my data
    }
}
