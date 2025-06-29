package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

//driver initilize as a base class and saved in utils as we will be using repeatdly
public class BaseTest {

    protected WebDriver driver;

    @BeforeMethod
    public void setUp() {
        // Initialize the Chrome driver
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Navigate to the application URL
        driver.get("https://agrichain.com/input");
    }

    @AfterMethod
    public void tearDown() {
        // Quit the browser after each test
        if (driver != null) {
            driver.quit();
        }
    }
}
