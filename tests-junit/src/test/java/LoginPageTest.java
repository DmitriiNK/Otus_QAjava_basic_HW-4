import config.ServerConfig;
import org.aeonbits.owner.ConfigFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.LoginPage;
import pages.PhotoFlashPage;
import java.util.Properties;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class LoginPageTest {
    private final Logger logger = LogManager.getLogger(LoginPageTest.class);
    protected static WebDriver driver;
    LoginPage loginPage;
    ServerConfig cfg = ConfigFactory.create(ServerConfig.class);

    @Before
    public void StartUp(){
        driver = WebDriverFactory.create(System.getProperty("browser"));
        driver.manage().window().maximize();
        logger.info("DriverUP");
        loginPage = new LoginPage(driver);
    }

    @After
    public void End(){
        if (driver!=null)
            //driver.quit();
            logger.info("DriverDown");
    }


    @Test
    public void LoginAutTest() throws InterruptedException {
        loginPage.openUrl("https://otus.ru");
        loginPage.clickOnEntryRegButton();
        loginPage.fillEmailField(cfg.login());
        loginPage.fillPassField(cfg.password());
        loginPage.clickOnSubmitButton();
        loginPage.getCookie();
    }
}
