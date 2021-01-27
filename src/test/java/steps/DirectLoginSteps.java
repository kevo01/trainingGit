package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import screens.DirectLoginScreen;

public class DirectLoginSteps {
    WebDriver driver;
    DirectLoginScreen loginScreen;
    @Given("user is located in the login page")
    public void userIsLocatedInTheLoginPage() {
        System.setProperty("webdriver.chrome.driver","D://Drivers//chromedriver_win32/chromedriver.exe");
        driver=new ChromeDriver();
        loginScreen =  new DirectLoginScreen(driver);
        driver.get("https://stage.newcropaccounts.com/ux2/account/newcropdemo/");
    }


    @When("user insert the user")
    public void userInsertTheUser() {
        /*WebDriverWait wait = new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.visibilityOf(loginScreen.userField));*/
        loginScreen.addUser();
    }

    @And("user insert the password")
    public void userInsertThePassword() {
        loginScreen.addPassword();
    }

    @And("user click in the login button")
    public void userClickInTheLoginButton() {
        loginScreen.clickLoginButton();
    }

    @Then("user should be redirected to select patient page")
    public void userShouldBeRedirectedToSelectPatientPage() {
    }
}
