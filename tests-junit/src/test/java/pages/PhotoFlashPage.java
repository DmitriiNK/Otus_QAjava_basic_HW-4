package pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class PhotoFlashPage extends AbstractPage {
    public PhotoFlashPage(WebDriver driver) {
        super(driver);
    }

    private final Logger logger = LogManager.getLogger(SearchPage.class);
    @FindBy(xpath = "//li[5]/span/a/div")
    private WebElement PhotoItem;
    @FindBy(xpath = "//div[@class='pp_pic_holder light_rounded']")
    private WebElement ClickedPhotoItem;


    public void clickOnPhotoItem() throws InterruptedException {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", PhotoItem);
        Thread.sleep(2000);
        PhotoItem.click();
    }

    public boolean isPhotoItemVisible() {
        try {
            if (ClickedPhotoItem.isDisplayed()) {
                logger.info("Step: Element is Displayed- completed");
                return true;
            }
        } catch (Exception e) {
            logger.info("Step: Element is not Displayed- completed");
            return false;
        }
        return false;
    }
}
