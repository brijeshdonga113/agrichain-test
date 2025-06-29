package tests;

import com.example.LongestString;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.BaseTest;
import utils.LocatorReader;

//this file will be starting point as test as it has @Test methods
public class StringAutomationTest extends BaseTest {
    //common variables to use
    String s1 = "abcabcbb";

    @Test(priority = 1)
    public void inputString() {

        // Locate elements after driver is ready
        WebElement input = driver.findElement(LocatorReader.get("input.inputField"));
        WebElement submitButton = driver.findElement(LocatorReader.get("input.submitButton"));

        // input a valid string
        input.sendKeys(s1);

        // click submit
        submitButton.click();

        //adding implicit wait to load a page
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ignored) {}

        // get current URL
        String currentUrl = driver.getCurrentUrl();

        //expected result url
        String expectedUrl = "https://agrichain.com/qa/result";

        // Verify the result
        Assert.assertEquals(currentUrl, expectedUrl, "User was not redirected to result page");
    }

    // Adding a priority and depandency on a another test method
    @Test(priority = 2, dependsOnMethods = {"inputString"})
    public void verifyResult() {
        // Locate result text
        WebElement result = driver.findElement(LocatorReader.get("result.resultText"));

        // Get the result text
        String resultText = result.getText().replaceAll("\\D+", ""); // Extract digits
        int resultSubString = Integer.parseInt(resultText);

        // Get the string length from LongestString class
        LongestString l1 = new LongestString();
        int expectedLength = l1.lengthOfLongestSubstring(s1);

        // Get current URL
        String currentUrl = driver.getCurrentUrl();

        //verify using instance we have created
        Assert.assertEquals(resultSubString, expectedLength);
    }

}
