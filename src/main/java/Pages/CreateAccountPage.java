package Pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utility.Utility;

public class CreateAccountPage extends Utility {
    private static final Logger log = LogManager.getLogger(CreateAccountPage.class.getName());

    public CreateAccountPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='email_create']")
    WebElement emailadd;

    @CacheLookup
    @FindBy(xpath = "//button[@id='SubmitCreate']")
    WebElement createacc;

    @CacheLookup
    @FindBy(xpath = "//input[@id='customer_firstname']")
    WebElement firstname;

    @CacheLookup
    @FindBy(xpath = "//input[@id='customer_lastname']")
    WebElement lastname;

    @CacheLookup
    @FindBy(xpath = "//input[@id='passwd']")
    WebElement password;

    @CacheLookup
    @FindBy(xpath = "//input[@id='address1']")
    WebElement address;

    @CacheLookup
    @FindBy(xpath = "//input[@id='city']")
    WebElement city;

    @CacheLookup
    @FindBy(css = "#id_state")
    WebElement state;

    @CacheLookup
    @FindBy(xpath = "//input[@id='postcode']")
    WebElement postcode;

    @CacheLookup
    @FindBy(xpath = "//select[@id='id_country']")
    WebElement country;

    @CacheLookup
    @FindBy(xpath = "//input[@id='phone_mobile']")
    WebElement mobilenuber;

    @CacheLookup
    @FindBy(xpath = "//button[@id='submitAccount']")
    WebElement registerbutton;

    @CacheLookup
    @FindBy(xpath = "//option[contains(text(),'California')]")
    WebElement california;

    public void enterRandomEmailfornewacountcreation() {
        sendRandomEmail(emailadd);
    }

    public void clickoncreateacc(){
        clickOnElement(createacc);
    }
    public void setFirstname(String First){
        sendTextToElement(firstname,First);
    }

    public void setLastname(String Last){
        sendTextToElement(lastname,Last);
    }
    public void setPassword(String pass){
        sendTextToElement(password,pass);
    }
    public void setAddress(String Add){
        sendTextToElement(address,Add);
    }
    public void setCity(String city1){
        sendTextToElement(city,city1);
    }
    public void setState(String st)  {
        selectByVisibleTextFromDropDown(state,st);

    }

    public void setPostcode(String pc){
        sendTextToElement(postcode,pc);
    }
    public void setCountry(String con){
        selectByVisibleTextFromDropDown(country,con);
    }
    public void setMobilenuber(String phone){
        sendTextToElement(mobilenuber,phone);
    }
    public void clickonrejisterbutton(){
        clickOnElement(registerbutton);
    }
}

