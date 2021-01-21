package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class stepDefiniitons2 {
    WebDriver driver;
    @Given("user is located in the stage environment")
    public void userIsLocatedInTheStageEnvironment() {
        System.setProperty("webdriver.chrome.driver","D://Drivers//chromedriver_win32/chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://stage.newcropaccounts.com/InterfaceV7/driver.aspx");
    }

    @When("user insert the doctor data xml")
    public void userInsertTheDoctorDataXml() {

    }

    @And("user click in the clickthrough button")
    public void userClickInTheClickthroughButton() {
    }

    @Then("user should be redirected to compose page")
    public void userShouldBeRedirectedToComposePage() {
    }
}
