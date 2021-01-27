package screens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
public class DirectLoginScreen {

    WebDriver driver;

    @FindBy(xpath = "//*[@id='Username']")
    public WebElement userField;
    @FindBy(id = "Password")
    public WebElement passwordField;
    @FindBy(id = "auth-login-submit")
    public WebElement loginButton;

    public DirectLoginScreen(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void addUser(){
        userField.click();
        userField.sendKeys("doctor2");
    }
    public void addPassword(){
        passwordField.sendKeys("Buick18!");
    }
    public void clickLoginButton(){
        loginButton.click();
    }
}
