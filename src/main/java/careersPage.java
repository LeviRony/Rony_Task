import org.openqa.selenium.By;

public class careersPage {
    public static By Department_List = By.id("department-filter");
    public static By Submit_Button = By.tagName("BUTTON");
    public static By input_First_Name = By.xpath("//*[@id=\"first_name\"]");
    public static By input_Last_Name = By.xpath("//*[@id=\"last_name\"]");
    public static By input_Email = By.xpath("//*[@id=\"email\"]");
    public static By input_Phone = By.xpath("//*[@id=\"phone\"]");
    public static By UploadResume = By.xpath("//*[@id=\"resume\"]");
    public static String CV_File = "src/main/resources/example_cv.pdf";
}

