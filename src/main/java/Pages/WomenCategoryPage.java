package Pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utility.Utility;

public class WomenCategoryPage extends Utility {
    private static final Logger log = LogManager.getLogger(WomenCategoryPage.class.getName());

    public WomenCategoryPage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//h2[@class='title_block']")
    WebElement womenText;

    @CacheLookup
    @FindBy(xpath = "//div[@class='block_content']//a[text()='Tops']")
    WebElement topsLink;

    @CacheLookup
    @FindBy(xpath = "//div[@class='block_content']//a[contains(@title,'Find your favorites dresses from our wide choice of evening, casual or summer dresses!')][normalize-space()='Dresses']")
    WebElement dresslink;

    @CacheLookup
    @FindBy(xpath = "//select[@id='selectProductSort']")
    WebElement sortBy;

    public void clickOnDressesLink() {
        clickOnElement(dresslink);
    }

    public void clickOnTopsLink() {
        clickOnElement(topsLink);
    }

    public String verifyWomenText() {
        return getTextFromElement(womenText);
    }

    public void selectFromDropdown(String value) {
        selectByValueFromDropDown(sortBy, value);
    }


}

