package Pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utility.Utility;



/**
 * Created by Rinkesh patel
 */
public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//a[@class='login']")
    WebElement signin;

    @CacheLookup
    @FindBy(xpath = "//a[@title='Women']")
    WebElement womenbutton;
    @CacheLookup
    @FindBy(xpath = "//h1[text()='Authentication']")
    WebElement authentication;


    public void clickonWomenButtonOnHomePage() {
        clickOnElement(womenbutton);

    }


    public void clickonsignin(){
        clickOnElement(signin);
    }
    public String verifytext(){
        return getTextFromElement(authentication);
    }
}
