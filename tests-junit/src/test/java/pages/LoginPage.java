package pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.Properties;

public class LoginPage extends AbstractPage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    private final Logger logger = LogManager.getLogger(LoginPage.class);
    private By entryAndRegButton = By.cssSelector("button[class='header2__auth js-open-modal']");
    private By emailField = By.cssSelector("div.new-input-line_slim:nth-child(3) > input:nth-child(1)");
    private By passwordField = By.cssSelector(".js-psw-input");
    private By submitButton = By.cssSelector("div.new-input-line_last:nth-child(5) > button:nth-child(1)");


    public void clickOnEntryRegButton() {
        driver.findElement(entryAndRegButton).click();
        logger.info("Step: Click On Entry and Registration Button  - completed");
    }

    public void fillEmailField(String searchInformation) throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(emailField).sendKeys(searchInformation);
        logger.info("Step: Fill Text Field  - completed");
    }
    public void fillPassField(String searchInformation) throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(passwordField).sendKeys(searchInformation);
        logger.info("Step: Fill Text Field  - completed");
    }
    public void clickOnSubmitButton(){
        driver.findElement(submitButton).click();
        logger.info("Step: Click On Submit Button  - completed");
    }
    public void getCookie(){
        logger.info(driver.manage().getCookies());
    }
}