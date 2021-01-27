package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import screens.ClickthroughScreen;

import java.time.Duration;

public class ClickthroughSteps extends ClickthroughScreen {
    WebDriver driver;
  /*  public void initiateDriver(){
        System.setProperty("webdriver.chrome.driver","D://Drivers//chromedriver_win32/chromedriver.exe");
        driver=new ChromeDriver();
    }*/
    @Given("user is located in the stage environment")
    public void userIsLocatedInTheStageEnvironment() {
        System.setProperty("webdriver.chrome.driver","D://Drivers//chromedriver_win32/chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://stage.newcropaccounts.com/InterfaceV7/driver.aspx");
    }

    @When("user insert the doctor data xml")
    public void userInsertTheDoctorDataXml() {
        clickXmlField();
    }
    @And("user click in the clickthrough button")
    public void userClickInTheClickthroughButton() {
        clickGoButton();
    }
    @Then("user should be redirected to compose page")
    public void userShouldBeRedirectedToComposePage() {
    }
}
