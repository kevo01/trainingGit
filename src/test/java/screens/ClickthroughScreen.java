package screens;

import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class ClickthroughScreen{

@FindBy(xpath = "//*[@id='RxInput']")
private WebElement xmlField;

@FindBy(css = "/html/body/form/input")
private WebElement goButton;

    public void clickXmlField(){
        xmlField.click();
    }

    public void clickGoButton(){
        goButton.click();
    }
}
