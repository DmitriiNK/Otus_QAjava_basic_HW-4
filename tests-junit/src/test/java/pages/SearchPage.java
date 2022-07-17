package pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchPage extends AbstractPage {
    private final Logger logger = LogManager.getLogger(SearchPage.class);
    private By searchField = By.cssSelector("[id='search_form_input_homepage']");
    private By searchButton = By.cssSelector("[id='search_button_homepage']");
    private By searchFirstItem = By.xpath(".//*[@id='r1-0']//div[2]//span");
    public SearchPage(WebDriver driver) {
        super(driver);
    }


    public void clickTextField(){
        driver.findElement(searchField).click();
        logger.info("Step: Set Info On Search Field - completed");
    }
    public void clickOnSearchButton(){
        driver.findElement(searchButton).click();
        logger.info("Step: Click On SearchButton  - completed");
    }
    public void fillTextField(String searchInformation){
        driver.findElement(searchField).sendKeys(searchInformation);
        logger.info("Step: Fill Text Field  - completed");
    }
    public String checkFirstItem(){
        return (driver.findElement(searchFirstItem).getText());
    }
}
