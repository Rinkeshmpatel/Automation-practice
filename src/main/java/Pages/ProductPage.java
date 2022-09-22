package Pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utility.Utility;

import java.util.List;

public class ProductPage extends Utility {
    private static final Logger log = LogManager.getLogger(ProductPage.class.getName());

    public ProductPage() {
        PageFactory.initElements(driver, this);
    }


    @CacheLookup
    @FindBy(xpath = "//a[@id='color_8']")
    WebElement colorWht;

    @CacheLookup
    @FindBy(xpath = "//a[@id='color_13']")
    WebElement colorOrg;

    @CacheLookup
    @FindBy(xpath = "//a[@id='color_15']")
    WebElement colorGrn;

    @CacheLookup
    @FindBy(xpath = "//a[@id='color_14']")
    WebElement colorBlu;

    @CacheLookup
    @FindBy(xpath = "//a[text()='Faded Short Sleeve T-shirts']")

    WebElement fadedShort;
    @CacheLookup
    @FindBy(xpath = "//input[@id='quantity_wanted']")
    WebElement inputboxQt;
    @CacheLookup
    @FindBy(xpath = "//select[@id='group_1']/option[1]")
    WebElement small;

    @CacheLookup
    @FindBy(xpath = "//select[@id='group_1']/option[2]")
    WebElement medium;

    @CacheLookup
    @FindBy(xpath = "//select[@id='group_1']/option[3]")
    WebElement large;

    @CacheLookup
    @FindBy(css = "button[name='Submit'] span")
    WebElement addToCartButton;

    @CacheLookup
    @FindBy(xpath = "//span[@title='Close window']")
    WebElement close;


    @CacheLookup
    @FindBy (xpath = "//a[@class='product-name']")
    List<WebElement> productlist;

    public void clickOnTheProduct (String product) throws InterruptedException {
        for (WebElement listPrd : productlist){
            if (listPrd.getText().equalsIgnoreCase(product)){
                Thread.sleep(2000);
                listPrd.click();
                break;
            }
        }
    }
    public void selColour(String color) {
        if (color.equalsIgnoreCase("White")) {
            clickOnElement(colorWht);

        } else if (color.equalsIgnoreCase("Orange")) {
            clickOnElement(colorOrg);

        } else if (color.equalsIgnoreCase("Green")) {
            clickOnElement(colorGrn);

        } else if (color.equalsIgnoreCase("Blue")) {
            clickOnElement(colorBlu);

        }
    }
    public void clickOnFadedShort(){
        clickOnElement(fadedShort);
    }
    public void enterQuantity(String value){
        clearValue(inputboxQt);
        sendTextToElement(inputboxQt,value);
    }
    public void selectYourComfortSize(String size) {
        if (size.equalsIgnoreCase("s")) {
            clickOnElement(small);

        } else if (size.equalsIgnoreCase("m")) {
            clickOnElement(medium);

        } else if (size.equalsIgnoreCase("l")) {
            clickOnElement(large);

        }}
    public void clickOnAddToCartButton () {
        clickOnElement(addToCartButton);

    }

    public void clickToClose () {
        clickOnElement(close);

    }
}

