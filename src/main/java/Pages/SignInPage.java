package Pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utility.Utility;

public class SignInPage extends Utility {
    private static final Logger log = LogManager.getLogger(SignInPage.class.getName());

    public SignInPage() {
        PageFactory.initElements(driver, this);}

    @CacheLookup
    @FindBy(xpath = "//input[@id='email']")
    WebElement emailfield;

    @CacheLookup
    @FindBy(xpath = "//input[@id='passwd']")
    WebElement passwordfield;

    @CacheLookup
    @FindBy(xpath = "//button[@id='SubmitLogin']")
    WebElement signinbutton;

    @CacheLookup
    @FindBy(xpath = "//a[@class='logout']")
    WebElement signout;

    @CacheLookup
    @FindBy(xpath = "//a[@class='login']")
    WebElement Signinlink;

    public void enteremail(String emailid){
        sendTextToElement(emailfield,emailid);
    }
    public void enterpassword(String passw){
        sendTextToElement(passwordfield,passw);
    }
    public void clickonsigninbutton(){
        clickOnElement(signinbutton);
    }
    public String verifyText(String text){
        WebElement result = driver.findElement(By.xpath("//div[@class='alert alert-danger']/ol/li"));
        return getTextFromElement(result);
    }
    public String verifysignout(){
        return getTextFromElement(signout);

    }
    public  void clickonsignout(){
        clickOnElement(signout);
    }
    public String verifysigninlink(){
        return getTextFromElement(Signinlink);
    }
}

