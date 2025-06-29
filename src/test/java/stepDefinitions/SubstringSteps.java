package stepDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import utils.BaseTest;
import utils.LocatorReader;

//this fill is glued to feature file using testrunner
public class SubstringSteps extends BaseTest {
    // store the string to compare later
    String inputValue;

    @Given("I am on the input page")
    public void i_am_on_the_input_page() {
        //getting driver instace from parent class
        driver.get("https://agrichain.com/qa/input");
    }

    @When("I enter {string} in the input field")
    public void i_enter_input_in_the_input_field(String value) {
        inputValue = value;
        WebElement inputField = driver.findElement(LocatorReader.get("input.inputField"));
        inputField.clear();
        inputField.sendKeys(value);
    }

    @When("I click the submit button")
    public void i_click_the_submit_button() {
        WebElement submitBtn = driver.findElement(LocatorReader.get("input.submitButton"));
        submitBtn.click();

        // Optional wait for page load (replace with WebDriverWait if needed)
        try {
            Thread.sleep(1500);
        } catch (InterruptedException ignored) {}
    }

    @Then("I should be redirected to the result page")
    public void i_should_be_redirected_to_the_result_page() {
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("/qa/result"),
                "Expected to be on /qa/result page but was: " + currentUrl);
    }

    @Then("I should see {string} as the result")
    public void i_should_see_result_as_output(String expectedResult) {
        WebElement resultText = driver.findElement(LocatorReader.get("result.resultText"));

        // Extract digits from text (e.g. "Output is: 3" → "3")
        String actual = resultText.getText().replaceAll("\\D+", "");

        Assert.assertEquals(actual, expectedResult, "Incorrect result displayed");
    }


}
