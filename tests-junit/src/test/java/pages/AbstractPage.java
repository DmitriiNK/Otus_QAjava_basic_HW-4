package pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class AbstractPage {
    protected WebDriver driver;
    private final Logger logger = LogManager.getLogger(AbstractPage.class);


    public AbstractPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void openUrl(String url) {
        driver.get(url);
        logger.info("Step: Open Search Page - completed");
    }
}
